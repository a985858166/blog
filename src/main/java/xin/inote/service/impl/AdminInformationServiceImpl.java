package xin.inote.service.impl;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xin.inote.mapper.OptionMapper;
import xin.inote.mapper.UserMapper;
import xin.inote.pojo.Option;
import xin.inote.pojo.OptionExample;
import xin.inote.pojo.User;
import xin.inote.pojo.UserExample;
import xin.inote.service.AdminInformationService;

import java.util.List;
@Service
public class AdminInformationServiceImpl implements AdminInformationService {
    @Autowired
    OptionMapper optionMapper;

    @Override
    public boolean setAdmin(String blogUserName, String blogNewPwd) {
        UserExample userExample = new UserExample();
        userExample.or().andUser_usernameEqualTo(blogUserName);
        String hashAlgorithmName = "MD5";
        String salt = new SecureRandomNumberGenerator().nextBytes().toString();
        String credentials = blogNewPwd;
        int hashIterations = 2;
        ByteSource credentialsSalt = ByteSource.Util.bytes(salt);
        String passwordDB= new SimpleHash(hashAlgorithmName, credentials, credentialsSalt, hashIterations).toString();
        User user = new User();
        user.setUser_username(blogUserName);
        user.setUser_password(passwordDB);
        user.setUser_salt(salt);
        if (userMapper.updateByExampleSelective(user,userExample) == 1)
            return true;
        return false;
    }

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
