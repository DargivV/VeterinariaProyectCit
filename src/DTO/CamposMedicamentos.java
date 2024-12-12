package DTO;
public class CamposMedicamentos {
    private int cod_Medicamento;
    private String nombre;
    private String tipo;
    private String principio_Activo;
    private String funcion_Terapeutica;
    private int cantidad_stock;
    private int cantidad_minima;
    private String fecha_vencimiento;
    private double precio_unidad;
    private String descripcion;
    //vas a caer lenin
    public CamposMedicamentos(){}

    public CamposMedicamentos(int cod_Medicamento, String nombre, String tipo, String principio_Activo, String funcion_Terapeutica, int cantidad_stock, int cantidad_minima, String fecha_vencimiento, double precio_unidad, String descripcion) {
        this.cod_Medicamento = cod_Medicamento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.principio_Activo = principio_Activo;
        this.funcion_Terapeutica = funcion_Terapeutica;
        this.cantidad_stock = cantidad_stock;
        this.cantidad_minima = cantidad_minima;
        this.fecha_vencimiento = fecha_vencimiento;
        this.precio_unidad = precio_unidad;
        this.descripcion = descripcion;
    }

    public int getCod_Medicamento() {
        return cod_Medicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPrincipio_Activo() {
        return principio_Activo;
    }

    public String getFuncion_Terapeutica() {
        return funcion_Terapeutica;
    }

    public int getCantidad_stock() {
        return cantidad_stock;
    }

    public int getCantidad_minima() {
        return cantidad_minima;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public double getPrecio_unidad() {
        return precio_unidad;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
