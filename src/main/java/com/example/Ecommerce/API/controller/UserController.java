package com.example.Ecommerce.API.controller;

import com.example.Ecommerce.API.model.User;
import com.example.Ecommerce.API.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("user/{id}")
    public Optional<User> getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @PostMapping("userC")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @DeleteMapping("user/{id}")
    public void deleteUserById(@PathVariable Integer id){
        userService.deleteUserById(id);
    }


}
