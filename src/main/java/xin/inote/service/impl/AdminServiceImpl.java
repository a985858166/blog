package xin.inote.service.impl;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.inote.mapper.LinkMapper;
import xin.inote.mapper.OptionMapper;
import xin.inote.mapper.UserMapper;
import xin.inote.pojo.*;
import xin.inote.service.AdminService;
import xin.inote.util.Md5Password;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    OptionMapper optionMapper;
    @Autowired
    LinkMapper linkMapper;

    @Override
    public boolean editLink(Link link) {
        LinkExample example = new LinkExample();
        example.or().andLink_idEqualTo(link.getLink_id());
        if (linkMapper.updateByExampleSelective(link,example)>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean delLink(Link link) {
        LinkExample example = new LinkExample();
        example.or().andLink_idEqualTo(link.getLink_id());
        if (linkMapper.deleteByExample(example)>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean addLink(Link link) {
        if (linkMapper.insertSelective(link)>0){
            return true;
        }
        return false;
    }

    @Override
    public List<Link> getLink() {
        LinkExample linkExample = new LinkExample();

        return linkMapper.selectByExample(linkExample);
    }

    @Override
    public boolean setNotice(String notice) {
        try{
            OptionExample example = new OptionExample();
            example.or().andOption_nameEqualTo("notece");
            Option option = new Option();
            option.setOption_value(notice);
            optionMapper.updateByExampleSelective(option,example);
            return true;
        }catch (Exception e){
            return false;
        }

    }

    @Override
    public String getNotece() {
        OptionExample example = new OptionExample();
        example.or().andOption_nameEqualTo("notece");
        return optionMapper.selectByExample(example).get(0).getOption_value();
    }

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

}
