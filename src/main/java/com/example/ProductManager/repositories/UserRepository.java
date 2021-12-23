package com.example.ProductManager.repositories;

import com.example.ProductManager.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findUserByEmail(String email);

}
