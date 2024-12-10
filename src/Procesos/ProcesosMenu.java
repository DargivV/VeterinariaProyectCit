
package Procesos;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class ProcesosMenu {
    public void cerrarFormularios(JDesktopPane desktopPane) {
    for (JInternalFrame frame : desktopPane.getAllFrames()) {
        frame.dispose(); // Cierra y libera los recursos del formulario.
    }
}
}
