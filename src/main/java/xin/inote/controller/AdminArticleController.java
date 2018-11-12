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
    @RequestMapping("/allArticle")
    public String allArticle(){
        return "/admin/allArticle";
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
}
