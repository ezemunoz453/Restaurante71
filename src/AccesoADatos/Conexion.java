
package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


     public class Conexion {
//    private static final String URL = "jdbc:mariadb://localhost/";
//    private static final String DB = "universidadGrupo71";
//    private static final String USUARIO = "root";
//    private static final String PASSWORD = "";
    private static Connection connection;
    
    
     private Conexion() {}
     
     public static Connection getConexion(){

        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mariadb://localhost/restaurantegrupo71","root","");
                
//                JOptionPane.showMessageDialog(null, " Conectado");

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar Driver " + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a BD " + ex.getMessage());
            }
        }
        return connection;
    }
     
     public static Connection desconectar(){
         
        try {
            connection.close();
            
            JOptionPane.showMessageDialog(null, " Desconectado");
        } catch (SQLException ex) {
//         JOptionPane.showMessageDialog(null, " Desconeccion exitosa");
        }
        return connection;
     }
     
     



}
