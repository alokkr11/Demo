package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;

@RestController
public class UserController {

    @Autowired
    UserService uService;

    @GetMapping("/")
    public void demo(){
        System.out.println("application is running");
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User u){
        return uService.addUser(u);
    }

    @GetMapping("/user")
    public List<User> getUsers(){
        return uService.getAllUsers();
    }
    
}
