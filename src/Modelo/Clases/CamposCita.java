package Modelo.Clases;

import java.util.Date;

public class CamposCita {
    private int id_cita;
    private int id_mascota;
    private int id_trabajador;
    private Date fecha;
    private String motivo;

    // Constructor vacío
    public CamposCita() {}

    // Constructor con parámetros
    public CamposCita(int idCita, int idMascota, int idTrabajador, Date fecha, String motivo) {
        this.id_cita = idCita;
        this.id_mascota = idMascota;
        this.id_trabajador = idTrabajador;
        this.fecha = fecha;
        this.motivo = motivo;
    }

     public Object[] Registro(int num) {
        Object[] fila = {num, id_cita, id_mascota, id_trabajador, fecha, motivo};
        return fila;
    }
    
    
    
    public int getIdCita() {
        return id_cita;
    }

    public void setIdCita(int idCita) {
        this.id_cita = idCita;
    }

    public int getIdMascota() {
        return id_mascota;
    }

    public void setIdMascota(int idMascota) {
        this.id_mascota = idMascota;
    }

    public int getIdTrabajador() {
        return id_trabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.id_trabajador = idTrabajador;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

     
}
