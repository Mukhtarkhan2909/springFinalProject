package com.example.springfinalproject.controller;

import com.example.springfinalproject.entity.Users;
import com.example.springfinalproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserCon {
    @Autowired
    UserService userService;

    @GetMapping("/list")
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/find/{id}")
    public Users getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id).get();
    }

    @PostMapping("/create")
    public void addUser(@RequestBody Users users) {
        userService.addUser(users);
    }

    @PutMapping("/update/{id}")
    public void updateUser(@PathVariable Long id,
                           @RequestBody Users users) {
        userService.updateUser(id, users);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }
}
