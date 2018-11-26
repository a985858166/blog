package xin.inote.controller;

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
        List<Comment> list = commentService.listComment((Integer) temp.get("comment_article_id"));
        map.put("list",list);
        return map;
    }
}
