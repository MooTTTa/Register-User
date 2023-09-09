package com.registeruser.RegisterUser.controller;

import com.registeruser.RegisterUser.domain.User;
import com.registeruser.RegisterUser.dto.UserDTO;
import com.registeruser.RegisterUser.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping
    public void insert(@RequestBody UserDTO userDTO){
        userService.insert(userDTO);
    }
}
