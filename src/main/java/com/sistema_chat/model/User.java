package com.sistema_chat.model;

import java.time.LocalDate;

public class User extends Person {
    private String email;
    private String password;
    public User(String name, String lastName, String genre, LocalDate birthdate, String email,String password) {
        super(name, lastName, genre, birthdate);
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
