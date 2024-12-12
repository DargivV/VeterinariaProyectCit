
package Controlador;

import DAO.DAO_Cliente;
import DTO.CamposCliente;
import Procesos.ProcesosCliente;
import Vista.frmRegistrarClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorRegistrarCliente implements ActionListener{
    
     DAO_Cliente crud ; 
     CamposCliente client ; 
    
    frmRegistrarClientes vista;
    static String data[][];
    public ControladorRegistrarCliente(frmRegistrarClientes frmRC) {
        vista = frmRC;
        data = ProcesosCliente.RecuperarDatosClientes();
        vista.btn_registrar.addActionListener(this);
        vista.btn_Actualisar.addActionListener(this);
        vista.btn_buscar.addActionListener(this);
        vista.btn_eliminar.addActionListener(this);
        ProcesosCliente.MostrarEnTabla(frmRC, data);
        ProcesosCliente.Presentacion(frmRC);
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
      if (e.getSource()==vista.btn_registrar){
      client = ProcesosCliente.LeerDatos(vista);
      crud = new DAO_Cliente();
      crud.insertarCliente(client);
      //me4todo pa mostrar tabas aqui    
      }  
      
         
      if (e.getSource()==vista.btn_Actualisar){
      client = ProcesosCliente.LeerDatos(vista);
      crud = new DAO_Cliente();
      crud.actualizarCliente(client);
      //me4todo pa mostrar tabas aqui    
      }  
      
     if (e.getSource() == vista.btn_eliminar) {
    try {
        CamposCliente client = ProcesosCliente.LeerDatos(vista);
        int respuesta = JOptionPane.showConfirmDialog(
            null, 
            "¿Está seguro de que desea eliminar este cliente?", 
            "Confirmación", 
            JOptionPane.YES_NO_OPTION
        );
        if (respuesta == JOptionPane.YES_OPTION) {
            DAO_Cliente crud = new DAO_Cliente();
            crud.eliminarCliente(client.getDNI());
             JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente.");
            //   actualizar 
                    }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "ERROR: No se pudo eliminar el cliente. " + ex.getMessage());
    }
    ///////////////////////////////////////////////////////////
 
     
    
}

    
    
    
    
}

 }
 