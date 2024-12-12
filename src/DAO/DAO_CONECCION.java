 
package DAO;

import static Controlador.ControlConectar.conectar;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

 
public class DAO_CONECCION {
    //RECUPERAR DATOS
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
