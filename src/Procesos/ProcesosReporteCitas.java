
package Procesos;

import Constantes.ConstantesCitas;

import Vista.frmReporteCitas;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProcesosReporteCitas implements ConstantesCitas{
   static DefaultTableModel modelo;
   static DefaultComboBoxModel<String> combomodel;
    public static void Presentacion(frmReporteCitas frmRPCita){
        frmRPCita.setTitle("Reporte Citas");
        frmRPCita.setVisible(true);
        frmRPCita.setSize(1280, 620);
    }
    public static void MostrarEnTabla(frmReporteCitas frm, String data[][]){
        modelo = new DefaultTableModel(data, columnas);
        frm.tbl_RPCitas.setModel(modelo);
    }
    public static void colocarModeloCBX(JComboBox<String> cbxT,JComboBox<String> cbxf){
        colocartipobUSQUEDA(cbxT);
        colocarRangoFecha(cbxf);
    }
    public static void colocartipobUSQUEDA(JComboBox<String> cbxT){
        combomodel = new DefaultComboBoxModel<>(cbxTipoBusqueda);
        cbxT.setModel(combomodel);
    }
    public static void  colocarRangoFecha(JComboBox<String> cbxf){
        combomodel = new DefaultComboBoxModel<>(rango);
        cbxf.setModel(combomodel);
    }
   
}
