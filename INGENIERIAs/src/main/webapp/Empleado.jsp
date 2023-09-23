<%@page import="datos.Conexio"%>
<%@page import="web.MostrarDatos"%>
<%@page import="dominio.Empleado" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Datos del Empleado</title>
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

        #consulta-empleado {
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

        #datos-empleado {
            margin-top: 20px;
        }

        .dato {
            margin-bottom: 10px;
        }

        .dato label {
            font-weight: bold;
        }

        .dato span {
            margin-left: 10px;
        }
    </style>
</head>
<body>
    <div id="header">
        <div id="logo">
            <img src="logo.png" alt="Logo de la empresa">
        </div>
        <h1>DATOS DEL EMPLEADO</h1>
    </div>

    <div id="consulta-empleado">
        <img id="imagen-empleado" src="placeholder.jpg" alt="Foto del empleado">

      

        <div id="datos-empleado">
            <div class="dato">
                <h2>Nombre: ${empleado.nombre}</h2>
            </div>
            <div class="dato">
                <h2>Apellido: ${empleado.apellido}</h2>
            </div>
            <div class="dato">
                <h2>Numero de cedula: ${empleado.cedula}</h2>
            </div>
            <div class="dato">
                <h2>Departamento: ${empleado.departamento}</h2>
            </div>
            <div class="dato">
                <h2>Jefe: ${empleado.jefe}</h2>
            </div>
            <div class="dato">
                <h2>Numero de celular: : ${empleado.telefono}</h2>
            </div>
            
            
            <a href="index.jsp">Pagina principal</a>
            
        </div>
    </div>
</body>
</html>

