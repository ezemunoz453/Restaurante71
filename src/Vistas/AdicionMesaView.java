package Vistas;

import AccesoADatos.MesaData;
import AccesoADatos.MeseroData;
import AccesoADatos.PedidoData;
import AccesoADatos.PedidoProductoData;
import AccesoADatos.ProductoData;
import Entidades.Mesa;
import Entidades.Mesero;
import Entidades.Pedido;
import Entidades.PedidoProducto;
import Entidades.Producto;
import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdicionMesaView extends javax.swing.JFrame {

    MesaData mData = new MesaData();
    MeseroData mesData = new MeseroData();
    ProductoData pData = new ProductoData();
    Producto producto = new Producto();
    PedidoProductoData ppd = new PedidoProductoData();
    PedidoProducto pedProd = new PedidoProducto();
    Pedido pedido = new Pedido();
    List<PedidoProducto> pedidosP;
    PedidoData pedidoData= new PedidoData();

    private DefaultTableModel modelo = new DefaultTableModel() {
//        para que sus celdas no sean editables
        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
    private DefaultTableModel modelo1 = new DefaultTableModel() {
//        para que sus celdas no sean editables
        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public AdicionMesaView() {
        initComponents();
        this.setSize(1280, 660);
        setResizable(false);

        this.setLocationRelativeTo(this);
        cargarColumnasProductos();
        cargarItemsMesas();
        cargarItemsMeseros();
        cargarColumnasPedido();
        
         jcbMesas.setSelectedItem(null);
         jcbMesero.setSelectedItem(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono=new ImageIcon(getClass().getResource("/imagenes/fondoLoggin.jpg"));
        Image miImagen1=icono.getImage();
        EscritorioAdicion = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics h){
                h.drawImage(miImagen1,0,0, getWidth(),getHeight(),this);
            }
        }
        ;
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jbAgregarAPedido = new javax.swing.JButton();
        jtCantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcbMesas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jcbMesero = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaPedidoP = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jtTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbRealizarPedido = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Producto");

        jtProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtProductoKeyReleased(evt);
            }
        });

        jTableProductos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableProductos);

        jbAgregarAPedido.setBackground(new java.awt.Color(229, 195, 157));
        jbAgregarAPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbAgregarAPedido.setForeground(new java.awt.Color(255, 255, 255));
        jbAgregarAPedido.setText("Agregar ");
        jbAgregarAPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarAPedidoActionPerformed(evt);
            }
        });

        jtCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Cantidad");

        jcbMesas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Mesa");

        jcbMesero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Mesero");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                                .addComponent(jcbMesas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addComponent(jcbMesero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jtCantidad)))))
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbAgregarAPedido)
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbAgregarAPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTablaPedidoP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTablaPedidoP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTablaPedidoP);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Pedido");

        jtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTotalActionPerformed(evt);
            }
        });

        jLabel4.setText("Total");

        jbRealizarPedido.setBackground(new java.awt.Color(229, 195, 157));
        jbRealizarPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbRealizarPedido.setForeground(new java.awt.Color(255, 255, 255));
        jbRealizarPedido.setText("Realizar Pedido");
        jbRealizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRealizarPedidoActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(229, 195, 159));
        jbEliminar.setText("Eliminar Seleccionado");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(141, 141, 141)
                            .addComponent(jbRealizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jtTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbRealizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EscritorioAdicion.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EscritorioAdicion.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioAdicionLayout = new javax.swing.GroupLayout(EscritorioAdicion);
        EscritorioAdicion.setLayout(EscritorioAdicionLayout);
        EscritorioAdicionLayout.setHorizontalGroup(
            EscritorioAdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioAdicionLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        EscritorioAdicionLayout.setVerticalGroup(
            EscritorioAdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioAdicionLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(EscritorioAdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(EscritorioAdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(EscritorioAdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarAPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarAPedidoActionPerformed
        PedidoProducto pp = null;
       

        int filaSel = jTableProductos.getSelectedRow();

        // if para vrificar si se ha seleccionado un fila
        if (filaSel != -1) {
            Producto producto = new Producto();
            String nombre = (String) modelo.getValueAt(filaSel, 0);
            producto = pData.buscarProductoPorNombre(nombre);
            try {
                if (jtCantidad.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "El campo cantidad no puede estar vacio");
                    return;
                } else {
                    int cantidad = Integer.parseInt(jtCantidad.getText());
                    if (cantidad == 0) {
                        JOptionPane.showMessageDialog(this, "El campo cantidad no puede ser cero");
                        return;
                    } else {
                        pp = new PedidoProducto(producto, cantidad);
                        ppd.guardarPedidoProducto(pp);
                        jtProducto.setText("");
                        jtCantidad.setText("");
                    }
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(this, "El campo Cantidad debe ser un numero");
                return;
            } catch (NullPointerException np) {
                JOptionPane.showMessageDialog(this, "El valor cantidad no puede ser nulo");
            }
            borrarFilas();

            // guardo pedido producto y cargo a un array
            pedidosP = new ArrayList<>();
           
            pedidosP.add(pp);
            for (PedidoProducto aux1 : pedidosP) {
                modelo1.addRow(new Object[]{aux1.getIdPedidoProducto(), aux1.getCantidad(), aux1.getProducto().getNombre(), aux1.getProducto().getPrecio(), aux1.getSubtotal()});
            }
            double suma = 0;
            for (int i = 0; i < modelo1.getRowCount(); i++) {

                suma += Double.parseDouble(modelo1.getValueAt(i, 4).toString());
            }
            jtTotal.setText(String.valueOf(suma));

        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jbAgregarAPedidoActionPerformed

    private void jtProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtProductoKeyReleased
        borrarFilas();
        for (Producto aux : pData.listarProductos()) {
            if (aux.getNombre().toLowerCase().startsWith(jtProducto.getText().toLowerCase())) {
                modelo.addRow(new Object[]{aux.getNombre(), aux.getPrecio(), aux.getTipo()});
            }
        }
    }//GEN-LAST:event_jtProductoKeyReleased

    private void jtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTotalActionPerformed


    }//GEN-LAST:event_jtTotalActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        PedidoProducto pp = null;

        int filaSel1 = jTablaPedidoP.getSelectedRow();
        if (filaSel1 != -1) {
//            String nombreProducto = modelo1.getValueAt(filaSel1, 2).toString();
////            System.out.println(nombreProducto);
//            producto = pData.buscarProductoPorNombre(nombreProducto);
//            System.out.println(producto.toString());
            int IdPP = Integer.parseInt(modelo1.getValueAt(filaSel1, 0).toString());
//            System.out.println(IdPP);
            pp = ppd.buscarpp(IdPP);
//            System.out.println(pp.toString());

            ppd.eliminarPedidoProducto(IdPP);
            
            pedidosP.remove(pp);
            modelo1.removeRow(filaSel1);
            double suma = 0;
            for (int i = 0; i < modelo1.getRowCount(); i++) {

                suma += Double.parseDouble(modelo1.getValueAt(i, 3).toString());
            }
            jtTotal.setText(String.valueOf(suma));

        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de listado pedido");
        }

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbRealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRealizarPedidoActionPerformed
        Pedido pedido1 = null;

        Mesero meseroSel = (Mesero) jcbMesero.getSelectedItem();
//        String nombreMesero = meseroSel.getNombreMesero();
        Mesa mesa= (Mesa)jcbMesas.getSelectedItem();
        
         pedido1= new Pedido(mesa, meseroSel, LocalDate.now(), LocalTime.now(), "PENDIENTE", pedidosP );
pedidoData.guardarPedido(pedido1);
    }//GEN-LAST:event_jbRealizarPedidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane EscritorioAdicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablaPedidoP;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JButton jbAgregarAPedido;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbRealizarPedido;
    private javax.swing.JComboBox<Mesa> jcbMesas;
    private javax.swing.JComboBox<Mesero> jcbMesero;
    private javax.swing.JTextField jtCantidad;
    private javax.swing.JTextField jtProducto;
    private javax.swing.JTextField jtTotal;
    // End of variables declaration//GEN-END:variables

    public void AgregarImagenALabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    public void cargarColumnasProductos() {
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Tipo");
        jTableProductos.setModel(modelo);
    }

    public void cargarColumnasPedido() {
        modelo1.addColumn("ID");
        modelo1.addColumn("Cantidad ");
        modelo1.addColumn("Producto ");
        modelo1.addColumn("Precio ");
        modelo1.addColumn("Subtotal");

        jTablaPedidoP.setModel(modelo1);
    }

    private void cargarItemsMesas() {

        for (Mesa mesas : mData.listarMesas()) {
            jcbMesas.addItem(mesas);
        }
    }

    private void cargarItemsMeseros() {

        for (Mesero meseros : mesData.listarMeseros()) {
            jcbMesero.addItem(meseros);
        }
    }

    private void borrarFilas() {
        int rowCount = modelo.getRowCount();
        for (int f = rowCount - 1; f >= 0; f--) {
            modelo.removeRow(f);
        }

    }

    private void borrarFilas1() {
        int rowCount = modelo1.getRowCount();
        for (int f = rowCount - 1; f >= 0; f--) {
            modelo1.removeRow(f);
        }

    }

}
