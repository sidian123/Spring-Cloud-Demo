package top.sidian123.eureka_client.controller;

import org.springframework.web.bind.annotation.*;
import top.sidian123.eureka_client.model.User;

import java.util.LinkedList;
import java.util.List;

/**
 * @author sidian
 * @date 19-7-20 下午12:16
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private List<User> users=new LinkedList<>();

    {
        User user=new User();
        user.setName("luo");
        user.setSex("男");
        users.add(user);

        user=new User();
        user.setSex("女");
        user.setName("李");
        users.add(user);
    }

    @GetMapping("/")
    public List<User> allUsers() throws IllegalAccessException {
        throw new IllegalAccessException("测试");
    }

    @GetMapping("/2")
    public List<User> allUsers2(){
        return users;
    }

    @PostMapping("/")
    public void add(@RequestBody User user){
        users.add(user);
    }
}
