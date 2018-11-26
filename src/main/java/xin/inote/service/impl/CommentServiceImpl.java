package xin.inote.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.inote.mapper.CommentMapper;
import xin.inote.pojo.Comment;
import xin.inote.pojo.CommentExample;
import xin.inote.service.CommentService;

import java.util.Date;
import java.util.List;


@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentMapper commentMapper;

    @Override
    public List<Comment> listComment(int comment_article_id) {
        CommentExample example = new CommentExample();
        example.or().andComment_article_idEqualTo(comment_article_id);
        return commentMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public boolean addComment(Comment comment) {
        comment.setComment_author_date(new Date());
        if (comment.getComment_author_content().equals("")||comment.getComment_author_name().equals("")||
        comment.getComment_author_email().equals("")){
            return false;
        }
        if (commentMapper.insertSelective(comment)>0){
            return true;
        }
        return false;
    }
}
