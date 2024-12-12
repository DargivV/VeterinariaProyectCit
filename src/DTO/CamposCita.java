package DTO;
import java.util.Date;
public class CamposCita {
    private int cod_cita;
    private int id_mascota;
    private int id_doctor;
    private int tipo_cita;
    private Date fecha;
    private String motivo;
    // Constructor vacío
    public CamposCita() {}

    public CamposCita(int cod_cita, int id_mascota, int id_doctor, int tipo, Date fecha, String motivo) {
        this.cod_cita = cod_cita;
        this.id_mascota = id_mascota;
        this.id_doctor = id_doctor;
        this.tipo_cita = tipo;
        this.fecha = fecha;
        this.motivo = motivo;
    }
    public int getCod_cita() {
        return cod_cita;
    }
    public int getId_mascota() {
        return id_mascota;
    }

    public int getId_doctor() {
        return id_doctor;
    }

    public int getTipo() {
        return tipo_cita;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getMotivo() {
        return motivo;
    }
    
}
