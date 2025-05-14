package com.sistema_chat.model.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/mi_basedatos";
    private static final String USER = "saul";
    private static final String PASSWORD = "password";
  
    public static Connection getConnection() {
      
        Connection connection = null;
            try {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);

            } catch (SQLException e) {
                e.printStackTrace();
            }catch(ClassNotFoundException e){
                
            }
     
        return connection;
    }
}
