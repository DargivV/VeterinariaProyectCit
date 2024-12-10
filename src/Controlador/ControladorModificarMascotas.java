
package Controlador;

import Vista.frmModificarMascotas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorModificarMascotas implements ActionListener{
    frmModificarMascotas vista;

    public ControladorModificarMascotas(frmModificarMascotas frmMM) {
        vista = frmMM;
        frmMM.setTitle("Registro de Mascotas");
        frmMM.setVisible(true);
        frmMM.setSize(1280, 620);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
