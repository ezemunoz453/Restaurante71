
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
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class PedidoData {

    private Connection con = null;

    public PedidoData() {
        con = Conexion.getConexion();
    }

    PedidoProducto pp = new PedidoProducto();
    Mesa mesa = new Mesa();
    LocalDateTime now = LocalDateTime.now();

    public void guardarPedido(Pedido pedido) {

        String sql = "INSERT INTO pedido(nombreMesero,fecha, hora,importe,idMesa,estado) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, pedido.getNombreMesero());
            ps.setDate(2,Date.valueOf(pedido.getFecha()));
            ps.setTime(3, Time.valueOf(pedido.getHora()));
//            ps.setTimestamp(2, Timestamp.valueOf(now));
            ps.setDouble(4, pedido.getImporte());
            ps.setInt(5, pedido.getMesa().getIdMesa());
            ps.setInt(6, pedido.getEstado());

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

    public void modificarEstadoPedido(Pedido pedido) {
        String sql = "UPDATE pedido SET  estado=?  WHERE idPedido=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, pedido.getEstado());
            ps.setInt(2, pedido.getIdPedido());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Estado pedido modificado con exito ");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido");
        }
    }

    public void modificarPedido(Pedido pedido) {

        String sql = "UPDATE pedido SET nombreMesero=?, fecha=?, hora=?, importe=?=, idMesa=? WHERE idPedido=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pedido.getNombreMesero());
//            ps.setTimestamp(2, Timestamp.valueOf(now));
            ps.setDate(2,Date.valueOf(pedido.getFecha()));
            ps.setTime(3, Time.valueOf(pedido.getHora()));
            ps.setDouble(4, pedido.getImporte());
            ps.setInt(5, pedido.getMesa().getIdMesa());
            ps.setInt(6, pedido.getIdPedido());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Pedido modificado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido");
        }
    }

    public void eliminarPedido(int idPedido) {
        String sql = "DELETE FROM pedido WHERE idPedido=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Pedido eliminado Definitivamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido");
        }
    }

    public Pedido buscarPedidoPorId(int idPedido) {
        Pedido pedido = new Pedido();
        String sql = " SELECT * FROM pedido WHERE idPedido=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pedido = new Pedido();
                MesaData mData = new MesaData();
                Mesa mesa = mData.buscarMesa(rs.getInt("idMesa"));
//                System.out.println("mesa = " + mesa);
                pedido.setIdPedido(idPedido);
                pedido.setNombreMesero(rs.getString("nombreMesero"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setHora(rs.getTime("hora").toLocalTime());
//                pedido.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setEstado(rs.getInt("estado"));
                pedido.setMesa(mesa);

            } else {
                JOptionPane.showMessageDialog(null, " No existe pedido con ese Id");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido");
        }
        return pedido;
    }

    public Pedido buscarPedidoPorNumeroMesa(int numeroMesa) {
        Pedido pedido = new Pedido();
        String sql = " SELECT * FROM pedido JOIN mesa ON (pedido.idMesa=mesa.idMesa) WHERE numeroMesa=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numeroMesa);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pedido = new Pedido();
                MesaData mData = new MesaData();
                Mesa mesa = mData.buscarMesa(rs.getInt("idMesa"));
//                System.out.println("mesa = " + mesa);
                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setNombreMesero(rs.getString("nombreMesero"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setHora(rs.getTime("hora").toLocalTime());
//                pedido.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setEstado(rs.getInt("estado"));
                pedido.setMesa(mesa);

            } else {
                JOptionPane.showMessageDialog(null, " No existe pedido con ese Id");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido");
        }
        return pedido;
    }

    public List<Pedido> ListarPedidosPorMesero(String nombreMesero) {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedido WHERE nombreMesero = ?";

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreMesero);
            rs = ps.executeQuery();

            while (rs.next()) {
                Pedido pedido = new Pedido();

                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setHora(rs.getTime("hora").toLocalTime());
//                pedido.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                pedido.setImporte(rs.getDouble("importe"));
                MesaData mData = new MesaData();
                Mesa mesa = mData.buscarMesa(rs.getInt("idMesa"));
                pedido.setMesa(mesa);

                pedidos.add(pedido);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido: ");
        }

        return pedidos;

    }
    
    public List<Pedido> ListarPedidosPorMeseroPorFecha(String nombreMesero, LocalDate fecha) {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedido WHERE nombreMesero = ? AND estado=2 AND fecha=?";

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreMesero);
            ps.setDate(2, Date.valueOf(fecha));
//            ps.setTimestamp(2,fechaHora);
            rs = ps.executeQuery();

            while (rs.next()) {
                Pedido pedido = new Pedido();

                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setHora(rs.getTime("hora").toLocalTime());
//                pedido.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                pedido.setImporte(rs.getDouble("importe"));
                MesaData mData = new MesaData();
                Mesa mesa = mData.buscarMesa(rs.getInt("idMesa"));
                pedido.setMesa(mesa);

                pedidos.add(pedido);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido: ");
        }

        return pedidos;

    }
    
    
       
     public List<Pedido> ListarIngresosTotalesPorFecha( LocalDate fecha) {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedido WHERE  estado=2 AND fecha=?";

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
           ps.setDate(1, Date.valueOf(fecha));

            rs = ps.executeQuery();

            while (rs.next()) {
                Pedido pedido = new Pedido();

                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setHora(rs.getTime("hora").toLocalTime());
                pedido.setImporte(rs.getDouble("importe"));
                MesaData mData = new MesaData();
                Mesa mesa = mData.buscarMesa(rs.getInt("idMesa"));
                pedido.setMesa(mesa);

                pedidos.add(pedido);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido: ");
        }

        return pedidos;

    }
     
      public double SumarTotalesPorFecha( LocalDate fecha) {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedido WHERE  estado=2 AND fecha=?";

        PreparedStatement ps = null;
        ResultSet rs = null;
          double sumaTotal = 0;

        try {
            ps = con.prepareStatement(sql);
           ps.setDate(1, Date.valueOf(fecha));
            rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setImporte(rs.getDouble("importe"));
                pedidos.add(pedido);
    
                sumaTotal += pedido.getImporte();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido: ");
        }
        return sumaTotal;

    }
      
      
      
      //Listar los pedidos que ha hecho una mesa en una fecha entre horas.

   public List<Pedido> ListarPedidosPorMesaPorFechaEntreHoras(int numeroMesa, LocalDate fecha, LocalTime hora, LocalTime hora1) {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = " SELECT * FROM pedido JOIN mesa ON (pedido.idMesa=mesa.idMesa) WHERE numeroMesa=? AND fecha=? "
                + " AND hora BETWEEN  ? AND ? ";

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, numeroMesa);
            ps.setDate(2, Date.valueOf(fecha));
            ps.setTime(3, Time.valueOf(hora));
            ps.setTime(4, Time.valueOf(hora1));

            rs = ps.executeQuery();

            while (rs.next()) {
                Pedido pedido = new Pedido();

                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setHora(rs.getTime("hora").toLocalTime());

                pedido.setImporte(rs.getDouble("importe"));
                MesaData mData = new MesaData();
                Mesa mesa = mData.buscarMesa(rs.getInt("idMesa"));
                pedido.setMesa(mesa);

                pedidos.add(pedido);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido: ");
        }

        return pedidos;

    }
      
      
      
      
      
      
      
}
