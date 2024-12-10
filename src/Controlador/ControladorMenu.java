package Controlador;
import Formatos.CentrarForma;
import Principal.Main;
import Procesos.*;
import Vista.Principal.frmMenu;
import Vista.frmModificarClientes;
import Vista.frmModificarMascotas;
import Vista.frmRegistrarClientes;
import Vista.frmRegistrarMascotas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
public class ControladorMenu implements ActionListener{
    frmMenu vista;
    ProcesosMenu ProcesosM = new ProcesosMenu();
    public ControladorMenu(frmMenu fm) {
        vista = fm;
        vista.jmitemRegistrarCliente.addActionListener(this);
        vista.jmitemRegistrarMascota.addActionListener(this);
        vista.jmitemModificarClientes.addActionListener(this);
        vista.jmitemModificarMascotas.addActionListener(this);
        fm.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fm.setDefaultCloseOperation(fm.EXIT_ON_CLOSE);
        fm.setVisible(true);
        fm.setTitle("Gestion en Veterinaria Un Nuevo Hueso");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.jmitemRegistrarCliente){
            Main.frmRC = new frmRegistrarClientes();
            Main.ControlRC = new ControladorRegistrarCliente(Main.frmRC);
            ProcesosM.cerrarFormularios(vista.jdpnContenedor);
            vista.jdpnContenedor.add(Main.frmRC);
            CentrarForma.CPanel(vista.jdpnContenedor, Main.frmRC);
        }
        if(e.getSource() == vista.jmitemRegistrarMascota){
            Main.frmRM = new frmRegistrarMascotas();
            Main.ControlRM = new ControladorRegistrarMascota(Main.frmRM);
            ProcesosM.cerrarFormularios(vista.jdpnContenedor);
            vista.jdpnContenedor.add(Main.frmRM);
            CentrarForma.CPanel(vista.jdpnContenedor, Main.frmRM);
        }
        if(e.getSource() == vista.jmitemModificarMascotas){
            Main.frmMM = new frmModificarMascotas();
            Main.ControlMM = new ControladorModificarMascotas(Main.frmMM);
            ProcesosM.cerrarFormularios(vista.jdpnContenedor);
            vista.jdpnContenedor.add(Main.frmMM);
            CentrarForma.CPanel(vista.jdpnContenedor, Main.frmMM);
        }
        if(e.getSource() == vista.jmitemModificarClientes){
            Main.frmMC = new frmModificarClientes();
            Main.ControlMC = new ControladorModificarClientes(Main.frmMC);
            ProcesosM.cerrarFormularios(vista.jdpnContenedor);
            vista.jdpnContenedor.add(Main.frmMC);
            CentrarForma.CPanel(vista.jdpnContenedor, Main.frmMC);
        }
    }
}
