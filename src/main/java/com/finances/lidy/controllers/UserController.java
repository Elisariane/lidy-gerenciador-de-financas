package com.finances.lidy.controllers;

import com.finances.lidy.models.User;
import com.finances.lidy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("users")
    public List<User> getAllUsers(){
        return repository.findAll();
    }

    @GetMapping("user/{id}")
    public User getAllUsers(@PathVariable Long id){
        return repository.getOne(id);
    }

    @PostMapping("user")
    public User saveUser(@RequestBody User user){
        return repository.save(user);
    }



}
