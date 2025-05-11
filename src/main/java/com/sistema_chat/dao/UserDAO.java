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

    public User validateUser(String username, String password) throws SQLException {
        String sql = "Select name, password from users where name=? and password=?";
        User user = new User();
        try (PreparedStatement preparedStatement = connection.prepareCall(sql);) {
            preparedStatement.setString(0, username);
            preparedStatement.setString(1, password);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    user.setUserName(resultSet.getString("username"));
                    user.setPassword(resultSet.getString("password"));
                }
            }
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
