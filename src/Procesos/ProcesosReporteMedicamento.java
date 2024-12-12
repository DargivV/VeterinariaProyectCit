
package Procesos;

import Constantes.CostantesMedicamentos;
import Vista.frmReporteMedicamento;
import javax.swing.table.DefaultTableModel;

public class ProcesosReporteMedicamento implements CostantesMedicamentos{
    static DefaultTableModel modelo;
    public static void Presentacion(frmReporteMedicamento frmRPMedicamento){
        frmRPMedicamento.setTitle("Reporte Clientes");
        frmRPMedicamento.setVisible(true);
        frmRPMedicamento.setSize(1280, 620);
    }
    public static void MostrarEnTabla(frmReporteMedicamento frm, String data[][]){
        modelo = new DefaultTableModel(data, columnas);
        frm.tbl_RPMedicamento.setModel(modelo);
    }
    
}
