
package Controlador;

import Vista.frmReporteMascotas;

public class ControladorReporteMascotas {
    frmReporteMascotas vista;

    public ControladorReporteMascotas(frmReporteMascotas frmRPMascota) {
        vista = frmRPMascota;
        frmRPMascota.setTitle("Reporte Mascotas");
        frmRPMascota.setVisible(true);
        frmRPMascota.setSize(1280, 620);
    }
}
