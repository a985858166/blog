package xin.inote.util;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xin.inote.mapper.UserMapper;
import xin.inote.pojo.User;
import xin.inote.pojo.UserExample;
@Component
public class Md5Password {
    @Autowired
    UserMapper userMapper;
    public boolean isPassword(String password){
        UserExample userExample = new UserExample();
        User user = userMapper.selectByExample(userExample).get(0);
        String hashAlgorithmName = "MD5";
        String credentials = password;
        int hashIterations = 2;
        ByteSource credentialsSalt = ByteSource.Util.bytes(user.getUser_salt());
        String PasswordDB= new SimpleHash(hashAlgorithmName, credentials, credentialsSalt, hashIterations).toString();
        if (user.getUser_password().equals(PasswordDB))
            return true;
        return false;
    }
}
