package com.example.Ecommerce.API.service;

import com.example.Ecommerce.API.model.User;
import com.example.Ecommerce.API.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepo iUserRepo;


    public List<User> getAllUsers() {
        return iUserRepo.findAll();
    }

    public Optional<User> getUserById(Integer id) {
        return iUserRepo.findById(id);
    }

    public User createUser(User user) {
        return iUserRepo.save(user);
    }

    public void deleteUserById(Integer id) {
        iUserRepo.deleteById(id);
    }
}
