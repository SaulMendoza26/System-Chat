package com.sistema_chat.model;

import java.time.LocalDate;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
@MappedSuperclass
public abstract  class Person {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;

   private String name;
   private String lastName;
   private String nickName;
   @Enumerated(EnumType.STRING)
   private Genre  genre;
   private LocalDate birthdate;

   public Person(String name, String lastName,String nickName, Genre genre, LocalDate birthdate){
      this.name=name;
      this.lastName=lastName;
      this.nickName=nickName;
      this.genre = genre;
      this.birthdate=birthdate;
   }
   public Person(){  }

   
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }



}
