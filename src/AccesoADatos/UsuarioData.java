
package AccesoADatos;

import Entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class UsuarioData {
    
    private Connection con = null;
    
    public UsuarioData() {
        con = Conexion.getConexion();
    }
    
    
    public void guardarUsuario( Usuario usuario) {
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
//    
//    
  public void eliminarUsuario(String username) {
        String sql = "DELETE FROM usuario WHERE username=? ";
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
//    
//    
//    public Producto buscarProductoPorId(int idProducto) {
//        Producto producto= null;
//        
//        String sql = " SELECT  idProducto, nombre , stock, precio, estado FROM producto "
//                + "WHERE idProducto=? and estado=1";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, idProducto);
//            ResultSet rs = ps.executeQuery();
//            
//            if (rs.next()) {
//                producto = new Producto();
//                producto.setIdProducto(rs.getInt("idProducto"));
//                producto.setNombre(rs.getString("nombre"));
//                producto.setStock(rs.getInt("stock"));
//                producto.setPrecio(rs.getDouble("precio"));
////                producto.setEstado(true);
//                
//            } else {
//                JOptionPane.showMessageDialog(null, " No existe Producto con ese Id");
//            }
//            ps.close();
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Producto");
//        }
//        return producto;
//    }
//    
//    
//    public Producto buscarProductoPorNombre(String nombreProd) {
//        Producto producto= null;
//        
//        String sql = " SELECT  idProducto, nombre , stock, precio, estado FROM producto "
//                + "WHERE nombre=? and estado=1";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, nombreProd);
//            ResultSet rs = ps.executeQuery();
//            
//            if (rs.next()) {
//                producto = new Producto();
//                producto.setIdProducto(rs.getInt("idProducto"));
//                producto.setNombre(rs.getString("nombre"));
//                producto.setStock(rs.getInt("stock"));
//                producto.setPrecio(rs.getDouble("precio"));
////                producto.setEstado(true);
//                
//            } else {
//                JOptionPane.showMessageDialog(null, " No existe Producto con ese Nombre");
//            }
//            ps.close();
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Producto");
//        }
//        return producto;
//    }
//    
//       public Producto buscarProductoPorPrecio(Double precio) {
//        Producto producto= null;
//        
//        String sql = " SELECT  idProducto, nombre , stock, precio, estado FROM producto "
//                + "WHERE precio=? and estado=1";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setDouble(1, precio);
//            ResultSet rs = ps.executeQuery();
//            
//            if (rs.next()) {
//                producto = new Producto();
//                producto.setIdProducto(rs.getInt("idProducto"));
//                producto.setNombre(rs.getString("nombre"));
//                producto.setStock(rs.getInt("stock"));
//                producto.setPrecio(rs.getDouble("precio"));
////                producto.setEstado(true);
//                
//            } else {
//                JOptionPane.showMessageDialog(null, " No existe Producto con ese Precio");
//            }
//            ps.close();
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Producto");
//        }
//        return producto;
//    }
    
  }
  
}
