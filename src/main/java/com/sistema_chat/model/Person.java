package com.sistema_chat.model;

import java.time.LocalDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
@MappedSuperclass
public abstract  class Person {
   @Id
   @GeneratedValue(strategy=GenerationType.SEQUENCE)
   private Long id;
   private String name;
   private String lastName;
   private Genre getGenre;
   private LocalDate birthdate;

   public Person(String name, String lastName,String genre, LocalDate birthdate){
      this.name=name;
      this.lastName=lastName;
      chooseGenre(genre);
      this.birthdate=birthdate;
   }
   public Person(){  }
   private void chooseGenre(String getGenre){
      if(getGenre.equals("Hombre")){
         this.getGenre=Genre.HOMBRE;
      }else if(getGenre.equals("Mujer")){
         this.getGenre=Genre.MUJER;
      }
   }
   
    
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

    public Genre getGetGenre() {
        return getGenre;
    }

    public void setGetGenre(Genre getGenre) {
        this.getGenre = getGenre;
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


}
