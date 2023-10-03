/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


public class Mesero {
    private int idMesero;
    private String nombre;
    private String apellido;

    public Mesero() {
    }

    public Mesero(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Mesero(int idMesero, String nombre, String apellido) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Mesero{" + "idMesero=" + idMesero + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}
