
package DTO;

public class CamposTipoCita {
    private int id_Tipo;
    private String nombre;

    public CamposTipoCita() {
    }
    
    public CamposTipoCita(int id_Tipo, String nombre) {
        this.id_Tipo = id_Tipo;
        this.nombre = nombre;
    }

    public int getId_Tipo() {
        return id_Tipo;
    }

    public String getNombre() {
        return nombre;
    }
    
}
