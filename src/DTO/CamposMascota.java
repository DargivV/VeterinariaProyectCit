package DTO;

public class CamposMascota {

    private int cod_Mascota;
    private String nombre;
    private int tipo_especie;
    private String raza;
    private int edad;
    private String sexo;
    private double peso;
    private int dni_dueño;
    private String descripcion;
    public CamposMascota() {
    }

    public CamposMascota(int cod_Mascota, String nombre, int tipo_especie, String raza, int edad, String sexo, double peso, int dni_dueño, String descripcion) {
        this.cod_Mascota = cod_Mascota;
        this.nombre = nombre;
        this.tipo_especie = tipo_especie;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.dni_dueño = dni_dueño;
        this.descripcion = descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTipo_especie() {
        return tipo_especie;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    

    public int getCod_Mascota() {
        return cod_Mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTipoEspecie() {
        return tipo_especie;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }
    public double getPeso() {
        return peso;
    }

    public int getDni_dueño() {
        return dni_dueño;
    }

    public void setCod_Mascota(int cod_Mascota) {
        this.cod_Mascota = cod_Mascota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo_especie(int tipo_especie) {
        this.tipo_especie = tipo_especie;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDni_dueño(int dni_dueño) {
        this.dni_dueño = dni_dueño;
    }

}
