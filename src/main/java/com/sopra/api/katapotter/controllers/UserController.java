package com.sopra.api.katapotter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.api.katapotter.entities.User;
import com.sopra.api.katapotter.services.IUserService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    public IUserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

        @GetMapping("/users/{id}")
    public List<User> getUserById(@PathParam(value = "") int id) {
        return userService.getAllUsers();
    }
}
