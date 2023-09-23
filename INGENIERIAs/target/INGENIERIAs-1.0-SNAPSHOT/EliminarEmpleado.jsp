

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Eliminar Empleado</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                margin: 0;
                padding: 0;
            }

            #header {
                text-align: center;
                background-color: #007bff;
                color: #fff;
                padding: 20px 0;
            }

            #logo {
                float: left;
                margin-left: 20px;
            }

            #eliminar-empleado {
                width: 80%;
                margin: 0 auto;
                padding: 20px;
            }

            #imagen-empleado {
                float: right;
                width: 200px;
                height: 200px;
                margin-right: 20px;
                margin-bottom: 20px;
            }

            .campo {
                display: block;
                margin-top: 20px;
            }

            .campo label {
                font-weight: bold;
            }

            .campo input {
                width: 100%;
                padding: 10px;
                margin-bottom: 20px;
                border: 1px solid #ccc;
                border-radius: 3px;
            }

            #eliminar-btn {
                background-color: #d9534f;
                color: #fff;
                border: none;
                padding: 10px 20px;
                border-radius: 3px;
                cursor: pointer;
            }

            #regresar-btn {
                background-color: #007bff;
                color: #fff;
                border: none;
                padding: 10px 20px;
                border-radius: 3px;
                cursor: pointer;
            }
        </style>
    </head>
    <body>
        <div id="header">
            <div id="logo">
                <img src="logo.png" alt="Logo de la empresa">
            </div>
            <h1>Bienvenidos a WorforcelQ</h1>
        </div>
        
        <form action="Eliminar" method="post">
            <div id="eliminar-empleado">
                <img id="imagen-empleado" src="placeholder.jpg" alt="Foto del empleado">

                <div class="campo">
                    <label for="cedula-input">Número de cedula del Empleado</label>
                    <input type="text" id="cedula-input" name="cedula" placeholder="Ingrese el número de cédula">
                </div>

               <input type="submit" value="liminar" >

            </div>
        </form>
        <a href="index.jsp"><button id="regresar-btn" type="button">Regresar</button></a>

    </body>
</html>
