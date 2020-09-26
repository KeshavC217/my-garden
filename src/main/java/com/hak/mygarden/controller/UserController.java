package com.hak.mygarden.controller;

import com.hak.mygarden.models.User;
import com.hak.mygarden.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    //Below is the REST API functionalities
    //Get all plants
    @GetMapping("users")
    public List<User> getAllUsers(){
        return this.userRepository.findAll();
    }

    // save plant
    @PostMapping("users")
    public User createUsers(@RequestBody User user) {
        return this.userRepository.save(user);
    }

}
