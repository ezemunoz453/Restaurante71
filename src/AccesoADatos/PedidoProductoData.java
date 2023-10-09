package AccesoADatos;

import Entidades.PedidoProducto;
import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    public void guardarPedidoProducto(PedidoProducto pp) {
        String sql = "INSERT INTO pedidoproducto (idProducto, cantidad, subtotal) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, org.mariadb.jdbc.Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pp.getProducto().getIdProducto());
            ps.setInt(2, pp.getCantidad());
            ps.setDouble(3, pp.getSubtotal());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pp.setIdPedidoProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Pedido Producto generado con exito ");
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido Producto");
        }
        

           
    }

    public void modificarPedidoProducto(PedidoProducto pp) {
        String sql = "UPDATE pedidoproducto SET idProducto=?, cantidad=? , subtotal=? "
                + "WHERE idPedidoProducto=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, pp.getProducto().getIdProducto());
            ps.setInt(2, pp.getCantidad());
            ps.setDouble(3, pp.getSubtotal());
            ps.setInt(4, pp.getIdPedidoProducto());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Pedido Producto modificado");
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
                JOptionPane.showMessageDialog(null, " Pedido Producto eliminado Definitivamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido Producto");
        }
        
     }
}
