package com.sistema_chat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sistema_chat.model.User;

public class UserDAO {

    private final Connection connection;

    public UserDAO(Connection connection) {
        this.connection = connection;
    }

    public User validateUser(String username) {
        String sql = "SELECT * FROM users WHERE username = ?";
        User user = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, username);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    user = new User();
                    user.setUserName(resultSet.getString("username"));       // Usa el nombre correcto de columna
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
