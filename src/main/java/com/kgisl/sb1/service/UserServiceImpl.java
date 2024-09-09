package com.kgisl.sb1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgisl.sb1.repository.UserRepository;

import java.util.List;

import com.kgisl.sb1.entity.User;

@Service
public class UserServiceImpl implements UserService {
    //@Autowired
    private UserRepository userRepository;
    UserServiceImpl( UserRepository userRepository ){
       this.userRepository=userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
