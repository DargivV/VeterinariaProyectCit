package Principal;

import Controlador.*;
import Vista.Principal.frmMenu;
import Vista.*;

public class Main {
    //Formularios vistas
    public static frmRegistrarClientes frmRC;
    public static frmRegistrarMascotas frmRM;
    public static frmModificarMascotas frmMM;
    public static frmModificarClientes frmMC;
    //Controladores
    public static ControladorRegistrarCliente ControlRC;
    public static ControladorRegistrarMascota ControlRM;
    public static ControladorModificarMascotas ControlMM;
    public static ControladorModificarClientes ControlMC;
    //formulario menu y controlador
    public static frmMenu frmM;
    public static ControladorMenu ControlM;
    public static void main(String[]args){
        frmM = new frmMenu();
        ControlM = new ControladorMenu(frmM);
    }
}