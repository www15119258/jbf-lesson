package com.cangzhitao.jbf.security.controller;

import com.cangzhitao.jbf.security.entities.User;
import com.cangzhitao.jbf.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "get/{id}")
    public Object get(@PathVariable Long id) {
        return userRepository.findById(id).get();
    }

    @PostMapping(value = "save")
    public Object save(User user) {
        userRepository.save(user);
        return user;
    }

    @PostMapping(value = "save1")
    public Object save1(@RequestBody User user) {
        userRepository.save(user);
        return user;
    }

    @PutMapping(value = "edit")
    public Object edit(@RequestBody User user) {
        userRepository.save(user);
        return user;
    }

    @DeleteMapping(value = "delete/{id}")
    public void delete(@PathVariable Long id) {
        User user = userRepository.findById(id).get();
        if (user != null) {
            userRepository.delete(user);
        }
    }

}
