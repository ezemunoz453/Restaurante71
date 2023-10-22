package Vistas;

import AccesoADatos.MesaData;
import AccesoADatos.UsuarioData;
import Entidades.Mesa;
import Entidades.Usuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class AdministradorView1 extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    UsuarioData uData = new UsuarioData();
    Mesa mesa = new Mesa();
    MesaData mData = new MesaData();

    public AdministradorView1() {
        initComponents();

        this.setSize(1920, 1080);

//        this.setSize(1700, 1000);
        setResizable(false);

        this.setLocationRelativeTo(this);
        AgregarImagenALabel(jLFondoBotones, "src/imagenes/fondobotones.jpg");
        AgregarImagenALabel(jLabelLogo, "src/imagenes/Logog71 resto.png");
        AgregarImagenALabel(jlLogoUser, "src/imagenes/username.png");
        AgregarImagenALabel(jlLogoMesa, "src/imagenes/mesa1.png");
        AgregarImagenALabel(jlLogoProducto, "src/imagenes/stock1.png");

        cargarComboNivel();
        jcbNivel.setSelectedItem(null);
        jbModificarUsuario.setEnabled(false);
        jbEliminarUsuario.setEnabled(false);
        cargarComboEstadoMesal();
        jcbEstado.setSelectedItem(null);
        jbModificarMesa.setEnabled(false);
        jbEliminarMesa.setEnabled(false);

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
        jbCerrarSesion = new javax.swing.JButton();
        jbReportes = new javax.swing.JButton();
        jbMesas = new javax.swing.JButton();
        jLFondoBotones = new javax.swing.JLabel();
        jPFondoVentanas = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jlLogoUser = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtNombreUsuario = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtContraseña = new javax.swing.JTextField();
        jbBuscarUsuario = new javax.swing.JButton();
        jbModificarUsuario = new javax.swing.JButton();
        jbEliminarUsuario = new javax.swing.JButton();
        jbGuardarUsuario = new javax.swing.JButton();
        jcbNivel = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jlLogoMesa = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jtNumeroMesa = new javax.swing.JTextField();
        jtCapacidad = new javax.swing.JTextField();
        jbBuscarMesa = new javax.swing.JButton();
        jbGuardarMesa = new javax.swing.JButton();
        jbModificarMesa = new javax.swing.JButton();
        jbEliminarMesa = new javax.swing.JButton();
        jcbEstado = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jlLogoProducto = new javax.swing.JLabel();
        jtIdProducto = new javax.swing.JTextField();
        jtNombreProducto = new javax.swing.JTextField();
        jtCantidadProducto = new javax.swing.JTextField();
        jtPrecioProducto = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jtEstadoProducto = new javax.swing.JTextField();
        jbBuscarProductoId = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jbBuscarProductoNombre = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MiEscritorio.setPreferredSize(new java.awt.Dimension(1700, 1000));
        MiEscritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        MiEscritorio.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 830, 200, 170));

        jdUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jdUsuarios.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jdUsuarios.setForeground(new java.awt.Color(201, 162, 123));
        jdUsuarios.setText("USUARIOS");
        jdUsuarios.setBorder(null);
        jdUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jdUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jdUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jdUsuariosMouseExited(evt);
            }
        });
        jdUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdUsuariosActionPerformed(evt);
            }
        });
        MiEscritorio.add(jdUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 230, 80));

        jbProductos.setBackground(new java.awt.Color(255, 255, 255));
        jbProductos.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jbProductos.setForeground(new java.awt.Color(201, 162, 123));
        jbProductos.setText("PRODUCTOS");
        jbProductos.setBorder(null);
        jbProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbProductosMouseExited(evt);
            }
        });
        jbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductosActionPerformed(evt);
            }
        });
        MiEscritorio.add(jbProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 230, 80));

        jbCerrarSesion.setBackground(new java.awt.Color(229, 195, 157));
        jbCerrarSesion.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jbCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jbCerrarSesion.setText("CERRAR SESION");
        jbCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarSesionActionPerformed(evt);
            }
        });
        MiEscritorio.add(jbCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 710, 230, 80));

        jbReportes.setBackground(new java.awt.Color(255, 255, 255));
        jbReportes.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jbReportes.setForeground(new java.awt.Color(201, 162, 123));
        jbReportes.setText("REPORTES");
        jbReportes.setBorder(null);
        jbReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbReportesMouseExited(evt);
            }
        });
        jbReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReportesActionPerformed(evt);
            }
        });
        MiEscritorio.add(jbReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 230, 80));

        jbMesas.setBackground(new java.awt.Color(255, 255, 255));
        jbMesas.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jbMesas.setForeground(new java.awt.Color(201, 162, 123));
        jbMesas.setText("MESAS");
        jbMesas.setBorder(null);
        jbMesas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbMesasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbMesasMouseExited(evt);
            }
        });
        jbMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesasActionPerformed(evt);
            }
        });
        MiEscritorio.add(jbMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 230, 80));

        jLFondoBotones.setBackground(new java.awt.Color(0, 51, 204));
        MiEscritorio.add(jLFondoBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 1160));

        jPFondoVentanas.setBackground(new java.awt.Color(204, 204, 204));

        jTabbedPane1.setBackground(new java.awt.Color(229, 195, 157));
        jTabbedPane1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(229, 195, 157));

        jlLogoUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlLogoUser.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre de Usuario");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apellido");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre ");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contraseña");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nivel");

        jtNombre.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jtNombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jtApellido.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jtContraseña.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jbBuscarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbBuscarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jbBuscarUsuario.setText("BUSCAR");
        jbBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarUsuarioActionPerformed(evt);
            }
        });

        jbModificarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jbModificarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        jbModificarUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarUsuarioActionPerformed(evt);
            }
        });

        jbEliminarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jbEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        jbEliminarUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarUsuarioActionPerformed(evt);
            }
        });

        jbGuardarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jbGuardarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        jbGuardarUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbGuardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarUsuarioActionPerformed(evt);
            }
        });

        jcbNivel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlLogoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbNivel, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtContraseña, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jbGuardarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(261, 261, 261)
                                .addComponent(jbModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(156, 156, 156))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlLogoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jLabel6)
                .addGap(2, 2, 2)
                .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel7)
                .addGap(8, 8, 8)
                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel8)
                .addGap(2, 2, 2)
                .addComponent(jtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel9)
                .addGap(2, 2, 2)
                .addComponent(jcbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbGuardarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("GESTION DE USUARIOS", jPanel4);

        jPanel5.setBackground(new java.awt.Color(229, 195, 157));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Numero Mesa");

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Capacidad");

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Estado");

        jtNumeroMesa.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jtCapacidad.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jbBuscarMesa.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscarMesa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbBuscarMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jbBuscarMesa.setText("BUSCAR");
        jbBuscarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarMesaActionPerformed(evt);
            }
        });

        jbGuardarMesa.setBackground(new java.awt.Color(255, 255, 255));
        jbGuardarMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        jbGuardarMesa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbGuardarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarMesaActionPerformed(evt);
            }
        });

        jbModificarMesa.setBackground(new java.awt.Color(255, 255, 255));
        jbModificarMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        jbModificarMesa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbModificarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarMesaActionPerformed(evt);
            }
        });

        jbEliminarMesa.setBackground(new java.awt.Color(255, 255, 255));
        jbEliminarMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        jbEliminarMesa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbEliminarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarMesaActionPerformed(evt);
            }
        });

        jcbEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlLogoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jtNumeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jbBuscarMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(0, 765, Short.MAX_VALUE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jbGuardarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(261, 261, 261)
                                        .addComponent(jbModificarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbEliminarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jcbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtCapacidad))))
                .addGap(163, 163, 163))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlLogoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel10)
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBuscarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNumeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbEliminarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbModificarMesa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbGuardarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("GESTION DE MESAS", jPanel5);

        jPanel6.setBackground(new java.awt.Color(229, 195, 157));

        jtIdProducto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jtNombreProducto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jtCantidadProducto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jtPrecioProducto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jtEstadoProducto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jbBuscarProductoId.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscarProductoId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbBuscarProductoId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jbBuscarProductoId.setText("BUSCAR");

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("id Producto");

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre");

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cantidad");

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Precio");

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Estado");

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Tipo");

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        jButton12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbBuscarProductoNombre.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscarProductoNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbBuscarProductoNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jbBuscarProductoNombre.setText("BUSCAR");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlLogoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtPrecioProducto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtCantidadProducto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(366, 366, 366)
                                        .addComponent(jLabel19)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jtEstadoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jTextField14))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(261, 261, 261)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtNombreProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtIdProducto))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jbBuscarProductoId, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbBuscarProductoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(169, 169, 169))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlLogoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBuscarProductoId, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jLabel15)
                .addGap(3, 3, 3)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarProductoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel16)
                .addGap(8, 8, 8)
                .addComponent(jtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtEstadoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("GESTION DE PRODUCTOS", jPanel6);

        jPanel7.setBackground(new java.awt.Color(229, 195, 157));

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

        jTabbedPane1.addTab("REPORTES ", jPanel7);

        javax.swing.GroupLayout jPFondoVentanasLayout = new javax.swing.GroupLayout(jPFondoVentanas);
        jPFondoVentanas.setLayout(jPFondoVentanasLayout);
        jPFondoVentanasLayout.setHorizontalGroup(
            jPFondoVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFondoVentanasLayout.createSequentialGroup()
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
            .addComponent(MiEscritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MiEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1078, Short.MAX_VALUE)
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

    private void jdUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdUsuariosMouseEntered
        jdUsuarios.setBackground(new Color(201, 162, 123));
        jdUsuarios.setForeground(Color.white);
    }//GEN-LAST:event_jdUsuariosMouseEntered

    private void jdUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdUsuariosMouseExited
        jdUsuarios.setBackground(Color.white);
        jdUsuarios.setForeground(new Color(201, 162, 123));
    }//GEN-LAST:event_jdUsuariosMouseExited

    private void jbMesasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbMesasMouseEntered
        jbMesas.setBackground(new Color(201, 162, 123));
        jbMesas.setForeground(Color.white);
    }//GEN-LAST:event_jbMesasMouseEntered

    private void jbMesasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbMesasMouseExited
        jbMesas.setBackground(Color.white);
        jbMesas.setForeground(new Color(201, 162, 123));
    }//GEN-LAST:event_jbMesasMouseExited

    private void jbProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbProductosMouseEntered
        jbProductos.setBackground(new Color(201, 162, 123));
        jbProductos.setForeground(Color.white);
    }//GEN-LAST:event_jbProductosMouseEntered

    private void jbProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbProductosMouseExited
        jbProductos.setBackground(Color.white);
        jbProductos.setForeground(new Color(201, 162, 123));
    }//GEN-LAST:event_jbProductosMouseExited

    private void jbReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbReportesMouseEntered
        jbReportes.setBackground(new Color(201, 162, 123));
        jbReportes.setForeground(Color.white);
    }//GEN-LAST:event_jbReportesMouseEntered

    private void jbReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbReportesMouseExited
        jbReportes.setBackground(Color.white);
        jbReportes.setForeground(new Color(201, 162, 123));
    }//GEN-LAST:event_jbReportesMouseExited

    private void jbCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarSesionActionPerformed
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jbCerrarSesionActionPerformed

    private void jbBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarUsuarioActionPerformed
        try {
            if (jtNombreUsuario.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "El campo Nombre de Usuario no puede estar vacio ");
                limpiarCamposUser();
            } else {
                usuario = uData.buscarUsuario(jtNombreUsuario.getText());
                if (usuario != null) {

                    jtApellido.setText(usuario.getApellido());
                    jtNombre.setText(usuario.getNombre());
                    jtContraseña.setText(usuario.getContrasena());
                    jcbNivel.setSelectedItem(usuario.getNivel());

                    jbGuardarUsuario.setEnabled(false);
                    jbModificarUsuario.setEnabled(true);
                    jbEliminarUsuario.setEnabled(true);
                } else {
                    limpiarCamposUser();
                }
            }
        } catch (NullPointerException e) {
//            JOptionPane.showMessageDialog(this, "El alumno no existe" );
        }
    }//GEN-LAST:event_jbBuscarUsuarioActionPerformed

    private void jbGuardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarUsuarioActionPerformed
        if (jtNombreUsuario.getText().isEmpty() || jtNombre.getText().isEmpty() || jtApellido.getText().isEmpty() || jtContraseña.getText().isEmpty() || jcbNivel.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacios al crear un USUARIO");
            return;
        } else {
            usuario.setUsername(jtNombreUsuario.getText());
            usuario.setNombre(jtNombre.getText());
            usuario.setApellido(jtApellido.getText());
            usuario.setContrasena(jtContraseña.getText());
            usuario.setNivel(jcbNivel.getSelectedItem().toString());
            uData.guardarUsuario(usuario);
        }
        limpiarCamposUser();
    }//GEN-LAST:event_jbGuardarUsuarioActionPerformed

    private void jbModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarUsuarioActionPerformed
        if (jtNombreUsuario.getText().isEmpty() || jtNombre.getText().isEmpty() || jtApellido.getText().isEmpty() || jtContraseña.getText().isEmpty() || jcbNivel.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacios al modificar un USUARIO ");
            return;
        } else{
            
        
        usuario.setUsername(jtNombreUsuario.getText());
        usuario.setNombre(jtNombre.getText());
        usuario.setApellido(jtApellido.getText());
        usuario.setContrasena(jtContraseña.getText());
        usuario.setNivel(jcbNivel.getSelectedItem().toString());

        uData.modificarUsuario(usuario);
        limpiarCamposUser();
        }
    }//GEN-LAST:event_jbModificarUsuarioActionPerformed

    private void jbEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarUsuarioActionPerformed
        if (jtNombreUsuario.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "No existe USUARIO a eliminar , indique un NOMBRE DE USUARIO para su busqueda ");
        } else {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar ?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                uData.eliminarUsuario(jtNombreUsuario.getText());
                limpiarCamposUser();
            } else {
                limpiarCamposUser();
            }
        }
    }//GEN-LAST:event_jbEliminarUsuarioActionPerformed

    private void jbBuscarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarMesaActionPerformed
        try {
            if (jtNumeroMesa.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "El campo Numero Mesa no puede estar vacio ");
                limpiarCamposMesa();
            } else {
                mesa = mData.buscarMesaPorNumero(Integer.parseInt(jtNumeroMesa.getText()));

                jtNumeroMesa.setText(mesa.getNumeroMesa() + "");
                jtCapacidad.setText(mesa.getCapacidad() + "");
                jcbEstado.setSelectedItem(mesa.getEstado());

                jbGuardarMesa.setEnabled(false);
                jbModificarMesa.setEnabled(true);
                jbEliminarMesa.setEnabled(true);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El campo solo acepta numeros ");
            limpiarCamposMesa();
            
        } catch (NullPointerException ex) {
//            JOptionPane.showMessageDialog(this, "No existe Materias con ese id ");

        }


    }//GEN-LAST:event_jbBuscarMesaActionPerformed

    private void jbGuardarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarMesaActionPerformed
        try{
        if (jtNumeroMesa.getText().isEmpty() ||  jtCapacidad.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Los campos Numero y Capacidad no pueden estar vacios al crear una Mesa");
            return;
        } else {
                       
            mesa.setNumeroMesa(Integer.parseInt(jtNumeroMesa.getText()));
            mesa.setCapacidad(Integer.parseInt(jtCapacidad.getText()));
            mesa.setEstado("LIBRE");
         
            mData.guardarMesa(mesa);
        }    
                }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, " Los campos deben se numericos");
        }
        limpiarCamposMesa();
        
        
        
    }//GEN-LAST:event_jbGuardarMesaActionPerformed

    private void jbModificarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarMesaActionPerformed
        if (jtNumeroMesa.getText().isEmpty() ||  jtCapacidad.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacios al modificar una MESA ");
            return;
        } else{
            
        
            mesa.setNumeroMesa(Integer.parseInt(jtNumeroMesa.getText()));
            mesa.setCapacidad(Integer.parseInt(jtCapacidad.getText()));
            mesa.setEstado("LIBRE");
        
        mData.modificarMesa(mesa);
      
        limpiarCamposMesa();
        }
    }//GEN-LAST:event_jbModificarMesaActionPerformed

    private void jbEliminarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarMesaActionPerformed
        if (jtNumeroMesa.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "No existe Mesa a eliminar , indique un Numero de Mesa para su busqueda ");
        } else {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar ?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                mData.eliminarMesaPorNumeroMesa(Integer.parseInt(jtNumeroMesa.getText()));
           
                limpiarCamposMesa();
            } else {
                limpiarCamposMesa();
            }
        }
    }//GEN-LAST:event_jbEliminarMesaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane MiEscritorio;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLFondoBotones;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JTextField jTextField14;
    private javax.swing.JButton jbBuscarMesa;
    private javax.swing.JButton jbBuscarProductoId;
    private javax.swing.JButton jbBuscarProductoNombre;
    private javax.swing.JButton jbBuscarUsuario;
    private javax.swing.JButton jbCerrarSesion;
    private javax.swing.JButton jbEliminarMesa;
    private javax.swing.JButton jbEliminarUsuario;
    private javax.swing.JButton jbGuardarMesa;
    private javax.swing.JButton jbGuardarUsuario;
    private javax.swing.JButton jbMesas;
    private javax.swing.JButton jbModificarMesa;
    private javax.swing.JButton jbModificarUsuario;
    private javax.swing.JButton jbProductos;
    private javax.swing.JButton jbReportes;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JComboBox<String> jcbNivel;
    private javax.swing.JButton jdUsuarios;
    private javax.swing.JLabel jlLogoMesa;
    private javax.swing.JLabel jlLogoProducto;
    private javax.swing.JLabel jlLogoUser;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCantidadProducto;
    private javax.swing.JTextField jtCapacidad;
    private javax.swing.JTextField jtContraseña;
    private javax.swing.JTextField jtEstadoProducto;
    private javax.swing.JTextField jtIdProducto;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtNombreProducto;
    private javax.swing.JTextField jtNombreUsuario;
    private javax.swing.JTextField jtNumeroMesa;
    private javax.swing.JTextField jtPrecioProducto;
    // End of variables declaration//GEN-END:variables

    private void cargarComboNivel() {
        jcbNivel.addItem("ADMINISTRADOR");
        jcbNivel.addItem("MESERO");
    }

    private void cargarComboEstadoMesal() {
        jcbEstado.addItem("LIBRE");
        jcbEstado.addItem("OCUPADA");
    }

    public void AgregarImagenALabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    public void limpiarCamposUser() {
        jtNombreUsuario.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jtContraseña.setText("");
        jcbNivel.setSelectedItem(null);

        jbModificarUsuario.setEnabled(false);
        jbGuardarUsuario.setEnabled(true);
        jbEliminarUsuario.setEnabled(false);

    }

        public void limpiarCamposMesa() {
        jtNumeroMesa.setText("");
        jtCapacidad.setText("");
        jcbEstado.setSelectedItem(null);

        jbModificarMesa.setEnabled(false);
        jbGuardarMesa.setEnabled(true);
        jbEliminarMesa.setEnabled(false);
    }
}