package xin.inote.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.inote.mapper.ArticleMapper;
import xin.inote.pojo.Article;
import xin.inote.pojo.ArticleExample;
import xin.inote.service.ArticleService;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;
    @Override
    public Article articleData(int article_id) {
        ArticleExample example = new ArticleExample();
        example.or().andArticle_idEqualTo(article_id);
        List<Article> list =  articleMapper.selectByExampleWithBLOBs(example);
        if (list.isEmpty()){
            return new Article();
        }
        return list.get(0);
    }
}
