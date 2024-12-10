package Controlador;
import Formatos.CentrarForma;
import Principal.Main;
import Procesos.*;
import Vista.Principal.frmMenu;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
public class ControladorMenu implements ActionListener{
    frmMenu vista;
    ProcesosMenu ProcesosM = new ProcesosMenu();
    public ControladorMenu(frmMenu fm) {
        vista = fm;
        //Items Menu para Mascotas
        vista.jmitemRegistrarCliente.addActionListener(this);
        vista.jmitemRegistrarMascota.addActionListener(this);
        //Items Menu para Veterinaria
        vista.jmitemRegistrarEmpleado.addActionListener(this);
        vista.jmitemRegistrarCitas.addActionListener(this);
        vista.jmitemRegistrarMedicamentos.addActionListener(this);
        fm.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fm.setDefaultCloseOperation(fm.EXIT_ON_CLOSE);
        fm.setVisible(true);
        fm.setTitle("Gestion en Veterinaria Un Nuevo Hueso");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.jmitemRegistrarCliente){
            Main.frmRClientes = new frmRegistrarClientes();
            Main.ControlRClientes = new ControladorRegistrarCliente(Main.frmRClientes);
            ProcesosM.cerrarFormularios(vista.jdpnContenedor);
            vista.jdpnContenedor.add(Main.frmRClientes);
            CentrarForma.CPanel(vista.jdpnContenedor, Main.frmRClientes);
        }
        if(e.getSource() == vista.jmitemRegistrarMascota){
            Main.frmRMascotas = new frmRegistrarMascotas();
            Main.ControlRMascotas = new ControladorRegistrarMascota(Main.frmRMascotas);
            ProcesosM.cerrarFormularios(vista.jdpnContenedor);
            vista.jdpnContenedor.add(Main.frmRMascotas);
            CentrarForma.CPanel(vista.jdpnContenedor, Main.frmRMascotas);
        }
        if(e.getSource() == vista.jmitemRegistrarCitas){
            Main.frmRCitas = new frmRegistroCitas();
            Main.ControladorRCitas = new ControladorRegistroCitas(Main.frmRCitas);
            ProcesosM.cerrarFormularios(vista.jdpnContenedor);
            vista.jdpnContenedor.add(Main.frmRCitas);
            CentrarForma.CPanel(vista.jdpnContenedor, Main.frmRCitas);
        }
        if(e.getSource() == vista.jmitemRegistrarEmpleado){
            Main.frmREmpleados = new frmRegistroEmpleados();
            Main.ControlREmpleados = new ControladorRegistroEmpleados(Main.frmREmpleados);
            ProcesosM.cerrarFormularios(vista.jdpnContenedor);
            vista.jdpnContenedor.add(Main.frmREmpleados);
            CentrarForma.CPanel(vista.jdpnContenedor, Main.frmREmpleados);
        }
        if(e.getSource() == vista.jmitemRegistrarMedicamentos){
            Main.frmRMedicamentos = new frmRegistroMedicamentos();
            Main.ControlRMedicamentos = new ControladorRegistroMedicamentos(Main.frmRMedicamentos);
            ProcesosM.cerrarFormularios(vista.jdpnContenedor);
            vista.jdpnContenedor.add(Main.frmRMedicamentos);
            CentrarForma.CPanel(vista.jdpnContenedor, Main.frmRMedicamentos);
        }
    }
}
