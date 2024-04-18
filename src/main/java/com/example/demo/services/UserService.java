package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepo;

@Service
public class UserService {

    @Autowired
    UserRepo uRepo;

    public User addUser(User u){
        return uRepo.save(u);
    }

    public List<User> getAllUsers(){
        return uRepo.findAll();
    }
    
}
