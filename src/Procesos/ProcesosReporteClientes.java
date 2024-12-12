
package Procesos;

import Constantes.ConstantesCliente;
import Vista.frmReporteClientes;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class ProcesosReporteClientes implements ConstantesCliente{
    static DefaultTableModel modelo;
    static DefaultComboBoxModel<String> modelocbx;
    public static void Presentacion(frmReporteClientes frmRPCliente){
        frmRPCliente.setTitle("Reporte Clientes");
        frmRPCliente.setVisible(true);
        frmRPCliente.setSize(1280, 620);
    }
    public static void MostrarEnTbla(frmReporteClientes frm, String data[][]){
        modelo = new DefaultTableModel(data, columnas);
        frm.tbl_RPClientes.setModel(modelo);
    }
    public static void colocarcbx(JComboBox<String> cbx){
        modelocbx = new DefaultComboBoxModel<>(TipoBusqueda);
        cbx.setModel(modelocbx);
    }
}
