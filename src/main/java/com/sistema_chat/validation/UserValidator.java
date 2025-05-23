package com.sistema_chat.validation;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import com.sistema_chat.exception.ServiceException;
import com.sistema_chat.model.Genre;

public class UserValidator {

    public static void validateLengthAndEmpty(String param, String name) throws ServiceException {
        if (param.isBlank() || param.isEmpty()) {
            throw new ServiceException("El " + name + " se ecuentra vacio");
        }
        if (param.length() > 20) {
            throw new ServiceException("El " + name + " excede el limite de 20 caracteres");
        }

    }

    public static LocalDate validateBirthDate(String year, String month, String day) throws ServiceException {
        if (day.isEmpty() || day.isBlank()) {
            throw new ServiceException("Ingrese el day de tu nacimiento");
        }
        if (month.isEmpty() || month.isBlank()) {
            throw new ServiceException("Ingrese el mes de tu nacimiento");
        }
        if (year.isEmpty() || year.isBlank()) {
            throw new ServiceException("Ingrese el año de tu nacimiento");
        }
        LocalDate dateBirth = null;
        try {
            int dayInt = Integer.parseInt(day);
            int monthInt = Integer.parseInt(month);
            int yearInt = Integer.parseInt(year);
            dateBirth = LocalDate.of(yearInt, monthInt, dayInt);
        } catch (NumberFormatException e) {
            throw new ServiceException("pillin te eh cachado as querido poner un texto verdad andas pilluelo");
        } catch (DateTimeException e) {
            throw new ServiceException("La fecha que ha ingresado no es valida");
        }

        return dateBirth;
    }
    public static Genre validatGenre(String genre) throws ServiceException{
        Genre genreEnum;
        if(genre.equals("HOMBRE")){
            genreEnum = Genre.HOMBRE;
        }
        if(genre.equals("MUJER")){
            genreEnum = Genre.MUJER;
        }else{
            throw new ServiceException("Elija un genero");
        }
        return genreEnum;
    }
}
