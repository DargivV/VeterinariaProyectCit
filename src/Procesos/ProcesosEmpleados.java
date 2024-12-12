
package Procesos;

import Constantes.ConstantesEmpleado;
import Controlador.ControlConectar;
import Modelo.Clases.CamposEmpleado;
import Vista.frmRegistroEmpleados;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class ProcesosEmpleados implements ConstantesEmpleado{
    static DefaultTableModel modelo;
    public static void Presentacion(frmRegistroEmpleados frmREmple){
        frmREmple.setTitle("Registro de Mascotas");
        frmREmple.setVisible(true);
        frmREmple.setSize(1280, 620);
    }
    public static String[][] RecuperarDatosEmpleados(){
        String[][] datos = ControlConectar.recuperarDatos(Consulta, numColum);
        return datos;
    }
    public static void MostrarEnTabla(frmRegistroEmpleados frm, String data[][]){
        modelo = new DefaultTableModel(data, columnas);
        frm.tbl_REmpleado.setModel(modelo);
    }
    public static CamposEmpleado recuperarEmpleadoPorId(int idEmpleado){
        Connection conexion = ControlConectar.conectar(); // Método de conexión previamente definido
        CamposEmpleado e = new CamposEmpleado();
        try {
            // Consulta SQL para recuperar datos de la tabla
            String query = "Select * from Empleados where cod_EMPLEADO = ?";
            PreparedStatement st = conexion.prepareStatement(query);
            st.setInt(1, idEmpleado);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                e = new CamposEmpleado(
                        rs.getInt("cod_EMPLEADO"), 
                        rs.getString("DNI"), 
                        rs.getString("Apellido_P"), 
                        rs.getString("Apellido_M"), 
                        rs.getString("nombres"), 
                        rs.getString("telefono"), 
                        rs.getString("correo"), 
                        rs.getString("direccion"), 
                        rs.getString("fecha_Naci"), 
                        rs.getString("tipo_empleado"), 
                        rs.getString("turno")
                );
            }
            conexion.close();
            return e;
        } catch (SQLException ex) {
            System.err.println("Error al recuperar el empleado: " + ex.getMessage());
        }
        return e;
    }
}
