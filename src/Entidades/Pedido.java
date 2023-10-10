package Entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import Entidades.PedidoProducto;

//public class Pedido {
//
//    private int idPedido;
//    public Mesa mesa;
//    private String nombreMesero;
//    private LocalDateTime fechaHora;
//    private double importe;
//    private boolean estado;
//     private List<PedidoProducto> pedidosP ;
//
//
//   PedidoProducto pp= new PedidoProducto();
//   
//
//    public Pedido() {
//        this.pedidosP = new ArrayList<PedidoProducto>();
//    }
//
//    public Pedido(Mesa mesa, String nombreMesero, LocalDateTime fechaHora,  boolean estado, List<PedidoProducto> pedidosP) {
//        this.mesa = mesa;
//        this.nombreMesero = nombreMesero;
//        this.fechaHora = fechaHora;
//        this.importe = calcularTotal();
//        this.estado = estado;
//        this.pedidosP = new ArrayList<PedidoProducto>();
//    }
//
//    public Pedido(int idPedido, Mesa mesa, String nombreMesero, LocalDateTime fechaHora,  boolean estado, List<PedidoProducto> pedidosP) {
//        this.idPedido = idPedido;
//        this.mesa = mesa;
//        this.nombreMesero = nombreMesero;
//        this.fechaHora = fechaHora;
//        this.importe = calcularTotal();
//        this.estado = estado;
//        this.pedidosP = new ArrayList<PedidoProducto>();
//    }
//
//    public int getIdPedido() {
//        return idPedido;
//    }
//
//    public void setIdPedido(int idPedido) {
//        this.idPedido = idPedido;
//    }
//
//    public Mesa getMesa() {
//        return mesa;
//    }
//
//    public void setMesa(Mesa mesa) {
//        this.mesa = mesa;
//    }
//
//    public String getNombreMesero() {
//        return nombreMesero;
//    }
//
//    public void setNombreMesero(String nombreMesero) {
//        this.nombreMesero = nombreMesero;
//    }
//
//    public LocalDateTime getFechaHora() {
//        return fechaHora;
//    }
//
//    public void setFechaHora(LocalDateTime fechaHora) {
//        this.fechaHora = fechaHora;
//    }
//
//    public double getImporte() {
//        return importe;
//    }
//
//    public void setImporte(double importe) {
//        this.importe = importe;
//    }
//
//    public boolean isEstado() {
//        return estado;
//    }
//
//    public void setEstado(boolean estado) {
//        this.estado = estado;
//    }
//
//    public List<PedidoProducto> getPedidosP() {
//        return pedidosP;
//    }
//
//    public void setPedidosP(List<PedidoProducto> pedidosP) {
//        this.pedidosP = pedidosP;
//    }
//
//    public PedidoProducto getPp() {
//        return pp;
//    }
//
//    public void setPp(PedidoProducto pp) {
//        this.pp = pp;
//    }
//
//    
//     
//    public void  adicionarPedidoProductoAPedido(PedidoProducto pp){
//           pedidosP.add(pp);  
//         
//      }
//      
//    
//    public double calcularTotal(){
//          double importeTotal=0 ;
//           for( PedidoProducto pedido: pedidosP){
//              importeTotal += pedido.getSubtotal();
//    }
//          return importeTotal;
//        
//    }
    

    
    
    public class Pedido {
    private int idPedido;
    public Mesa mesa;
    private String nombreMesero;
    private LocalDateTime fechaHora;
    private double importe;
    private boolean estado;
    private List<PedidoProducto> pedidosP;

    public Pedido() {
        pedidosP = new ArrayList<>();
    }

    public Pedido(Mesa mesa, String nombreMesero, LocalDateTime fechaHora, boolean estado, List<PedidoProducto> pedidosP) {
        this.mesa = mesa;
        this.nombreMesero = nombreMesero;
        this.fechaHora = fechaHora;
        this.pedidosP = new ArrayList<>();
        this.pedidosP.addAll(pedidosP); // Copiar la lista de productos
        this.importe = calcularTotal(); // Calcular el importe total
        this.estado = estado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String getNombreMesero() {
        return nombreMesero;
    }

    public void setNombreMesero(String nombreMesero) {
        this.nombreMesero = nombreMesero;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<PedidoProducto> getPedidosP() {
        return pedidosP;
    }

    public void setPedidosP(List<PedidoProducto> pedidosP) {
        this.pedidosP = pedidosP;
    }
    
    

    public void agregarPedidoProducto(PedidoProducto producto) {
        pedidosP.add(producto);
        importe = calcularTotal(); // Actualizar el importe total al agregar un producto
    }

    public double calcularTotal() {
        double total = 0.0;
        for (PedidoProducto producto : pedidosP) {
            total += producto.getSubtotal();
        }
        return total;
    }
    
 
}
