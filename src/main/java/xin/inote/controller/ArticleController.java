package xin.inote.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xin.inote.pojo.Article;
import xin.inote.service.ArticleService;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("")
public class ArticleController {
    @Autowired
    ArticleService articleService;
    @RequestMapping("article/{article_id:\\d+}")
    public String article(@PathVariable int article_id){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        session.setAttribute("article_id",article_id);
        return "/article";
    }
    @RequestMapping("articleData")
    @ResponseBody
    public Map articleData(){
        Map<String,Object> map = new HashMap<>();
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        int article_id = Integer.parseInt(session.getAttribute("article_id").toString());
        Article article = articleService.articleData(article_id);
        map.put("article",article);
        return map;
    }
}
