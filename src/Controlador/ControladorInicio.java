
package Controlador;

import VistaPrincipal.frmInicio;
import VistaPrincipal.frmRegistrarEspecie;
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
            // Configurar el comportamiento de cierre para solo cerrar esta ventana
            frmEspecie.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frmEspecie.setLocationRelativeTo(null);
            frmEspecie.setVisible(true);
        }
    }
    
}
