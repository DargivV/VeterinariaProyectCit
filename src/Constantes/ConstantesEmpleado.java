
package Constantes;

public interface ConstantesEmpleado {
    String[] columnas = {"cod", "DNI", "Apellido_P", "Apellido_M", "nombres", "telefono", "correo", "direccion", "fecha_Naci", "tipo", "turno"};
    int numColum = columnas.length;
    String Consulta = "Select * from Empleados ";
    String TipoEmpleados[] = {"Veterinario","Asistente","Administrador","Recepcionista"};
    String Turnos[] = {"Mañana","Tarde","Noche"};
    String tipoBusqueda[]  = {"Nombre","Apellido Paterno","Apellido Materno","Fecha Nacimiento", "Tipo Empleado","Turno"};
}
