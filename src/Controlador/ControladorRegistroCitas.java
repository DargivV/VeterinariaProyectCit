
package Controlador;

import Vista.frmRegistroCitas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorRegistroCitas implements ActionListener{
    frmRegistroCitas vista;

    public ControladorRegistroCitas(frmRegistroCitas frmRCitas) {
        vista = frmRCitas;
        frmRCitas.setTitle("Registro de Mascotas");
        frmRCitas.setVisible(true);
        frmRCitas.setSize(1280, 620);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
