package xin.inote.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xin.inote.pojo.Comment;
import xin.inote.service.CommentService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("")
public class CommentController {
    @Autowired
    CommentService commentService;
    @RequestMapping("addComment")
    @ResponseBody
    public Map addComment(@RequestBody Comment comment){
        Map<String,Object> map = new HashMap<>();
        if (commentService.addComment(comment)){
            map.put("status","ok");
        }else {
            map.put("status","on");
        }
        return map;
    }
    @RequestMapping("listComment")
    @ResponseBody
    public Map listComment(@RequestBody Map temp){
        Map<String,Object> map = new HashMap<>();
        if (temp.get("pageNum") != null){
            PageHelper.startPage((Integer) temp.get("pageNum"),5);
        }else {
            PageHelper.startPage(1,5);
        }
        List<Comment> list = commentService.listComment((Integer) temp.get("comment_article_id"));
        PageInfo page = new PageInfo(list);
        map.put("pageNum",page.getPageNum());
        map.put("pages",page.getPages());
        map.put("list",list);
        return map;
    }
}
