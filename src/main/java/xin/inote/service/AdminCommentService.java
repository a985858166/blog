package xin.inote.service;

import xin.inote.pojo.Comment;

import java.util.List;
import java.util.Map;

public interface AdminCommentService {
    Map<String,Object> listComment();

    boolean delComment(Comment comment);
}
