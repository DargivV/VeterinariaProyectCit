
package Procesos;

import Constantes.ConstantesEmpleado;
import static Constantes.ConstantesEmpleado.TipoEmpleados;
import static Constantes.ConstantesEmpleado.Turnos;
import Controlador.ControlConectar;
import DAO.DAO_CONECCION;
import Modelo.Clases.CamposEmpleado;
import static Procesos.ProcesosReporteEmpleados.modeloCombobox;
import Vista.frmRegistroEmpleados;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class ProcesosEmpleados implements ConstantesEmpleado{
    static DefaultTableModel modelo;
    public static void Presentacion(frmRegistroEmpleados frmREmple){
        frmREmple.setTitle("Registro de Mascotas");
        frmREmple.setVisible(true);
        frmREmple.setSize(1280, 620);
    }
    public static String[][] RecuperarDatosEmpleados(){
        String[][] datos = DAO_CONECCION.recuperarDatos(Consulta, numColum);
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
                        rs.getDate("fecha_Naci"), 
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
    public static void ColocarModeloCombobox(JComboBox<String> cbxTipoE, JComboBox<String> cbxTurno){
        ColocarModeloComboboxTipoEmpleado(cbxTipoE);
        ColocarModeloComboboxTurno(cbxTurno);
    }
    public static void ColocarModeloComboboxTipoEmpleado(JComboBox<String> cbxTipoE){
        modeloCombobox = new DefaultComboBoxModel<>(TipoEmpleados);
        cbxTipoE.setModel(modeloCombobox);
    }
    public static void ColocarModeloComboboxTurno(JComboBox<String> cbxTurno){
        modeloCombobox = new DefaultComboBoxModel<>(Turnos);
        cbxTurno.setModel(modeloCombobox);
    }
}
