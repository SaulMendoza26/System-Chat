package com.sistema_chat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sistema_chat.model.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class UserDAO {
   
    private final Connection connection;
    private EntityManager entityManager;
    private EntityManagerFactory entityManagerFactory;
    public UserDAO(Connection connection) {
        this.connection = connection;
    }
    public User findByUserLogin(){
        return new User();
    }
    public User validateUser(String username) {
        String sql = "SELECT * FROM users WHERE username = ?";
        User user = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, username);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    user = new User();
                    user.setName(resultSet.getString("username"));       // Usa el nombre correcto de columna
                    user.setPassword(resultSet.getString("password"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Recomendable no dejar el catch vacío
        }

        return user;
    }

    public Boolean registerUser(User user) {
        return false;
    }

    private User user2(String userName,String userPassword){
        return new User();
    }
}
