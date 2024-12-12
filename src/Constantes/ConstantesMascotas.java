
package Constantes;

import javax.swing.JSpinner;

public interface ConstantesMascotas {
    String[] columnas = {"cod_Mascota", "nombre", "tipo_especie", "raza", "edad", "sexo", "peso", "dni_dueño", "Descripcion"};
    int numColum = columnas.length;
    String Consulta = "Select * from Mascotas ";
    String []sexos = {"Macho","Hembra"};
    int spnEdad[] = {0,0,200,1};
    double spnPeso[] = {0.0,0.0,50.0,0.1};
}
