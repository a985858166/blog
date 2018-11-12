package xin.inote.service.impl;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.inote.mapper.ArticleMapper;
import xin.inote.pojo.Article;
import xin.inote.pojo.User;
import xin.inote.service.AdminArticleService;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class AdminArticleServiceImpl implements AdminArticleService {
    @Autowired
    ArticleMapper articleMapper;
    @Override
    public boolean newArticle(Article article) {
//        获取登录用户的信息
        User user = (User) SecurityUtils.getSubject().getSession().getAttribute("user");
        article.setArticle_user_id(user.getUser_id());
        Date date = new Date();
        article.setArticle_date(date);
        article.setArticle_url("https://inote.xin");
        if (articleMapper.insert(article)>0){
            return true;
        }
        return false;
    }
}
