package com.example.login.service.serviceimpl;

import com.example.login.model.ERole;
import com.example.login.model.Role;
import com.example.login.repository.RoleRepository;
import com.example.login.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

}
