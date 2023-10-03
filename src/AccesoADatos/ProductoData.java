
package AccesoADatos;

import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ProductoData {
    
    
     private Connection con = null;
    
    public ProductoData() {
        con = Conexion.getConexion();
    }
    
    
    public void guardarProducto( Producto producto) {
        String sql = "INSERT INTO producto (nombre, cantidad ,precio, estado) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getCantidad());
            ps.setDouble(3, producto.getPrecio());
            ps.setBoolean(4, producto.isEstado());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                producto.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto añadido con exito ");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Producto");
        
        }
        
    }
    
    public void modificarProducto(Producto producto) {
        String sql = "UPDATE producto SET nombre=?, cantidad=?, precio=? WHERE idProducto=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getCantidad());
            ps.setDouble(3, producto.getPrecio());
            ps.setDouble(4, producto.getIdProducto());
                      
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Producto modificado");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Producto");
        }
        
    }
    
    
    public void eliminarProducto(int idProducto) {
        String sql = "UPDATE producto SET estado=0 WHERE idProducto=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Producto eliminado- Estado inactivo");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Producto");
        }
        
    }
    
    
    public Producto buscarProductoPorId(int idProducto) {
        Producto producto= null;
        
        String sql = " SELECT  idProducto, nombre , cantidad, precio, estado FROM producto "
                + "WHERE idProducto=? and estado=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCantidad(rs.getInt("cantidad"));
                producto.setPrecio(rs.getDouble("precio"));
//                producto.setEstado(true);
                
            } else {
                JOptionPane.showMessageDialog(null, " No existe Producto con ese Id");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Producto");
        }
        return producto;
    }
    
    
    public Producto buscarProductoPorNombre(String nombreProd) {
        Producto producto= null;
        
        String sql = " SELECT  idProducto, nombre , cantidad, precio, estado FROM producto "
                + "WHERE nombre=? and estado=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombreProd);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCantidad(rs.getInt("cantidad"));
                producto.setPrecio(rs.getDouble("precio"));
//                producto.setEstado(true);
                
            } else {
                JOptionPane.showMessageDialog(null, " No existe Producto con ese Nombre");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Producto");
        }
        return producto;
    }
    
    
}
