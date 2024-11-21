package Modelo;

public class CamposdeTabla {
    private int idarea;
    private String nomarea;
    private String lugar;

    public CamposdeTabla() {}

    public Object[] Registro(int num) {
        Object[] fila = {num, idarea, nomarea, lugar};
        return fila;
    }

    public int getIdarea() {
        return idarea;
    }

    public void setIdarea(int idarea) {
        this.idarea = idarea;
    }

    public String getNomarea() {
        return nomarea;
    }

    public void setNomarea(String nomarea) {
        this.nomarea = nomarea;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
