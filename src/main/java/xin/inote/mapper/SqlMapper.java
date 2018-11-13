package xin.inote.mapper;

import xin.inote.pojo.Article;

import java.util.List;

public interface SqlMapper {
    List<Article> selectClassifyAll();
}
