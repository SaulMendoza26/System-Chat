package com.sistema_chat.service;

import java.util.Optional;

import com.sistema_chat.exception.ServiceException;
import com.sistema_chat.model.User;

public interface UserService {
    boolean registerExist(User user);
    Optional<User> login(String username, String password) throws ServiceException;
    void register(String name, String lastName,String nickName,String yearBirthday,String monthBirtday,String dayBirthday,String genreString,String  email,String newPassword) throws ServiceException;
}
