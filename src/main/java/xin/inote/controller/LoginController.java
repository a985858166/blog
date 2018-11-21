package xin.inote.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xin.inote.service.UserService;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("")
public class LoginController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(Model model, String username, String password){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        try {
            subject.login(token);
            Session session = subject.getSession();
            session.setAttribute("subject",subject);
            session.setAttribute("user",userService.getByName(username));
            System.out.println("登录成功");
            return "redirect:index";
        }catch (AuthenticationException e){
            System.out.println("登录失败");
            model.addAttribute("error","验证失败");
            return "login";
        }
    }
    @RequestMapping("/status")
    @ResponseBody
    public Map status(){
        Map<String,Object> map = new HashMap();
        Subject subject = SecurityUtils.getSubject();
        if (subject.getPrincipal() != null){
            map.put("ul","<li><a href='b-admin/information'>后台管理</a></li>" +
                    "<li><a href='/doLogout'>注销</a></li>");
        }else {
            map.put("ul","<li><a href='/login'>登录</a></li>");
        }
        return map;
    }

}
