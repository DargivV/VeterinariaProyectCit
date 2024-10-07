 
package com.mycompany.veterianradn;

import java.util.ArrayList;

 
public class Mascota {
    
    private int IdMascota;
     private String Nombre;
     private String Especie ;
     private String Raza ;  
     private int FechaNaci ; //edad ? 
     private String Genero;
     private Dueños paciente ;
     private ArrayList<Citas> citas; 

    public Mascota(int IdMascota, String Nombre, String Especie, String Raza, int FechaNaci, String Genero, Dueños paciente) {
        this.IdMascota = IdMascota;
        this.Nombre = Nombre;
        this.Especie = Especie;
        this.Raza = Raza;
        this.FechaNaci = FechaNaci;
        this.Genero = Genero;
        this.paciente = paciente;
        this.citas= new ArrayList <>(); // incio la lista 
    }

    public int getIdMascota() {
        return IdMascota;
    }

    public void setIdMascota(int IdMascota) {
        this.IdMascota = IdMascota;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public int getFechaNaci() {
        return FechaNaci;
    }

    public void setFechaNaci(int FechaNaci) {
        this.FechaNaci = FechaNaci;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public Dueños getPaciente() {
        return paciente;
    }

    public void setPaciente(Dueños paciente) {
        this.paciente = paciente;
    }

    public ArrayList<Citas> getCita() {
        return citas;
    }

    public void setCita(ArrayList<Citas> cita) {
        this.citas = cita;
    }
 
public void AgregarCita(Citas citas){
this.citas.add(citas);
}; 
   
 public void mostrarCitas() {
        System.out.println("Citas para la mascota " + Nombre + ":");
        for (Citas cita : citas) {
            System.out.println(cita);
        }
    }



}
    
    
     
