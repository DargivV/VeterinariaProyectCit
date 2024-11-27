package Controlador;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
//Modelos de las tablas
import Modelo.Clases.CamposdeTabla;
import Modelo.Clases.CamposdeTablaMedico;
import Modelo.Clases.TablaDueno;
//formularios 
import Vista.EstadisticasR;
import Vista.GestionarMAscDueño;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.geom.Area;
import javax.swing.JOptionPane;

public class ControlConectar implements ActionListener {
    
    //titulos de las tablas 
    //Creo que se pueden en un archivo de parametros o meterlos en otra clase 
    String[] titulo = { "ID ayudante", "NOMBRE ayudante", "Id del doctor"};
    String[] tituloMedic = { "ID Medico", "nombre", "Id del local ","Apellidos M","Apellido P","telefono"};
    String[] tituloDue = { "ID Medico", "nombre", "Id del local ","Apellidos M","Apellido P","Correo","telefono"};
   
    EstadisticasR vista;
    GestionarMAscDueño vistaC;//llamar a lformu crear 

    
    
    //esta vaian se repitira segun los form que creen 
    //si se extiende mucho se tendra que crear una clase para solo esto creo.. o le hacemos algo para que no se vea feo 
    public ControlConectar(EstadisticasR fl) {
        vista = fl;
        MostrarDatosAyudantes();
        MostrarDatosMedico();
        //MostrarDatosDuen();
    }
    
     public ControlConectar(GestionarMAscDueño fl) {
        vistaC = fl;
       // MostrarDatosAyudantes();
        MostrarDatosMedico();
       // MostrarDatosDuen();
    }
    
    

    private void MostrarDatosAyudantes() {
        DefaultTableModel mt = new DefaultTableModel(null, titulo);
        if (vista != null) {
        vista.tblDatos.setModel(mt);
           }
           if (vistaC != null) {
        vistaC.tblDatosMedico.setModel(mt);// todas las tablas del mismo tipo deben llamarse igual
    }

        // Conexión a la base de datos
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", ""
            );
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM ayudante ORDER BY 2;");
            
            int num = 0;
            while (rs.next()) {
                CamposdeTabla ar = new CamposdeTabla();
                ar.setIdarea(rs.getInt("id_ayudante"));
                ar.setNomarea(rs.getString("nombre_Ayudan"));
                ar.setLugar(rs.getString("id_medico"));
                num++;
                mt.addRow(ar.Registro(num));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR al conectarse a la BD: " + ex);
        }
    }

    
    private void MostrarDatosMedico() {
        DefaultTableModel mt = new DefaultTableModel(null, tituloMedic);
        //agregar tantos condicionales como formulario de mi vista 
        //usar swicht de preferencia (porque es mas bonito asi)
        if (vista != null) {
        vista.tblDatosMedico.setModel(mt);
           }
           if (vistaC != null) {
        vistaC.tblDatosMedico.setModel(mt); // todas las tablas del mismo tipo deben llamarse igual
    }

        // Conexión a la base de datos
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", ""
            );
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM medico ORDER BY 2;");
            
            int num = 0;
            while (rs.next()) {
                
                CamposdeTablaMedico Medic = new CamposdeTablaMedico();
                
                Medic.setIdMedico(rs.getInt("id_medico"));
                Medic.setNomarea(rs.getString("nombre"));
                Medic.setLugar(rs.getString("id_local"));
                Medic.setApellM(rs.getString("apellido_M"));
                Medic.setApellP(rs.getString("apellido_P"));
                Medic.settelf(rs.getString("telf"));
                num++;
                mt.addRow(Medic.Registro(num));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR al conectarse a la BD: " + ex);
        }
    }

     private void MostrarDatosDuen() {
        DefaultTableModel mt = new DefaultTableModel(null, tituloDue);
        vistaC.tblDueno.setModel(mt);
        if (vista != null) {
        vista.tblDatosMedico.setModel(mt);
           }
           if (vistaC != null) {
        vistaC.tblDatosMedico.setModel(mt);
    }

        // Conexión a la base de datos
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", ""
            );
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM mascota ORDER BY 2;");
            
            int num = 0;
            while (rs.next()) {
                TablaDueno Duen = new TablaDueno();
                Duen.setIddueno(rs.getInt("id_dueno"));
                Duen.setNombreDueno(rs.getString("nombre"));
                Duen.setApellidoM(rs.getString("Apellido_M"));
                Duen.setApellidoP(rs.getString("Apellido_P"));
                Duen.setCorreo(rs.getString("correo"));
                Duen.setTelefono(rs.getInt("telefono"));
                num++;
                mt.addRow(Duen.Registro(num));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR al conectarse a la BD: " + ex);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) { 
    }
}
