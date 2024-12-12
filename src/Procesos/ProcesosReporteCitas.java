
package Procesos;

import Constantes.ConstantesCitas;
import Controlador.ControlConectar;
import static Procesos.ProcesosCitas.*;
import Vista.frmReporteCitas;
import javax.swing.table.DefaultTableModel;

public class ProcesosReporteCitas implements ConstantesCitas{
   static DefaultTableModel modelo;
    public static void Presentacion(frmReporteCitas frmRPCita){
        frmRPCita.setTitle("Reporte Citas");
        frmRPCita.setVisible(true);
        frmRPCita.setSize(1280, 620);
    }
    public static void MostrarEnTabla(frmReporteCitas frm, String data[][]){
        modelo = new DefaultTableModel(data, columnas);
        frm.tbl_RPCitas.setModel(modelo);
    }
}
