/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;
public class CamposEspecie {
    private int id_Especie;
    private String nombre;

    public CamposEspecie(int id_Especie, String nombre) {
        this.id_Especie = id_Especie;
        this.nombre = nombre;
    }

    public int getId_Especie() {
        return id_Especie;
    }

    public String getNombre() {
        return nombre;
    }
    
}
