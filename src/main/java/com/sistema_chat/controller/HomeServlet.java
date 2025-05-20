package com.sistema_chat.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet(description="Aqui se crea la logica del home y del contenido que tendra", urlPatterns={"/home"})
public class HomeServlet extends  HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         HttpSession session = req.getSession(false);
            if(session==null || session.getAttribute("user")==null){
                resp.sendRedirect("login");
            }
            else{
                req.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(req,resp);
            }
        
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.doPost(req, resp);
    }

}
