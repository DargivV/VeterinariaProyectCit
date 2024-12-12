
package Constantes;

public interface ConstantesCliente {
    String[] columnas = {"DNI", "Apellido_P", "Apellido_M", "nombres", "telefono", "correo", "direccion", "fecha_Naci"};
    int numColum = columnas.length;
    String Consulta = "Select * from Clientes ";
    String TipoBusqueda[] = {"Nombre","Apellido Paterno", "Apellido Materno", "Fecha de Nacimiento"};
}
