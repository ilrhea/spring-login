package com.example.login.service;

import com.example.login.model.ERole;
import com.example.login.model.Role;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface RoleService {
//    Optional<?> findByName(ERole name );

    List<Role> findAll();
}
