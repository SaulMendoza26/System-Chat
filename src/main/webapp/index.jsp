
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/login/style.css">
    <title>Servicio de chat</title>

</head>
<body>
    <div class="container-main">
        <div class="container-login container-flex-column">
            <h1 class="label-title labels">Login</h1>
            <div class="container-form-login container-flex-column">
                <form class="form-login container-flex-column" action="login" method="post" >
                    <label class="label-name labels" for="user">Ingrese su usuario o email:</label>
                    <input class="input-name inputs" type="text" id="user" name="userName" placeholder="example@gmail.com">
                    <label class="label-password labels" for="password">Ingrese su contraseña:</label>
                    <input class="input-password inputs" id="password" type="password" name="userPassword" placeholder="**************">
                    <input class="input-buttom-login inputs-buttom" type="submit" value="Ingresar">
                    <div class="error-login bg-error"> 
                         <p class="label-error">
                            ${errorLogin}
                         </p></div>
                </form>
                <a class="direction-logout" href="/logout">Registrarse</a>
            </div>
        </div>
    </div>
</body>
</html>