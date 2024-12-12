/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Constantes.ConstantesCliente;
import Procesos.ProcesosCliente;
import Procesos.ProcesosReporteClientes;
import Vista.frmReporteClientes;

public class ControladorReporteClientes implements ConstantesCliente{
    frmReporteClientes vista;
    static String data[][];
    public ControladorReporteClientes(frmReporteClientes frmRPCliente) {
        vista = frmRPCliente;
        data = ProcesosCliente.RecuperarDatosClientes();
        ProcesosReporteClientes.MostrarEnTbla(frmRPCliente, data);
        ProcesosReporteClientes.Presentacion(frmRPCliente);
        ProcesosReporteClientes.colocarcbx(frmRPCliente.cbx_TipoBusqueda);
    }
}
