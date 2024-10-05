 
package com.mycompany.veterianradn;
 
public class Doctor {
     
    private int IdDoctor;
    private String Nombre;
    private String Especialidad;     
    private String[] Semana; //martes ,jueves taka taka
    private String Hora  ; // las hora de iniico a fin de su dia 

    public Doctor(int IdDoctor, String Nombre, String Especialidad, String[] Dia, String Hora) {
        this.IdDoctor = IdDoctor;
        this.Nombre = Nombre;
        this.Especialidad = Especialidad;
        this.Semana = Dia;
        this.Hora = Hora;
    }

    public int getIdDoctor() {
        return IdDoctor;
    }

    public void setIdDoctor(int IdDoctor) {
        this.IdDoctor = IdDoctor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String[] getDia() {
        return Semana;
    }

    public void setDia(String[] Dia) {
        this.Semana = Dia;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }
    
}
