// www.zdescargas.org/

package restaurante71;

import AccesoADatos.Conexion;
import AccesoADatos.MesaData;
import AccesoADatos.PedidoData;
import AccesoADatos.PedidoProductoData;
import AccesoADatos.ProductoData;
import AccesoADatos.UsuarioData;
import Entidades.Mesa;
import Entidades.Pedido;
import Entidades.PedidoProducto;
import Entidades.Producto;
import Entidades.Usuario;
import Vistas.Login;
import java.sql.Connection;
import java.time.LocalDate;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;

import java.util.List;

public class Restaurante71 {

    public static void main(String[] args) {
        Connection con = null;
        con = Conexion.getConexion();
//     con=Conexion.desconectar();
        ProductoData pData = new ProductoData();
        MesaData mData= new MesaData();
        UsuarioData uData= new UsuarioData();
        PedidoData peData= new PedidoData();
        PedidoProductoData ppd= new PedidoProductoData();
        PedidoData pedData= new PedidoData();

        Login log= new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        
     




/////* PRUEBAS MAIN*/////////

// Guardar Producto
//Producto prod= new Producto("Lomito completo s", 100, 2000.0 , true, 1);
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
    

//listar usuarios x nivel
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

// calcular subtotal- metodo de pedido producto
//Producto prod= new Producto("pepsi", 1500, 750, true);
//pData.guardarProducto(prod);
//PedidoProducto pedProd= new PedidoProducto(prod, 3) ;
//pedProd.calcularSubtotal();


////////////////// calcular total- no usar
//Producto prod= new Producto("pepsi", 1500, 800, true);
//Producto prod1= new Producto("brhama lata", 2400, 700, true);
//Producto prod2= new Producto("hamburguesa con chedar", 100, 2800, true);
//Producto prod3= new Producto("empanada carne salada", 500, 400, true);

//pData.guardarProducto(prod);
//pData.guardarProducto(prod1);
//pData.guardarProducto(prod2);
//pData.guardarProducto(prod3);

//PedidoProducto pedProd= new PedidoProducto(prod, 1) ;
//PedidoProducto pedProd1= new PedidoProducto(prod1, 1) ;
//PedidoProducto pedProd2= new PedidoProducto(prod2, 1) ;
//PedidoProducto pedProd3= new PedidoProducto(prod3, 4) ;

////        System.out.println(" subtotal= "+pedProd.calcularSubtotal());
////        System.out.println(" subtotal= "+pedProd1.calcularSubtotal());
////        System.out.println(" subtotal= "+pedProd2.calcularSubtotal());
////        System.out.println(" subtotal= "+pedProd3.calcularSubtotal());
////

//List<PedidoProducto> pedidos = new ArrayList<PedidoProducto>();
//pedidos.add(pedProd);
//pedidos.add(pedProd1);
//pedidos.add(pedProd2);
//pedidos.add(pedProd3);
//double suma =0;
// for (PedidoProducto pedidoProducto : pedidos) {
//           suma= suma+ pedidoProducto.getSubtotal();
// }
//           System.out.println(" suma "+ suma);
           
// guardar pedido producto
//Producto prod= new Producto("sheppes", 1000, 850, true);
//pData.guardarProducto(prod);
//PedidoProducto pp= new PedidoProducto(prod, 100);
//PedidoProductoData ppd= new PedidoProductoData();
//ppd.guardarPedidoProducto(pp);

// modificar pedido producto
//Producto prod1= new Producto("Pepsi", 1000, 700, true);
//pData.guardarProducto(prod1);
//PedidoProducto pp= new PedidoProducto(1,prod1, 5);
//PedidoProductoData ppd= new PedidoProductoData();
//ppd.modificarPedidoProducto(pp);

//eliminar pedido producto
//PedidoProductoData ppd= new PedidoProductoData();
//ppd.eliminarPedidoProducto(1);


//pedidoData


//Pedido pedido= new Pedido(2, mesa , "Mariano", LocalDateTime.of(2023, 10, 7, 23, 55), true);
//peData.guardarPedidoData(pedido);
//
////// adicionar pedido
//Producto prod= new Producto("/up 500 cm3 ", 5000, 800, true);// genero producto
//pData.guardarProducto(prod);// cargo producto
//Producto prod1= new Producto("Hamburguesa Doble cheddar", 500, 3200, true);// genero producto 2
//pData.guardarProducto(prod1);// cargo producto 2
//Mesa mesa= new Mesa(4, 2, true); // genero mesa
//mData.guardarMesa(mesa);// cargo mesa a bd
//PedidoProducto pp= new PedidoProducto(prod, 1); // genero pedidoproducto 1
//PedidoProducto pp1= new PedidoProducto(prod1, 1);// genero pedido producto 2
//ppd.guardarPedidoProducto(pp); // cargo pd 1
//ppd.guardarPedidoProducto(pp1);// cargo pd 2
//List<PedidoProducto> pedidosP= new ArrayList<PedidoProducto>();
//pedidosP.add(pp); // agredo pedido producto a array
//pedidosP.add(pp1);// agredo pedido producto 2 a array
//Pedido pedido2= new Pedido(mesa, "jorge", LocalDate.now(), LocalTime.now(), 1, pedidosP); // genero pedido y cargo dentro el array
//
//pedData.guardarPedido(pedido2);// guardo pedido en bdatos

// buscar pedido x id
//        System.out.println(pedData.buscarPedidoPorId(13));
 


////// eliminar pedido
//PedidoData pedData= new PedidoData();
//pedData.eliminarPedido(12);


// buscar pedido x numeroMesa
//  System.out.println(pedData.buscarPedidoPorNumeroMesa(3));


// listar pedido x mesero x fecha
//for(Pedido pedido:pedData.ListarPedidosPorMeseroPorFecha("jorge", LocalDate.of(2023,10,11))){
//    System.out.println("id Pedido"+pedido.getIdPedido());
//    System.out.println("importe total" +pedido.getImporte());
//    System.out.println("mesa"+ pedido.getMesa());
//    
//     for (PedidoProducto arg : pedido.getPedidosP()) {
//        System.out.println(arg.getCantidad());
//        System.out.println(arg.getProducto());
//        System.out.println(arg.getSubtotal());
//    }
//    System.out.println("Pedido Producto"+pedido.getPedidosP());
// 
//     System.out.println("");
//  } 


// Listar pedidos x mesero
//for(Pedido pedido:pedData.ListarPedidosPorMesero("jorge")){
//    System.out.println("id Pedido"+pedido.getIdPedido());
//    System.out.println("importe total" +pedido.getImporte());
//    System.out.println("mesa"+ pedido.getMesa());
//    System.out.println("Pedido Producto"+pedido.getPedidosP());
//    
//     System.out.println("");

// listar ingresos totales x fecha - sumar totales (metodo aparte
//for(Pedido pedido:pedData.ListarIngresosTotalesPorFecha(LocalDate.of(2023, 10, 11))){
//    System.out.println("id Pedido= "+pedido.getIdPedido());
//    System.out.println("importe total= " +pedido.getImporte());
//    System.out.println("Fecha= "+ pedido.getFecha());
// 
//     System.out.println("");
//}
//System.out.println(" suma total= " + pedData.SumarTotalesPorFecha(LocalDate.of(2023, 10, 11)));

// listar pedidos x fecha x mesa entre horas
//for(Pedido pedido:pedData.ListarPedidosPorMesaPorFechaEntreHoras(2, LocalDate.of(2023, 10, 11), LocalTime.of(10, 00, 00), LocalTime.of(19, 00, 00))){
//    System.out.println("id Pedido= "+pedido.getIdPedido());
//    System.out.println("importe total= " +pedido.getImporte());
//    System.out.println("mesa= "+ pedido.getMesa());
//    System.out.println("pedido= " + pedido.getFecha());
//    System.out.println(" hora base= "+pedido.getHora());
//    
//    
//     System.out.println("");}





    }
    
    
    
    
    
    
}
