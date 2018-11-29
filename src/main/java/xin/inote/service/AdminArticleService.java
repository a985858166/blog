package xin.inote.service;

import xin.inote.pojo.Article;

import java.util.List;

public interface AdminArticleService {
    int newArticle(Article article);
    List<Article> listArticle();

    boolean delArticle(Article article);

    boolean editArticle(Article article);

    Article getArticle(int article_id);
}
