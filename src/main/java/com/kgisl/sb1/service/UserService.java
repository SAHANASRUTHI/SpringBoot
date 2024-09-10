package com.kgisl.sb1.service;

import java.util.List;

import com.kgisl.sb1.entity.Person;
import com.kgisl.sb1.entity.User;


public interface UserService {
    List<User> getAllUsers();

    User createUser(User user);

    User getUserById(int id);

    User updateUser(int id, User updatedUser);

    void deletePerson(int id);

}
