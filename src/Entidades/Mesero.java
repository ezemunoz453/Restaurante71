
package Entidades;


public class Mesero {
    
    int idMesero;
    String nombreMesero;
    String apellidoMesero;

    public Mesero() {
    }

    public Mesero(String nombreMesero, String apellidoMesero) {
        this.nombreMesero = nombreMesero;
        this.apellidoMesero = apellidoMesero;
    }

    public Mesero(int idMesero, String nombreMesero, String apellidoMesero) {
        this.idMesero = idMesero;
        this.nombreMesero = nombreMesero;
        this.apellidoMesero = apellidoMesero;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public String getNombreMesero() {
        return nombreMesero;
    }

    public void setNombreMesero(String nombreMesero) {
        this.nombreMesero = nombreMesero;
    }

    public String getApellidoMesero() {
        return apellidoMesero;
    }

    public void setApellidoMesero(String apellidoMesero) {
        this.apellidoMesero = apellidoMesero;
    }

    @Override
    public String toString() {
        return  idMesero + " ,  " + nombreMesero + "  " + apellidoMesero ;
    }
    
    
    
    
}
