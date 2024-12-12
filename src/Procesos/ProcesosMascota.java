
package Procesos;

import Constantes.ConstantesMascotas;
import Controlador.ControlConectar;
import DAO.DAO_CONECCION;
import DTO.CamposMascota;
import Vista.frmRegistrarMascotas;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

public class ProcesosMascota implements ConstantesMascotas{
    static DefaultTableModel modelo;
    static DefaultComboBoxModel<String> ModeloCombobox;
    static SpinnerNumberModel modeloSpinner;
    public static void Presentacion(frmRegistrarMascotas frmRM){
        frmRM.setTitle("Registro de Mascotas");
        frmRM.setVisible(true);
        frmRM.setSize(1280, 620);
    }
    public static String [][]RecuperarDatosMascota(){
        String data[][] = DAO_CONECCION.recuperarDatos(Consulta, numColum);
        for(int i =0; i<data.length; i++)
            data[i][2] = ObtenerEspecie(Integer.parseInt(data[i][2]));
        return data;
    }
    public static void MostrarEnTabla(frmRegistrarMascotas frm, String data[][]){
        modelo = new DefaultTableModel(data, columnas);
        frm.tbl_RMascota.setModel(modelo);
    }
    public static String ObtenerEspecie(int id){
        Connection conexion = ControlConectar.conectar(); // Método de conexión previamente definido
        String nombre_Especie = null; 
        try {
            // Consulta SQL para recuperar datos de la tabla
            String query = "Select nombre from Especies where id_Especie = ?";
            PreparedStatement st = conexion.prepareStatement(query);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if(rs.next())
                nombre_Especie = rs.getString("nombre");
            conexion.close();
            return nombre_Especie;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nombre_Especie;
    }
    public static CamposMascota ObtenerMascotaID(int id){
        Connection conexion = ControlConectar.conectar(); // Método de conexión previamente definido
        CamposMascota mascota = new CamposMascota();
        try {
            // Consulta SQL para recuperar datos de la tabla
            String query = "Select * from Mascotas where cod_Mascota = ?";
            PreparedStatement st = conexion.prepareStatement(query);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                mascota.setCod_Mascota(rs.getInt("cod_Mascota"));
                mascota.setDni_dueño(rs.getInt("dni_dueño"));
                mascota.setEdad(rs.getInt("edad"));
                mascota.setNombre(rs.getString("nombre"));
                mascota.setPeso(rs.getDouble("peso"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setTipo_especie(rs.getInt("tipo_especie"));
                mascota.setDescripcion(rs.getString("descripcion"));
            }
            conexion.close();
            return mascota;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mascota;
    }
    public static void colocarModeloComboBox(JComboBox<String> ComboEsp, JComboBox<String> ComboSex){
        ColocarModeloComboboxEspecies(ComboEsp);
        ColocarModeloComboboxSexos(ComboSex);
    }
    
    public static void ColocarModeloComboboxEspecies(JComboBox<String> ComboEspecies){
        String [] x = ProcesosTipoEspecie.ObtenerEspecies();
        ModeloCombobox = new DefaultComboBoxModel(x);
        ComboEspecies.setModel(ModeloCombobox);
    }
    public static void ColocarModeloComboboxSexos(JComboBox<String> Combosexos){
        ModeloCombobox = new DefaultComboBoxModel(sexos);
        Combosexos.setModel(ModeloCombobox);
    }
    public static void ColocarModeloSpinners(JSpinner spnP, JSpinner spnAge){
        ColocarModeloSpinnerPeso(spnP);
        ColocarModeloSpinnerEdad(spnAge);
    }
    public static void ColocarModeloSpinnerPeso(JSpinner spnP){
        modeloSpinner = new SpinnerNumberModel(
                spnPeso[0], 
                spnPeso[1], 
                spnPeso[2], 
                spnPeso[3]);
        spnP.setModel(modeloSpinner);
    }
    public static void ColocarModeloSpinnerEdad(JSpinner spnAge){
        modeloSpinner = new SpinnerNumberModel(
                spnEdad[0], 
                spnEdad[1], 
                spnEdad[2], 
                spnEdad[3]);
        spnAge.setModel(modeloSpinner);
    }
}
