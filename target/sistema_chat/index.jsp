
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
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
                <form class="form-login container-flex-column" action="/home" >
                    <label class="label-name labels" for="user">Ingrese su usuario o email:</label>
                    <input class="input-name inputs" type="text" id="user" name="name-user" placeholder="example@gmail.com">
                    <label class="label-password labels" for="password">Ingrese su contraseña:</label>
                    <input class="input-password inputs" id="password" type="password" name="name-password" placeholder="**************">
                    <input class="input-buttom-login inputs-buttom" type="submit" value="Ingresar">
                    <div class="error-login bg-error"> 
                         <p class="label-error">Su usuario o contraseña es incorrecto</p></div>
                  
                </form>
                <a class="direction-logout" href="/logout">Registrarse</a>
            </div>
        </div>
    </div>
</body>
</html>