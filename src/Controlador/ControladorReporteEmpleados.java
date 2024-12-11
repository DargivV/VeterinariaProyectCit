/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.frmReporteEmpleados;

public class ControladorReporteEmpleados {
    frmReporteEmpleados vista;

    public ControladorReporteEmpleados(frmReporteEmpleados frmRPEmpleado) {
        vista = frmRPEmpleado;
        frmRPEmpleado.setTitle("Reporte Empleados");
        frmRPEmpleado.setVisible(true);
        frmRPEmpleado.setSize(1280, 620);
    }
}
