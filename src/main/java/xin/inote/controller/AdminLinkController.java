package xin.inote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xin.inote.pojo.Link;
import xin.inote.service.AdminLinkService;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("b-admin")
public class AdminLinkController {
    @Autowired
    AdminLinkService adminLinkService;
    @RequestMapping("/link")
    public String link(){
        return "/admin/link";
    }
    @RequestMapping("/linkData")
    @ResponseBody
    public Map linkData(){
        Map map = new HashMap();
        map.put("link",adminLinkService.listLink());
        return map;
    }
    @RequestMapping(value = "/addLink")
    @ResponseBody
    public Map addLink(@RequestBody Link link){
        Map<String, Object> map = new HashMap<>();
        if (adminLinkService.addLink(link)){
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
        if (adminLinkService.delLink(link)){
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
        if (adminLinkService.editLink(link)){
            map.put("status", "ok");
        }else {
            map.put("status", "no");
        }
        return map;
    }
}
