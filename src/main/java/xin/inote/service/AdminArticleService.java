package xin.inote.service;

import xin.inote.pojo.Article;

import java.util.List;

public interface AdminArticleService {
    boolean newArticle(Article article);
    List<Article> listArticle();
}
