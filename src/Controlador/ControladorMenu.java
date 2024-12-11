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
        //Imtens Menu Reportes
        vista.jmitemReporteCitas.addActionListener(this);
        vista.jmitemReporteClientes.addActionListener(this);
        vista.jmitemReporteEmpleados.addActionListener(this);
        vista.jmitemReporteMascotas.addActionListener(this);
        //Metodos extra
        fm.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fm.setDefaultCloseOperation(fm.EXIT_ON_CLOSE);
        fm.setVisible(true);
        fm.setTitle("Gestion en Veterinaria Un Nuevo Hueso");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Menu mascotas
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
        //Menu veterinaria
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
        //Menu reportes
        if(e.getSource() == vista.jmitemReporteCitas){
            Main.frmRPCitas = new frmReporteCitas();
            Main.ControladorRPCitas = new ControladorReporteCitas(Main.frmRPCitas);
            ProcesosM.cerrarFormularios(vista.jdpnContenedor);
            vista.jdpnContenedor.add(Main.frmRPCitas);
            CentrarForma.CPanel(vista.jdpnContenedor, Main.frmRPCitas);
        }    
        if(e.getSource() == vista.jmitemReporteClientes){
            Main.frmRPClientes = new frmReporteClientes();
            Main.ControladorRPClientes = new ControladorReporteClientes(Main.frmRPClientes);
            ProcesosM.cerrarFormularios(vista.jdpnContenedor);
            vista.jdpnContenedor.add(Main.frmRPClientes);
            CentrarForma.CPanel(vista.jdpnContenedor, Main.frmRPClientes);
        }
        if(e.getSource() == vista.jmitemReporteEmpleados){
            Main.frmRPEmpleados = new frmReporteEmpleados();
            Main.ControladorRPEmpleados = new ControladorReporteEmpleados(Main.frmRPEmpleados);
            ProcesosM.cerrarFormularios(vista.jdpnContenedor);
            vista.jdpnContenedor.add(Main.frmRPEmpleados);
            CentrarForma.CPanel(vista.jdpnContenedor, Main.frmRPEmpleados);
        }
        if(e.getSource() == vista.jmitemReporteMascotas){
            Main.frmRPMacotas = new frmReporteMascotas();
            Main.ControladorRPMascotas = new ControladorReporteMascotas(Main.frmRPMacotas);
            ProcesosM.cerrarFormularios(vista.jdpnContenedor);
            vista.jdpnContenedor.add(Main.frmRPMacotas);
            CentrarForma.CPanel(vista.jdpnContenedor, Main.frmRPMacotas);
        }
    }
}
