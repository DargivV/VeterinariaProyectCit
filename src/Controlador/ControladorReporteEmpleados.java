
package Controlador;

import Procesos.ProcesosEmpleados;
import Procesos.ProcesosReporteEmpleados;
import Vista.frmReporteEmpleados;

public class ControladorReporteEmpleados {
    frmReporteEmpleados vista;
    static String data[][];
    public ControladorReporteEmpleados(frmReporteEmpleados frmRPEmpleado) {
        vista = frmRPEmpleado;
        data = ProcesosEmpleados.RecuperarDatosEmpleados();
        ProcesosReporteEmpleados.Presentacion(frmRPEmpleado);
        ProcesosReporteEmpleados.MostrarEnTabla(vista,data);
    }
}
