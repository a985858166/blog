package xin.inote.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xin.inote.mapper.SqlMapper;
import xin.inote.pojo.Article;

import java.util.List;

@Controller
@RequestMapping("")
public class PageController {
    @Autowired
    SqlMapper sqlMapper;
    @RequestMapping({"index","/"})
    public String index(){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        session.setAttribute("subject",subject);
        return "index";
    }
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }
    @RequestMapping("unauthorized")
    public String noPerms(){
        return "unatuthorized";
    }



}
