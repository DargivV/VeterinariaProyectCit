
package Procesos;

import Controlador.ControlConectar;
import Vista.frmRegistroMedicamentos;
import Constantes.CostantesMedicamentos;
import DAO.DAO_CONECCION;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
public class ProcesosMedicamentos implements CostantesMedicamentos{
    static DefaultTableModel modelo;
    static DefaultComboBoxModel<String> cbxmodelo;
    public static void Presentacion(frmRegistroMedicamentos frmRMedi){
        frmRMedi.setTitle("Registro Medicamentos");
        frmRMedi.setVisible(true);
        frmRMedi.setSize(1280, 620);
    }
    public static String [][] RecuperarDatosMedicamentos(){
        String data [][]= DAO_CONECCION.recuperarDatos(Consulta, numColum);
        return data;
    }
    public static void mostrarEnTabla(frmRegistroMedicamentos frm, String data [][]){
        modelo = new DefaultTableModel(data, columnas);
        frm.tbl_RMedicamento.setModel(modelo);
    }
    public static void colocarTipoMedicamento(JComboBox<String> cbxTipoMedi){
        cbxmodelo = new DefaultComboBoxModel<>(cbxtipo);
        cbxTipoMedi.setModel(cbxmodelo);
    }
}
