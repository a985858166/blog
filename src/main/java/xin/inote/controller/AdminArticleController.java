package xin.inote.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xin.inote.pojo.Article;
import xin.inote.service.AdminArticleService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("b-admin")
public class AdminArticleController {
    @Autowired
    AdminArticleService adminArticleService;
    @RequestMapping("/write")
    public String write(){
        return "/admin/write";
    }
    @RequestMapping("/editWrite")
    public String editWrite(int article_id){
        Subject subject = SecurityUtils.getSubject();
        subject.getSession().setAttribute("article_id",article_id);
        return "/admin/editWrite";
    }
    @RequestMapping("/allArticle")
    public String allArticle(){
        return "/admin/allArticle";
    }
    @RequestMapping("/listArticle")
    @ResponseBody
    public Map listArticle(){
        Map<String,Object> map = new HashMap<>();
        List<Article> list = adminArticleService.listArticle();
        map.put("listArticle",list);
        map.put("status","ok");
        return map;
    }

    @RequestMapping("/newArticle")
    @ResponseBody
    public Map newArticle(@RequestBody Article article){
        Subject subject = SecurityUtils.getSubject();
        Map<String,Object> map = new HashMap();
        System.out.println(article.toString());
        if (adminArticleService.newArticle(article)){
            map.put("status","ok");
        }else {
            map.put("status","no");
        }
        return map;
    }
    @RequestMapping("/delArticle")
    @ResponseBody
    public Map delArticle(@RequestBody Article article){
        Map<String,Object> map = new HashMap();
        if (adminArticleService.delArticle(article)){
            map.put("status","ok");
        }else {
            map.put("status","no");
        }
        return map;
    }
    @RequestMapping("/editArticle")
    @ResponseBody
    public Map editArticle(@RequestBody Article article){
        Map<String,Object> map = new HashMap();
        if (adminArticleService.editArticle(article)){
            map.put("status","ok");
        }else {
            map.put("status","no");
        }
        return map;
    }
    @RequestMapping("/getArticle")
    @ResponseBody
    public Map getArticle(){
        Map<String,Object> map = new HashMap();
        Subject subject = SecurityUtils.getSubject();
        int article_id = (int) subject.getSession().getAttribute("article_id");
        Article article = adminArticleService.getArticle(article_id);
        if (article != null){
            map.put("status","ok");
            map.put("article",article);
        }else {
            map.put("status","no");
        }
        return map;
    }

}
