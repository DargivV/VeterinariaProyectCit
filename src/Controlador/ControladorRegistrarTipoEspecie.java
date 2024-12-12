
package Controlador;

import Procesos.ProcesosTipoEspecie;
import VistaPrincipal.frmRegistrarEspecie;

public class ControladorRegistrarTipoEspecie {
    frmRegistrarEspecie vista;
    static String data[][];
    public ControladorRegistrarTipoEspecie(frmRegistrarEspecie frm) {
        vista = frm;
        data= ProcesosTipoEspecie.RecuperarDatosEspecies();
        ProcesosTipoEspecie.MostrarEnTabla(frm, data);
        ProcesosTipoEspecie.Presentacion(frm);
    }
    
}
