
package Controlador;

import Procesos.ProcesosMascota;
import Procesos.ProcesosReporteMascota;
import Vista.frmReporteMascotas;

public class ControladorReporteMascotas {
    frmReporteMascotas vista;
    static String data [][];
    public ControladorReporteMascotas(frmReporteMascotas frmRPMascota) {
        vista = frmRPMascota;
        data = ProcesosMascota.RecuperarDatosMascota();
        ProcesosReporteMascota.MostrarEnTabla(frmRPMascota, data);
        ProcesosReporteMascota.Presentacion(frmRPMascota);
        ProcesosMascota.ColocarModeloComboboxSexos(frmRPMascota.cbx_sexo);
    }
}
