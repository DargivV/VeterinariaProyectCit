/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procesos;

import Constantes.ConstantesMascotas;
import Controlador.ControlConectar;
import Modelo.Clases.CamposMascota;
import Vista.frmRegistrarMascotas;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class ProcesosMascota implements ConstantesMascotas{
    static DefaultTableModel modelo;
    public static void Presentacion(frmRegistrarMascotas frmRM){
        frmRM.setTitle("Registro de Mascotas");
        frmRM.setVisible(true);
        frmRM.setSize(1280, 620);
    }
    public static String [][]RecuperarDatosMascota(){
        String data[][] = ControlConectar.recuperarDatos(Consulta, numColum);
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
}
