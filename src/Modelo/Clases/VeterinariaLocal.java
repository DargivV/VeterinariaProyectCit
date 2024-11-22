
package Modelo.Clases;

public class VeterinariaLocal { 
    private int id_local;
    private String nombre;
    private int id_direccion;

 
    public VeterinariaLocal(int id_local, String nombre, int id_direccion) {//si o si debe de tener una dirrecion ya creaada 
        this.id_local = id_local;
        this.nombre = nombre;
        this.id_direccion = id_direccion;
    }
 
    public int getId_local() {
        return id_local;
    }

    public void setId_local(int id_local) {
        this.id_local = id_local;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }
 
    
    public String MostrarLV() {
        return "localveterinaria{" +
                "id_local=" + id_local +
                ", nombre='" + nombre + '\'' +
                ", id_direccion=" + id_direccion +
                '}';
    }
}

    
    
