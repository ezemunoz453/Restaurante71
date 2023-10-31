package Vistas;

import AccesoADatos.PedidoData;
import Entidades.Pedido;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentasPorHora extends javax.swing.JFrame {

    private PedidoData pedidoData;
    
    public VentasPorHora() {
        initComponents();
        
        pedidoData = new PedidoData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono=new ImageIcon(getClass().getResource("/imagenes/fondoLoggin.jpg"));
        Image miImagen=icono.getImage();
        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen,0,0, getWidth(),getHeight(),this);

            }
        }
        ;
        jlVentaPorHora = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jtFecha = new javax.swing.JTextField();
        jlHoraComienzo = new javax.swing.JLabel();
        jtHoraComienzo = new javax.swing.JTextField();
        jlHoraFinal = new javax.swing.JLabel();
        jtHoraFinal = new javax.swing.JTextField();
        jtTotal = new javax.swing.JTextField();
        jlTotal = new javax.swing.JLabel();
        jbConsulta = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlVentaPorHora.setForeground(new java.awt.Color(0, 0, 0));
        jlVentaPorHora.setText("Ventas por hora");

        jlFecha.setForeground(new java.awt.Color(0, 0, 0));
        jlFecha.setText("Ingrese fecha ddmmaaaa : ");

        jtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFechaActionPerformed(evt);
            }
        });

        jlHoraComienzo.setForeground(new java.awt.Color(0, 0, 0));
        jlHoraComienzo.setText("Ingrese hora comienzo hhmm : ");

        jlHoraFinal.setForeground(new java.awt.Color(0, 0, 0));
        jlHoraFinal.setText("Ingrese hora final hhmm : ");

        jtHoraFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtHoraFinalActionPerformed(evt);
            }
        });

        jlTotal.setForeground(new java.awt.Color(0, 0, 0));
        jlTotal.setText("Total :    $");

        jbConsulta.setBackground(new java.awt.Color(228, 195, 150));
        jbConsulta.setText("Consulta ");
        jbConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(228, 195, 150));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlFecha)
                            .addComponent(jlHoraComienzo)
                            .addComponent(jlHoraFinal)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jlTotal)))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtHoraFinal)
                        .addGap(167, 167, 167))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtHoraComienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addGap(167, 167, 167))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtFecha)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jlVentaPorHora)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jbConsulta)
                        .addGap(131, 131, 131)
                        .addComponent(jbSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlVentaPorHora)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlTotal)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlFecha))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlHoraComienzo)
                            .addComponent(jtHoraComienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlHoraFinal))
                        .addGap(34, 34, 34)
                        .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbConsulta)
                    .addComponent(jbSalir))
                .addGap(99, 99, 99))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultaActionPerformed
     
        try {
        String fechaStr = jtFecha.getText();
        String horaComienzoStr = jtHoraComienzo.getText();
        String horaFinalStr = jtHoraFinal.getText();
        
        LocalDate fecha = LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern("ddMMyyyy"));
        LocalTime horaInicio = LocalTime.parse(horaComienzoStr, DateTimeFormatter.ofPattern("HHmm"));
        LocalTime horaFinal = LocalTime.parse(horaFinalStr, DateTimeFormatter.ofPattern("HHmm"));
        
        double total = pedidoData.SumarTotalesPorFechaEntreHoras(fecha, horaInicio, horaFinal);

        jtTotal.setFont(new Font("Segoe UI", Font.BOLD, 30));
        jtTotal.setText(String.format("%.2f", total));
    } catch (DateTimeParseException ex) {
       
        JOptionPane.showMessageDialog(null, "Formato de fecha u hora incorrecto.");
    }
  
    }//GEN-LAST:event_jbConsultaActionPerformed

    private void jtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFechaActionPerformed

    private void jtHoraFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtHoraFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtHoraFinalActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
     this.dispose(); 
    }//GEN-LAST:event_jbSalirActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VentasPorHora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentasPorHora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentasPorHora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentasPorHora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentasPorHora().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbConsulta;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlHoraComienzo;
    private javax.swing.JLabel jlHoraFinal;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JLabel jlVentaPorHora;
    private javax.swing.JTextField jtFecha;
    private javax.swing.JTextField jtHoraComienzo;
    private javax.swing.JTextField jtHoraFinal;
    private javax.swing.JTextField jtTotal;
    // End of variables declaration//GEN-END:variables
}
