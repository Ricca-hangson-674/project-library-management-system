package com.nrh.library.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nrh.library.app.entity.User;
import com.nrh.library.app.repository.UserRepository;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}
