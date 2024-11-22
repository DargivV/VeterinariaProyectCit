 
package Modelo;

 
public class TablaDueno {//
    private int id_dueno;
    private String nombre;
    private String apellido_M;
    private String apellido_P;
    private String correo;
    private int telefono;
 
    public TablaDueno(){}
    
     public Object[] Registro(int num) {
        Object[] fila = {num,id_dueno,nombre,apellido_M, apellido_P, correo, telefono};
        return fila;
    }
     
     
    public int getIddueno() {
        return id_dueno;
    }

    public void setIddueno(int id_dueno) {
        this.id_dueno = id_dueno;
    }

    public String getNombreDueno() {
        return nombre;
    }

    public void setNombreDueno(String nombreDuenio) {
        this.nombre = nombreDuenio;
    }

    public String getApellidoM() {
        return apellido_M;
    }

    public void setApellidoM(String apellido_M) {
        this.apellido_M = apellido_M;
    }

    public String getApellidoP() {
        return apellido_P;
    }

    public void setApellidoP(String apellido_P) {
        this.apellido_P = apellido_P;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}