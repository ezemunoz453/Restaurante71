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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdicionMesaView1 extends javax.swing.JFrame {

    MesaData mData = new MesaData();
    MeseroData meseroData = new MeseroData();
    ProductoData pData = new ProductoData();
    Producto producto = new Producto();
    PedidoProductoData ppd = new PedidoProductoData();
    PedidoProducto pedProd = new PedidoProducto();
    Pedido pedido = new Pedido();
    List<PedidoProducto> pedidosP;
    PedidoData pedidoData = new PedidoData();
    Mesa mesaSel = new Mesa();

    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
    private DefaultTableModel modelo1 = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public AdicionMesaView1(Mesa mesa) {
        initComponents();
        this.setSize(1280, 660);
        setResizable(false);

        this.setLocationRelativeTo(this);
        cargarColumnasProductos();
        cargarColumnasPedido();
//         cargarTablaPedido();

        mesaSel = mesa;
        int numeromesa = mesaSel.getNumeroMesa();
        int capacidadmesa = mesaSel.getCapacidad();
        jtMesaSeleccionada.setText(numeromesa + "");
        jtCapacidadSeleccionada.setText(capacidadmesa + "");

        Pedido pedidoSel = pedidoData.buscarPedidoPorIdMesaConEstadoPedido(mesa.getIdMesa(), "REALIZADO");
        jtMeseroSeleccionado.setText(pedidoSel.getMesero().toString());

        jtIdPedido.setText(pedidoSel.getIdPedido() + "");
        cargarTablaPedido(pedidoSel);
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
        jSeparator1 = new javax.swing.JSeparator();
        jbAgregarAPedido = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jtProducto = new javax.swing.JTextField();
        jtCantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtMesaSeleccionada = new javax.swing.JTextField();
        jtCapacidadSeleccionada = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtMeseroSeleccionado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaPedidoP = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jtTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbEliminar = new javax.swing.JButton();
        jbAdicionarPedido = new javax.swing.JButton();
        jtIdPedido = new javax.swing.JTextField();
        jbSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator1.setBackground(new java.awt.Color(229, 195, 157));

        jbAgregarAPedido.setBackground(new java.awt.Color(229, 195, 157));
        jbAgregarAPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbAgregarAPedido.setForeground(new java.awt.Color(255, 255, 255));
        jbAgregarAPedido.setText("Agregar ");
        jbAgregarAPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarAPedidoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Mesa");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Mesero");

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

        jtProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtProductoKeyReleased(evt);
            }
        });

        jtCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Producto");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Cantidad");

        jtMesaSeleccionada.setEditable(false);
        jtMesaSeleccionada.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jtCapacidadSeleccionada.setEditable(false);
        jtCapacidadSeleccionada.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Capacidad");

        jtMeseroSeleccionado.setEditable(false);
        jtMeseroSeleccionado.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jbAgregarAPedido)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(185, 185, 185)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtMeseroSeleccionado, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jtMesaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(214, 214, 214)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jtCapacidadSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtCapacidadSeleccionada, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jtMesaSeleccionada))
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtMeseroSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAgregarAPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
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

        jbEliminar.setBackground(new java.awt.Color(229, 195, 159));
        jbEliminar.setText("Eliminar Seleccionado");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbAdicionarPedido.setBackground(new java.awt.Color(229, 195, 157));
        jbAdicionarPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbAdicionarPedido.setForeground(new java.awt.Color(255, 255, 255));
        jbAdicionarPedido.setText("Adicionar a Pedido");
        jbAdicionarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarPedidoActionPerformed(evt);
            }
        });

        jtIdPedido.setEditable(false);
        jtIdPedido.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jbAdicionarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAdicionarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );

        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        EscritorioAdicion.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EscritorioAdicion.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EscritorioAdicion.setLayer(jbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioAdicionLayout = new javax.swing.GroupLayout(EscritorioAdicion);
        EscritorioAdicion.setLayout(EscritorioAdicionLayout);
        EscritorioAdicionLayout.setHorizontalGroup(
            EscritorioAdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioAdicionLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioAdicionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(34, 34, 34))
        );
        EscritorioAdicionLayout.setVerticalGroup(
            EscritorioAdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioAdicionLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jbSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EscritorioAdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EscritorioAdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EscritorioAdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarAPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarAPedidoActionPerformed
        PedidoProducto pp = null;
        Pedido pedido1 = new Pedido();

        int filaSel = jTableProductos.getSelectedRow();

        // if para vrificar si se ha seleccionado un fila
        if (filaSel != -1) {
            Producto producto = new Producto();
            String nombre = (String) modelo.getValueAt(filaSel, 0);
            producto = pData.buscarProductoPorNombre(nombre);

            int idPedido = Integer.parseInt(jtIdPedido.getText().toString());
            pedido1 = pedidoData.buscarPedidoPorId(idPedido);

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
                        pp = new PedidoProducto(producto, cantidad, pedido1);
                        ppd.guardarPedidoProducto(pp);
                        jtProducto.setText("");
                        jtCantidad.setText("");
                        jbAdicionarPedido.setEnabled(true);
                    }
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(this, "El campo Cantidad debe ser un numero");
                return;
            } catch (NullPointerException np) {
                JOptionPane.showMessageDialog(this, "El valor cantidad no puede ser nulo");
            }
            borrarFilas();

            // guardo pedido producto y cargo a un array en tabla
            pedidosP = new ArrayList<>();
            // listar oEDIDOS PRODUCTOS CON ID PEDIDO ??

            pedidosP.add(pp);
            for (PedidoProducto aux1 : pedidosP) {
                modelo1.addRow(new Object[]{aux1.getIdPedidoProducto(), aux1.getCantidad(), aux1.getProducto().getNombre(), aux1.getProducto().getPrecio(), aux1.getSubtotal()});
            }

            //realizo suma para textfield
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

            int IdPP = Integer.parseInt(modelo1.getValueAt(filaSel1, 0).toString());

            pp = ppd.buscarpp(IdPP);

            ppd.eliminarPedidoProducto(IdPP);

            pedidosP.remove(pp);
            modelo1.removeRow(filaSel1);
            double suma = 0;
            for (int i = 0; i < modelo1.getRowCount(); i++) {

                suma += Double.parseDouble(modelo1.getValueAt(i, 4).toString());
            }
            jtTotal.setText(String.valueOf(suma));

        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de listado pedido");
        }

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbAdicionarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarPedidoActionPerformed
        Pedido pedido2 = null;
        int idPedido = Integer.parseInt(jtIdPedido.getText().toString());
        System.out.println(idPedido);
        Double importe = 0.0;
        pedidosP = new ArrayList<>();
        pedidosP = ppd.ListarPedidosProductoPorIdPedido(idPedido);

        for (PedidoProducto pedidoProducto : pedidosP) {
//            System.out.println(pedidoProducto.getPedido().toString());
            importe += pedidoProducto.getSubtotal();

        }
//        System.out.println("importe total"+importe);

        pedidoData.modificarImportePedido(idPedido, importe);
        dispose();
    }//GEN-LAST:event_jbAdicionarPedidoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane EscritorioAdicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTablaPedidoP;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JButton jbAdicionarPedido;
    private javax.swing.JButton jbAgregarAPedido;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtCantidad;
    private javax.swing.JTextField jtCapacidadSeleccionada;
    private javax.swing.JTextField jtIdPedido;
    private javax.swing.JTextField jtMesaSeleccionada;
    private javax.swing.JTextField jtMeseroSeleccionado;
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

    private void cargarTablaPedido(Pedido pedidoSel) {

        Producto producto = new Producto();
        List<Producto> productos = new ArrayList<>();
        pedidosP = ppd.ListarPedidosProductoPorIdPedido(pedidoSel.getIdPedido());

//           System.out.println( pedidosP.toString());
        for (PedidoProducto aux1 : pedidosP) {
//                 
//        productos= pData.listarProductosPorPedido();

            modelo1.addRow(new Object[]{
                aux1.getIdPedidoProducto(), aux1.getCantidad(), aux1.getProducto().getNombre(), aux1.getProducto().getPrecio(), aux1.getSubtotal()});
        }
        double suma = 0;
        for (int i = 0; i < modelo1.getRowCount(); i++) {
            suma += Double.parseDouble(modelo1.getValueAt(i, 4).toString());
        }
        jtTotal.setText(String.valueOf(suma));
    }

}
