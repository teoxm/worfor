
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Consulta de Empleados - WorkforcelQ</title>
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

            #consulta-empleados {
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

            #cedula-label {
                display: block;
                margin-top: 20px;
            }

            #cedula-input {
                width: 100%;
                padding: 10px;
                margin-bottom: 20px;
                border: 1px solid #ccc;
                border-radius: 3px;
            }

            #buscar-btn {
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
                <img src="logo.png" alt="Logo de WorkforcelQ">
            </div>
            <h1>Bienvenidos a WorkforcelQ</h1>
            <p>Sistema de consulta de empleados</p>
        </div>

        <div id="consulta-empleados">

            <img id="imagen-empleado" src="placeholder.jpg" alt="Foto del empleado">
            <form action="MostrarDatos" method="post">
                <label for="cedula-input" id="cedula-label">Cédula del empleado:</label>
                <input type="text" id="cedula-input" name="cedula" placeholder="Ingrese la cédula del empleado">
                <input type="submit" value="Ingresar" >
            </form>
            <a href="registro.jsp">Registrar nuevo empleado</a>
            <br>
            <a href="EliminarEmpleado.jsp"> Eliminar Empleado de la base de datos</a>


            
        </div>
    </body>
</html>
