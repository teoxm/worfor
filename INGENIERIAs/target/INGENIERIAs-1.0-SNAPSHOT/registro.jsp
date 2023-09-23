
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Registro de Empleado</title>
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

            #registro-empleado {
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

            #guardar-btn, #regresar-btn {
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
            <h2>Registro de Empleado</h2>
        </div>
        <div id="registro-empleado">
            <img id="imagen-empleado" src="placeholder.jpg" alt="Foto del empleado">
            <form action="IngresarEmpleado" method="post">
                <div class="campo">
                    <label for="nombre-input">Nombre:</label>
                    <input type="text" id="nombre-input" name="nombre" placeholder="Ingrese el nombre">
                </div>

                <div class="campo">
                    <label for="apellido-input">Apellido:</label>
                    <input type="text" id="apellido-input" name="apellido" placeholder="Ingrese el apellido">
                </div>

                <div class="campo">
                    <label for="fecha-contratacion-input">Numero de cedula:</label>
                    <input type="text" id="fecha-contratacion-input" name="cedula" placeholder="Ingrese el numero de cedula">
                </div>
                
                 <div class="campo">
                    <label for="departamento-input">Departamento:</label>
                    <input type="text" id="departamento-input" name="departamento" placeholder="Ingrese el departamento">
                </div>
                
                 <div class="campo">
                    <label for="departamento-input">Numero del id del jefe:</label>
                    <input type="text" id="departamento-input" name="jefe" placeholder="Ingrese el numero del id del jefe">
                </div>
                
                <div class="campo">
                    <label for="telefono-input">Número de Teléfono:</label>
                    <input type="tel" id="telefono-input" name="telefono" placeholder="Ingrese el número de teléfono">
                </div>

               



                <input type="submit" value="Guardar" >
            </form>

            <br>

            <a href="index.jsp"><button id="regresar-btn" type="button">Regresar</button></a>
        </div>
    </body>
</html>
