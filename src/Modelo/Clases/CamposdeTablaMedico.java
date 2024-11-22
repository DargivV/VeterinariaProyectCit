package Modelo.Clases;

public class CamposdeTablaMedico {
    private int IDMedico;
    private String nombre;
    private String IDLocal;
    private String ApellidoM;
    private String ApellidoP;
    private String telf;

    public CamposdeTablaMedico() {}

    public Object[] Registro(int num) {
        Object[] fila = {num, IDMedico, nombre, IDLocal,ApellidoM,ApellidoP,telf};
        return fila;
    }

    public int getIdMedico() {
        return IDMedico;
    }

    public void setIdMedico(int idarea) {
        this.IDMedico = idarea;
    }

    public String getNomarea() {
        return nombre;
    }

    public void setNomarea(String nomarea) {
        this.nombre = nomarea;
    }

    public String getLugar() {
        return IDLocal;
    }

    public void setLugar(String lugar) {
        this.IDLocal = lugar;
    }
    
    
    
    public String getApellM() {
        return ApellidoM ;
    }

    public void setApellM(String  ApellidoM) {
        this.ApellidoM = ApellidoM;
    }
    
    
    public String getApellP() {
        return ApellidoP ;
    }

    public void setApellP(String  ApellidoP) {
        this.ApellidoP = ApellidoP;
    }
    
    public String gettelf() {
        return telf;
    }

    public void settelf(String telf) {
        this.telf = telf;
    }
    
    
}
