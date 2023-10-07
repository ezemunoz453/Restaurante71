
package Entidades;

import java.util.ArrayList;
import java.util.List;


public class Mesa {
    private int idMesa;
    private int numeroMesa;
    private int capacidad;
    private boolean estado;
    List<Pedido> pedidos;

    public Mesa() {
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Mesa(int numeroMesa, int capacidad, boolean estado) {
        this.numeroMesa = numeroMesa;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public Mesa(int idMesa, int numeroMesa, int capacidad, boolean estado) {
        this.idMesa = idMesa;
        this.numeroMesa = numeroMesa;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Mesa{" + "idMesa=" + idMesa + ", numeroMesa=" + numeroMesa + ", capacidad=" + capacidad + ", estado=" + estado + '}';
    }
    public double calcularImporteTotal() {
        double importeTotal = 0;
        for (Pedido pedido : pedidos) {
            importeTotal += pedido.obtenerTotal((ArrayList) pedidos);
        }
        return importeTotal;
    }   
    
}
