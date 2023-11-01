package AccesoADatos;

import Entidades.Mesa;
import Entidades.Pedido;
import Entidades.PedidoProducto;
import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PedidoProductoData {

    private Connection con = null;

    public PedidoProductoData() {
        con = Conexion.getConexion();
    }
    
    Producto producto= new Producto();
    ProductoData pData= new ProductoData();
    PedidoData pedData= new PedidoData();

    public void guardarPedidoProducto(PedidoProducto pp) {
        String sql = "INSERT INTO pedidoproducto (idProducto, cantidad, subtotal, idPedido) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, org.mariadb.jdbc.Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pp.getProducto().getIdProducto());
            ps.setInt(2, pp.getCantidad());
            ps.setDouble(3, pp.getSubtotal());
            ps.setInt(4, pp.getPedido().getIdPedido());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pp.setIdPedidoProducto(rs.getInt(1));
//                JOptionPane.showMessageDialog(null, "Pedido Producto generado con exito ");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido Producto");
        }
       
    }

    public void modificarPedidoProducto(PedidoProducto pp) {
        String sql = "UPDATE pedidoproducto SET idProducto=?, cantidad=? , subtotal=? , idPedido=? "
                + "WHERE idPedidoProducto=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, pp.getProducto().getIdProducto());
            ps.setInt(2, pp.getCantidad());
            ps.setDouble(3, pp.getSubtotal());
            ps.setInt(4, pp.getPedido().getIdPedido());
            ps.setInt(5, pp.getIdPedidoProducto());
            int exito = ps.executeUpdate();
            if (exito == 1) {
//                JOptionPane.showMessageDialog(null, " Pedido Producto modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido Producto");
        }

    }

    
     public void eliminarPedidoProducto(int idPP) {
        String sql = "DELETE FROM pedidoproducto WHERE idPedidoProducto=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPP);

            int exito = ps.executeUpdate();

            if (exito == 1) {
//                JOptionPane.showMessageDialog(null, " Pedido Producto eliminado Definitivamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido Producto");
        }
        
     }

  
     public PedidoProducto buscarpp(int idPedidoProducto) {
        PedidoProducto pp= new PedidoProducto(); 
        String sql = " SELECT * FROM pedidoproducto "
                + "WHERE idPedidoProducto=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPedidoProducto);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                pp.setIdPedidoProducto(idPedidoProducto);
                Producto prod;
                prod= pData.buscarProductoPorId(rs.getInt("idProducto"));
                pp.setProducto(prod);
                pp.setCantidad(rs.getInt("cantidad"));
                pp.setSubtotal(rs.getDouble("subtotal"));
                Pedido ped;
                ped= pedData.buscarPedidoPorId(rs.getInt("idPedido"));
                pp.setPedido(ped);
              
            } else {
                JOptionPane.showMessageDialog(null, " No existe Pedido Producto con ese id");
                pp= null;
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla PedidoProducto");
        }
        return pp;
    }
     
      public List<PedidoProducto> ListarPedidosProductoPorIdPedido(int idPedido) {
        List<PedidoProducto> pedidosProductos = new ArrayList<>();
        String sql = "SELECT * FROM pedidoproducto join pedido on( pedidoproducto.idPedido= pedido.idPedido)  "
                + " WHERE pedidoproducto.idPedido = ? ";

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);
            rs = ps.executeQuery();

            while (rs.next()) {
                PedidoProducto pedidoProducto = new PedidoProducto();
                pedidoProducto.setIdPedidoProducto(rs.getInt("idPedidoProducto"));
                pedidoProducto.setCantidad(rs.getInt("cantidad"));
               pedidoProducto.setSubtotal(rs.getDouble("subtotal"));
                Producto prod;
                prod= pData.buscarProductoPorId(rs.getInt("idProducto"));
               pedidoProducto.setProducto(prod);
               Pedido ped;
               ped= pedData.buscarPedidoPorId(idPedido);
               pedidoProducto.setPedido(ped);

                pedidosProductos.add(pedidoProducto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido: ");
        }

        return pedidosProductos;

    }
}
