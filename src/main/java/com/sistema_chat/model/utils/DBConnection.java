package com.sistema_chat.model.utils;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class DBConnection {
     public static Connection getConnection() throws SQLException {
        String user="saul";
        String password="password";
        String driveUrl="jdbc:postgresql://localhost:5432/mi_basedatos";
        Connection connection =null;
        if(connection ==null){
            try{
                connection = DriverManager.getConnection(driveUrl,user,password);
            }catch(SQLException e){
                System.out.println(e);
            }finally{
                connection.close();
            }
        }
        return connection;    
     }
}
