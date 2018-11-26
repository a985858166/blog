package xin.inote.service;

import xin.inote.pojo.Comment;

import java.util.List;

public interface CommentService {
    boolean addComment(Comment comment);

    List<Comment> listComment(int comment_article_id);
}
