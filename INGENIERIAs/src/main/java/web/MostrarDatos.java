
package web;

import datos.Conexio;
import dominio.Empleado;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MostrarDatos", urlPatterns = {"/MostrarDatos"})
public class MostrarDatos extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String cedula = request.getParameter("cedula");
        

        boolean isValidUser = Conexio.verificacion(cedula);
        if (isValidUser) {

            Empleado empleado = Conexio.obtenerEmpleado(cedula);
            request.setAttribute("empleado", empleado);
            request.getRequestDispatcher("Empleado.jsp").forward(request, response);

        } else {
            response.sendRedirect("index.jsp");
        }
    }
}
