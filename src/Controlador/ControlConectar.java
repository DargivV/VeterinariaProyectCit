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
    
    //recuperar datos cualqquier tabla 
    public static String[][] recuperarDatos(String Consulta, int numColum) {
        Connection conexion = conectar(); // Método de conexión previamente definido

        try {
            // Consulta SQL para recuperar datos de la tabla
            String query = Consulta;
            PreparedStatement st = conexion.prepareStatement(query);
            ResultSet rs = st.executeQuery();

            List<String[]> dataList = new ArrayList<>();
            while (rs.next()) {
                String[] data = new String[numColum]; // Ajusta el tamaño en función de las columnas que estás recuperando
                for (int j = 0; j < numColum; j++) { // Ajusta el límite en función de las columnas que estás recuperando
                    data[j] = rs.getString(j + 1);
                }
                dataList.add(data);
            }
            conexion.close();

            // Convertir la lista en una matriz de dos dimensiones
            String[][] dataArr = new String[dataList.size()][numColum];
            for (int i = 0; i < dataList.size(); i++) {
                dataArr[i] = dataList.get(i);
            }
            return dataArr;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conexion != null) {
                    conexion.close(); // Cerrar la conexión después de utilizarla
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
