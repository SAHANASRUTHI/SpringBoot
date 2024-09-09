package com.kgisl.sb1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kgisl.sb1.entity.User;


public interface UserService {
    List<User> getAllUsers();

}
