/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.frmReporteClientes;

public class ControladorReporteClientes {
    frmReporteClientes vista;

    public ControladorReporteClientes(frmReporteClientes frmRPCliente) {
        vista = frmRPCliente;
        frmRPCliente.setTitle("Reporte Clientes");
        frmRPCliente.setVisible(true);
        frmRPCliente.setSize(1280, 620);
    }
}
