
package AccesoADatos;

import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProductoData {
    
    
     private Connection con = null;
    
    public ProductoData() {
        con = Conexion.getConexion();
    }
    
    
    public void guardarProducto( Producto producto) {
        String sql = "INSERT INTO producto (nombre, stock ,precio, estado, tipo) VALUES (?,?,?,?, ?)";
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getStock());
            ps.setDouble(3, producto.getPrecio());
            ps.setBoolean(4, producto.isEstado());
            ps.setString(5, producto.getTipo());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                producto.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto añadido con exito ");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Producto- No puede duplicar producto");
        
        }
        
    }
    
    public void modificarProducto(Producto producto) {
        String sql = "UPDATE producto SET nombre=?, stock=?, precio=?, tipo=? WHERE idProducto=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getStock());
            ps.setDouble(3, producto.getPrecio());
             ps.setString(4, producto.getTipo());
             ps.setDouble(5, producto.getIdProducto());
                      
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
        Producto producto= new Producto();
        String sql = " SELECT  * FROM producto "
                + "WHERE idProducto=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setTipo(rs.getString("tipo"));
//                producto.setEstado(true);
                
            } else {
                JOptionPane.showMessageDialog(null, " No existe Producto con ese Id");
                producto= null;
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Producto");
        }
        return producto;
    }
    
    
    public Producto buscarProductoPorTipo(int tipo) {
        Producto producto= new Producto();
        
        String sql = " SELECT  idProducto, nombre , stock, precio, estado, tipo FROM producto "
                + "WHERE tipo=? and estado=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, tipo);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setTipo(rs.getString("tipo"));
//                producto.setEstado(true);
                
            } else {
                JOptionPane.showMessageDialog(null, " No existe El tipo de producto");
                producto= null;
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Producto");
        }
        return producto;
    }
    
        public Producto buscarProductoPorNombre(String nombreProd) {
        Producto producto= null;
        
        String sql = " SELECT  * FROM producto "
                + "WHERE nombre=? and estado=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombreProd);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio(rs.getDouble("precio"));
                 producto.setTipo(rs.getString("tipo"));
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
    
    public Producto buscarProductoPorNombre1(String nombreProd) {
        Producto producto= null;
        
        String sql = " SELECT  idProducto, nombre , stock, precio, estado, tipo FROM producto "
                + "WHERE nombre LIKE ? and estado=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + nombreProd+ "%");
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio(rs.getDouble("precio"));
                 producto.setTipo(rs.getString("tipo"));
//                producto.setEstado(true);
                
            } else {
                JOptionPane.showMessageDialog(null, " No existe Producto con ese Nombre");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Producto"+ex.getMessage());
        }
        return producto;
    }
    
       public Producto buscarProductoPorPrecio(Double precio) {
        Producto producto= null;
        
        String sql = " SELECT  idProducto, nombre , stock, precio, estado, tipo FROM producto "
                + "WHERE precio=? and estado=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, precio);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio(rs.getDouble("precio"));
                 producto.setTipo(rs.getString("tipo"));
//                producto.setEstado(true);
                
            } else {
                JOptionPane.showMessageDialog(null, " No existe Producto con ese Precio");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Producto");
        }
        return producto;
    }
       
       public List<Producto> listarProductos() {

        String sql = " SELECT idProducto, nombre , stock, precio, estado, tipo FROM producto ";
                
        ArrayList<Producto> productos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
              Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setEstado(rs.getBoolean("estado"));
                 producto.setTipo(rs.getString("tipo"));

                productos.add(producto);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla usuario");
        }
        return productos;
    }
    
}
