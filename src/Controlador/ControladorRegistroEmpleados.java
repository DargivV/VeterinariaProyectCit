
package Controlador;

import Procesos.ProcesosEmpleados;
import Vista.frmRegistroEmpleados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorRegistroEmpleados implements ActionListener{
    frmRegistroEmpleados vista;
    static String data [][];
    public ControladorRegistroEmpleados(frmRegistroEmpleados frmREmple){
        vista = frmREmple;
        data = ProcesosEmpleados.RecuperarDatosEmpleados();
        ProcesosEmpleados.MostrarEnTabla(frmREmple, data);
        ProcesosEmpleados.Presentacion(frmREmple);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
