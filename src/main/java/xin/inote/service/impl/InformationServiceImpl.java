package xin.inote.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xin.inote.mapper.OptionMapper;
import xin.inote.mapper.UserMapper;
import xin.inote.pojo.Option;
import xin.inote.pojo.OptionExample;
import xin.inote.pojo.UserExample;
import xin.inote.service.InformationService;

import java.util.List;
@Service
public class InformationServiceImpl implements InformationService {
    @Autowired
    OptionMapper optionMapper;
    @Autowired
    UserMapper userMapper;

    @Override
    @Transactional
    public boolean setInformation(String blogName, String blogDomain) {
        OptionExample blogNameExample = new OptionExample();
        OptionExample blogDomainExample = new OptionExample();
        blogNameExample.or().andOption_nameEqualTo("blogName");
        blogDomainExample.or().andOption_nameEqualTo("blogDomain");
        Option blogNameOption = new Option();
        Option blogDomainOption = new Option();
        blogNameOption.setOption_value(blogName);
        blogDomainOption.setOption_value(blogDomain);
        if (optionMapper.updateByExampleSelective(blogNameOption,blogNameExample) != 0 &&
        optionMapper.updateByExampleSelective(blogDomainOption,blogDomainExample)!=0)
            return true;
        return false;
    }

    public List<Option> getInformation() {
        OptionExample example = new OptionExample();
        //example.createCriteria().andOption_nameEqualTo("blogDomain");
        example.or().andOption_nameEqualTo("blogName");
        example.or().andOption_nameEqualTo("blogDomain");
        List<Option> list = optionMapper.selectByExample(example);
        return list;
    }

    @Override
    public String getName() {
        UserExample example = new UserExample();
        String userName = userMapper.selectByExample(example).get(0).getUser_username();
        return userName;
    }
}
