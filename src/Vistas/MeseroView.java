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
        
        this.setLocationRelativeTo(this);
        AgregarImagenALabel(jLabelLogo1, "src/imagenes/Logog71 resto.png");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jbMesasLibres = new javax.swing.JButton();
        jbListarMesas = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbCerrarSesion = new javax.swing.JButton();
        jLabelLogo1 = new javax.swing.JLabel();
        jLabelBotones = new javax.swing.JLabel();
        jdEscritorioMesero = new javax.swing.JDesktopPane();
        PanelMesas = new javax.swing.JPanel();
        jlMesa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(910, 6850));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("ADICION A MESAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 115, 62));

        jButton4.setText("ABRIR MESA");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 150, 50));

        jButton5.setText("CERRAR MESA");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 150, 50));

        jbMesasLibres.setText(" MESAS LIBRES");
        jPanel1.add(jbMesasLibres, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 150, 50));

        jbListarMesas.setText("LISTAR MESAS");
        jbListarMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarMesasActionPerformed(evt);
            }
        });
        jPanel1.add(jbListarMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 150, 50));

        jButton2.setText("MESAS OCUPADAS");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 150, 50));

        jbCerrarSesion.setBackground(new java.awt.Color(229, 195, 157));
        jbCerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jbCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jbCerrarSesion.setText("Cerrar Sesion");
        jbCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(jbCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 150, 50));

        jLabelLogo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabelLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 170, 140));

        jLabelBotones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoLoggin.jpg"))); // NOI18N
        jPanel1.add(jLabelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 640));

        PanelMesas.setBackground(new java.awt.Color(255, 255, 51));

        jlMesa.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout PanelMesasLayout = new javax.swing.GroupLayout(PanelMesas);
        PanelMesas.setLayout(PanelMesasLayout);
        PanelMesasLayout.setHorizontalGroup(
            PanelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMesasLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jlMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(716, Short.MAX_VALUE))
        );
        PanelMesasLayout.setVerticalGroup(
            PanelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMesasLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jlMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(433, Short.MAX_VALUE))
        );

        jdEscritorioMesero.setLayer(PanelMesas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdEscritorioMeseroLayout = new javax.swing.GroupLayout(jdEscritorioMesero);
        jdEscritorioMesero.setLayout(jdEscritorioMeseroLayout);
        jdEscritorioMeseroLayout.setHorizontalGroup(
            jdEscritorioMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdEscritorioMeseroLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(PanelMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jdEscritorioMeseroLayout.setVerticalGroup(
            jdEscritorioMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdEscritorioMeseroLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(PanelMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1.add(jdEscritorioMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 980, 640));

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
        AdicionMesaView amv = new AdicionMesaView();
        amv.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbListarMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarMesasActionPerformed
        jdEscritorioMesero.removeAll();
        jdEscritorioMesero.repaint();
        JPanel PanelMesas = new JPanel();
        PanelMesas.setVisible(true);
        jdEscritorioMesero.add(PanelMesas);
        jdEscritorioMesero.moveToFront(PanelMesas);
        
        List<Mesa> mesas = new ArrayList<>();
        MesaData mData = new MesaData();
        mesas = mData.listarMesas();

        for (Mesa mesa : mesas) {
//            JButton boton = new JButton("MESA N°: " + mesa.getNumeroMesa(), new ImageIcon(getClass().getResource("src/imagenes/mesa1.png")));
//            boton.setHorizontalTextPosition(JButton.CENTER);
//            boton.setVerticalTextPosition(JButton.BOTTOM);
           
            JLabel jlMesa = new JLabel();
            jlMesa.setText("Numero de Mesa" +mesa.getNumeroMesa()+" Capacidad = "+mesa.getCapacidad()+"Estado = "+mesa.getEstado());
            Dimension size = new Dimension(200, 50); 
            jlMesa.setPreferredSize(size);
            PanelMesas.add(jlMesa);


        }

    }//GEN-LAST:event_jbListarMesasActionPerformed

    
    public void AgregarImagenALabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMesas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabelBotones;
    private javax.swing.JLabel jLabelLogo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCerrarSesion;
    private javax.swing.JButton jbListarMesas;
    private javax.swing.JButton jbMesasLibres;
    private javax.swing.JDesktopPane jdEscritorioMesero;
    private javax.swing.JLabel jlMesa;
    // End of variables declaration//GEN-END:variables

}
