package AccesoADatos;

import Entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioData {

    private Connection con = null;

    public UsuarioData() {
        con = Conexion.getConexion();
    }

    public void guardarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuario (username, contrasena ,Nivel, nombre, apellido) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getContrasena());
            ps.setString(3, usuario.getNivel());
            ps.setString(4, usuario.getNombre());
            ps.setString(5, usuario.getApellido());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuario añadido con exito ");

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Usuario");

        }

    }

    public void modificarUsuario(Usuario usuario) {
        String sql = "UPDATE usuario SET  username=?, contrasena=?, Nivel=?, nombre=?, apellido=? WHERE username=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getContrasena());
            ps.setString(3, usuario.getNivel());
            ps.setString(4, usuario.getNombre());
            ps.setString(5, usuario.getApellido());
            ps.setString(6, usuario.getUsername());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Usuario modificado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Usuario");
        }

    }

    public void eliminarUsuario(String username) {
        String sql = "DELETE FROM usuario WHERE username=? ";
      
        
//            String respuesta= JOptionPane.showInputDialog("Eliminar? SI/NO");
//            if (respuesta.equalsIgnoreCase("no")){
//               return;
//            } else if (respuesta.equalsIgnoreCase("si")){
                  try {
                          PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                 JOptionPane.showMessageDialog(null, " Usuario eliminado Definitivamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Usuario");
        }
//            } else {
//                 JOptionPane.showMessageDialog(null, " La respuesta es incorrecta ");
//                 return;
//            }

    }

    public List<Usuario> listarUsuarios() {

        String sql = " SELECT username, contrasena, Nivel, nombre, apellido FROM usuario ";
                
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setUsername(rs.getString("username"));
                usuario.setContrasena(rs.getString("contrasena"));
                usuario.setNivel(rs.getString("Nivel"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));

                usuarios.add(usuario);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla usuario");
        }
        return usuarios;
    }
    
    public List<Usuario> listarUsuariosPorNivel(String Nivel) {

        String sql = " SELECT username, contrasena, Nivel, nombre, apellido FROM usuario WHERE Nivel=? ";
                
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, Nivel);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setUsername(rs.getString("username"));
                usuario.setContrasena(rs.getString("contrasena"));
                usuario.setNivel(rs.getString("Nivel"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));

                usuarios.add(usuario);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla usuario");
        }
        return usuarios;
    }

    
      public Usuario buscarUsuario(String userName) {
        Usuario us = new Usuario();
        String sql = " SELECT username, contrasena, Nivel, nombre, apellido FROM usuario "
                + "WHERE username=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userName);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
            
                us.setUsername(userName);
                us.setContrasena(rs.getString("contrasena"));
                us.setNivel(rs.getString("nivel"));
                us.setNombre(rs.getString("nombre"));
                us.setApellido(rs.getString("apellido"));
                
                
            } else {
                JOptionPane.showMessageDialog(null, " No existe Usuario con ese Nombre de Usuario");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Usuario");
        }
        return us;
    }
    
}
