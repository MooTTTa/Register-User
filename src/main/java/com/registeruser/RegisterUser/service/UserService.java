package com.registeruser.RegisterUser.service;

import com.registeruser.RegisterUser.domain.User;
import com.registeruser.RegisterUser.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
}
