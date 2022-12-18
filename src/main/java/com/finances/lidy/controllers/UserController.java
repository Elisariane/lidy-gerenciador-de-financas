package com.finances.lidy.controllers;

import com.finances.lidy.entities.User;
import com.finances.lidy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> getAllUsers(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public User getAllUsers(@PathVariable Long id){
        return repository.findById(id).get();
    }

    @PostMapping
    public User saveUser(@RequestBody User user){
        return repository.save(user);
    }



}
