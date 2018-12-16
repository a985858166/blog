package xin.inote.service.impl;

import com.github.pagehelper.PageHelper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.inote.mapper.*;
import xin.inote.pojo.*;
import xin.inote.service.IndexService;
import xin.inote.util.Html2Text;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    OptionMapper optionMapper;
    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    ClassifyMapper classifyMapper;
    @Autowired
    LinkMapper linkMapper;
    @Autowired
    CommentMapper commentMapper;
    @Autowired
    Html2Text html2Text;

    @Override
    public List<Link> link() {
        return linkMapper.selectByExample(new LinkExample());
    }

    @Override
    public List<Classify> classifyList() {
        ClassifyExample example = new ClassifyExample();
        example.setOrderByClause("classify_top asc");
        return classifyMapper.selectByExample(example);
    }

    @Override
    public List<Article> showArticleList() throws IOException {
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        int pageNum;
        if (session.getAttribute("pageNumber") != null){
            pageNum = Integer.parseInt(session.getAttribute("pageNumber").toString());
        }else {
            pageNum = 1;
        }
        PageHelper.startPage(pageNum, 5);
        ArticleExample articleExample = new ArticleExample();
//        按时间排序
        articleExample.setOrderByClause("article_date DESC");
        ArticleExample.Criteria criteria = articleExample.createCriteria();
        criteria.andArticle_statusEqualTo(1);
        if (session.getAttribute("classify_id") != null){
            criteria.andArticle_classify_idEqualTo(Integer.parseInt(session.getAttribute("classify_id").toString()));
        }
        if (session.getAttribute("search") != null){
            criteria.andArticle_titleLike("%"+session.getAttribute("search").toString()+"%");
        }
        List<Article> list = articleMapper.selectByExampleWithBLOBs(articleExample);
        for (int i = 0; i < list.size(); i++) {
            Reader in=new StringReader(list.get(i).getArticle_content());
            html2Text.parse(in);
            list.get(i).setArticle_content(html2Text.getText().substring(0, html2Text.getText().length()<200?html2Text.getText().length():200));
            UserExample userExample = new UserExample();
            userExample.or().andUser_idEqualTo(list.get(i).getArticle_user_id());
            User user = new User();
            user.setUser_username(userMapper.selectByExample(userExample).get(0).getUser_username());
            list.get(i).setUser(user);
//          设置评论数
            CommentExample commentExample = new CommentExample();
            commentExample.or().andComment_article_idEqualTo(list.get(i).getArticle_id());
            list.get(i).setCommentNum(commentMapper.countByExample(commentExample));
        }
        return list;
    }

    @Override
    public Option notice() {
        Option option = new Option();
        option.setOption_value("公告为空");
        OptionExample example = new OptionExample();
        example.or().andOption_nameEqualTo("notice");
        List<Option> list = optionMapper.selectByExample(example);
        if (!list.isEmpty()){
            option = list.get(0);
        }
        return option;
    }
}
