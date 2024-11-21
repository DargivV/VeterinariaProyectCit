 
package modelo.EntidadesBD;
 
public class medico {
    private int id_medico;
    private String nombre;
    private int id_local;  // llave f del local
    private String apellido_M;
    private String apellido_P;
    private int telf;

    // Constructor
    public medico(int id_medico, String nombre, int id_local, String apellido_M, String apellido_P, int telf) { // debe de aver un local ya exsitido
        this.id_medico = id_medico;
        this.nombre = nombre;
        this.id_local = id_local;
        this.apellido_M = apellido_M;
        this.apellido_P = apellido_P;
        this.telf = telf;
    }
 
    public int getId_medico() {
        return id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_local() {
        return id_local;
    }

    public void setId_local(int id_local) {
        this.id_local = id_local;
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

    public int getTelf() {
        return telf;
    }

    public void setTelf(int telf) {
        this.telf = telf;
    }
 
    public String MostrarMedico() {
        return "medico{" +
                "id_medico=" + id_medico +
                ", nombre='" + nombre + '\'' +
                ", id_local=" + id_local +
                ", apellido_M='" + apellido_M + '\'' +
                ", apellido_P='" + apellido_P + '\'' +
                ", telf=" + telf +
                '}';
    }
}
