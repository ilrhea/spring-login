package com.example.login.controller;

import com.example.login.model.Role;
import com.example.login.service.RoleService;
import com.example.login.service.serviceimpl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestController {

    private final RoleService roleService;

    @Autowired
    public TestController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/roles")
    public ResponseEntity<?> getAllRole(){
        List<Role> roles = roleService.findAll();
        return ResponseEntity.ok(roles);
    }
}
