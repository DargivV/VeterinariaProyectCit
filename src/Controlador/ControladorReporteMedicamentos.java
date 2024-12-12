
package Controlador;

import Procesos.ProcesosMedicamentos;
import Procesos.ProcesosReporteMedicamento;
import Vista.frmReporteMedicamento;

public class ControladorReporteMedicamentos {
    frmReporteMedicamento vista;
    static String data [][];
    public ControladorReporteMedicamentos(frmReporteMedicamento frmRPMedicamento) {
        vista = frmRPMedicamento;
        data = ProcesosMedicamentos.RecuperarDatosMedicamentos();
        ProcesosReporteMedicamento.MostrarEnTabla(frmRPMedicamento, data);
        ProcesosReporteMedicamento.Presentacion(frmRPMedicamento);
        ProcesosReporteMedicamento.ColocarCbx(frmRPMedicamento.cbx_TipoMedicamento, frmRPMedicamento.cbx_TipoBusqueda);
    }
    
}
