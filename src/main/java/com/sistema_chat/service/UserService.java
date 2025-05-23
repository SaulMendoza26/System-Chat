package com.sistema_chat.service;

import java.util.Optional;

import com.sistema_chat.exception.ServiceException;
import com.sistema_chat.model.User;

public interface UserService {
    boolean register(User user);
    Optional<User> login(String username, String password);
    void register(String name, String lastName,String yearBirthday,String monthBirtday,String dayBirthday,String genreString,String  email,String newPassword) throws ServiceException;
}
