package com.registeruser.RegisterUser.service;

import com.registeruser.RegisterUser.domain.User;
import com.registeruser.RegisterUser.dto.UserDTO;
import com.registeruser.RegisterUser.repository.UserRepository;
import com.registeruser.RegisterUser.service.exception.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        return userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public User insert(UserDTO userDTO){
        return userRepository.save(new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail()));
    }

    public void delete(Long id){
        findById(id);
        userRepository.deleteById(id);
    }

    public User update(UserDTO user) {
        User newUser = findById(user.getId());
        updateData(newUser, user);
        return userRepository.save(newUser);
    }

    private void updateData(User newUser, UserDTO user) {
        newUser.setName(user.getName());
        newUser.setEmail(user.getEmail());
    }
}
