
package Controlador;

import Vista.frmRegistrarClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorRegistrarCliente implements ActionListener{
    frmRegistrarClientes vista;
    public ControladorRegistrarCliente(frmRegistrarClientes frmRC) {
        vista = frmRC;
        frmRC.setTitle("Registro de Clientes");
        frmRC.setVisible(true);
        frmRC.setSize(1280, 620);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
