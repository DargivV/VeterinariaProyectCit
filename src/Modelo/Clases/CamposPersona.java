
package Modelo.Clases;
public class CamposPersona {
    private String DNI;
    private String Apellido_P;
    private String Apellido_M;
    private String nombres;
    private String telefono;
    private String correo;
    private String direccion;
    private String fecha_Naci;
    //Constructor
    public CamposPersona(String DNI, String Apellido_P, String Apellido_M, String nombres, String telefono, String correo, String direccion, String fecha_Naci) {
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

    public String getFecha_Naci() {
        return fecha_Naci;
    }
    
}
