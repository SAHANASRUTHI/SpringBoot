package com.kgisl.sb1.entity;

import org.springframework.data.annotation.Id;

public record User(@Id int id,String userid,String uname,String email,String upassword,String urole) {
    

}
