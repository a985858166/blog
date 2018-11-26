package xin.inote.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.inote.mapper.ArticleMapper;
import xin.inote.mapper.CommentMapper;
import xin.inote.pojo.Article;
import xin.inote.pojo.ArticleExample;
import xin.inote.pojo.Comment;
import xin.inote.pojo.CommentExample;
import xin.inote.service.AdminCommentService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class AdminCommentServiceImpl implements AdminCommentService {
    @Autowired
    CommentMapper commentMapper;
    @Autowired
    ArticleMapper articleMapper;
    @Override
    public Map<String, Object> listComment() {
        List<Comment> commentList = commentMapper.selectByExampleWithBLOBs(new CommentExample());
        List<Article> articleList = new ArrayList<>();
        for (Comment comment:commentList
             ) {
            ArticleExample articleExample = new ArticleExample();
            articleExample.or().andArticle_idEqualTo(comment.getComment_article_id());
            articleList.add(articleMapper.selectByExample(articleExample).get(0));
        }

        Map<String,Object> map = new HashMap<>();
        map.put("commentList",commentList);
        map.put("articleList",articleList);
        return map;
    }

    @Override
    public boolean delComment(Comment comment) {
        CommentExample example = new CommentExample();
        example.or().andComment_idEqualTo(comment.getComment_id());
        if (commentMapper.deleteByExample(example)>0){
            return true;
        }
        return false;
    }
}
