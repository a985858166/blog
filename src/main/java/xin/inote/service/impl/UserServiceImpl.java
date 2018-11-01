package xin.inote.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.inote.mapper.UserMapper;
import xin.inote.pojo.User;
import xin.inote.pojo.UserExample;
import xin.inote.service.UserService;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User getByName(String name) {
        UserExample example = new UserExample();
        example.createCriteria().andUser_usernameEqualTo(name);
        List<User> users = userMapper.selectByExample(example);
        if(users.isEmpty())
            return null;
        return users.get(0);
    }
}
