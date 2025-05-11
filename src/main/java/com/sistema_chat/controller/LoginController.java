package com.sistema_chat.controller;

import java.io.IOException;

import com.sun.net.httpserver.Request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(description="Logica de inicio de sesion para los usuarios",urlPatterns ={"/login"})
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String getName =req.getParameter("userName");
        String getPassword = req.getParameter("userPassword");
        

    }
    
 
}
