
package Controlador;

import Vista.frmReporteCitas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorReporteCitas implements ActionListener{
    frmReporteCitas vista;

    public ControladorReporteCitas(frmReporteCitas frmRPCita) {
        vista = frmRPCita;
        frmRPCita.setTitle("Reporte Citas");
        frmRPCita.setVisible(true);
        frmRPCita.setSize(1280, 620);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
