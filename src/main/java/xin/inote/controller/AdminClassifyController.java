package xin.inote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xin.inote.pojo.Classify;
import xin.inote.service.AdminClassifyService;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("b-admin")
public class AdminClassifyController {
    @Autowired
    AdminClassifyService adminClassifyService;
    @RequestMapping("/classify")
    public String classify(){
        return "/admin/classify";
    }

    @RequestMapping(value = "/addClassify")
    @ResponseBody
    public Map addClassify(@RequestBody Classify classify){
        classify.setClassify_url("inote.xin");
        Map<String, Object> map = new HashMap<>();
        if (adminClassifyService.addClassify(classify)){
            map.put("status", "ok");
        }else {
            map.put("status", "no");
        }
        return map;
    }
    @RequestMapping(value = "/listClassify")
    @ResponseBody
    public Map listClassify(){
        Map<String, Object> map = new HashMap<>();
        map.put("classify",adminClassifyService.listClassify());
        return map;
    }
    @RequestMapping(value = "/editClassify")
    @ResponseBody
    public Map editClassify(@RequestBody Classify classify){
        Map<String, Object> map = new HashMap<>();
        if (adminClassifyService.editClassify(classify)){
            map.put("status", "ok");
        }else {
            map.put("status", "no");
        }
        return map;
    }
    @RequestMapping(value = "/delClassify")
    @ResponseBody
    public Map delClassify(@RequestBody Classify classify){
        Map<String, Object> map = new HashMap<>();
        if (adminClassifyService.delClassify(classify)){
            map.put("status", "ok");
        }else {
            map.put("status", "no");
        }
        return map;
    }


}
