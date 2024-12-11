package Modelo.Clases;
public class CamposEmpleado extends CamposPersona{
    private int cod_EMPLEADO;
    private String tipo_empleado;
    private String turno;
    public CamposEmpleado(int cod, String DNI, String Apellido_P, String Apellido_M, String nombres, 
            String telefono, String correo, String direccion, String fecha_Naci, String tipo, String turno) {
        super(DNI, Apellido_P, Apellido_M, nombres, telefono, correo, direccion, fecha_Naci);
        cod_EMPLEADO  = cod;
        tipo_empleado = tipo;
        this.turno = turno;
    }
    //getter

    public int getCod_EMPLEADO() {
        return cod_EMPLEADO;
    }
    
    public String getTipo_empleado() {
        return tipo_empleado;
    }
    public String getTurno() {
        return turno;
    } 
}
