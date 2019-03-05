package com.cangzhitao.jbf.security.controller;

import com.cangzhitao.jbf.security.entities.User;
import com.cangzhitao.jbf.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "save")
    public Object save() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        user.setEmail("www15119258@qq.com");

        userRepository.save(user);
        return user;
    }

}
