
package Vistas;

import AccesoADatos.MesaData;
import AccesoADatos.PedidoData;
import AccesoADatos.UsuarioData;
import Entidades.Mesa;
import Entidades.Pedido;
import Entidades.Usuario;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MeseroView extends javax.swing.JFrame {
    
    
    public MeseroView() {
                
        initComponents();
        
         this.setSize(1280, 660);
        setResizable(false);
        panelMesas();

        // cargar a jlabel una imagen
        this.setLocationRelativeTo(this);
        AgregarImagenALabel(jLabelLogo1, "src/imagenes/Logog71 resto.png");
//        AgregarImagenALabel(jLabelBotones, "src/imagenes/fondoLoggin.jpg");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbCerrarSesion = new javax.swing.JButton();
        jLabelLogo1 = new javax.swing.JLabel();
        jLabelBotones = new javax.swing.JLabel();
        PanelMesas = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(910, 6850));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbCerrarSesion.setBackground(new java.awt.Color(229, 195, 157));
        jbCerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jbCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jbCerrarSesion.setText("Cerrar Sesion");
        jbCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(jbCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 150, 50));

        jLabelLogo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabelLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 170, 140));

        jLabelBotones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoLoggin.jpg"))); // NOI18N
        jPanel1.add(jLabelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 640));

        PanelMesas.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMesasLayout = new javax.swing.GroupLayout(PanelMesas);
        PanelMesas.setLayout(PanelMesasLayout);
        PanelMesasLayout.setHorizontalGroup(
            PanelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMesasLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jButton1)
                .addContainerGap(787, Short.MAX_VALUE))
        );
        PanelMesasLayout.setVerticalGroup(
            PanelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMesasLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jButton1)
                .addContainerGap(520, Short.MAX_VALUE))
        );

        jPanel1.add(PanelMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 980, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarSesionActionPerformed
       dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jbCerrarSesionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         AdicionMesaView amv= new AdicionMesaView ();
        amv.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void panelMesas() {
        List<Mesa> mesas= new ArrayList<>();
        MesaData mData= new MesaData();
//       List<Mesa> mesas= new ArrayList<>();    
        
        mesas= mData.listarMesas();
        
//        mesas.addAll(Arrays.asList(mesasDeListar));
        
        int cont=0;
        for (Mesa mesa1 : mesas) {
            
        
           cont= cont+1;
            System.out.println("cont"+cont);
            System.out.println(" mesa"+ mesa1.getNumeroMesa());
            System.out.println(" cap mesa"+ mesa1.getCapacidad());
            

JLabel jl= new JLabel( new ImageIcon("src/imagenes/mesa1.png"));
Dimension size = new Dimension(200, 50); // Ancho x Alto en píxeles
        jl.setPreferredSize(size);

      JPanel panel= PanelMesas;


//         
//            JButton boton = new JButton("MESA N°: " +  new ImageIcon(getClass().getResource("src/imagenes/mesa1.png")));
//            boton.setHorizontalTextPosition(JButton.CENTER);
//            boton.setVerticalTextPosition(JButton.BOTTOM);
//            boton.setBackground(new Color(255, 51, 51));
            panel.add(jl);
            panel.revalidate();

        }
        
        
//        for (int i = 1; i <= cant; i++) {
//            int num_mesa = i;
//            //verificar estado
//            JButton boton = new JButton("MESA N°: " + i, new ImageIcon(getClass().getResource("/Img/mesa.png")));
//            boton.setHorizontalTextPosition(JButton.CENTER);
//            boton.setVerticalTextPosition(JButton.BOTTOM);
//            int verificar = pedDao.verificarStado(num_mesa, id_sala);
//            if (verificar > 0) {
//                boton.setBackground(new Color(255, 51, 51));
//            } else {
//                boton.setBackground(new Color(0, 102, 102));
//            }
//            boton.setForeground(Color.WHITE);
//            boton.setFocusable(false);
//            boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
//            PanelMesas.add(boton);
//            boton.addActionListener((ActionEvent e) -> {
//                if (verificar > 0) {
//                    LimpiarTable();
//                    verPedido(verificar);
//                    verPedidoDetalle(verificar);
//                    btnFinalizar.setEnabled(true);
//                    btnPdfPedido.setEnabled(false);
//                    jTabbedPane1.setSelectedIndex(4);
//                } else {
//                    LimpiarTable();
//                    ListarPlatos(tblTemPlatos);
//                    jTabbedPane1.setSelectedIndex(3);
//                    txtTempIdSala.setText("" + id_sala);
//                    txtTempNumMesa.setText("" + num_mesa);
//                }
//            });
//        }
    }
    
   
    
     public void AgregarImagenALabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMesas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelBotones;
    private javax.swing.JLabel jLabelLogo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCerrarSesion;
    // End of variables declaration//GEN-END:variables
}
