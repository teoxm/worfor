package datos;

import dominio.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DAOempleado {

    private static final String SQL_SELECT = "SELECT * FROM empleado ";
    private static final String SQL_SELEC_BY_ID = "SELECT id, nombre, apellido, cedula, departamento"
            + ", direccion, genero, edad, numero_historia_clinica, correo, contrasena FROM paciente WHERE id=?";
    private static final String SQL_INSERT = "INSERT INTO empleado(idEmpleado, nombre, apellido, cedula, departamento, jefe, numeroTelefono) "
            + "VALUES (?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE empleado SET nombre = ?, apellido=?, "
            + "cedula=?, departamento=?, jefe=?, numeroTelefono=?";
    private static final String SQL_DELETE = "DELETE FROM empleado WHERE idEmpleado=?";
    private static final String QUERY = "SELECT * FROM empleado WHERE cedula=?";

    //Creamos el metedo que nos devueklve el listado de empleados 
    public List<Empleado> listar() {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Empleado empleado = null;
        List<Empleado> empleados = new ArrayList<>();
        try {
            con = Conexio.getConnection();//igualamos nuestra variable connection con l clase que creamos anteriormente Conexion
            stmt = con.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idEmpleado = rs.getInt("idEmpleado");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String cedula = rs.getString("cedula");
                int departamento = rs.getInt("departamento");
                int jefe = rs.getInt("jefe");
                String celular = rs.getString("numeroTelefono");

                //creamos el objeto tipo empleado y le pasamos por parametro la información recuperada
                empleado = new Empleado(idEmpleado, nombre, apellido, cedula, departamento, jefe, celular);
                empleados.add(empleado);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);

        } finally {
            Conexio.close(rs);
            Conexio.close(stmt);
            Conexio.close(con);
        }
        return empleados;
    }
    //se procede a crear el metodo para encontrar in empleado por el id

    public Empleado encontrar(Empleado empleado) {
        //inicializamos los tres objetos que nos permiten interactual con la BD
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            con = Conexio.getConnection();
            stmt = con.prepareStatement(SQL_SELEC_BY_ID);
            stmt.setInt(1, empleado.getIdEmpleado());
            rs = stmt.executeQuery();

            rs.absolute(1);

            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            String cedula = rs.getString("cedula");
            int departamento = rs.getInt("departamento");
            int jefe = rs.getInt("jefe");
            String celular = rs.getString("numeroTelefono");

            empleado.setNombre(nombre);
            empleado.setApellido(apellido);
            empleado.setCedula(cedula);
            empleado.setDepartamento(departamento);
            empleado.setJefe(jefe);
            empleado.setTelefono(celular);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexio.close(rs);
            Conexio.close(stmt);
            Conexio.close(con);
        }
        return empleado;
    }
    //metodo para insertar empleados

    public int insertar(Empleado empleado) {
        Connection con = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            con = Conexio.getConnection();
            stmt = con.prepareStatement(SQL_INSERT);

            stmt.setString(1, empleado.getNombre());
            stmt.setString(2, empleado.getApellido());
            stmt.setString(3, empleado.getCedula());
            stmt.setInt(4, empleado.getDepartamento());
            stmt.setInt(5, empleado.getJefe());
            stmt.setString(6, empleado.getTelefono());
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexio.close(stmt);
            Conexio.close(con);
        }
        return rows;

    }
    //METODO PARA ACTUYALIZAR INFORMACION DE UN EMPLEADO

    public int actualizar(Empleado empleado) {
        Connection con = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {

            con = Conexio.getConnection();
            stmt = con.prepareStatement(SQL_UPDATE);

            stmt.setString(1, empleado.getNombre());
            stmt.setString(2, empleado.getApellido());
            stmt.setString(3, empleado.getCedula());
            stmt.setInt(4, empleado.getDepartamento());
            stmt.setInt(5, empleado.getJefe());
            stmt.setString(6, empleado.getTelefono());
            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexio.close(stmt);
            Conexio.close(con);
        }
        return rows;
    }
    
    //metodo para eliminar empleados
    
    public int eliminarEmpleado(Empleado empleado) {
        Connection con = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            con = Conexio.getConnection();
            stmt = con.prepareStatement(SQL_DELETE);

            stmt.setInt(1, empleado.getIdEmpleado());
            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {

            Conexio.close(stmt);
            Conexio.close(con);

        }
        return rows;

    }
    
    //metodo para ingresar al sistema
    
        public void loguin(String cedula){
        
        Connection con = null;
        PreparedStatement stmt = null;
        
        try {
            con = Conexio.getConnection();
            stmt = con.prepareStatement(QUERY);
           
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
}
