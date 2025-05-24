package com.sistema_chat.controller;

import java.io.IOException;

import com.sistema_chat.dao.UserDAO;
import com.sistema_chat.dao.UserDAOImpl;
import com.sistema_chat.exception.ServiceException;
import com.sistema_chat.service.UserService;
import com.sistema_chat.service.UserServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(description = "Este servlet maneja los registros de los usuarios que quieren usar el sistema de char", urlPatterns = {
        "/register" })

public class RegisterServlet extends HttpServlet {
    private UserService userService;

    @Override
    public void init() throws ServletException {
        UserDAO userDAO = new UserDAOImpl();
        userService = new UserServiceImpl(userDAO);

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String lastName = req.getParameter("lastName");
        String nickName = req.getParameter("nickName");
        String yeartBirthday = req.getParameter("yearBirthday");
        String monthBirtday = req.getParameter("monthBirtday");
        String dayBirtday = req.getParameter("dayBirtday");
        String genre = req.getParameter("genre");
        String email = req.getParameter("email");
        String newPassword = req.getParameter("new-password");
        try {
            userService.register(name, lastName, nickName,yeartBirthday, monthBirtday, dayBirtday, genre, email, newPassword);
            req.setAttribute("message","<p class='label-error'>"+"Su usuario se creado con exito!!"+"</p>" );
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        } catch (ServiceException e) {
            req.setAttribute("error","<p class='label-error'>"+e.getMessage()+"</p>" );
            req.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(req, resp);
        }
    }
}
