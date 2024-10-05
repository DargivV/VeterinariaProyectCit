 
package com.mycompany.veterianradn;

import java.util.ArrayList;

 
public class Paciente {
    
    private int IDPaciente ;
     private String nombre;
     private String dirrecion ;
     private int telf ; 
     private ArrayList<Mascota> mascota;

    public Paciente(int IDPaciente, String nombre, String dirrecion, int telf, Mascota mascota) {
        this.IDPaciente = IDPaciente;
        this.nombre = nombre;
        this.dirrecion = dirrecion;
        this.telf = telf;
        this.mascota = new ArrayList<>(); 
    }

     

    public int getIDPaciente() {
        return IDPaciente;
    }

    public void setIDPaciente(int IDPaciente) {
        this.IDPaciente = IDPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public int getTelf() {
        return telf;
    }

    public void setTelf(int telf) {
        this.telf = telf;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascota; 
    }

    public void setMascota(ArrayList<Mascota> mascota) {
        this.mascota = mascota;
    }

   
    
    
    
 

    
    
}
