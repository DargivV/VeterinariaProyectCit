
package Procesos;

import Constantes.ConstantesEspecies;
import Controlador.ControlConectar;
import VistaPrincipal.frmRegistrarEspecie;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ProcesosTipoEspecie implements ConstantesEspecies{
    static DefaultTableModel m;
    public static void Presentacion(frmRegistrarEspecie frmEspecie){
        frmEspecie.setTitle("Registro Especie de Mascota");
        frmEspecie.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmEspecie.setLocationRelativeTo(null);
        frmEspecie.setVisible(true);
    }
    public static String[][] RecuperarDatosEspecies(){
        String data[][] = ControlConectar.recuperarDatos(Consulta, numColum);
        return data;
    }
    public static void MostrarEnTabla(frmRegistrarEspecie frm, String data [][]){
        m = new DefaultTableModel(data, columnas);
        frm.tbl_REspecies.setModel(m);
    }
}
