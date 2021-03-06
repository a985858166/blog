package xin.inote.controller;

import com.github.pagehelper.PageInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xin.inote.pojo.Article;
import xin.inote.pojo.Classify;
import xin.inote.pojo.Link;
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
    @RequestMapping("link")
    @ResponseBody
    public Map link(){
        Map<String,Object> map = new HashMap<>();
        List<Link> list = indexService.link();
        map.put("link",list);
        return map;
    }
    @RequestMapping("showArticleList")
    @ResponseBody
    public Map showArticleList () throws IOException {
        Map<String,Object> map = new HashMap<>();
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        if (session.getAttribute("classify_id") != null){
            map.put("classify_status","ok");
            map.put("classify_id",Integer.parseInt(session.getAttribute("classify_id").toString()));
        }
        if (session.getAttribute("search") != null){
            map.put("search_status","ok");
            map.put("search",session.getAttribute("search"));
        }
        List<Article> list = indexService.showArticleList();
        PageInfo page = new PageInfo(list);
        map.put("pages",page.getPages());
        map.put("pageNum",page.getPageNum());
        map.put("articeList",list);
        return map;
    }
    @RequestMapping("classifyList")
    @ResponseBody
    public Map classifyList(){
        Map<String,Object> map = new HashMap<>();
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        if (session.getAttribute("classify_id") != null){
            map.put("classify_status","ok");
            map.put("classify_id",Integer.parseInt(session.getAttribute("classify_id").toString()));
        }
        if (session.getAttribute("search") != null){
            map.put("search_status","ok");
        }
        List<Classify> list = indexService.classifyList();
        map.put("classify",list);
        return map;
    }
}
