package com.example.login.service;

import com.example.login.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User createUser(String username,String email, String password);
}
