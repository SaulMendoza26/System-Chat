package com.sistema_chat.service;

import java.time.LocalDate;
import java.util.Optional;

import com.sistema_chat.dao.UserDAO;
import com.sistema_chat.exception.ServiceException;
import com.sistema_chat.model.Genre;
import com.sistema_chat.model.User;
import com.sistema_chat.validation.PassworValidator;
import com.sistema_chat.validation.UserValidator;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public boolean registerExist(User user) {

        Optional<User> existe = userDAO.findByNick(user.getNickName());
        return existe.isEmpty();
    }

    @Override
    public Optional<User> login(String nickName, String password) throws ServiceException {
        Optional<User> user = userDAO.findByNick(nickName);
        if(PassworValidator.chekedPassword(password, user.get().getPassword())){
            return userDAO.findByNickAndPassword(nickName, password);
        }
       throw new ServiceException("El nombre del usuario o de la contraseña es incorrecto");
    }
    @Override
    public void register(String name, String lastName, String nickName,String yearBirthday, 
    String monthBirtday, String dayBirthday, String genreString, 
    String email, String newPassword) throws ServiceException {
        
        //Validar el campo de nombre
        UserValidator.validateLengthAndEmpty(name, "nombre");
        //Validar el campo de apellido
        UserValidator.validateLengthAndEmpty(lastName, "apellido");
        //Valirdar el campo de email
        UserValidator.validateEmail(email);
        //Obtener y validar el campo del cumpleaños
        LocalDate dateBirthDate = UserValidator.validateBirthDate(yearBirthday, monthBirtday, dayBirthday);
        //Validar genero
        Genre genre = UserValidator.validateGenre(genreString);
        //Validar password pasar a tipo de dato a encriptado
        String hashPassword = UserValidator.validatePassword(newPassword);
        //Validar campo de nickName
        UserValidator.validateLengthAndEmpty(nickName, "nombre de usuario");
        //Crear el objeto de tipo usuario
        User user = new User(name, lastName, nickName,genre, dateBirthDate, email, hashPassword);
        //Agregar el objeto de tipo usuario a la base de datos
        if(registerExist(user)){
            userDAO.create(user);
        }else{
            throw new ServiceException("Este nombre de usuario ya existe elija otro");
        }
        
    }

}
