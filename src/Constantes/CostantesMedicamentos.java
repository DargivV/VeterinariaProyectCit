
package Constantes;

public interface CostantesMedicamentos {
    String[] columnas = {"Código", "nombre", "tipo", "principio_Activo", 
                      "funcion_Terapeutica", "cantidad_stock", "cantidad_minima", 
                      "fecha_vencimiento", "precio_unidad", "descripcion"};
    int numColum = columnas.length;
    String Consulta = "Select * from Medicamentos ";
    String cbxtipo[]= {"Oral","Inyectable","Gel","Topico"};
    
}
