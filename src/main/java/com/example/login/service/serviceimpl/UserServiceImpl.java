package com.example.login.service.serviceimpl;

import com.example.login.model.Password;
import com.example.login.model.User;
import com.example.login.repository.PasswordRepository;
import com.example.login.repository.UserRepository;
import com.example.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final PasswordRepository passwordRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, PasswordRepository passwordRepository) {
        this.userRepository = userRepository;
        this.passwordRepository = passwordRepository;
    }

    @Override
    public User createUser(String username, String email, String password) {
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        userRepository.save(user);

        // save password in another table .
        Password pwd = new Password(user.getId(),password);
        passwordRepository.save(pwd);

        return null;
    }
}
