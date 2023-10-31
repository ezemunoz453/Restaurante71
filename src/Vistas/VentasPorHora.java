package Vistas;

import AccesoADatos.PedidoData;
import Entidades.Pedido;
import java.awt.Font;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
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

        jlVentaPorHora = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jlHoraComienzo = new javax.swing.JLabel();
        jlHoraFinal = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();
        jbConsulta = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jtFecha = new javax.swing.JTextField();
        jtHoraComienzo = new javax.swing.JTextField();
        jtHoraFinal = new javax.swing.JTextField();
        jtTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlVentaPorHora.setText("Ventas por hora");

        jlFecha.setText("Ingrese fecha ddmmaaaa : ");

        jlHoraComienzo.setText("Ingrese hora comienzo hhmm : ");

        jlHoraFinal.setText("Ingrese hora final hhmm : ");

        jlTotal.setText("Total :    $");

        jbConsulta.setText("Consulta ");
        jbConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFechaActionPerformed(evt);
            }
        });

        jtHoraFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtHoraFinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jlVentaPorHora)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlFecha)
                            .addComponent(jlHoraComienzo)
                            .addComponent(jlHoraFinal)
                            .addComponent(jlTotal))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtFecha)
                                    .addComponent(jtHoraComienzo)
                                    .addComponent(jtHoraFinal)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jbConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir)))
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jlVentaPorHora)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFecha)
                    .addComponent(jtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlHoraComienzo)
                    .addComponent(jtHoraComienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlHoraFinal)
                    .addComponent(jtHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jlTotal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbConsulta)
                    .addComponent(jbSalir))
                .addGap(57, 57, 57))
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
