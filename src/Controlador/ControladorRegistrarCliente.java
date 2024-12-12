
package Controlador;

import DAO.DAO_Cliente;
import Modelo.Clases.CamposCliente;
import Procesos.ProcesosCliente;
import Vista.frmRegistrarClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
      
      
      
        
        
        
        
        
        
        
    }
    
}
