package com.mycompany.veterianradn;

public class Citas {

    private int ID_Cita;
    private String Fecha;
    private int hora;
    private boolean Estado;
    
    //int IDDoctor;
    private Doctor doctor;

    //int IDPaciente;
    private Paciente paciente ;
    
    //int ID_Mascota;
    private Mascota mascota ; 

    public Citas(int ID_Cita, String Fecha, int hora, boolean Estado, Doctor doctor, Paciente paciente, Mascota mascota) {
        this.ID_Cita = ID_Cita;
        this.Fecha = Fecha;
        this.hora = hora;
        this.Estado = Estado;
        this.doctor = doctor;
        this.paciente = paciente;
        this.mascota = mascota;
    }

    public int getID_Cita() {
        return ID_Cita;
    }

    public void setID_Cita(int ID_Cita) {
        this.ID_Cita = ID_Cita;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    

  
    
    
    
    
}
