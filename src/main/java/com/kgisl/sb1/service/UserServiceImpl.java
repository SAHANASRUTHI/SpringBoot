package com.kgisl.sb1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgisl.sb1.repository.UserRepository;

import java.util.List;

import com.kgisl.sb1.entity.Person;
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

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
    
    @Override
    public User getUserById(int id) {
        return userRepository.findById((long) id).orElse(null);
    }


    @Override
    public User updateUser(int id, User updatedPerson) {
        User person = userRepository.findById((long) id).orElse(null);
        if (person != null) {
            // person.setFirstName(updatedPerson.getFirstName());
            // person.setLastName(updatedPerson.getLastName());
            // person.setEmail(updatedPerson.getEmail());
            return userRepository.save(updatedPerson);
        }
        return null;
    }

    @Override
    public void deletePerson(int id) {
        userRepository.deleteById((long) id);
    }
}
