
package Controlador;

import Procesos.ProcesosCitas;
import Vista.frmRegistroCitas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorRegistroCitas implements ActionListener{
    frmRegistroCitas vista;
    static String data [][];
    public ControladorRegistroCitas(frmRegistroCitas frmRCitas) {
        vista = frmRCitas;
        data = ProcesosCitas.recuperarCitas();
        ProcesosCitas.MostrarEnTabla(frmRCitas, data);
        ProcesosCitas.ColocarCbx(frmRCitas.cbx_Doctor, frmRCitas.cbx_tipo_cita);
        ProcesosCitas.Presentacion(frmRCitas);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
