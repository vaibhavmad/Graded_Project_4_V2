package com.gl.com.controller;

import com.gl.com.model.Role;
import com.gl.com.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/roles")
    public Role createRole(@RequestBody Role role) {
        return roleService.saveRole(role);
    }
}