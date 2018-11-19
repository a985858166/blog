package xin.inote.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.inote.mapper.OptionMapper;
import xin.inote.pojo.Option;
import xin.inote.pojo.OptionExample;
import xin.inote.service.IndexService;

import java.util.List;
@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    OptionMapper optionMapper;
    @Override
    public Option notice() {
        Option option = new Option();
        option.setOption_value("公告为空");
        OptionExample example = new OptionExample();
        example.or().andOption_nameEqualTo("notice");
        List<Option> list = optionMapper.selectByExample(example);
        if (!list.isEmpty()){
            option = list.get(0);
        }
        return option;
    }
}
