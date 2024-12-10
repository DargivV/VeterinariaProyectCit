
package Controlador;

import Vista.frmRegistrarMascotas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorRegistrarMascota implements ActionListener{
    frmRegistrarMascotas vista;
    public ControladorRegistrarMascota(frmRegistrarMascotas frmRM) {
        vista = frmRM;
        frmRM.setTitle("Registro de Mascotas");
        frmRM.setVisible(true);
        frmRM.setSize(1280, 620);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
