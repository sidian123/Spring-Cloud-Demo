package top.sidian123.eureka_client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.sidian123.eureka_client.model.User;

import java.util.LinkedList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaClientApplicationTests {

    @Test
    public void contextLoads() {
        List<User> users=new LinkedList<>();
        User user=new User();
        user.setName("luo");
        user.setSex("男");
        users.add(user);

        System.out.println(users);

        user.setSex("女");

        System.out.println(users);
    }

}
