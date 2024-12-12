
package Procesos;

import Constantes.ConstantesMascotas;
import Vista.frmReporteMascotas;
import javax.swing.table.DefaultTableModel;

public class ProcesosReporteMascota implements ConstantesMascotas{
    static DefaultTableModel modelo;
    public static void Presentacion(frmReporteMascotas frmRPMascota){
        frmRPMascota.setTitle("Reporte Mascotas");
        frmRPMascota.setVisible(true);
        frmRPMascota.setSize(1280, 620);
    }
    public static void MostrarEnTabla(frmReporteMascotas frm, String data [][]){
        modelo = new DefaultTableModel(data, columnas);
        frm.tbl_RPMascota.setModel(modelo);
    }
}
