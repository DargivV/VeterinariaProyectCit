package Principal;

import Controlador.*;
import Vista.Principal.frmMenu;
import Vista.*;

public class Main {
    //Formularios vistas
    public static frmRegistrarClientes frmRClientes;
    public static frmRegistrarMascotas frmRMascotas;
    public static frmRegistroEmpleados frmREmpleados;
    public static frmRegistroCitas frmRCitas;
    public static frmRegistroMedicamentos frmRMedicamentos;
    public static frmReporteCitas frmRPCitas;
    public static frmReporteEmpleados frmRPEmpleados;
    public static frmReporteClientes frmRPClientes;
    public static frmReporteMascotas frmRPMacotas;
    //Controladores
    public static ControladorRegistrarCliente ControlRClientes;
    public static ControladorRegistrarMascota ControlRMascotas;
    public static ControladorRegistroEmpleados ControlREmpleados;
    public static ControladorRegistroMedicamentos ControlRMedicamentos;
    public static ControladorRegistroCitas ControladorRCitas;
    public static ControladorReporteCitas ControladorRPCitas;
    public static ControladorReporteClientes ControladorRPClientes;
    public static ControladorReporteEmpleados ControladorRPEmpleados;
    public static ControladorReporteMascotas ControladorRPMascotas;
    //formulario menu y controlador
    public static frmMenu frmMenu;
    public static ControladorMenu ControlMenu;
    public static void main(String[]args){
        frmMenu = new frmMenu();
        ControlMenu = new ControladorMenu(frmMenu);
    }
}