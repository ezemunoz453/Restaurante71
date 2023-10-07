package Entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int idPedido;
    public Mesa mesa;
    private String nombreMesero;
    private LocalDateTime fechaHora;
    private double importe;
    private boolean estado;
    List<PedidoProducto> productos;

    private ArrayList<PedidoProducto> pedProd = new ArrayList<PedidoProducto>();

    public Pedido() {
    }

    public Pedido(Mesa mesa, String nombreMesero, LocalDateTime fechaHora,  boolean estado) {
        this.mesa = mesa;
        this.nombreMesero = nombreMesero;
        this.fechaHora = fechaHora;
        this.importe = obtenerTotal(pedProd);
        this.estado = estado;
    }

    public Pedido(int idPedido, Mesa mesa, String nombreMesero, LocalDateTime fechaHora,  boolean estado) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.nombreMesero = nombreMesero;
        this.fechaHora = fechaHora;
        this.importe = obtenerTotal(pedProd);
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

    public ArrayList<PedidoProducto> getPedProd() {
        return pedProd;
    }

    public void setPedProd(ArrayList<PedidoProducto> pedProd) {
        this.pedProd = pedProd;
    }


    public void cargarPprodAPedido(PedidoProducto pedP) {
        pedProd.add(pedP);
    }
    
       public double obtenerTotal(ArrayList ped){
           pedProd= ped;
       double suma= 0;
       for (PedidoProducto pedidoProducto : pedProd) {
           suma= suma + pedidoProducto.getSubtotal();
          } return suma;
       
   }
       
}
