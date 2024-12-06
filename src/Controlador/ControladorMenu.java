
package Controlador;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;  
import Vista.Principal.Home;
import com.sun.tools.javac.Main;
import javax.swing.JFrame;

public class ControladorMenu implements ActionListener {
    Home vista;

    public ControladorMenu(Home fm) {
        vista = fm;

        vista.btnCitas.addActionListener(this);
       

        fm.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fm.setDefaultCloseOperation(fm.EXIT_ON_CLOSE);
        fm.setVisible(true);
        fm.setTitle("Citas Registradas ---- :v");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnCitas) {
            GestionarMAscDueño fl = new GestionarMAscDueño();  
             fl.setVisible(true); // llamar y mostrar ventana 
          
            ControlConectar cfl = new ControlConectar(fl);
            
        }
    }
}
