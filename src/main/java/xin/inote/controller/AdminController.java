package xin.inote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import xin.inote.pojo.Link;
import xin.inote.service.AdminService;
import xin.inote.service.InformationService;
import xin.inote.util.Md5Password;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    InformationService informationService;
    @Autowired
    AdminService adminService;
    @Autowired
    Md5Password md5Password;
    @RequestMapping(value = "/setInformation",method = RequestMethod.POST)
    public String setInformation(String blogName,String blogDomain){
        informationService.setInformation(blogName,blogDomain);
        return "redirect:/adminPage/information";
    }
    @RequestMapping(value = "/setAdmin",method = RequestMethod.POST)
    public String setAdmin(RedirectAttributes attr, String blogUserName, String blogNewPwd,String blogOldPwd){
        if (blogUserName == null || blogUserName.isEmpty()){
            attr.addFlashAttribute("info","用户名不能为空");
        }else if (blogOldPwd == null || blogOldPwd.isEmpty()){
            attr.addFlashAttribute("info","旧密码不能为空");
        }else if (blogNewPwd == null || blogNewPwd.isEmpty()){
            attr.addFlashAttribute("info","新密码不能为空");
        }else if (!md5Password.isPassword(blogOldPwd)){
            attr.addFlashAttribute("info","旧密码错误");
        }else if(!adminService.setAdmin(blogUserName,blogNewPwd)){
            attr.addFlashAttribute("info","密码修改失败");
        }else {
            attr.addFlashAttribute("info","密码修改成功!");
        }
        return "redirect:/adminPage/information";
    }
    @RequestMapping(value = "/setNotice",method = RequestMethod.POST)
    @ResponseBody
    public Map setNotice(@RequestBody Map<String,Object> params){
        Map<String, Object> map = new HashMap<>();
        if (adminService.setNotice(params.get("notice").toString())){
            map.put("status", "ok");
        }else {
            map.put("status", "no");
        }

        return map;
    }
    @RequestMapping(value = "/addLink")
    @ResponseBody
    public Map addLink(@RequestBody Link link){
        Map<String, Object> map = new HashMap<>();
        if (adminService.addLink(link)){
            map.put("status", "ok");
        }else {
            map.put("status", "no");
        }
        return map;
    }
    @RequestMapping(value = "/delLink")
    @ResponseBody
    public Map delLink(@RequestBody Link link){
        Map<String, Object> map = new HashMap<>();
        if (adminService.delLink(link)){
            map.put("status", "ok");
        }else {
            map.put("status", "no");
        }
        return map;
    }
    @RequestMapping(value = "/editLink")
    @ResponseBody
    public Map editLink(@RequestBody Link link){
        Map<String, Object> map = new HashMap<>();
        if (adminService.editLink(link)){
            map.put("status", "ok");
        }else {
            map.put("status", "no");
        }
        return map;
    }

}
