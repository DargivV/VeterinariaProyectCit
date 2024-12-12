
package Procesos;

import Constantes.ConstantesTipoCita;
import Controlador.ControlConectar;
import DAO.DAO_CONECCION;
import VistaPrincipal.frmRegistrarTipoCita;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ProcesosTipoCita implements ConstantesTipoCita{
    static DefaultTableModel m ;
    static DefaultComboBoxModel<String> modeloComboBox; 
    public static void Presentacion(frmRegistrarTipoCita frmTipoCita){
        // Configurar el comportamiento de cierre para solo cerrar esta ventana
        frmTipoCita.setTitle("Registro Tipo Cita");
        frmTipoCita.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmTipoCita.setLocationRelativeTo(null);
        frmTipoCita.setVisible(true);
    }
    public static String [][]RecuperarDatosTipoCita(){
        String [][]data= DAO_CONECCION.recuperarDatos(Consulta, numColum);
        return data;
    }
    public static void mostrarEnTabla(frmRegistrarTipoCita frm, String data[][]){
        m = new DefaultTableModel(data, columnas);
        frm.tbl_RTipoCitas.setModel(m);
    }
    
}
