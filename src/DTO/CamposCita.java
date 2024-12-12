package DTO;
import java.util.Date;
  
public class CamposCita {
    private int codCita;
    private int idMascota;
    private int idDoctor;
    private int tipoCita;
    private Date fecha;
    private String motivo;

    // Constructor vacío
    public CamposCita() {}

    // Constructor con parámetros
    public CamposCita(int codCita, int idMascota, int idDoctor, int tipoCita, Date fecha, String motivo) {
        this.codCita = codCita;
        this.idMascota = idMascota;
        this.idDoctor = idDoctor;
        this.tipoCita = tipoCita;
        this.fecha = fecha;
        this.motivo = motivo;
    }

    // Métodos setters
    public void setCodCita(int codCita) {
        this.codCita = codCita;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public void setTipoCita(int tipoCita) {
        this.tipoCita = tipoCita;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    // Métodos getters
    public int getCodCita() {
        return codCita;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public int getTipoCita() {
        return tipoCita;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getMotivo() {
        return motivo;
    }

   public Object[] RegistroCita(int numeracion) {
    Object[] fila = {
        numeracion, 
        this.codCita, 
        this.idMascota, 
        this.idDoctor, 
        this.tipoCita, 
        this.fecha, 
        this.motivo
    };
    return fila;
}

}
