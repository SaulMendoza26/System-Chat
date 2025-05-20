package com.sistema_chat.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(description="Este servlet maneja los registros de los usuarios que quieren usar el sistema de char", 
urlPatterns={"/register"})
public class RegisterServlet extends  HttpServlet {
 @Override
 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
     req.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(req, resp);
 }
 @Override
 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
     super.doPost(req, resp);
 }
}
