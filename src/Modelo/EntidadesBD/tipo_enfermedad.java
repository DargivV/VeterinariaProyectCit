 
package modelo.EntidadesBD;

 
public class tipo_enfermedad {
 
private int Id_tipo_enfermedad ; 
private String nombreEnfermedad;

    public tipo_enfermedad(int Id_tipo_enfermedad, String nombreEnfermedad) {
        this.Id_tipo_enfermedad = Id_tipo_enfermedad;
        this.nombreEnfermedad = nombreEnfermedad;
    }

    public int getId_tipo_enfermedad() {
        return Id_tipo_enfermedad;
    }

    public void setId_tipo_enfermedad(int Id_tipo_enfermedad) {
        this.Id_tipo_enfermedad = Id_tipo_enfermedad;
    }

    public String getNombreEnfermedad() {
        return nombreEnfermedad;
    }

    public void setNombreEnfermedad(String nombreEnfermedad) {
        this.nombreEnfermedad = nombreEnfermedad;
    }


    
    
    
    
}
