 
package Modelo.Clases;

public class dirreccion {
    private int Id_dirrecion;
    private String calle;
    private String ciudad;
    private String codigo_postal;

    // Constructol
    public dirreccion(int Id_dirrecion, String calle, String ciudad, String codigo_postal) {
        this.Id_dirrecion = Id_dirrecion;
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigo_postal = codigo_postal;
    }

    //  
    public int getId_dirrecion() {
        return Id_dirrecion;
    }

    public void setId_dirrecion(int Id_dirrecion) {
        this.Id_dirrecion = Id_dirrecion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }
 
    
}