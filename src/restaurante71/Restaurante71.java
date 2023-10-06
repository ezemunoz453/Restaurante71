// www.zdescargas.org/

package restaurante71;

import AccesoADatos.Conexion;
import AccesoADatos.MesaData;
import AccesoADatos.ProductoData;
import AccesoADatos.UsuarioData;
import Entidades.Mesa;
import Entidades.Pedido;
import Entidades.PedidoProducto;
import Entidades.Producto;
import Entidades.Usuario;
import Vistas.Loggin;
import java.sql.Connection;
import java.time.LocalDateTime;

public class Restaurante71 {

    public static void main(String[] args) {
        Connection con = null;
        con = Conexion.getConexion();
//     con=Conexion.desconectar();
        ProductoData pData = new ProductoData();
        MesaData mData= new MesaData();
        UsuarioData uData= new UsuarioData();

//////////        Loggin log= new Loggin();
//////////        log.setVisible(true);
        
        
// Guardar Producto
//Producto prod= new Producto("Lomito", 100, 2000.0 , true);
//pData.guardarProducto(prod);


// Modificar producto
//Producto prod= new Producto(3,"Lomito con papas", 100, 2500.0 , true);
//pData.modificarProducto(prod);


//Eliminar producto
// pData.eliminarProducto(2);


  //  Buscar por idProducto
//        Producto encontrado = pData.buscarProductoPorId(3);
//        System.out.println(" IdProducto = " + encontrado.getIdProducto());
//        System.out.println(" Nombre = " + encontrado.getNombre());
//        System.out.println(" Cantidad = " + encontrado.getStock());
//        System.out.println(" Estado = " + encontrado.isEstado());
//        System.out.println(" Precio = " + encontrado.getPrecio());

  //  Buscar por Nombre Producto
//        Producto encontrado = pData.buscarProductoPorNombre("papas fritas");
//        System.out.println(" IdProducto = " + encontrado.getIdProducto());
//        System.out.println(" Nombre = " + encontrado.getNombre());
//        System.out.println(" Cantidad = " + encontrado.getStock());
//        System.out.println(" Estado = " + encontrado.isEstado());
//        System.out.println(" Precio = " + encontrado.getPrecio());

//  Buscar por Precio
//        Producto encontrado = pData.buscarProductoPorPrecio(10.0);
//        System.out.println(" IdProducto = " + encontrado.getIdProducto());
//        System.out.println(" Nombre = " + encontrado.getNombre());
//        System.out.println(" Cantidad = " + encontrado.getStock());
//        System.out.println(" Estado = " + encontrado.isEstado());
//        System.out.println(" Precio = " + encontrado.getPrecio());


// Guardar Mesa
//Mesa mesa= new Mesa(25, 8, true);
//mData.guardarMesa(mesa);

// modificar mesa
//Mesa mesa= new Mesa(8, 1, 2, true);
//mData.modificarMesa(mesa);

//eliminar mesa
//mData.eliminarMesa(8);

//eliminar mesa x numero mesa
//mData.eliminarMesaPorNumeroMesa(2);


// listar mesas
//for(Mesa mesa:mData.listarMesas()){
//    System.out.println(" id" +mesa.getIdMesa());
//    System.out.println(" capacidad = "+mesa.getCapacidad());
//    System.out.println(" numero Mesa =" +mesa.getNumeroMesa());
//    System.out.println(" Estado libre/ocupado= "+mesa.isEstado());
//    
//    System.out.println("");
//    }


// listar mesas libres
//for(Mesa mesa:mData.listarMesasLibres()){
//    System.out.println(" id" +mesa.getIdMesa());
//    System.out.println(" capacidad = "+mesa.getCapacidad());
//    System.out.println(" numero Mesa =" +mesa.getNumeroMesa());
//    System.out.println(" Estado libre/ocupado= "+mesa.isEstado());
//    
//    System.out.println("");
//    } 
//


// guardar usuario
//Usuario user= new Usuario("jorgej", "1111", "Administrador", "jorge", "juarez");
//UsuarioData uData= new UsuarioData();
//uData.guardarUsuario(user);

// modificar usuario
//Usuario user= new Usuario("poroto", "3333", "Administrador", "jorge", "juarez aaa");
//UsuarioData uData= new UsuarioData();
//uData.modificarUsuario(user);

//eliminar usuario
//uData.eliminarUsuario("poroto");


// listar usuarios
//for(Usuario usuario:uData.listarUsuarios()){
//    System.out.println(usuario.getUsername());
//    System.out.println(usuario.getContrasena());
//    System.out.println(usuario.getNivel());
//    System.out.println(usuario.getNombre());
//    System.out.println(usuario.getApellido());
//    
//    System.out.println("");
//    }
    


//for(Usuario usuario:uData.listarUsuariosPorNivel("Administrador")){
//    System.out.println(usuario.getUsername());
//    System.out.println(usuario.getContrasena());
//    System.out.println(usuario.getNivel());
//    System.out.println(usuario.getNombre());
//    System.out.println(usuario.getApellido());
//    
//    System.out.println("");
//    }

//Mesa mesa= new Mesa(5, 4, true);
//mData.guardarMesa(mesa);
//
//Producto prod= new Producto("pap", 100, 100, true);
//pData.guardarProducto(prod);
//
//Pedido pedido= new Pedido(mesa, "pepe", LocalDateTime.now(), 1000, true);
//PedidoProducto pedProd= new PedidoProducto(pedido, prod, 0);
//



    }
    
}
