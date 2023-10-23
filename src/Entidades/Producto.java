
package Entidades;


public class Producto {
    private int idProducto;
    private String nombre;
    private int stock;
    private double precio;
    private boolean estado;
    private String tipo;

    public Producto() {
    }

    public Producto(int idProducto, String nombre, int stock, double precio, boolean estado, String tipo) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.estado = estado;
        this.tipo = tipo;
    }

    public Producto(String nombre, int stock, double precio, boolean estado, String tipo) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.estado = estado;
        this.tipo = tipo;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", stock=" + stock + ", precio=" + precio + ", estado=" + estado + ", tipo=" + tipo + '}';
    }

    
    
}
