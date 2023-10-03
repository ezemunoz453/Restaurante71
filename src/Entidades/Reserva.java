/*
 reserva, a nombre de una persona, DNI, fecha, hora, y estado vigente o no vigente.
LocalTime horaMinutos = LocalTime.of(15, 30); // Representa las 3:30 PM
 */
package Entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class Reserva {
    private int idReserva;
    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate fecha;
    private LocalTime hora;
    private boolean vigente;

    public Reserva() {
    }

    public Reserva(String nombre, String apellido, int dni, LocalDate fecha, LocalTime hora, boolean vigente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.vigente = vigente;
    }

    public Reserva(int idReserva, String nombre, String apellido, int dni, LocalDate fecha, LocalTime hora, boolean vigente) {
        this.idReserva = idReserva;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.vigente = vigente;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", fecha=" + fecha + ", hora=" + hora + ", vigente=" + vigente + '}';
    }
    
    
    
}
