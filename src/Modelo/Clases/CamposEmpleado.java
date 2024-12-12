package Modelo.Clases;

import java.util.Date;

public class CamposEmpleado extends CamposCliente{
    private int cod_EMPLEADO;
    private String tipo_empleado;
    private String turno;

    public CamposEmpleado() {
    }
    
   public CamposEmpleado(int cod, String DNI, String Apellido_P, String Apellido_M, String nombres, 
        String telefono, String correo, String direccion, Date fecha_Naci, String tipo, String turno) {
    super(DNI, Apellido_P, Apellido_M, nombres, telefono, correo, direccion, fecha_Naci); // Llamada al constructor de la clase padre
    this.cod_EMPLEADO = cod;
    this.tipo_empleado = tipo;
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

    public void setCod_EMPLEADO(int cod_EMPLEADO) {
        this.cod_EMPLEADO = cod_EMPLEADO;
    }

    public void setTipo_empleado(String tipo_empleado) {
        this.tipo_empleado = tipo_empleado;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
}
