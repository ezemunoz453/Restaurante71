
package Entidades;


public class Usuario {
    private String username;
    private String contrasena;
    private String Nivel;
    
    private String nombre;
    private String apellido;

    public Usuario(String username, String contrasena, String Nivel, String nombre, String apellido) {
        this.username = username;
        this.contrasena = contrasena;
        this.Nivel = Nivel;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Usuario() {
    }

    public Usuario(String contrasena, String Nivel, String nombre, String apellido) {
        this.contrasena = contrasena;
        this.Nivel = Nivel;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
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
        return "Usuario={" + "username=" + username + ", contrasena=" + contrasena + ", Nivel=" + Nivel + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
    
    
    
    
}
