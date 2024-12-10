
package Controlador;

import Vista.frmRegistroEmpleados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorRegistroEmpleados implements ActionListener{
    frmRegistroEmpleados vista;
    public ControladorRegistroEmpleados(frmRegistroEmpleados frmREmple){
        vista = frmREmple;
        frmREmple.setTitle("Registro de Mascotas");
        frmREmple.setVisible(true);
        frmREmple.setSize(1280, 620);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
