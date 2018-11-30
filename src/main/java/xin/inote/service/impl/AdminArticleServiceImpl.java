package xin.inote.service.impl;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.inote.mapper.ArticleMapper;
import xin.inote.mapper.SqlMapper;
import xin.inote.pojo.Article;
import xin.inote.pojo.ArticleExample;
import xin.inote.pojo.User;
import xin.inote.service.AdminArticleService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class AdminArticleServiceImpl implements AdminArticleService {
    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    SqlMapper sqlMapper;
    @Override
    public int newArticle(Article article) {
//        获取登录用户的信息
        User user = (User) SecurityUtils.getSubject().getSession().getAttribute("user");
        article.setArticle_user_id(user.getUser_id());
        Date date = new Date();
        article.setArticle_date(date);
        article.setArticle_url("https://inote.xin");
        article.setVisitors(0);
        if (articleMapper.insertReturnId(article)>0){

            return article.getArticle_id();
        }
        return 0;
    }

    @Override
    public List<Article> listArticle() {
        return sqlMapper.selectClassifyAll();
    }

    @Override
    public boolean delArticle(Article article) {
        ArticleExample example = new ArticleExample();
        example.or().andArticle_idEqualTo(article.getArticle_id());
        if (articleMapper.deleteByExample(example)>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean editArticle(Article article) {
        ArticleExample example = new ArticleExample();
        example.or().andArticle_idEqualTo(article.getArticle_id());
        if (articleMapper.updateByExampleSelective(article,example)>0){
            return true;
        }
        return false;
    }

    @Override
    public Article getArticle(int article_id) {
        ArticleExample example = new ArticleExample();
        example.or().andArticle_idEqualTo(article_id);
        List<Article> list = articleMapper.selectByExampleWithBLOBs(example);
        if (list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
