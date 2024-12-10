package Controlador;

import Vista.frmModificarClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorModificarClientes implements ActionListener{
    frmModificarClientes vista;
    public ControladorModificarClientes(frmModificarClientes frmMC) {
        vista = frmMC;
        frmMC.setTitle("Registro de Mascotas");
        frmMC.setVisible(true);
        frmMC.setSize(1280, 620);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
