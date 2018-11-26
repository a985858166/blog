package xin.inote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xin.inote.pojo.Comment;
import xin.inote.service.AdminCommentService;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("b-admin")
public class AdminCommentController {
    @Autowired
    AdminCommentService adminCommentService;
    @RequestMapping("listComment")
    @ResponseBody
    public Map listComment(){
        Map<String,Object> map = adminCommentService.listComment();
        return map;
    }
    @RequestMapping("comment")
    public String comment(){
        return "admin/comment";
    }
    @RequestMapping(value = "/delComment")
    @ResponseBody
    public Map delLink(@RequestBody Comment comment){
        Map<String, Object> map = new HashMap<>();
        if (adminCommentService.delComment(comment)){
            map.put("status", "ok");
        }else {
            map.put("status", "no");
        }
        return map;
    }
}
