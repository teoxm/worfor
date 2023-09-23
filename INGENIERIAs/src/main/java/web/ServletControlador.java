
package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Paciente> pacientes = new PacienteDAO().listar();
//        System.out.println("pacientes = " + pacientes);
//        request.setAttribute("pacientes", pacientes);
//        String correo =request.getParameter("correo");
//        String contrasena = request.getParameter("contrasena");
//        
//        PacienteDAO paciente = new PacienteDAO();
//        
//        request.setAttribute("correo", correo);
//        request.setAttribute("contrasena", contrasena);
//        
//        request.getRequestDispatcher("pacientes.jsp").forward(request, response);

    }
}
