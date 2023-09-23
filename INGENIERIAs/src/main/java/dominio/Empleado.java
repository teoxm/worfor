package dominio;


public class Empleado {
        private int idEmpleado;
    private String nombre;
    private String apellido;
    private String cedula;
    private int departamento;
    private int jefe;
    private String telefono;
    
    public Empleado(String nombre, String apellido, String cedula, int departamento, int jefe, String telefono) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.cedula = cedula;
    this.departamento = departamento;
    this.jefe = jefe;
    this.telefono = telefono;
}

    public Empleado(String nombre, String apellido, String cedula, int departamento, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.departamento = departamento;
        this.telefono = telefono;
    }


    

   
    
    
    public Empleado(int idEmpleado, String nombre, String apellido, String cedula, int departamento, int jefe, String telefono) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.departamento = departamento;
        this.jefe = jefe;
        this.telefono = telefono;
    }
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public int getJefe() {
        return jefe;
    }

    public void setJefe(int jefe) {
        this.jefe = jefe;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", departamento=" + departamento + ", jefe=" + jefe + ", telefono=" + telefono + '}';
    }
   
   
   

 
   
}
