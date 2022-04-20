package com.demo.bankapp.service;

import com.demo.bankapp.model.User;
import com.demo.bankapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> findById(Integer id){
        return userRepository.findAll();
    }
}
