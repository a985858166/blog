package xin.inote.service;

import xin.inote.pojo.Article;
import xin.inote.pojo.Option;

import java.io.IOException;
import java.util.List;

public interface IndexService {
    Option notice();

    List<Article> showArticleList() throws IOException;
}
