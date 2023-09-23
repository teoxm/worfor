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

@WebServlet(name = "Eliminar", urlPatterns = {"/Eliminar"})
public class Eliminar extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtén el ID del usuario a eliminar desde los parámetros de la solicitud
        

          String cedula = request.getParameter("cedula");

        if (cedula != null && !cedula.isEmpty()) {
            // Aquí debes escribir la lógica para eliminar al usuario directamente desde la base de datos
            // Esto dependerá de cómo estés accediendo a tu base de datos y la estructura de la misma.

            // Por ejemplo, si estás utilizando JDBC:
            Connection con = null;
            PreparedStatement stmt = null;
            
            try {
                con = Conexio.getConnection(); // Obtén tu conexión a la base de datos
                String sql = "DELETE FROM empleado WHERE cedula=?";
                stmt = con.prepareStatement(sql);
                stmt.setString(1, cedula);
                
                int filasAfectadas = stmt.executeUpdate();
                
                if (filasAfectadas > 0) {
                    // Empleado eliminado con éxito
                    response.sendRedirect("index.jsp"); // Redirige a una página de confirmación
                } else {
                    // No se pudo eliminar al empleado, redirige a una página de error
                    response.sendRedirect("index.jsp");
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
                // Manejo de errores de base de datos
                response.sendRedirect("index.jsp");
            } finally {
                // Cierra las conexiones y recursos aquí si es necesario
                Conexio.close(con);
                Conexio.close(stmt);
            }
        } else {
            // La cédula no está presente en la solicitud, manejo de error
            response.sendRedirect("index.jsp");
        }
        }
    }
