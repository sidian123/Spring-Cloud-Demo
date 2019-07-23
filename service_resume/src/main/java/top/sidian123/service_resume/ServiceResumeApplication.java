package top.sidian123.service_resume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.sidian123.service_resume.model.User;
import top.sidian123.service_resume.service.UserService;

import java.util.List;


@RestController
@SpringBootApplication
@EnableFeignClients
public class ServiceResumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceResumeApplication.class, args);
    }


    @Autowired
    UserService userService;

    @GetMapping("/")
    public List<User> users(){
        return userService.allUsers();
    }

    @GetMapping("/add")
    public void add(){
        User user=new User();
        user.setName("楼");
        user.setSex("女");

        userService.add(user);
    }
    @GetMapping("/2")
    public List<User> users2(){
        return userService.allUsers2();
    }
}
