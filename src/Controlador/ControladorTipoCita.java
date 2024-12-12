
package Controlador;

import Procesos.ProcesosTipoCita;
import VistaPrincipal.frmRegistrarTipoCita;

public class ControladorTipoCita {
    frmRegistrarTipoCita vista;
    static String data[][];
    public ControladorTipoCita(frmRegistrarTipoCita frm) {
        vista = frm;
        data = ProcesosTipoCita.RecuperarDatosTipoCita();
        ProcesosTipoCita.mostrarEnTabla(frm, data);
        ProcesosTipoCita.Presentacion(frm);
    }
    
}
