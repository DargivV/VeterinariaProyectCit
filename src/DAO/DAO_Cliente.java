 
package DAO;

import Controlador.ControlConectar;
import Modelo.Clases.CamposCliente;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
 
public class DAO_Cliente extends ControlConectar { 
    
    public DAO_Cliente(){}
    
    public void MostrarCliente(JTable tabla ,JTable etiqueta){
       
        DefaultTableModel modelo = new DefaultTableModel(null,tituloCita);
        tabla.setModel(modelo);
        CamposCliente clie = new CamposCliente();
        int cantreg = 0;
    }
    
    
    
    public void insertarCliente(CamposCliente client) {
    Connection conexion = conectar();
    try {
        
        String sql = "INSERT INTO `clientes` (`DNI`, `Apellido_P`, `Apellido_M`, `nombres`, `telefono`, `correo`, `direccion`, `fecha_Naci`) VALUES (?, ?,?, ?,?, ?,?, ?)";
        ps = conexion.prepareStatement(sql);

        ps.setString(1, client.getDNI());  
        ps.setString(2, client.getApellido_P());  
        ps.setString(3, client.getApellido_M() );  
        ps.setString(4,client.getNombres());  
        ps.setString(5, client.getTelefono() );  
        ps.setString(6, client.getCorreo() );  
        ps.setString(7, client.getDireccion() );  
        ps.setDate(8, new java.sql.Date(client.getFecha_Naci().getTime()));

        // Ejecutar la consulta
        ps.executeUpdate();
        
        // Mensaje de éxito
        JOptionPane.showMessageDialog(null, "Datos insertados correctamente");
        conexion.close();
    } catch (Exception e) {
        // Manejo de errores
        JOptionPane.showMessageDialog(null, "ERROR: No se puede insertar categoría... " + e);
 
    }  
}

        
        
          
        
        
        
    
      
    }
