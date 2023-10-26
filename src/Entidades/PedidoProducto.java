
package Entidades;


public class PedidoProducto {
    private int idPedidoProducto;
    private Producto producto;
    private int cantidad;
    private double subtotal;
    private Pedido pedido;

    public PedidoProducto() {
        pedido= new Pedido();
    }

    public PedidoProducto( Producto producto, int cantidad, Pedido pedido) {
         this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = calcularSubtotal();
        this.pedido=pedido;
    }

    public PedidoProducto(int idPedidoProducto, Producto producto, int cantidad, Pedido pedido) {
        this.idPedidoProducto = idPedidoProducto;
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = calcularSubtotal();
        this.pedido=pedido;
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

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    

    
    public double calcularSubtotal(){
      double st= cantidad * producto.getPrecio();
      return st;
  }

    @Override
    public String toString() {
        return "PedidoProducto{" + "idPedidoProducto=" + idPedidoProducto + ", producto=" + producto + ", cantidad=" + cantidad + ", subtotal=" + subtotal + ", pedido=" + pedido + '}';
    }

 
   
    
}
