 
package com.mycompany.veterianradn;

 
public class Mascota {
    
    private int IdMascota;
     private String Nombre;
     private String Especie ;
     private String Raza ;  
     private int FechaNaci ; //edad ? 
     private String Genero;
     private Paciente paciente ;

    public Mascota(int IdMascota, String Nombre, String Especie, String Raza, int FechaNaci, String Genero, Paciente paciente) {
        this.IdMascota = IdMascota;
        this.Nombre = Nombre;
        this.Especie = Especie;
        this.Raza = Raza;
        this.FechaNaci = FechaNaci;
        this.Genero = Genero;
        this.paciente = paciente;
    }

   
    }
    
    //meter como dewpendencia cita
    
    
     
