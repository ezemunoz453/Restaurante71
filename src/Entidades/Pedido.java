package Entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import Entidades.PedidoProducto;
import java.time.LocalDate;
import java.time.LocalTime;

  

    
    
    public class Pedido {
    private int idPedido;
    public Mesa mesa;
    private String nombreMesero;
//    private LocalDateTime fechaHora;
    private LocalDate fecha;
    private LocalTime hora;
    private double importe;
    private int estado;//0 pendiente, 1 entregado , 2 pagado
    private List<PedidoProducto> pedidosP;

    public Pedido() {
        pedidosP = new ArrayList<>();
    }

    public Pedido(Mesa mesa, String nombreMesero, LocalDate fecha, LocalTime hora, int estado, List<PedidoProducto> pedidosP) {
        this.mesa = mesa;
        this.nombreMesero = nombreMesero;
        this.fecha= fecha;
        this.hora = hora;
//        this.fechaHora = fechaHora;
        this.pedidosP = new ArrayList<>();
        this.pedidosP.addAll(pedidosP); // Copiar la lista de productos
        this.importe = calcularTotal(); // Calcular el importe total
        this.estado = estado;
    }

    public Pedido(Mesa mesa, String nombreMesero, LocalDate fecha, LocalTime hora, int estado) {
        this.mesa = mesa;
        this.nombreMesero = nombreMesero;
        this.fecha= fecha;
        this.hora = hora;
//        this.fechaHora = fechaHora;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    
    

//    public LocalDateTime getFechaHora() {
//        return fechaHora;
//    }
//
//    public void setFechaHora(LocalDateTime fechaHora) {
//        this.fechaHora = fechaHora;
//    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
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

    @Override
    public String toString() {
        return  "idPedido=" + idPedido + ", mesa=" + mesa + ", nombreMesero=" + nombreMesero + ", fecha=" + fecha + ", hora=" + hora + ", importe=" + importe + ", estado=" + estado + ", pedidosP=" + pedidosP ;
    }

  
    
  
 
}
