package com.sistema_chat.controller;

import java.io.IOException;

import com.sistema_chat.dao.UserDAO;
import com.sistema_chat.model.User;
import com.sistema_chat.model.utils.DBConnection;
import com.sistema_chat.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(description="Logica de inicio de sesion para los usuarios",urlPatterns ={"/login"})
public class LoginServlet extends HttpServlet {
    private UserService userService;
    User user;
    UserDAO userDAO;
    @Override
    public void init() throws ServletException {
        userDAO = new UserDAO(DBConnection.getConnection());
        userService = new UserService(userDAO);

        
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String getName =req.getParameter("userName");
        String getPassword = req.getParameter("userPassword");
        user = userDAO.validateUser(getName);
        boolean isReallyAUser = userService.login(getName, getPassword);
        if(isReallyAUser){
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            
            resp.sendRedirect("home");

        }else{
            req.setAttribute("errorLogin", "El nombre del usuario o de la contraseña es incorrecto");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
        
    }
    
 
}
