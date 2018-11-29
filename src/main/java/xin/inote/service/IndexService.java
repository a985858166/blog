package xin.inote.service;

import xin.inote.pojo.Article;
import xin.inote.pojo.Classify;
import xin.inote.pojo.Link;
import xin.inote.pojo.Option;

import java.io.IOException;
import java.util.List;

public interface IndexService {
    Option notice();

    List<Article> showArticleList() throws IOException;

    List<Classify> classifyList();

    List<Link> link();
}
