 
package DAO;

import Controlador.ControlConectar;
import DTO.CamposCliente;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
 
public class DAO_Cliente extends ControlConectar { 
    
    public DAO_Cliente(){}
    
    public void MostrarCliente(JTable tabla ){
     String[] titulos = {"DNI", "Apellido Paterno", "Apellido Materno", "Nombres", "Teléfono", "Correo", "Dirección", "Fecha Nacimiento"};
    DefaultTableModel modelo = new DefaultTableModel(null, titulos);
    tabla.setModel(modelo);
    CamposCliente clie = new CamposCliente();
    int cantreg = 0;

    Connection conexion = conectar();
    try {
        String sql = "SELECT DNI, Apellido_P, Apellido_M, nombres, telefono, correo, direccion, fecha_Naci FROM clientes";
        Statement stmt = conexion.createStatement(); // importante el statemenr declarar
        rs = stmt.executeQuery(sql); //ejecutar query

        while (rs.next()) {
            cantreg++;
            clie.setDNI(rs.getString(1));
            clie.setApellido_P(rs.getString(2));
            clie.setApellido_M(rs.getString(3));
            clie.setNombres(rs.getString(4));
            clie.setTelefono(rs.getString(5));
            clie.setCorreo(rs.getString(6));
            clie.setDireccion(rs.getString(7));
            clie.setFecha_Naci(rs.getDate(8));

            modelo.addRow(clie.RegistroCliente(cantreg));
        } 
       
        
        conexion.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR: No se pueden mostrar los clientes... " + e);
    }
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

    
        ps.executeUpdate();
        
       
        JOptionPane.showMessageDialog(null, "Datos insertados correctamente");
        conexion.close();
    } catch (Exception e) {
       
        JOptionPane.showMessageDialog(null, "ERROR: No se puede insertar categoría... " + e);
 
    }  
}

    public void actualizarCliente(CamposCliente client) {
    Connection conexion = conectar();
    try {
        
        String sql = "UPDATE clientes SET Apellido_P = ?, Apellido_M = ?, nombres = ?, telefono = ?, correo = ?, direccion = ?, fecha_Naci = ? WHERE DNI = ?";
        ps = conexion.prepareStatement(sql);

      
        ps.setString(1, client.getApellido_P());
        ps.setString(2, client.getApellido_M());
        ps.setString(3, client.getNombres());
        ps.setString(4, client.getTelefono());
        ps.setString(5, client.getCorreo());
        ps.setString(6, client.getDireccion());
        ps.setDate(7, new java.sql.Date(client.getFecha_Naci().getTime()));
        ps.setString(8, client.getDNI());  //esta vaina es pa idetificaar 
      
        ps.executeUpdate();

     
        JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
        conexion.close();
    } catch (Exception e) {
        
        JOptionPane.showMessageDialog(null, "ERROR: No se puede actualizar el cliente... " + e);
    }
}
    
    public void eliminarCliente(String DNI) {
    Connection conexion = conectar();
    try { 
        String sql = "DELETE FROM clientes WHERE DNI = ?";
        ps = conexion.prepareStatement(sql);
        ps.setString(1, DNI);
        ps.executeUpdate();

        JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente");
        conexion.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR: No se puede eliminar el cliente... " + e);
    }
    }

    
    
    
}
        
    