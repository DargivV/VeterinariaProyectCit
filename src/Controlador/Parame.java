package Controlador;


interface Parame {
    String DRIVER = "com.mysql.cj.jdbc.Driver";
    String RUTA = "jdbc:mysql://localhost:3306/veterinariaproyect";
    String USUARIO ="root";
    String CLAVE = "";
    
  //  String Medicamentolist = " SELECT * FROM lista_medicamento ORDER BY 2;";
    
    
    
    String[] titulo = { "ID ayudante", "NOMBRE ayudante", "Id del doctor"};
    String[] tituloMedic = { "ID Medico", "nombre", "Id del local ","Apellidos M","Apellido P","telefono"};
    String[] tituloDue = { "ID Medico", "nombre", "Id del local ","Apellidos M","Apellido P","Correo","telefono"};
    String[] MedicamentoLis = { "id_lista_medicamento","nombre","PrincipioActivo" , "docis", "Fomra farmaceutica","Via administrativa"  };
    String[] tituloCita = { " ID cita " ," Mascota "," Encargado "," fecha  "," Motivo"};
   
    
}
