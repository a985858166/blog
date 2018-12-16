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
import xin.inote.util.AntiXSS;
import xin.inote.util.CookieUtils;
import xin.inote.util.RegexUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    public Map addComment(@RequestBody Comment comment, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        Map<String,Object> map = new HashMap<>();
        comment.setComment_author_content(AntiXSS.replaceHtmlCode(comment.getComment_author_content()));
        comment.setComment_author_name(AntiXSS.replaceHtmlCode(comment.getComment_author_name()));
        if ((RegexUtils.checkURL(comment.getComment_author_url()) || comment.getComment_author_url() == null || comment.getComment_author_url() == "") && RegexUtils.checkEmail(comment.getComment_author_email())){
            if (commentService.addComment(comment)){
                CookieUtils.setCookie(httpServletRequest,httpServletResponse,"user",String.format("%s:%s:%s",comment.getComment_author_name(),comment.getComment_author_email(),comment.getComment_author_url()),60*60*24*365);
                map.put("status","ok");
            }else {
                map.put("status","on");
            }
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
        map.put("total",page.getTotal());
        map.put("list",list);
        return map;
    }
}
