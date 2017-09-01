package pe.egcc.app.model;

public class Producto {

    private String nombre;
    private double precio;

    /**
     * Constructor por defecto.
     */
    public Producto() {
        this.nombre = "Televisor";
        this.precio = 456.78;
    }

    /**
     * Constructor con parámetros.
     *
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     */
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
