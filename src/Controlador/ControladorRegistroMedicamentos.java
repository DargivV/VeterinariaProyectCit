
package Controlador;

import Procesos.ProcesosMedicamentos;
import Vista.frmRegistroMedicamentos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorRegistroMedicamentos implements ActionListener{
    frmRegistroMedicamentos vista;
    static String data[][];
    public ControladorRegistroMedicamentos(frmRegistroMedicamentos frmRMedi) {
        vista = frmRMedi;
        data = ProcesosMedicamentos.RecuperarDatosMedicamentos();
        ProcesosMedicamentos.mostrarEnTabla(frmRMedi, data);
        ProcesosMedicamentos.Presentacion(frmRMedi);
        ProcesosMedicamentos.colocarTipoMedicamento(frmRMedi.cbx_TipoMedicamento);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
