package Vistas;

import AccesoADatos.Conexion;
import Entidades.Usuario;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public String user = "";
    public String pass;
    private Connection con = null;

    public Login() {
        initComponents();
         this.setSize(910, 685 );
        setResizable(false);

        // cargar a jlabel una imagen
        this.setLocationRelativeTo(this);
        AgregarImagenALabel(jLabelLogo, "src/imagenes/Logog71 resto.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtPass = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jtUsuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbtnCancelar = new javax.swing.JPanel();
        jbTCancelar = new javax.swing.JLabel();
        jbtnIngresar = new javax.swing.JPanel();
        jbTIngresar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 190, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoLoggin.jpg"))); // NOI18N
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 400, 670));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel3.setText("INICIO DE SESION");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, -1, -1));

        jtPass.setForeground(new java.awt.Color(51, 51, 51));
        jtPass.setBorder(null);
        bg.add(jtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 410, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 410, 10));

        jtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtUsuario.setBorder(null);
        jtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtUsuarioMousePressed(evt);
            }
        });
        jtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 410, 50));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 410, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("CONTRASEÑA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("USUARIO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jbtnCancelar.setBackground(new java.awt.Color(228, 195, 150));
        jbtnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnCancelarMouseExited(evt);
            }
        });

        jbTCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbTCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbTCancelar.setText("CANCELAR");
        jbTCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbTCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbTCancelarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jbtnCancelarLayout = new javax.swing.GroupLayout(jbtnCancelar);
        jbtnCancelar.setLayout(jbtnCancelarLayout);
        jbtnCancelarLayout.setHorizontalGroup(
            jbtnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbtnCancelarLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jbTCancelar)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jbtnCancelarLayout.setVerticalGroup(
            jbtnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbtnCancelarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jbTCancelar)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jbtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 170, 70));

        jbtnIngresar.setBackground(new java.awt.Color(228, 195, 150));
        jbtnIngresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnIngresarMouseExited(evt);
            }
        });

        jbTIngresar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbTIngresar1.setForeground(new java.awt.Color(255, 255, 255));
        jbTIngresar1.setText("INGRESAR");
        jbTIngresar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbTIngresar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbTIngresar1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jbtnIngresarLayout = new javax.swing.GroupLayout(jbtnIngresar);
        jbtnIngresar.setLayout(jbtnIngresarLayout);
        jbtnIngresarLayout.setHorizontalGroup(
            jbtnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbtnIngresarLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jbTIngresar1)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jbtnIngresarLayout.setVerticalGroup(
            jbtnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbtnIngresarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jbTIngresar1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jbtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 170, 70));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 510, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbTCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTCancelarMouseEntered
        jbTCancelar.setForeground(Color.WHITE);

    }//GEN-LAST:event_jbTCancelarMouseEntered

    private void jbTCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTCancelarMouseExited
        jbTCancelar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jbTCancelarMouseExited

    private void jbtnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarMouseEntered
        jbtnCancelar.setBackground(new Color(145, 117, 89));
    }//GEN-LAST:event_jbtnCancelarMouseEntered

    private void jbtnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarMouseExited
        jbtnCancelar.setBackground(new Color(201, 162, 123));
    }//GEN-LAST:event_jbtnCancelarMouseExited

    private void jtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtUsuarioMousePressed
   
    }//GEN-LAST:event_jtUsuarioMousePressed

    private void jbtnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarMouseClicked
        JOptionPane.showMessageDialog(null, "Gracias por utilizar Resto71 - Servicios Virtuales");
        System.exit(0);

    }//GEN-LAST:event_jbtnCancelarMouseClicked

    private void jbTIngresar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTIngresar1MouseEntered
        jbTIngresar1.setForeground(Color.WHITE);
    }//GEN-LAST:event_jbTIngresar1MouseEntered

    private void jbTIngresar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTIngresar1MouseExited
        jbTIngresar1.setForeground(Color.WHITE);
    }//GEN-LAST:event_jbTIngresar1MouseExited

    private void jbtnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnIngresarMouseClicked
        user = jtUsuario.getText();
        pass = jtPass.getText();

        Usuario usuario = new Usuario();
        usuario.setUsername(user);
        usuario.setContrasena(pass);

        if (!user.equals("") || !pass.equals("")) {
            try {
                con = Conexion.getConexion();

                PreparedStatement pst = con.prepareStatement("select Nivel from usuario where username = '" + user
                        + "' and contrasena = '" + pass + "'");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    String Nivel = rs.getString("Nivel");

                    if (Nivel.equalsIgnoreCase("Administrador")) {
                        dispose();
                        new AdministradorView1().setVisible(true);
                    } else if (Nivel.equalsIgnoreCase("Mesero")) {
                        dispose();
                        new MeseroView().setVisible(true);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "DATOS INCORRECTOS - INTENTE NUEVAMENTE");
                    jtUsuario.setText("");
                    jtPass.setText("");
                }

            } catch (SQLException e) {
                System.err.println("Error en el boton Acceder." + e);
                JOptionPane.showMessageDialog(null, "Ocurrio un error contacte con el Administrador");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
            jtUsuario.setText("");
            jtPass.setText("");
        }


    }//GEN-LAST:event_jbtnIngresarMouseClicked

    private void jbtnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnIngresarMouseEntered
        jbtnIngresar.setBackground(new Color(145, 117, 89));
    }//GEN-LAST:event_jbtnIngresarMouseEntered

    private void jbtnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnIngresarMouseExited
          jbtnIngresar.setBackground(new Color(201, 162, 123));
    }//GEN-LAST:event_jbtnIngresarMouseExited

    private void jtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtUsuarioActionPerformed
        jtUsuario.setText("");
    }//GEN-LAST:event_jtUsuarioActionPerformed

    // metodo para cargar a label una imagen segun tamaño de label
    public void AgregarImagenALabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jbTCancelar;
    private javax.swing.JLabel jbTIngresar1;
    private javax.swing.JPanel jbtnCancelar;
    private javax.swing.JPanel jbtnIngresar;
    private javax.swing.JPasswordField jtPass;
    private javax.swing.JTextField jtUsuario;
    // End of variables declaration//GEN-END:variables
}
