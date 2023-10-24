
package AccesoADatos;

import Entidades.Mesa;
import Entidades.Mesero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class MeseroData {
    private Connection con = null;

    public MeseroData() {
        con = Conexion.getConexion();
    }
    
     public void guardarMesero(Mesero mesero) {
        String sql = "INSERT INTO mesero (nombreMesero, apellidoMesero) VALUES (?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, mesero.getNombreMesero());
            ps.setString(2, mesero.getApellidoMesero());
           
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
               mesero.setIdMesero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Mesero añadida con exito ");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mesero");

        }

    }
    
    
     
       public Mesero buscarMesero(String nombreMesero) {
        Mesero mesero= new Mesero();
        String sql = " SELECT * FROM mesero "
                + "WHERE nombreMesero=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombreMesero);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                mesero.setNombreMesero(nombreMesero);
                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setApellidoMesero(rs.getString("apellidoMesero"));
                
               
            } else {
                JOptionPane.showMessageDialog(null, " No existe Mesero con ese id");
                mesero= null;
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mesero");
        }
        return mesero;
    }
       
       
        public List<Mesero> listarMeseros() {

        String sql = " SELECT * FROM mesero ";
                
                ArrayList<Mesero> meseros = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Mesero mesero= new Mesero();
                mesero.setNombreMesero(rs.getString("nombreMesero"));
                mesero.setApellidoMesero(rs.getString("apellidoMesero"));
                mesero.setIdMesero(rs.getInt("idMesero"));
                
                             
                meseros.add(mesero);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla meseros");
        }
        return meseros;
        }
        
}
