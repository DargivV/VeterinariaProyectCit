  
package com.mycompany.veterianradn;
 
public class VeterianraDN {

    public static void main(String[] args) {
        String [] HorarioDoc1 =  {"Lunes ","Miercoes ","jeuves ","Viernes"};
        
        Doctor doctor1 = new Doctor(01,"Ramirez","Gatos",HorarioDoc1,"5 pm ");
       Dueños cliente1 = new Dueños (1,"roberto","Los nutriales", 94944);
        Mascota mascota1 = new Mascota (1,"pimpon","Nutria", "Negra ",213,"12",cliente1 ) ;
                
        Mascota mascota2 = new Mascota (2,"Almorset","Cuy", "Mostasa ",213,"12",cliente1 ) ;
         //public Citas(int ID_Cita, String Fecha, int hora, boolean Estado, Doctor doctor, Cliente paciente, Mascota mascota)
         Citas cita1 = new Citas (1,"4/7/7",6,true ,doctor1,cliente1 ,mascota1);
         
         mascota1.AgregarCita(cita1);
         mascota1.mostrarCitas();
         //asasas
//acabas de unir el arrary con la creacion del obj doctor 
        
        //ahora crear el paciente y la mascota 
        // Crear un paciente
      //proceso , cambie muchas cosas toy llendo a comer couch , depues lo soluciono 
                
                }
}
