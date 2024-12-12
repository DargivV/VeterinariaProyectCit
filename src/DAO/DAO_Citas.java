package DAO;

import Controlador.ControlConectar;
import static Controlador.ControlConectar.conectar;
import DTO.CamposCita;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class DAO_Citas extends ControlConectar {

    public DAO_Citas() {}

    public void MostrarCitas(JTable tabla) {
        String[] titulos = {"Código Cita", "ID Mascota", "ID Doctor", "Tipo Cita", "Fecha", "Motivo"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        CamposCita cita = new CamposCita();
        int cantReg = 0;

        Connection conexion = conectar();
        try { 
            Statement st = conexion.createStatement();
            rs = st.executeQuery("SELECT cod_cita, id_mascota, id_doctor, tipo_cita, fecha, motivo FROM citas");

            while (rs.next()) {
                cantReg++;
                cita.setCodCita(rs.getInt(1));
                cita.setIdMascota(rs.getInt(2));
                cita.setIdDoctor(rs.getInt(3));
                cita.setTipoCita(rs.getInt(4));
                cita.setFecha(rs.getDate(5));
                cita.setMotivo(rs.getString(6));

                modelo.addRow(cita.RegistroCita(cantReg));
            }

            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: No se pueden mostrar las citas... " + e);
        }
    }

    public void insertarCita(CamposCita cita) {
        Connection conexion = conectar();
        try {
 
            ps = conexion.prepareStatement("INSERT INTO `citas` (`cod_cita`, `id_mascota`, `id_doctor`, `tipo_cita`, `fecha`, `motivo`) VALUES (?, ?, ?, ?, ?, ?)");

            ps.setInt(1, cita.getCodCita());
            ps.setInt(2, cita.getIdMascota());
            ps.setInt(3, cita.getIdDoctor());
            ps.setInt(4, cita.getTipoCita());
            ps.setDate(5, new java.sql.Date(cita.getFecha().getTime()));
            ps.setString(6, cita.getMotivo());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cita registrada correctamente.");

            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: No se pudo registrar la cita... " + e);
        }
    }

    public void actualizarCita(CamposCita cita) {
        Connection conexion = conectar();
        try {
            String sql = "UPDATE citas SET id_mascota = ?, id_doctor = ?, tipo_cita = ?, fecha = ?, motivo = ? WHERE cod_cita = ?";
            ps = conexion.prepareStatement(sql);

            ps.setInt(1, cita.getIdMascota());
            ps.setInt(2, cita.getIdDoctor());
            ps.setInt(3, cita.getTipoCita());
            ps.setDate(4, new java.sql.Date(cita.getFecha().getTime()));
            ps.setString(5, cita.getMotivo());
            ps.setInt(6, cita.getCodCita());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cita actualizada correctamente.");

            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: No se pudo actualizar la cita... " + e);
        }
    }

    public void eliminarCita(int codCita) {
        Connection conexion = conectar();
        try {
            String sql = "DELETE FROM citas WHERE cod_cita = ?";
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, codCita);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cita eliminada correctamente.");
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: No se pudo eliminar la cita... " + e);
        }
    }

    public CamposCita buscarCita(int codCita) {
        Connection conexion = conectar();
        CamposCita cita = null;
        try {
            String sql = "SELECT cod_cita, id_mascota, id_doctor, tipo_cita, fecha, motivo FROM citas WHERE cod_cita = ?";
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, codCita);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cita = new CamposCita();
                cita.setCodCita(rs.getInt(1));
                cita.setIdMascota(rs.getInt(2));
                cita.setIdDoctor(rs.getInt(3));
                cita.setTipoCita(rs.getInt(4));
                cita.setFecha(rs.getDate(5));
                cita.setMotivo(rs.getString(6));
            }

            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: No se pudo buscar la cita... " + e);
        }

        return cita;
    }
    
    
  public DefaultTableModel FiltrarCitas(String criterio, String valor) {
    DefaultTableModel modelo = new DefaultTableModel();
    Connection conexion = conectar();
    try {
        String sql = "";
        if (criterio.equals("Codigo Doctor")) {
            sql = "SELECT cod_cita, id_mascota, id_doctor, tipo_cita, fecha, motivo FROM citas WHERE id_doctor = ?";
        } else if (criterio.equals("Codigo Mascota")) {
            sql = "SELECT cod_cita, id_mascota, id_doctor, tipo_cita, fecha, motivo FROM citas WHERE id_mascota = ?";
        } else if (criterio.equals("Rango de Fechas")) {
            sql = "SELECT cod_cita, id_mascota, id_doctor, tipo_cita, fecha, motivo FROM citas WHERE fecha BETWEEN ? AND ?";
        }

        ps = conexion.prepareStatement(sql);
        if (criterio.equals("Rango de Fechas")) {
            String[] fechas = valor.split(";");
            ps.setDate(1, java.sql.Date.valueOf(fechas[0]));
            ps.setDate(2, java.sql.Date.valueOf(fechas[1]));
        } else {
            ps.setString(1, valor);
        } 
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Object[] fila = {
                rs.getInt("cod_cita"),
                rs.getInt("id_mascota"),
                rs.getInt("id_doctor"),
                rs.getString("tipo_cita"),
                rs.getDate("fecha"),
                rs.getString("motivo")
            };
            modelo.addRow(fila);
        }

        rs.close();
        ps.close();
        conexion.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR: " + e);
    }
    return modelo;
}



}