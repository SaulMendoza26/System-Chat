package com.sistema_chat.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "USERS")
public class User extends Person {
    private String email;
    private String password;
    public User(String name, String lastName,String nickName, Genre genre, LocalDate birthdate, String email,String password) {
        super(name, lastName,nickName ,genre, birthdate);
        this.email=email;
        this.password=password;
    }
    public User(){}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  
    

}
