package Modelo.Clases;
public class CamposMascota {
    private int cod_Mascota;
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private String sexo;
    private double peso;
    private int dni_dueño;

    public CamposMascota(int cod_Mascota, String nombre, String especie, String raza, int edad, String sexo, double peso, int dni_dueño) {
        this.cod_Mascota = cod_Mascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.dni_dueño = dni_dueño;
    }

    public int getCod_Mascota() {
        return cod_Mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
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
    
}
