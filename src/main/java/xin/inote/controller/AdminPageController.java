package xin.inote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xin.inote.pojo.Option;
import xin.inote.service.AdminService;
import xin.inote.service.InformationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("adminPage")
public class AdminPageController {
    @Autowired
    InformationService informationService;
    @Autowired
    AdminService adminService;
    @RequestMapping("/information")
    public String information(Model model){
        List<Option> list = informationService.getInformation();
        String blogName = "";
        String blogDomain = "";
        String userName = "";
        userName = informationService.getName();
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
    @RequestMapping("/notice")
    public String notice(Model model){
        model.addAttribute("notice",adminService.getNotece());
        return "/admin/notice";
    }
    @RequestMapping("/link")
    public String link(){
        return "/admin/link";
    }
    @RequestMapping("/linkData")
    @ResponseBody
    public Map linkData(){
        Map map = new HashMap();
        map.put("link",adminService.getLink());
        return map;
    }

}
