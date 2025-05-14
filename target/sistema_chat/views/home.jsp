<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ page isELIgnored="false" %>

                <!DOCTYPE html>
                <html lang="es">

                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <link rel="stylesheet" href="../css/login/style.css">
                    <link rel="stylesheet" href="../css/home/home.css">
                    <title>ChatSistema</title>
                </head>

                <body>
                    <header class="container-header">
                    </header>
                    <div class="container-nav">
                        <nav class="box container-nav">
                            <div class="box-left">
                                <img class="icon-image-user" src="./images/icons/homes/muestra.jpg" alt="prueba">
                                <p class="labels">
                                    ${user.getUserName()}
                                </p>
                            </div>
                            <div class="box-right">
                                <input class="input-search inputs" type="text" placeholder="Buscar 🔍">
                                <img class="icon-image-lupa" src="" alt="lupa">
                            </div>
                        </nav>
                    </div>

                    <div class="box-container-chat">
                        <section class="chat-left">
                            <div class="box-chat">
                                <ul>

                                </ul>
                            </div>
                            <div class="message-send">
                                <input class="inputs input-send-message" type="text">
                                <input class="input-buttom-login" type="submit">
                            </div>
                        </section>
                        <section class="chat-right">

                        </section>
                    </div>

                </body>

                </html>