
package Constantes;

public interface ConstantesCitas {
    String[] columnas = {"cod_cita", "id - Nombre Mascota", "id - Nombre Doctor", "tipo_cita", "fecha", "motivo"};
    int numColum = columnas.length;
    String Consulta = "Select * from Citas ";
    String ConsultaDoctores = "Select*from empleados where tipo_empleado = 'Veterinario'";
}
