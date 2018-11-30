package xin.inote.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.inote.mapper.ArticleMapper;
import xin.inote.mapper.UserMapper;
import xin.inote.pojo.Article;
import xin.inote.pojo.ArticleExample;
import xin.inote.pojo.User;
import xin.inote.pojo.UserExample;
import xin.inote.service.ArticleService;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    UserMapper userMapper;
    @Override
    public Article articleData(int article_id) {
        ArticleExample articleExample = new ArticleExample();
        articleExample.or().andArticle_idEqualTo(article_id).andArticle_statusEqualTo(1);
        List<Article> list =  articleMapper.selectByExampleWithBLOBs(articleExample);
        if (list.isEmpty()){
            return new Article();
        }
        //
//      增加访问数
        Article article = list.get(0);
        article.setVisitors(article.getVisitors()+1);
        articleMapper.updateByExampleSelective(article,articleExample);
//      设置用户名
        User user = new User();
        UserExample userExample = new UserExample();
        userExample.or().andUser_idEqualTo(article.getArticle_user_id());
        user.setUser_username(userMapper.selectByExample(userExample).get(0).getUser_username());
        article.setUser(user);
        return article;
    }
}
