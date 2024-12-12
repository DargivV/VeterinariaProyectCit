
package Procesos;

import Constantes.ConstantesEmpleado;
import Vista.frmReporteEmpleados;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class ProcesosReporteEmpleados implements ConstantesEmpleado{
    static DefaultTableModel modelo;
    static DefaultComboBoxModel<String> modeloCombobox;
    public static void Presentacion(frmReporteEmpleados frmRPEmpleado){
        frmRPEmpleado.setTitle("Reporte Empleados");
        frmRPEmpleado.setVisible(true);
        frmRPEmpleado.setSize(1280, 620);
    }
    public static void MostrarEnTabla(frmReporteEmpleados frm, String data[][]){
        modelo = new DefaultTableModel(data, columnas);
        frm.tbl_RPEmpleados.setModel(modelo);
    }
    
    
}
