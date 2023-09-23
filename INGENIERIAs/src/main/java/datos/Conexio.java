package datos;

import dominio.Empleado;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexio {

    private static final String url = "jdbc:mysql://localhost:3306/worfor?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true"; // URL de la base de datos
    private static final String usuario = "root"; // Nombre de usuario de MySQL
    private static final String contrasena = ""; // Contraseña de MySQL

    public static DataSource getDataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(url);
        ds.setUsername(usuario);
        ds.setPassword(contrasena);
        ds.setInitialSize(50);
        return ds;
    }

    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }

    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(PreparedStatement stmt) {
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(Connection con) {
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static boolean verificacion(String cedula) {
        String query = "SELECT * FROM empleado WHERE cedula = ? ";
        try (Connection conn = getConnection(); 
            PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, cedula);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return false;
    }

    public static Empleado obtenerEmpleado(String cedula) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Empleado empleado = null;
        try {
            connection = getConnection();

            String query = "SELECT * FROM empleado WHERE cedula = ?";
            statement = connection.prepareStatement(query);
            statement.setString(1, cedula);

            //ejecutamos la consulta
            resultSet = statement.executeQuery();

            //Verificar si se encontro un usuario con el correo electronico
            if (resultSet.next()) {
                //obtener los detalles del paciente
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                String cedul = resultSet.getString("cedula");
                int departamento = resultSet.getInt("departamento");
                int jefe = resultSet.getInt("jefe");
                String telefono = resultSet.getString("numeroTelefono");
                

                empleado = new Empleado(nombre, apellido, cedul, departamento, jefe, telefono);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //cerrar los recursos utilizados
            Conexio.close(resultSet);
            Conexio.close(statement);
            Conexio.close(connection);

        }
        return empleado;
    }
}
