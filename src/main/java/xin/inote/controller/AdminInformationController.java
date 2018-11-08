package xin.inote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import xin.inote.pojo.Option;
import xin.inote.service.AdminInformationService;
import xin.inote.util.Md5Password;

import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminInformationController {
    @Autowired
    AdminInformationService adminInformationService;
    @Autowired
    Md5Password md5Password;

    @RequestMapping("/information")
    public String information(Model model){
        List<Option> list = adminInformationService.getInformation();
        String blogName = "";
        String blogDomain = "";
        String userName = "";
        userName = adminInformationService.getName();
        try {
            blogName = list.get(0).getOption_name().equals("blogName")?list
                    .get(0).getOption_value():list.get(1).getOption_value();
        }catch (Exception e){

        }
        try {
            blogDomain = list.get(0).getOption_name().equals("blogName")?list
                    .get(1).getOption_value():list.get(0).getOption_value();
        }catch (Exception e){

        }

        model.addAttribute("userName",userName);
        model.addAttribute("blogName",blogName);
        model.addAttribute("blogDomain",blogDomain);
        return "/admin/information";
    }
    @RequestMapping(value = "/setInformation",method = RequestMethod.POST)
    public String setInformation(String blogName,String blogDomain){
        adminInformationService.setInformation(blogName,blogDomain);
        return "redirect:/admin/information";
    }
    @RequestMapping(value = "/setAdmin",method = RequestMethod.POST)
    public String setAdmin(RedirectAttributes attr, String blogUserName, String blogNewPwd, String blogOldPwd){
        if (blogUserName == null || blogUserName.isEmpty()){
            attr.addFlashAttribute("info","用户名不能为空");
        }else if (blogOldPwd == null || blogOldPwd.isEmpty()){
            attr.addFlashAttribute("info","旧密码不能为空");
        }else if (blogNewPwd == null || blogNewPwd.isEmpty()){
            attr.addFlashAttribute("info","新密码不能为空");
        }else if (!md5Password.isPassword(blogOldPwd)){
            attr.addFlashAttribute("info","旧密码错误");
        }else if(!adminInformationService.setAdmin(blogUserName,blogNewPwd)){
            attr.addFlashAttribute("info","密码修改失败");
        }else {
            attr.addFlashAttribute("info","密码修改成功!");
        }
        return "redirect:/admin/information";
    }
}
