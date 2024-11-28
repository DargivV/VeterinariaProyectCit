package Modelo.Clases;

public class CamposMedicamentos {
    private int idListaMedicamento;
    private String nombre;
    private String principioActivo;
    private int dosis;
    private String formaFarmaceutica;
    private String viaAdministracion;
//jodete 
    public CamposMedicamentos(){}

    public Object[] Registro(int num) {
        Object[] fila = {num, idListaMedicamento, nombre, principioActivo, dosis, formaFarmaceutica, viaAdministracion};
        return fila;
    }

    // Getters y Setters
    public int getIdListaMedicamento() {
        return idListaMedicamento;
    }

    public void setIdListaMedicamento(int idListaMedicamento) {
        this.idListaMedicamento = idListaMedicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrincipioActivo() {
        return principioActivo;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    public String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

    public String getViaAdministracion() {
        return viaAdministracion;
    }

    public void setViaAdministracion(String viaAdministracion) {
        this.viaAdministracion = viaAdministracion;
    }
}
