
package Controlador;

import Vista.frmRegistroMedicamentos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorRegistroMedicamentos implements ActionListener{
    frmRegistroMedicamentos vista;

    public ControladorRegistroMedicamentos(frmRegistroMedicamentos frmRMedi) {
        vista = frmRMedi;
        frmRMedi.setTitle("Registro Medicamentos");
        frmRMedi.setVisible(true);
        frmRMedi.setSize(1280, 620);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
