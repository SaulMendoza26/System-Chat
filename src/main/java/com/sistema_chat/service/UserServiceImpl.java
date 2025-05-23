package com.sistema_chat.service;

import java.util.Optional;

import com.sistema_chat.dao.UserDAO;
import com.sistema_chat.exception.ServiceException;
import com.sistema_chat.model.Genre;
import com.sistema_chat.model.User;
import com.sistema_chat.validation.UserValidator;
import java.time.LocalDate;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public boolean register(User user) {

        Optional<User> existe = userDAO.findByUsername(user.getName());
        if (existe.isPresent()) {
            return false;
        }
        userDAO.create(user);
        return true;
    }

    @Override
    public Optional<User> login(String username, String password) {
        return userDAO.findByUsernameAndPassword(username, password);
    }
    @Override
    public void register(String name, String lastName, String yearBirthday, 
    String monthBirtday, String dayBirthday, String genreString, 
    String email, String newPassword) throws ServiceException {

        UserValidator.validateLengthAndEmpty(name, "nombre");
        UserValidator.validateLengthAndEmpty(lastName, "apellido");
        LocalDate dateBirthDate = UserValidator.validateBirthDate(yearBirthday, monthBirtday, dayBirthday);
        Genre genre = UserValidator.validatGenre(genreString);
        Optional<User> user = Optional.of(new User(name, lastName, genre, dateBirthDate, email, newPassword));
        userDAO.create(user.get());
    }

}
