
package modelo.EntidadesBD;

public class tipotratamiento {
    private int Id_Tratamiento;
    private String nameTratamiento;
 
    public tipotratamiento(int Id_Tratamiento, String nameTratamiento) {
        this.Id_Tratamiento = Id_Tratamiento;
        this.nameTratamiento = nameTratamiento;
    }
 
    public int getId_Tratamiento() {
        return Id_Tratamiento;
    }

    public void setId_Tratamiento(int Id_Tratamiento) {
        this.Id_Tratamiento = Id_Tratamiento;
    }

    public String getNameTratamiento() {
        return nameTratamiento;
    }

    public void setNameTratamiento(String nameTratamiento) {
        this.nameTratamiento = nameTratamiento;
    }
  
    public String motrarDire() {
        return "tipotratamiento{" +
                "Id_Tratamiento=" + Id_Tratamiento +
                ", nameTratamiento='" + nameTratamiento + '\'' +
                '}';
    }
}

