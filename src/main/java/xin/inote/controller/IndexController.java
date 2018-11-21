package xin.inote.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xin.inote.pojo.Article;
import xin.inote.service.IndexService;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
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
    @RequestMapping("showArticleList")
    @ResponseBody
    public Map showArticleList () throws IOException {
        Map<String,Object> map = new HashMap<>();
        List<Article> list = indexService.showArticleList();
        PageInfo page = new PageInfo(list);
        map.put("pages",page.getPages());
        map.put("pageNum",page.getPageNum());
        map.put("articeList",list);
        return map;
    }
}
