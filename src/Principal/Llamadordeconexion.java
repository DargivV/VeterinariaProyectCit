package Principal;

import Controlador.ControlConectar;
import Controlador.*;
import Vista.*;

public class Llamadordeconexion {
    public static void main(String[] args) {
        Forma01 fl = new Forma01();
        fl.setVisible(true);
        fl.setTitle("Lista de Áreas");
        fl.setLocationRelativeTo(null);
        ControlConectar cfl = new ControlConectar(fl);
    }
}
