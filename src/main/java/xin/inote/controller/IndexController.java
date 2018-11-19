package xin.inote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xin.inote.service.IndexService;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("")
public class IndexController {
    @Autowired
    IndexService indexService;
    @RequestMapping("notice")
    @ResponseBody
    public Map notice(){
        Map<String,Object> map = new HashMap<>();
        map.put("notice",indexService.notice().getOption_value());
        return map;
    }
}
