
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
import Entidades.Mesero;
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
    Mesero mesero= new Mesero();
    MeseroData mesData= new MeseroData();

    public void guardarPedido(Pedido pedido) {

        String sql = "INSERT INTO pedido(nombreMesero,fecha, hora,importe,idMesa,estado) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, pedido.getMesero().getNombreMesero());
            ps.setDate(2,Date.valueOf(pedido.getFecha()));
            ps.setTime(3, Time.valueOf(pedido.getHora()));
//            ps.setTimestamp(2, Timestamp.valueOf(now));
            ps.setDouble(4, pedido.getImporte());
            ps.setInt(5, pedido.getMesa().getIdMesa());
            ps.setString(6, pedido.getEstado());

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

    public void modificarEstadoPedido(int idPedido, String estado) {
        String sql = "UPDATE pedido SET  estado=?  WHERE idPedido=? ";
        try {
            Pedido pedido= buscarPedidoPorId(idPedido);
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, estado);
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
            ps.setString(1, pedido.getMesero().getNombreMesero());
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
    
    public void modificarImportePedido(int idPedido, double importe) {
            Pedido pedido= new Pedido();
        String sql = "UPDATE pedido SET  importe=? WHERE idPedido=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            pedido= buscarPedidoPorId(idPedido);
            ps.setDouble(1, importe);
            ps.setInt(2, pedido.getIdPedido());

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
               Mesero mesero= mesData.buscarMesero(rs.getString("nombreMesero"));
               pedido.setMesero(mesero);
//                pedido.setNombreMesero(rs.getString("nombreMesero"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setHora(rs.getTime("hora").toLocalTime());
//                pedido.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setEstado(rs.getString("estado"));
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
                Mesero mesero= mesData.buscarMesero(rs.getString("nombreMesero"));
               pedido.setMesero(mesero);
//                pedido.setNombreMesero(rs.getString("nombreMesero"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setHora(rs.getTime("hora").toLocalTime());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setEstado(rs.getString("estado"));
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
    
//     public Pedido buscarPedidoPorNumeroMesa(int numeroMesa) {
//        Pedido pedido = new Pedido();
//        String sql = " SELECT * FROM pedido JOIN mesa ON (pedido.idMesa=mesa.idMesa) WHERE numeroMesa=? ";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, numeroMesa);
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                pedido = new Pedido();
//                MesaData mData = new MesaData();
//                Mesa mesa = mData.buscarMesa(rs.getInt("idMesa"));
////                System.out.println("mesa = " + mesa);
//                pedido.setIdPedido(rs.getInt("idPedido"));
//                Mesero mesero= mesData.buscarMesero(rs.getString("nombreMesero"));
//               pedido.setMesero(mesero);
////                pedido.setNombreMesero(rs.getString("nombreMesero"));
//                pedido.setFecha(rs.getDate("fecha").toLocalDate());
//                pedido.setHora(rs.getTime("hora").toLocalTime());
//                pedido.setImporte(rs.getDouble("importe"));
//                pedido.setEstado(rs.getString("estado"));
//                pedido.setMesa(mesa);
//
//            } else {
//                JOptionPane.showMessageDialog(null, " No existe pedido con ese Id");
//            }
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido");
//        }
//        return pedido;
//    }
    
    public Pedido buscarPedidoPorIdMesaConEstadoPedido(int idMesa, String estadoPedido) {
        Pedido pedido = new Pedido();
        String sql = " SELECT * FROM pedido JOIN mesa ON (pedido.idMesa=mesa.idMesa) WHERE pedido.idMesa=?  AND pedido.estado= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesa);
            ps.setString(2, estadoPedido);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pedido = new Pedido();
                MesaData mData = new MesaData();
                Mesa mesa = mData.buscarMesa(rs.getInt("idMesa"));
//                System.out.println("mesa = " + mesa);
                pedido.setIdPedido(rs.getInt("idPedido"));
                Mesero mesero= mesData.buscarMesero(rs.getString("nombreMesero"));
               pedido.setMesero(mesero);
//                pedido.setNombreMesero(rs.getString("nombreMesero"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setHora(rs.getTime("hora").toLocalTime());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setEstado(rs.getString("estado"));
                pedido.setMesa(mesa);

            } else {
                JOptionPane.showMessageDialog(null, " No existe pedido con ese Id de Mesa");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido"+ex.getMessage());
        }
        return pedido;
    }
    

    public List<Pedido> ListarPedidosPorMesero(String nombreMesero) {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedido join mesero on( pedido.nombreMesero= mesero.nombreMesero)  "
                + " WHERE pedido.nombreMesero = ? ";

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
    
    public List<Pedido> ListarPedidosPorEstado(String estado) {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedido   "
                + " WHERE estado=? ";

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estado);
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
    
     public List<Pedido> ListarPedidosPorEstadoPorFecha(String estado, LocalDate fecha) {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedido   "
                + " WHERE estado=? and fecha=?";

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estado);
            ps.setDate(2, Date.valueOf(fecha));
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
    
    public List<Pedido> ListarPedidosPorMeseroPorFecha(String nombreMesero, LocalDate fecha) {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedido join mesero on( pedido.nombreMesero= mesero.nombreMesero) "
                + " WHERE nombreMesero = ? AND estado=2 AND fecha=?";

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
