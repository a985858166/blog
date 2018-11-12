package xin.inote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xin.inote.service.AdminNoticeService;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("b-admin")
public class AdminNoticeController {
    @Autowired
    AdminNoticeService adminNoticeService;
    @RequestMapping("/notice")
    public String notice(Model model){
        model.addAttribute("notice",adminNoticeService.getNotece());
        return "/admin/notice";
    }
    @RequestMapping(value = "/setNotice",method = RequestMethod.POST)
    @ResponseBody
    public Map setNotice(@RequestBody Map<String,Object> params){
        Map<String, Object> map = new HashMap<>();
        if (adminNoticeService.setNotice(params.get("notice").toString())){
            map.put("status", "ok");
        }else {
            map.put("status", "no");
        }

        return map;
    }
}
