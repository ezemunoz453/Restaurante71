package restaurante71;

import AccesoADatos.Conexion;
import AccesoADatos.ProductoData;
import Entidades.Producto;
import java.sql.Connection;

public class Restaurante71 {

    public static void main(String[] args) {
        Connection con = null;
        con = Conexion.getConexion();
//     con=Conexion.desconectar();
        ProductoData pData = new ProductoData();

// Guardar Producto
//Producto prod= new Producto("Papas fritas", 100, 10.0 , true);
//pData.guardarProducto(prod);


// Modificar producto
//Producto prod= new Producto(2,"Papas fritas", 100, 25.0 , true);
//pData.modificarProducto(prod);


//Eliminar producto
// pData.eliminarProducto(2);


  //  Buscar por idProducto
//        Producto encontrado = pData.buscarProductoPorId(2);
//        System.out.println(" IdProducto = " + encontrado.getIdProducto());
//        System.out.println(" Nombre = " + encontrado.getNombre());
//        System.out.println(" Cantidad = " + encontrado.getCantidad());
//        System.out.println(" Estado = " + encontrado.isEstado());
//        System.out.println(" Precio = " + encontrado.getPrecio());

  //  Buscar por Nombre Producto
//        Producto encontrado = pData.buscarProductoPorNombre("coca cola");
//        System.out.println(" IdProducto = " + encontrado.getIdProducto());
//        System.out.println(" Nombre = " + encontrado.getNombre());
//        System.out.println(" Cantidad = " + encontrado.getCantidad());
//        System.out.println(" Estado = " + encontrado.isEstado());
//        System.out.println(" Precio = " + encontrado.getPrecio());



///nuihuhuygbyun
    }

}
