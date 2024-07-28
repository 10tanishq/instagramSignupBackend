package com.instagram.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagram.login.dao.UserRepository;
import com.instagram.login.entity.User;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    public User saveUser(User user) {
        // Add password hashing and other logic here
        return userRepository.save(user);
    }
}

