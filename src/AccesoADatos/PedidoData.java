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
import Entidades.PedidoProducto;
import static java.lang.Character.UnicodeScript.UNKNOWN;

public class PedidoData {
    
     private Connection con = null;
    
    public PedidoData() {
        con = Conexion.getConexion();
        }
    
    PedidoProducto pp= new PedidoProducto();
    Mesa mesa = new Mesa();
    
    public void guardarPedido(Pedido pedido) {
        LocalDateTime now = LocalDateTime.now();
        String sql = "INSERT INTO pedido(nombreMesero,fechaHora,importe,idMesa,estado) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, pedido.getNombreMesero());
            ps.setTimestamp(2, Timestamp.valueOf(now));
            ps.setDouble(3, pedido.getImporte());
            ps.setInt(4, pedido.getMesa().getIdMesa());
            ps.setBoolean(5, pedido.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pedido.setIdPedido(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Pedido añadido con exito ");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido");

        }
        
    }
    
//    public void modificarEstadoPedido(Pedido pedido) {
//        String sql = "UPDATE pedido SET  estado=?  WHERE idPedido=? ";
//       
//        try {
//            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setInt(2, insc.getAlumno().getIdAlumno());
//            ps.setInt(3, insc.getMateria().getIdMateria());
//
//            ps.executeUpdate();
//            ResultSet rs = ps.getGeneratedKeys();
//            if (rs.next()) {
//                insc.setIdInscripcion(rs.getInt(1));
//                JOptionPane.showMessageDialog(null, "Alumno inscripto con exito ");
//            }
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla inscripcion");
//        }
//
//        
//    }
    
    
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
                                
                mesa.setIdMesa(rs.getInt("idMesa"));  // Asigna el id de la mesa al objeto Mesa
                pedido.setMesa(mesa);  // Asigna la mesa al pedido
               
                pedido.setNombreMesero(rs.getString("nombre mesero"));
                pedido.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
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
                mesa.setIdMesa(rs.getInt("idMesa"));  
                pedido.setMesa(mesa); 
                pedido.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
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
            ps.setInt(1, mesa.getIdMesa()); 
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                pedido = new Pedido();
                pedido.setNombreMesero(rs.getString("nombre mesero"));
                pedido.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
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


