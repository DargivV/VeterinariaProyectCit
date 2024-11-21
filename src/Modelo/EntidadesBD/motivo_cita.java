 
package modelo.EntidadesBD;
 
public class motivo_cita {
    private int id_motivo_cita ;
    private String nombreMotivo ; 

    public motivo_cita(int id_motivo_cita, String nombreMotivo) {
        this.id_motivo_cita = id_motivo_cita;
        this.nombreMotivo = nombreMotivo;
    }

    public int getId_motivo_cita() {
        return id_motivo_cita;
    }

    public void setId_motivo_cita(int id_motivo_cita) {
        this.id_motivo_cita = id_motivo_cita;
    }

    public String getNombreMotivo() {
        return nombreMotivo;
    }

    public void setNombreMotivo(String nombreMotivo) {
        this.nombreMotivo = nombreMotivo;
    }
    
    
}
