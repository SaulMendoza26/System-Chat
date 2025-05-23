package com.sistema_chat.dao;

import java.util.List;
import java.util.Optional;

import com.sistema_chat.model.User;

public interface UserDAO {
   User create(User user);
   boolean update(User user);
   boolean delete(Long id);

   Optional<User> findById(Long id);
   Optional<User> findByUsername(String username);
   Optional<User> findByUsernameAndPassword(String username, String password);
   List<User> findAll();
}
