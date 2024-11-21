 
package modelo.EntidadesBD;

 
public class Dueno {//
    private int id_dueno;
    private String nombreDuenio;
    private String apellido_M;
    private String apellido_P;
    private int correo;
    private int telefono;
 
    
     
    public Dueno(int id_dueno, String nombreDuenio, String apellido_M, String apellido_P, int correo, int telefono) {
        this.id_dueno = id_dueno;
        this.nombreDuenio = nombreDuenio;
        this.apellido_M = apellido_M;
        this.apellido_P = apellido_P;
        this.correo = correo;
        this.telefono = telefono;
    }
 
    public int getId_dueno() {
        return id_dueno;
    }

    public void setId_dueno(int id_dueno) {
        this.id_dueno = id_dueno;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public String getApellido_M() {
        return apellido_M;
    }

    public void setApellido_M(String apellido_M) {
        this.apellido_M = apellido_M;
    }

    public String getApellido_P() {
        return apellido_P;
    }

    public void setApellido_P(String apellido_P) {
        this.apellido_P = apellido_P;
    }

    public int getCorreo() {
        return correo;
    }

    public void setCorreo(int correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

 
    public String MostrarDueno() {
        return "Dueno{" +
                "id_dueno=" + id_dueno +
                ", nombreDuenio='" + nombreDuenio + '\'' +
                ", apellido_M='" + apellido_M + '\'' +
                ", apellido_P='" + apellido_P + '\'' +
                ", correo=" + correo +
                ", telefono=" + telefono +
                '}';
    }
}
