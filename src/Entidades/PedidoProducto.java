
package Entidades;


public class PedidoProducto {
    private int idPedidoProducto;
//    private Pedido pedido;
    private Producto producto;
    private int cantidad;
    private double subtotal;

    public PedidoProducto() {
    }

    public PedidoProducto(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = calcularSubtotal();
    }

    public PedidoProducto(int idPedidoProducto, Producto producto, int cantidad) {
        this.idPedidoProducto = idPedidoProducto;
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = calcularSubtotal();
    }

    public int getIdPedidoProducto() {
        return idPedidoProducto;
    }

    public void setIdPedidoProducto(int idPedidoProducto) {
        this.idPedidoProducto = idPedidoProducto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    
    
    public double calcularSubtotal(){
      double st= cantidad * producto.getPrecio();
      return st;
  }

}
