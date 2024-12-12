
package Controlador;

import Procesos.ProcesosMascota;
import Vista.frmRegistrarMascotas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorRegistrarMascota implements ActionListener{
    frmRegistrarMascotas vista;
    static String data[][];
    public ControladorRegistrarMascota(frmRegistrarMascotas frmRM) {
        vista = frmRM;
        data = ProcesosMascota.RecuperarDatosMascota();
        ProcesosMascota.MostrarEnTabla(frmRM, data);
        ProcesosMascota.Presentacion(frmRM);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
