package com.kgisl.sb1.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.kgisl.sb1.entity.User;

@Repository
public interface UserRepository extends ListCrudRepository<User,Long>{
    
}
