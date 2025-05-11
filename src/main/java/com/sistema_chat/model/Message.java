package com.sistema_chat.model;

import java.time.LocalDateTime;

public class Message {
    private Integer id;
    private User user;
    private String content;
    private LocalDateTime timesTamp;
    public Message(){

    }
   public Message(Integer id,User user,String content,LocalDateTime timesTamp){
    this.id=id;
    this.user=user;
    this.content=content;
    this.timesTamp=timesTamp;

   }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimesTamp() {
        return timesTamp;
    }

    public void setTimesTamp(LocalDateTime timesTamp) {
        this.timesTamp = timesTamp;
    }

}
