package xin.inote.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(Model model, String username, String password){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        try {
            subject.login(token);
            Session session = subject.getSession();
            session.setAttribute("subject",subject);
            System.out.println("登录成功");
            return "redirect:index";
        }catch (AuthenticationException e){
            System.out.println("登录失败");
            model.addAttribute("error","验证失败");

            return "login";
        }
    }

}
