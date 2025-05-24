package com.sistema_chat.controller;

import java.io.IOException;
import java.util.Optional;

import com.sistema_chat.dao.UserDAO;
import com.sistema_chat.dao.UserDAOImpl;
import com.sistema_chat.exception.ServiceException;
import com.sistema_chat.model.User;
import com.sistema_chat.service.UserService;
import com.sistema_chat.service.UserServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(description="Logica de inicio de sesion para los usuarios",urlPatterns ={"/login"})
public class LoginServlet extends HttpServlet {
    private UserService userService;

    @Override
    public void init() throws ServletException {
    UserDAO userDAO = new UserDAOImpl();
        userService = new UserServiceImpl(userDAO);

        
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String getName =req.getParameter("userName");
        String getPassword = req.getParameter("userPassword");
        try {
            Optional<User> user =  userService.login(getName, getPassword);
            HttpSession session = req.getSession();
            session.setAttribute("user", user.get());
            
            resp.sendRedirect("home");
        } catch (ServiceException e) {
            req.setAttribute("errorLogin", "<p class='label-error'>"+e.getMessage()+"</p>" );
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
 
        
    }
    
 
}
