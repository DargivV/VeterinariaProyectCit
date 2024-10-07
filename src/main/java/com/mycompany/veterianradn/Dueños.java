 
package com.mycompany.veterianradn;

import java.util.ArrayList;

 
public class Dueños {
    
    private int IDDueño ;
     private String nombre;
     private String dirrecion ;
     private int telf ; 
     private ArrayList<Mascota> mascotas;

    public Dueños(int IdDueño, String nombre, String dirrecion, int telf   ) {
        this.IDDueño = IdDueño;
        this.nombre = nombre;
        this.dirrecion = dirrecion;
        this.telf = telf;
        this.mascotas = new ArrayList<>(); 
    }

     
public void AgregarMascota(Mascota mascota) 
        {
            mascotas.add(mascota); 
        }
    
    public int getIDPaciente() {
        return IDDueño;
    }

    public void setIDPaciente(int IDPaciente) {
        this.IDDueño = IDPaciente;
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
        return mascotas; 
    }

    public void setMascota(ArrayList<Mascota> mascota) {
        this.mascotas = mascota;
    }

    @Override
    public String toString() {
        return "Cliente{" + "IDPaciente=" + IDDueño + ", nombre=" + nombre + ", dirrecion=" + dirrecion + ", telf=" + telf + ", mascotas=" + mascotas + '}';
    }

   
    
    
    
 

    
    
}
