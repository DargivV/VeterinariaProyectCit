
package Controlador;

import Vista.frmReporteMedicamento;

public class ControladorReporteMedicamentos {
    frmReporteMedicamento vista;

    public ControladorReporteMedicamentos(frmReporteMedicamento frmRPMedicamento) {
        vista = frmRPMedicamento;
        frmRPMedicamento.setTitle("Reporte Clientes");
        frmRPMedicamento.setVisible(true);
        frmRPMedicamento.setSize(1280, 620);
    }
    
}
