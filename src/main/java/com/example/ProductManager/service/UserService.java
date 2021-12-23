package com.example.ProductManager.service;

import com.example.ProductManager.repositories.UserRepository;
import com.example.ProductManager.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUserByEmail(String email){
        return userRepository.findUserByEmail(email);
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

}
