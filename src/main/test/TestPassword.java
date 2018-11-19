import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//表示整合JUnit4进行测试
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TestPassword {
//    @Autowired
//    UserMapper userMapper;
//    @Test
//    public void test(){
//        UserExample userExample = new UserExample();
//        User user = userMapper.selectByExample(userExample).get(0);
//        String hashAlgorithmName = "MD5";
//        String credentials = "12345";
//        int hashIterations = 2;
//        ByteSource credentialsSalt = ByteSource.Util.bytes(user.getUser_salt());
//        String passwordDB= new SimpleHash(hashAlgorithmName, credentials, credentialsSalt, hashIterations).toString();
//        System.out.println(passwordDB.equals(user.getUser_password()));
//
//    }
}
