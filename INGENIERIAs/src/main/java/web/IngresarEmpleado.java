package web;

import datos.Conexio;
import datos.DAOempleado;
import dominio.Empleado;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "IngresarEmpleado", urlPatterns = {"/IngresarEmpleado"})
public class IngresarEmpleado extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String cedula = request.getParameter("cedula");
        int departamento = Integer.parseInt(request.getParameter("departamento"));
        int jefe = Integer.parseInt(request.getParameter("jefe"));
        String telefono = request.getParameter("telefono");

        // Realizar la inserción en la base de datos
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = Conexio.getConnection();
            // Query SQL para insertar un nuevo empleado en la tabla
            String query = "INSERT INTO empleado (nombre, apellido, cedula, departamento, jefe, numeroTelefono) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(query);
            statement.setString(1, nombre);
            statement.setString(2, apellido);
            statement.setString(3, cedula);
            statement.setInt(4, departamento);
            statement.setInt(5, jefe);
            statement.setString(6, telefono);
            // Ejecutar la consulta
            int filasAfectadas = statement.executeUpdate();

            if (filasAfectadas > 0) {
                // Inserción exitosa, puedes redirigir a una página de confirmación
                response.sendRedirect("index.jsp");
            } else {
                // Algo salió mal, puedes redirigir a una página de error
                response.sendRedirect("index.jsp");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);

        }finally {
            // Cerrar recursos
            Conexio.close(statement);
            Conexio.close(connection);
        }

        
    }
}
