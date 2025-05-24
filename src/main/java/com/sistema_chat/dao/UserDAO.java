package com.sistema_chat.dao;

import java.util.List;
import java.util.Optional;

import com.sistema_chat.model.User;

public interface UserDAO {
   void create(User user);
   boolean update(User user);
   boolean delete(Long id);

   Optional<User> findById(Long id);
   Optional<User> findByNick(String nick);
   Optional<User> findByNickAndPassword(String nick, String password);
   List<User> findAll();
}
