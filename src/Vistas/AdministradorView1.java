
package Vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class AdministradorView1 extends javax.swing.JFrame {

     
    
    public AdministradorView1() {
        initComponents();
                        
         this.setSize(1700 , 1000);
//        setResizable(false);

        this.setLocationRelativeTo(this);
         AgregarImagenALabel(jLFondoBotones, "src/imagenes/fondobotones.jpg");
        AgregarImagenALabel(jLabelLogo, "src/imagenes/Logog71 resto.png");
         
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono=new ImageIcon(getClass().getResource("/imagenes/fondoLoggin.jpg"));
        Image miImagen=icono.getImage();
        MiEscritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen,0,0, getWidth(),getHeight(),this);

            }
        }
        ;
        jLabelLogo = new javax.swing.JLabel();
        jdUsuarios = new javax.swing.JButton();
        jbProductos = new javax.swing.JButton();
        jbReportes = new javax.swing.JButton();
        jbMesas = new javax.swing.JButton();
        jLFondoBotones = new javax.swing.JLabel();
        jPFondoVentanas = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MiEscritorio.setPreferredSize(new java.awt.Dimension(1700, 1000));
        MiEscritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        MiEscritorio.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 760, 200, 170));

        jdUsuarios.setBackground(new java.awt.Color(201, 162, 123));
        jdUsuarios.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jdUsuarios.setText("GESTION DE USUARIOS");
        jdUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdUsuariosActionPerformed(evt);
            }
        });
        MiEscritorio.add(jdUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 210, 80));

        jbProductos.setBackground(new java.awt.Color(201, 162, 123));
        jbProductos.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jbProductos.setText("GESTION DE PRODUCTOS");
        jbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductosActionPerformed(evt);
            }
        });
        MiEscritorio.add(jbProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 210, 80));

        jbReportes.setBackground(new java.awt.Color(201, 162, 123));
        jbReportes.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jbReportes.setText("REPORTES");
        jbReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReportesActionPerformed(evt);
            }
        });
        MiEscritorio.add(jbReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 210, 80));

        jbMesas.setBackground(new java.awt.Color(201, 162, 123));
        jbMesas.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jbMesas.setText("GESTION DE MESAS");
        jbMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesasActionPerformed(evt);
            }
        });
        MiEscritorio.add(jbMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 210, 80));

        jLFondoBotones.setBackground(new java.awt.Color(0, 51, 204));
        MiEscritorio.add(jLFondoBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 370, 1000));

        jPFondoVentanas.setBackground(new java.awt.Color(204, 204, 204));

        jTabbedPane1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("GESTION DE USUARIOS");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel5.setText("Nombre de Usuario");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel6.setText("Apellido");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel7.setText("Nombre ");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel8.setText("Contraseña");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel9.setText("Nivel");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("BUSCAR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jTextField2)
                                .addGap(41, 41, 41)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel1)))
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(284, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(158, 158, 158)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(120, 120, 120)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addComponent(jLabel6)
                .addGap(79, 79, 79)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(236, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(280, 280, 280)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(547, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("GESTION DE USUARIOS", jPanel4);

        jLabel2.setText("Mesas");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel2)
                .addContainerGap(979, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel2)
                .addContainerGap(792, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("M", jPanel5);

        jLabel3.setText("Reportes");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel3)
                .addContainerGap(1029, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel3)
                .addContainerGap(805, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("P", jPanel6);

        jLabel4.setText("Stock");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel4)
                .addContainerGap(943, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel4)
                .addContainerGap(707, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("R", jPanel7);

        javax.swing.GroupLayout jPFondoVentanasLayout = new javax.swing.GroupLayout(jPFondoVentanas);
        jPFondoVentanas.setLayout(jPFondoVentanasLayout);
        jPFondoVentanasLayout.setHorizontalGroup(
            jPFondoVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFondoVentanasLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPFondoVentanasLayout.setVerticalGroup(
            jPFondoVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFondoVentanasLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        MiEscritorio.add(jPFondoVentanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 1130, 910));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MiEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1688, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MiEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesasActionPerformed

jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jbMesasActionPerformed

    private void jdUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdUsuariosActionPerformed
jTabbedPane1.setSelectedIndex(0);
    
    }//GEN-LAST:event_jdUsuariosActionPerformed

    private void jbReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReportesActionPerformed
       jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jbReportesActionPerformed

    private void jbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProductosActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jbProductosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane MiEscritorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLFondoBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPFondoVentanas;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton jbMesas;
    private javax.swing.JButton jbProductos;
    private javax.swing.JButton jbReportes;
    private javax.swing.JButton jdUsuarios;
    // End of variables declaration//GEN-END:variables

  public void AgregarImagenALabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }



}
