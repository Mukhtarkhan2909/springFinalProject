package com.example.springfinalproject.service;

import com.example.springfinalproject.entity.Users;
import com.example.springfinalproject.repository.UserRepo;
import com.example.springfinalproject.service.serviceInterface.UserServiceIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserServiceIn, UserDetailsService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void addUser(Users users) {
        users.setPassword(passwordEncoder.encode(users.getPassword()));
        userRepo.saveAndFlush(users);
    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public void updateUser(Long id, Users users) {
        users.setPassword(passwordEncoder.encode(users.getPassword()));
        users.setId(id);
        userRepo.saveAndFlush(users);
    }

    @Override
    public Optional<Users> getUserById(Long id) {
        return userRepo.findById(id);
    }

    @Override
    public List<Users> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Users users = userRepo.findByUsername(s);
        if (users == null) {
            throw new UsernameNotFoundException("User " + s + " not found.");
        }
        return users;
    }
}
