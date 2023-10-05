package AccesoADatos;

import Entidades.Mesa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;

public class MesaData {

    private Connection con = null;

    public MesaData() {
        con = Conexion.getConexion();
    }

    public void guardarMesa(Mesa mesa) {
        String sql = "INSERT INTO mesa (numeroMesa, capacidad, estado) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mesa.getNumeroMesa());
            ps.setInt(2, mesa.getCapacidad());
            ps.setBoolean(3, mesa.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                mesa.setIdMesa(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Mesa añadida con exito ");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mesa");

        }

    }

    public void modificarMesa(Mesa mesa) {
        String sql = "UPDATE mesa SET numeroMesa=?, capacidad=?, estado=? WHERE idMesa=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mesa.getNumeroMesa());
            ps.setInt(2, mesa.getCapacidad());
            ps.setBoolean(3, mesa.isEstado());
            ps.setInt(4, mesa.getIdMesa());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Datos de Mesa modificada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mesa");
        }

    }

    public void eliminarMesaPorId(int idMesa) {
        String sql = "DELETE FROM mesa WHERE idMesa=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesa);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Mesa eliminada Definitivamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mesa");
        }
    }
    
     public void eliminarMesaPorNumeroMesa(int numeroMesa) {
        String sql = "DELETE FROM mesa WHERE numeroMesa=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numeroMesa);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Mesa eliminada Definitivamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mesa");
        }
    }

    public List<Mesa> listarMesas() {

        String sql = " SELECT idMesa,numeroMesa, capacidad, estado FROM mesa ";
                
        
        ArrayList<Mesa> mesas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumeroMesa(rs.getInt("numeroMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(rs.getBoolean("estado"));
                
                mesas.add(mesa);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla mesa");
        }
        return mesas;
    }

     public List<Mesa> listarMesasLibres() {

        String sql = " SELECT idMesa,numeroMesa, capacidad, estado FROM mesa WHERE estado=1  ";
                //1 true libre- 0 false ocupado
        
        ArrayList<Mesa> mesas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumeroMesa(rs.getInt("numeroMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(rs.getBoolean("estado"));
                
                mesas.add(mesa);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla mesa");
        }
        return mesas;
    }

    public List<Mesa> listarMesasOcupadas() {

        String sql = " SELECT idMesa,numeroMesa, capacidad, estado FROM mesa WHERE estado=0  ";
                //1 true libre- 0 false ocupado
        
        ArrayList<Mesa> mesas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumeroMesa(rs.getInt("numeroMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(rs.getBoolean("estado"));
                
                mesas.add(mesa);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla mesa");
        }
        return mesas;
    }
    
}
