package Controlador;
import static Controlador.Parame.CLAVE;
import static Controlador.Parame.DRIVER;
import static Controlador.Parame.RUTA;
import static Controlador.Parame.USUARIO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ControlConectar implements Parame {
    
      public Connection conexion = null;
    public Statement st= null;
    public ResultSet rs;
    public PreparedStatement ps;
    public ResultSetMetaData mdata;
    
    
    
    // Método para establecer la conexión
  public static Connection conectar() {
    Connection conexion = null;

    try {
        Class.forName(DRIVER); // Cargar el driver de JDBC
        conexion = DriverManager.getConnection(RUTA, USUARIO, CLAVE);
        System.out.println("Conexión exitosa a la base de datos.");
    } catch (ClassNotFoundException e) {
        System.err.println("Error: No se encontró el driver de JDBC.");
        e.printStackTrace();
    } catch (SQLException e) {
        System.err.println("Error: No se pudo establecer la conexión con la base de datos.");
        e.printStackTrace();
    }

    return conexion; // Devuelve la conexión establecida
}

    
}
