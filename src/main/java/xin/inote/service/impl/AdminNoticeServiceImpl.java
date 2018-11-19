package xin.inote.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.inote.mapper.OptionMapper;
import xin.inote.pojo.Option;
import xin.inote.pojo.OptionExample;
import xin.inote.service.AdminNoticeService;
@Service
public class AdminNoticeServiceImpl implements AdminNoticeService {
    @Autowired
    OptionMapper optionMapper;
    @Override
    public String getNotece() {
        OptionExample example = new OptionExample();
        example.or().andOption_nameEqualTo("notice");
        return optionMapper.selectByExample(example).get(0).getOption_value();
    }
    @Override
    public boolean setNotice(String notice) {
        try {
            OptionExample example = new OptionExample();
            example.or().andOption_nameEqualTo("notice");
            Option option = new Option();
            option.setOption_value(notice);
            optionMapper.updateByExampleSelective(option, example);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
