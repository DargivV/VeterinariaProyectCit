
package Procesos;

import Controlador.ControladorInicio;
import VistaPrincipal.frmInicio;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class ProcesosMenu {
    public void cerrarFormularios(JDesktopPane desktopPane) {
        for (JInternalFrame frame : desktopPane.getAllFrames()) {
            frame.dispose(); // Cierra y libera los recursos del formulario.
    }
    }
    public void ColocarInicio(JDesktopPane jdpn, frmInicio I, ControladorInicio CI){
        I = new frmInicio();
        CI = new ControladorInicio(I);
        jdpn.add(I);
    }
}
