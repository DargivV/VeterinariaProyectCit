package Controlador;
import java.sql.*;
import javax.swing.JOptionPane;

public class ControlConectar implements Parame {
    public Connection conexion = null;
    public Statement st= null;
    public ResultSet rs;
    public PreparedStatement ps;
    public ResultSetMetaData mdata;
    
     public void ConectarBD(){
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(RUTA, USUARIO, CLAVE);
            st=conexion.createStatement();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"ERROR no se puede conectar a la BD..." + ex);
        }
    }
    
    //No entendi pero lo borre
   
}
