package top.sidian123.service_resume.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import top.sidian123.service_resume.model.User;

import java.util.Arrays;
import java.util.List;

/**
 * @author sidian
 * @date 19-7-21 上午7:49
 */
@Component
public class Fallback implements UserService {


    @Override
    public List<User> allUsers() {
        User user=new User();
        user.setName("出故障喽");
        user.setSex("是滴!是滴!!");


        return Arrays.asList(user);
    }

    @Override
    public void add(User user) {

    }

    @Override
    public List<User> allUsers2() {
        return allUsers();
    }
}
