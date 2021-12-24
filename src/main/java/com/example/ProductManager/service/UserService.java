package com.example.ProductManager.service;

import com.example.ProductManager.user.User;

public interface UserService {

    public User findUserByEmail(String email);

}
