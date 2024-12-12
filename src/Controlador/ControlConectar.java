package Controlador;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ControlConectar implements Parame {
    // Método para establecer la conexión
    public static Connection conectar() {
        Connection conexion = null;

        // Datos de la conexión
        String url = "jdbc:mysql://localhost:3306/bdveterinaria"; // Cambia "nombre_base_datos" por el nombre de tu BD
        String usuario = "root"; // Usuario por defecto en XAMPP
        String contraseña = ""; // La contraseña generalmente está en blanco en XAMPP

        try {
            // Registrar el controlador de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establecer la conexión
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("¡Conexión exitosa a la base de datos!");

        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el controlador JDBC.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error: No se pudo conectar a la base de datos.");
            e.printStackTrace();
        }

        return conexion; // Devuelve la conexión establecida
    }
    
    
}
