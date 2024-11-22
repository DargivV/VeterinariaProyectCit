package Modelo;

public class CamposdeTabla {
    private int idAyudante;
    private String nombre;
    private String IDDoctor;

    public CamposdeTabla() {}

    public Object[] Registro(int num) {
        Object[] fila = {num, idAyudante, nombre, IDDoctor};
        return fila;
    }

    public int getIdarea() {
        return idAyudante;
    }

    public void setIdarea(int idarea) {
        this.idAyudante = idarea;
    }

    public String getNomarea() {
        return nombre;
    }

    public void setNomarea(String nomarea) {
        this.nombre = nomarea;
    }

    public String getLugar() {
        return IDDoctor;
    }

    public void setLugar(String lugar) {
        this.IDDoctor = lugar;
    }
}
