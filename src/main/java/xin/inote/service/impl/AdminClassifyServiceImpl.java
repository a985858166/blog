package xin.inote.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.inote.mapper.ArticleMapper;
import xin.inote.mapper.ClassifyMapper;
import xin.inote.pojo.ArticleExample;
import xin.inote.pojo.Classify;
import xin.inote.pojo.ClassifyExample;
import xin.inote.service.AdminClassifyService;

import java.util.List;

@Service
public class AdminClassifyServiceImpl implements AdminClassifyService {
    @Autowired
    ClassifyMapper classifyMapper;
    @Autowired
    ArticleMapper articleMapper;
    @Override
    public boolean addClassify(Classify classify) {
        if (classifyMapper.insertSelective(classify)>0){
            return true;
        }
        return false;
    }

    @Override
    public List<Classify> listClassify() {
        return classifyMapper.selectByExample(new ClassifyExample());
    }

    @Override
    public boolean editClassify(Classify classify) {

        ClassifyExample example = new ClassifyExample();
        example.or().andClassify_idEqualTo(classify.getClassify_id());
        if (classifyMapper.updateByExampleSelective(classify,example)>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean delClassify(Classify classify) {
        ArticleExample articleExample = new ArticleExample();
        articleExample.or().andArticle_classify_idEqualTo(classify.getClassify_id());
        if (!articleMapper.selectByExample(articleExample).isEmpty()){
            return false;
        }
        ClassifyExample example = new ClassifyExample();
        example.or().andClassify_idEqualTo(classify.getClassify_id());
        if (classifyMapper.deleteByExample(example)>0){
            return true;
        }
        return false;
    }
}
