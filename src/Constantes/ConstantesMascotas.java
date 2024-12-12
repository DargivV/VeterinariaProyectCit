
package Constantes;

public interface ConstantesMascotas {
    String[] columnas = {"cod_Mascota", "nombre", "tipo_especie", "raza", "edad", "sexo", "peso", "dni_dueño", "Descripcion"};
    int numColum = columnas.length;
    String Consulta = "Select * from Mascotas ";
}
