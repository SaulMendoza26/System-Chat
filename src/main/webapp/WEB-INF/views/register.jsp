<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ page isELIgnored="false" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
            <link rel="stylesheet" href="${pageContext.request.contextPath}/css/register/register.css">

            <title>Register</title>
        </head>

        <body>
            <div class="container-main">
                <div class="container-form-register">
                    <form action="register" method="post">
                        <h1 class="labels label-title title">Registrarse</h1>
                        <div class="container-names container">
                            <input class="inputs input-register " type="text" name="name"
                                placeholder="Ingrese su nombres">
                            <input class="inputs input-register" type="text" name="lastName"
                                placeholder="Ingrese su apellido">
                        </div>
                        <div class="container-birthdates container">
                            <select class="select-yearBirthday selects box" name="yearBirthday"
                                id="year-birthday"></select>
                            <select class="select-monthBirhtday selects box" name="monthBirtday"
                                id="month-birthday"></select>
                            <select class="select-dayBirthday selects box" name="dayBirtday" id="day-birthday"></select>
                        </div>
                        <div class="container-genre container">
                            <div class="option-genre box">
                                <label for="hombre" class="labels">Hombre</label>
                                <input type="radio" id="hombre" name="genre">
                            </div>

                            <div class="option-genre box">
                                <label for="mujer" class="labels">Mujer</label>
                                <input type="radio" id="mujer" name="genre">
                            </div>
                        </div>
                        <div class="container-email containerL">
                            <input class="inputs input-register input-alone" type="email"
                                placeholder="Ingrese su correo electronico" name="email">
                        </div>
                        <div class="container-password containerL">
                            <input class="inputs input-register input-alone" type="password"
                                placeholder="Ingrese su nueva contraseña" name="new-password">
                        </div>
                        <div class="input-form-register">
                            <input type="submit" class="input-buttom-login" value="Registrarse">

                        </div>
                    </form>
                    <a class="links" href="${pageContext.request.contextPath}">Ya tienes una cuenta?</a>
                </div>

            </div>

        </body>
        <script src="${pageContext.request.contextPath}/js/register.js"></script>

        </html>