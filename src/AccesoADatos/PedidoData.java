package AccesoADatos;

import Entidades.Pedido;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import Entidades.Mesa;

public class PedidoData {
    
     private Connection con = null;
    
    public PedidoData() {
        con = Conexion.getConexion();
    }
    
    
    public void guardarPedidoData( Pedido pedido) {
        LocalDateTime now = LocalDateTime.now();
        String sql = "INSERT INTO pedido(idMesa,nombreMesero,fechaHora,importe,estado) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pedido.mesa.getIdMesa());
            ps.setString(2, pedido.getNombreMesero());
           ps.setTimestamp(3, Timestamp.valueOf(now));
            ps.setDouble(4, pedido.getImporte());
            ps.setBoolean(5, pedido.isEstado());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pedido.getIdPedido();
                JOptionPane.showMessageDialog(null, "Pedido añadido con exito ");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido");
        
        }
        
    }
    
    public void modificarPedido(Pedido pedido) {
        String sql = "UPDATE pedido SET numeroMesa=? , nombreMesero=?, estado=? WHERE idMesa=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, pedido.mesa.getIdMesa());
            ps.setString(2, pedido.getNombreMesero());
            ps.setBoolean(3, pedido.isEstado());
            
                      
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Producto modificado");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Producto");
        }
        
    }
    
    
    public void eliminarPedido(int idPedido) {
        String sql = "UPDATE pedido SET estado=0 WHERE idPedido=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);
            
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Pedido eliminado");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla pedido");
        }
        
    }
    
    
    public Pedido buscarPedidoPorId(int idPedido) {
        Pedido pedido= null;
        
        String sql = " SELECT   idMesa, nombreMesero , fechaHora, importe, estado FROM pedido "
                + "WHERE idPedido=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                pedido = new Pedido();
                pedido.setidMesa(pedido.mesa.getInt("idMesa"));
                pedido.setNombreMesero(rs.getString("nombre mesero"));
                pedido.setFechaHora(rs.getLocalTime(fechaHora));
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setEstado(rs.getBoolean("estado"));
//                producto.setEstado(true);
                
            } else {
                JOptionPane.showMessageDialog(null, " No existe pedido con ese Id");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido");
        }
        return pedido;
    }
    
    
    public Pedido buscarPedidosPorMesero(String nombreMesero) {
        Pedido pedido= null;
        
        String sql = " SELECT  idMesa,fechaHora,importe,estado FROM pedido "
                + "WHERE nombreMesero=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombreMesero);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                pedido = new Pedido();
                pedido.setMesa(pedido.mesa.getIdMesa());
                pedido.setFechaHora(rs.getLocalDate("fechaHora"));
                pedido.setImporte(rs.getInt("importe"));
                pedido.setEstado(rs.getBoolean("estado"));
                
            } else {
                JOptionPane.showMessageDialog(null, " No existe Pedido de ese mesero");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla pedido");
        }
        return pedido;
    }
    
       public Pedido buscarPedidosPorMesa(Mesa mesa) {
        Pedido pedido= null;
        
        String sql = " SELECT  nombreMesero,fechaHora,importe,estado FROM pedido "
                + "WHERE idMesa=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mesa);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                pedido = new Pedido();
                pedido.setNombreMesero(rs.getString("nombre mesero"));
                pedido.setFechaHora(rs.getLocalDateTime("fecha hora"));
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setEstado(rs.getBoolean("estado"));

                
            } else {
                JOptionPane.showMessageDialog(null, " la mesa no tiene pedidos");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla pedido");
        }
        return pedido;
    }
    
}


