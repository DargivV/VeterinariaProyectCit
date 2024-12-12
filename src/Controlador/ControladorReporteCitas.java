
package Controlador;

import Procesos.ProcesosCitas;
import Procesos.ProcesosReporteCitas;
import Vista.frmReporteCitas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorReporteCitas implements ActionListener{
    frmReporteCitas vista;
    static String data[][];
    public ControladorReporteCitas(frmReporteCitas frmRPCita) {
        vista = frmRPCita;
        data = ProcesosCitas.recuperarCitas();
        ProcesosReporteCitas.MostrarEnTabla(frmRPCita, data);
        ProcesosReporteCitas.Presentacion(frmRPCita);
        ProcesosReporteCitas.colocartipobUSQUEDA(frmRPCita.cbx_TipoBusqueda);
        ProcesosReporteCitas.colocarModeloCBX(frmRPCita.cbx_TipoBusqueda, frmRPCita.cbx_rangoFechas);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
