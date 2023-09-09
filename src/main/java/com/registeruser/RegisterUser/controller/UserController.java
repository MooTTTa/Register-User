package com.registeruser.RegisterUser.controller;

import com.registeruser.RegisterUser.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping
    public List<User> findAll(){
        User user = new User(1L, "", "");
        List<User> list = new ArrayList<>();
        list.add(user);
        return list;
    }
}
