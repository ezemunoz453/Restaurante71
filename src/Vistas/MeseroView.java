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

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.DefaultTableModel;

public class MeseroView extends javax.swing.JFrame {


    private int cantidadDeMesas;

    private JPanel buttonPanel;

    Mesa mesa = new Mesa();
    MesaData mData = new MesaData();
    PedidoData pedidoData = new PedidoData();

    public MeseroView() {

        initComponents();
        this.setSize(1280, 675);
        setResizable(false);
        this.setLocationRelativeTo(this);
        AgregarImagenALabel(jLabelLogo1, "src/imagenes/Logog71 resto.png");

        int cantidadDeMesas = mData.contarMesas();

        agregarBotonesAlPanel(cantidadDeMesas);
    }

    private void agregarBotonesAlPanel(int cantidadDeBotones) {
        panel.removeAll();
        int filas = (int) Math.ceil((double) cantidadDeBotones / 6);
        panel.setLayout(new GridLayout(filas, 6, 5, 5));

        List<Mesa> mesas = mData.listarMesas();
        for (Mesa mesa1 : mesas) {
            // realiza un boton x mesa 
            JButton boton = new JButton("MESA n°=" + mesa1.getNumeroMesa() + "- ESTADO= " + mesa1.getEstado() + "- CAPACIDAD= " + mesa1.getCapacidad());
            Dimension buttonSize = new Dimension(100, 100);
            boton.setPreferredSize(buttonSize);
            Font nuevaFuente = new Font("Tahoma", Font.BOLD, 16);
            boton.setFont(nuevaFuente);

            if (mesa1.getEstado().equalsIgnoreCase("libre")) {
                boton.setBackground(Color.white);
            } else {
                boton.setBackground(new Color(229, 195, 157));
            }

            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Object[] options = {"NUEVO PEDIDO", "ADICIONAR CONSUMO", "CERRAR MESA"};

                    int seleccion = JOptionPane.showOptionDialog(null,
                            "MESA N°= " + mesa1.getNumeroMesa() + " CAPACIDAD = " + mesa1.getCapacidad(),
                            "MESA = " + mesa1.getEstado(),
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options,
                            options[0]);

                    //0 ABRIR MESA
                    if (seleccion == 0) {
                        if (mesa1.getEstado().equalsIgnoreCase("ocupada")) {
                            JOptionPane.showMessageDialog(panel, " La mesa ya se encuentra ocupada");
                        } else {
                            AbrirMesaView amv = new AbrirMesaView(mesa1);
                            amv.setVisible(true);
                            mesa1.setEstado("OCUPADA");
                            boton.setBackground(new Color(229, 195, 157));
                            mData.modificarMesa(mesa1);
                        }

                        //1 NUEVO CONSUMO
                    } else if (seleccion == 1) {
                        if (mesa1.getEstado().equalsIgnoreCase("LIBRE")) {
                            JOptionPane.showMessageDialog(panel, " Debe abrir mesa para adicionar consumo");
                        } else {
                            AdicionMesaView amv = new AdicionMesaView(mesa1);
                            amv.setVisible(true);
                        }
                    } // CERRAR MESA
                    else if (seleccion == 2) {

                        if (mesa1.getEstado().equalsIgnoreCase("libre")) {
                            JOptionPane.showMessageDialog(panel, " La Mesa NO esta Ocupada");

                        } else {
                            int idMesa = mesa1.getIdMesa();
                            String estadoPedido = "REALIZADO";
                            Pedido pedido2 = pedidoData.buscarPedidoPorIdMesaConEstadoPedido(idMesa, estadoPedido);

                            if (pedido2.getImporte() == 0) {
                                JOptionPane.showMessageDialog(panel, " Su Mesa no tiene consumo, cerrando mesa... .");
                                pedidoData.modificarEstadoPedido(pedido2.getIdPedido(), "CERRADO");
                                mesa1.setEstado("LIBRE");
                                boton.setBackground(Color.WHITE);
                                mData.modificarMesa(mesa1);

                            } else if (pedido2 == null) {

                                JOptionPane.showMessageDialog(panel, " Su Mesa no tiene consumo, cerrando mesa... .");
                                mesa1.setEstado("LIBRE");
                                boton.setBackground(Color.WHITE);
                                mData.modificarMesa(mesa1);

                            } else if (pedido2.getImporte() != 0) {
                                JOptionPane.showMessageDialog(panel, "Cerrando Mesa... Obteniento comprobante");   
                                pedidoData.modificarEstadoPedido(pedido2.getIdPedido(), "CERRADO");
                                 mesa1.setEstado("LIBRE");
                                boton.setBackground(Color.WHITE);
                                mData.modificarMesa(mesa1);
                                 ComprobanteView cv = new ComprobanteView(pedido2);
                            cv.setVisible(true);
                                
                            }

                        }

                    } else {
                        System.out.println("No se realizó ninguna selección");
                    }

                }
            });

            panel.add(boton);
        }
        panel.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jbCerrarSesion = new javax.swing.JButton();
        jLabelLogo1 = new javax.swing.JLabel();
        jLabelBotones = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Admin");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 90, -1));

        jButton1.setBackground(new java.awt.Color(229, 195, 157));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Pedidos x Cobrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 160, 60));

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

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 960, 610));

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
      PedidosPorCobrar ppc= new PedidosPorCobrar();
      ppc.setVisible(true);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login log= new Login();
        log.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void AgregarImagenALabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

//  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabelBotones;
    private javax.swing.JLabel jLabelLogo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCerrarSesion;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

}
