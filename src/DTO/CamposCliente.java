
package DTO;

import java.util.Date;

public class CamposCliente {
    private String DNI;
    private String Apellido_P;
    private String Apellido_M;
    private String nombres;
    private String telefono;
    private String correo;
    private String direccion;
    private Date fecha_Naci;
    //Constructor

    public CamposCliente() {
    }
    
    public CamposCliente(String DNI, String Apellido_P, String Apellido_M, String nombres, String telefono, String correo, String direccion, Date fecha_Naci) {
        this.DNI = DNI;
        this.Apellido_P = Apellido_P;
        this.Apellido_M = Apellido_M;
        this.nombres = nombres;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.fecha_Naci = fecha_Naci;
    }
    //G AND S

    public String getDNI() {
        return DNI;
    }

    public String getApellido_P() {
        return Apellido_P;
    }

    public String getApellido_M() {
        return Apellido_M;
    }

    public String getNombres() {
        return nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

 

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setApellido_P(String Apellido_P) {
        this.Apellido_P = Apellido_P;
    }

    public void setApellido_M(String Apellido_M) {
        this.Apellido_M = Apellido_M;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

     public Date getFecha_Naci() {
        return fecha_Naci;
    }

    public void setFecha_Naci(Date fecha_Naci) {
        this.fecha_Naci = fecha_Naci;
    }
    
}
