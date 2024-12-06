package Controlador;
import Modelo.Clases.CamposCita;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import Modelo.Clases.CamposdeTabla;
import Modelo.Clases.CamposdeTablaMedico;
import Modelo.Clases.CamposMedicamentos; 
import Vista.EstadisticasR;
import Vista.GestionarMAscDueño;
import Vista.GestiondeCitas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControlConectar implements Parame {
    // ya lo puse en parametros xd :V
    EstadisticasR vista;
    GestiondeCitas vistaCita;
    GestionarMAscDueño vistaC;//llamar a lformu crear 

    public Connection conexion = null;
    public Statement st= null;
    public ResultSet rs;
    public PreparedStatement ps;
    public ResultSetMetaData mdata;
    
    
    
     public void ConectarBD(){
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(RUTA, USUARIO, CLAVE);
            st=conexion.createStatement();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"ERROR no se puede conectar a la BD..." + ex);
        }
    }
    
    //esta vaian se repitira segun los form que creen 
    //si se extiende mucho se tendra que crear una clase para solo esto creo.. o le hacemos algo para que no se vea feo 
    public ControlConectar(EstadisticasR fl) {
        vista = fl;
        //MostrarDatosAyudantes();
        //MostrarDatosMedico();
        MostrarMedicamento();
        //MostrarDatosDuen();
    }
    
     public ControlConectar(GestionarMAscDueño fl) {
        vistaC = fl;
       // MostrarDatosAyudantes();
       MostrarMedicamento(); 
       //MostrarDatosMedico();
       // MostrarDatosDuen();
    }
    
     public ControlConectar(GestiondeCitas fl) {
        vistaCita = fl;
       // MostrarDatosAyudantes();
        MostrarCitas();
       //MostrarDatosMedico();
       // MostrarDatosDuen();
    }
     
     
    private void MostrarCitas() {
        DefaultTableModel mt = new DefaultTableModel(null, tituloCita);
        if (vistaCita != null) {
        vistaCita.tblCitas1.setModel(mt);
           }
           if (vistaCita != null) {
        vistaCita.tblCitas1.setModel(mt);} // todas las tablas del mismo tipo deben llamarse igual 

        // Conexión a la base de datos
        try {
             ConectarBD();
            ResultSet rs = st.executeQuery("SELECT * FROM citas;");
            
            int num = 0;
            while (rs.next()) {
                CamposCita Ct = new CamposCita();
                Ct.setIdCita(rs.getInt("id_cita"));
                Ct.setIdMascota(rs.getInt("id_mascota"));
                Ct.setIdTrabajador(rs.getInt("id_trabajador"));
                Ct.setFecha(rs.getDate("fecha"));
                Ct.setMotivo(rs.getString("motivo")); 
                num++;
                mt.addRow(Ct.Registro(num));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR al conectarse a la BD: " + ex);
        }
    }
     

    private void MostrarMedicamento() {
        DefaultTableModel mt = new DefaultTableModel(null, MedicamentoLis);
        if (vista != null) {
        vista.tblDatos.setModel(mt);
           }
           if (vistaC != null) {
        vistaC.tblDatosMedico.setModel(mt);// todas las tablas del mismo tipo deben llamarse igual
    }

        // Conexión a la base de datos
        try {
             ConectarBD();
            ResultSet rs = st.executeQuery("SELECT * FROM lista_medicamento ORDER BY 2;");
            
            int num = 0;
            while (rs.next()) {
                CamposMedicamentos ar = new CamposMedicamentos();
                ar.setIdListaMedicamento(rs.getInt("id_lista_medicamento"));
                ar.setNombre(rs.getString("nombre"));
                ar.setPrincipioActivo(rs.getString("Principio activo"));
                ar.setDosis(rs.getInt("dosis"));
                ar.setFormaFarmaceutica(rs.getString("FormaFar"));
                ar.setViaAdministracion(rs.getString("Administracion"));
                num++;
                mt.addRow(ar.Registro(num));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR al conectarse a la BD: " + ex);
        }
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
            ConectarBD();
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
            ConectarBD();
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

     
 
    public void actionPerformed(ActionEvent e) { 
    }
}
