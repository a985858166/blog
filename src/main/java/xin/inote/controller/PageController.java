package xin.inote.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
    @RequestMapping({"index","/","/page/{number:\\d+}","/classify/{classify_id:\\d+}","/classify/{classify_id:\\d+}/page/{number:\\d+}",
    "/search/{search:.+}","/search/{search:.+}/page/{number:\\d+}"})
    public String index(@PathVariable(required = false) String number,@PathVariable(required = false) String classify_id,@PathVariable(required = false) String search){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        if (number != null){
            session.setAttribute("pageNumber",number);
        }else {
            session.removeAttribute("pageNumber");
        }
        if (classify_id != null){
            session.setAttribute("classify_id",classify_id);
        }else {
            session.removeAttribute("classify_id");
        }
        if (search != null){
            session.setAttribute("search",search);
        }else {
            session.removeAttribute("search");
        }
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
