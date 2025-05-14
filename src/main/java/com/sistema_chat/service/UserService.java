package com.sistema_chat.service;


import com.sistema_chat.dao.UserDAO;
import com.sistema_chat.model.User;




public class UserService {
private final UserDAO userDAO;
public UserService(UserDAO userDAO){
this.userDAO=userDAO;
}
public boolean login(String userName , String password){
        User user = userDAO.validateUser(userName);
    return user!=null && user.getPassword().equals(password);
}
}
