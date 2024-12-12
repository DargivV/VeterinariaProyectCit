
package Controlador;

import VistaPrincipal.frmInicio;
import VistaPrincipal.frmRegistrarEspecie;
import VistaPrincipal.frmRegistrarTipoCita;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class ControladorInicio implements ActionListener{
    frmInicio vista;

    public ControladorInicio(frmInicio frmI) {
        vista = frmI;
        vista.btn_registrarEspecie.addActionListener(this);
        vista.btn_registrarTipoCita.addActionListener(this);
        frmI.setTitle("Inicio");
        frmI.setVisible(true);
        frmI.setSize(1280, 620);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.btn_registrarEspecie){
            frmRegistrarEspecie frmEspecie = new frmRegistrarEspecie();
            ControladorRegistrarTipoEspecie ControlEspecie = new ControladorRegistrarTipoEspecie(frmEspecie);
        }
        if(e.getSource() == vista.btn_registrarTipoCita){
            frmRegistrarTipoCita frmTipoCita = new frmRegistrarTipoCita();
            ControladorTipoCita ControlTipoCita = new ControladorTipoCita(frmTipoCita);
        }
    }
    
}
