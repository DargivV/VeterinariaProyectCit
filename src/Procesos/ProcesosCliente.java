
package Procesos;

import Constantes.ConstantesCliente;
import Controlador.ControlConectar;
import DAO.DAO_CONECCION;
import DTO.CamposCliente;
import Vista.frmRegistrarClientes;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class ProcesosCliente implements ConstantesCliente{
    static DefaultTableModel modelo;
    public static void Presentacion(frmRegistrarClientes frm) {
        frm.setTitle("Registro de Clientes");
        frm.setVisible(true);
        frm.setSize(1280, 620);
    }
    public static String [][]RecuperarDatosClientes(){
        String[][]data = DAO_CONECCION.recuperarDatos(Consulta, numColum);
        return data;
    }
    public static void MostrarEnTabla(frmRegistrarClientes frm, String data[][] ){
        modelo = new DefaultTableModel(data, columnas);
        frm.tbl_RCliente.setModel(modelo);
    }
    
    public static CamposCliente LeerDatos(frmRegistrarClientes fl) {
    CamposCliente client = new CamposCliente();
    client.setDNI(fl.txt_DNI.getText());
    client.setApellido_P(fl.txt_apellidoP.getText());
    client.setApellido_M(fl.txt_apellidoM.getText());
    client.setNombres(fl.txt_nombre.getText());
    client.setTelefono(fl.txt_telefono.getText());
    client.setCorreo(fl.txt_correo.getText());
    client.setDireccion(fl.txt_direccion.getText());
    client.setFecha_Naci(fl.jdtc_FechaNacimiento.getDate());
   
    
    return client;
}

    
}
