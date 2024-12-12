
package Procesos;

import Constantes.ConstantesCitas;
import Controlador.ControlConectar;
import DAO.DAO_CONECCION;
import DTO.CamposEmpleado;
import DTO.CamposMascota;
import DTO.CamposTipoCita;
import static Procesos.ProcesosTipoCita.*;
import Vista.frmRegistroCitas;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class ProcesosCitas implements ConstantesCitas{
    static CamposMascota mascota;
    static CamposEmpleado empleado;
    static DefaultTableModel modelo;
    public static void Presentacion(frmRegistroCitas frmRCitas){
        frmRCitas.setTitle("Registro de Mascotas");
        frmRCitas.setVisible(true);
        frmRCitas.setSize(1280, 620);
    }
    public static String [][] recuperarCitas(){
        String data[][] = DAO_CONECCION.recuperarDatos(Consulta, numColum);
        for(int i =0; i<data.length; i++){
            data[i][1] = data[i][1]+" - "+RecuperarNombreMascota(Integer.parseInt(data[i][1]));
            data[i][2] = data[i][2]+" - "+RecuperarNombreDoctor(Integer.parseInt(data[i][2]));
            data[i][3] = RecuperarNombreTipoCita(Integer.parseInt(data[i][3])).getNombre();
        }
        return data;
    }
    public static void MostrarEnTabla(frmRegistroCitas frm, String data[][]){
        modelo = new DefaultTableModel(data, columnas);
        frm.tbl_RCitas.setModel(modelo);
    }
    public static String RecuperarNombreMascota(int idMascota){
        mascota = ProcesosMascota.ObtenerMascotaID(idMascota);
        return mascota.getNombre();
    }
    public static String RecuperarNombreDoctor(int idemple){
        empleado = ProcesosEmpleados.recuperarEmpleadoPorId(idemple);
        return empleado.getNombres();
    }
    public static CamposTipoCita RecuperarNombreTipoCita(int idTipoCita){
        Connection conexion = ControlConectar.conectar(); // Método de conexión previamente definido
        CamposTipoCita tc = null;
        try {
            // Consulta SQL para recuperar datos de la tabla
            String query = "Select * from tiposCita where id_Tipo = ?";
            PreparedStatement st = conexion.prepareStatement(query);
            st.setInt(1, idTipoCita);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                tc = new CamposTipoCita(
                        rs.getInt("id_Tipo"), 
                        rs.getString("nombre"));
            }
            conexion.close();
            return tc;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tc;
    }
    public static String [] ObtenerTiposCita(){
        String data[][] = ProcesosTipoCita.RecuperarDatosTipoCita();
        String tipos[] = new String[data.length];
        for(int i = 0; i<data.length;i++){
            tipos [i] = data[i][1];
        }
        return tipos;
    }
    public static String [] ObtenerNombreDoctores(){
        String data[][] = DAO_CONECCION.recuperarDatos(ConsultaDoctores, Constantes.ConstantesEmpleado.numColum);
        String nombre[] = new String[data.length];
        for(int i = 0; i<data.length;i++){
            nombre [i] = data[i][0]+"/"+data[i][4];
        }
        return nombre;
    }
    public static void ColocarCbx(JComboBox<String> cbxDoctores, JComboBox<String> cbxTipoCita){
        ColocarCbxDoctores(cbxDoctores);
        ColocarCbxTipoCita(cbxTipoCita);
    }
    public static void ColocarCbxDoctores(JComboBox<String> cbxDoctores){
        modeloComboBox = new DefaultComboBoxModel<>(ObtenerNombreDoctores());
        cbxDoctores.setModel(modeloComboBox);
    }
    public static void ColocarCbxTipoCita(JComboBox<String> cbxTipoCita){
        modeloComboBox = new DefaultComboBoxModel<>(ObtenerTiposCita());
        cbxTipoCita.setModel(modeloComboBox);
    }
    public static int ObtenerIdDoctor(String idNombre){
        String datos[]=idNombre.split("/");
        return Integer.parseInt(datos[0]);
    }
}