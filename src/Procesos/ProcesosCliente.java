
package Procesos;

import Constantes.ConstantesCliente;
import Controlador.ControlConectar;
import Vista.frmRegistrarClientes;
import javax.swing.table.DefaultTableModel;

public class ProcesosCliente implements ConstantesCliente{
    static DefaultTableModel modelo;
    public static void Presentacion(frmRegistrarClientes frm) {
        frm.setTitle("Registro de Clientes");
        frm.setVisible(true);
        frm.setSize(1280, 620);
    }
    public static String [][]RecuperarDatosClientes(){
        String[][]data = ControlConectar.recuperarDatos(Consulta, numColum);
        return data;
    }
    public static void MostrarEnTabla(frmRegistrarClientes frm, String data[][] ){
        modelo = new DefaultTableModel(data, columnas);
        frm.tbl_RCliente.setModel(modelo);
    }
    
}
