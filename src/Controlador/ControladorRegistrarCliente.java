
package Controlador;

import Procesos.ProcesosCliente;
import Vista.frmRegistrarClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorRegistrarCliente implements ActionListener{
    frmRegistrarClientes vista;
    static String data[][];
    public ControladorRegistrarCliente(frmRegistrarClientes frmRC) {
        vista = frmRC;
        data = ProcesosCliente.RecuperarDatosClientes();
        ProcesosCliente.MostrarEnTabla(frmRC, data);
        ProcesosCliente.Presentacion(frmRC);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
