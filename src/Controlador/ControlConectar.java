package Controlador;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import Modelo.CamposdeTabla; // Importación de modelo (si funciona la vaina)
import Vista.Forma01;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.geom.Area;
import javax.swing.JOptionPane;

public class ControlConectar implements ActionListener {
    String[] titulo = {"Num", "ID AREA", "NOMBRE AREA", "LUGAR AREA"};
    Forma01 vista;

    public ControlConectar(Forma01 fl) {
        vista = fl;
        MostrarDatosArea();
    }

    private void MostrarDatosArea() {
        DefaultTableModel mt = new DefaultTableModel(null, titulo);
        vista.tblDatos.setModel(mt);

        // Conexión a la base de datos
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", ""
            );
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM ayudante ORDER BY 2;");
            
            int num = 0;
            while (rs.next()) {
                CamposdeTabla ar = new CamposdeTabla();
                ar.setIdarea(rs.getInt("id_ayudante"));
                ar.setNomarea(rs.getString("nombre_Ayudan"));
                ar.setLugar(rs.getString("id_medico"));
                num++;
                mt.addRow(ar.Registro(num));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR al conectarse a la BD: " + ex);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Implementar acciones del evento si es necesario
    }
}
