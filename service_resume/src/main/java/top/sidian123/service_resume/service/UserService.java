package top.sidian123.service_resume.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import top.sidian123.service_resume.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author sidian
 * @date 19-7-20 下午9:58
 */
@FeignClient(value = "service-client",fallback = Fallback.class,path = "/user")
@ResponseBody
public interface UserService {
    @GetMapping("/")
    public List<User> allUsers();

    @PostMapping("/")
    public void add(@RequestBody User user);

    @GetMapping("/2")
    public List<User> allUsers2();
}
