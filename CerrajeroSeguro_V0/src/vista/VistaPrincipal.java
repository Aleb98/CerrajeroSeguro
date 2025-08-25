package vista;

public class VistaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaPrincipal.class.getName());
    private controllerMenuVistaPrincipal ControllerMenuVistaPrincipal;
    public VistaPrincipal() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        panelPrincipal.removeAll();
        panelPrincipal.repaint();
        this.ControllerMenuVistaPrincipal = new controllerMenuVistaPrincipal(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelPrincipalVenta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaLineaDeVenta = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        campoCodigoProducto = new javax.swing.JTextField();
        botonIngresarProducto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonFinalizarVenta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        panelPrincipalInventario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuVenta = new javax.swing.JMenu();
        menuInventario = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VENTAS");

        tablaLineaDeVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Nombre", "Precio", "Subtotal"
            }
        ));
        jScrollPane3.setViewportView(tablaLineaDeVenta);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Registrar venta");

        botonIngresarProducto.setText("Ingresar producto");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Total: ");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("$ 101010");

        botonFinalizarVenta.setText("Finalizar venta");

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Listado de productos");

        javax.swing.GroupLayout panelPrincipalVentaLayout = new javax.swing.GroupLayout(panelPrincipalVenta);
        panelPrincipalVenta.setLayout(panelPrincipalVentaLayout);
        panelPrincipalVentaLayout.setHorizontalGroup(
            panelPrincipalVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelPrincipalVentaLayout.createSequentialGroup()
                .addGroup(panelPrincipalVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalVentaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelPrincipalVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalVentaLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalVentaLayout.createSequentialGroup()
                                .addComponent(campoCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonIngresarProducto))))
                    .addGroup(panelPrincipalVentaLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(panelPrincipalVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
            .addGroup(panelPrincipalVentaLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(botonFinalizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalVentaLayout.setVerticalGroup(
            panelPrincipalVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPrincipalVentaLayout.createSequentialGroup()
                        .addGroup(panelPrincipalVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonIngresarProducto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(botonFinalizarVenta)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INVENTARIO");

        javax.swing.GroupLayout panelPrincipalInventarioLayout = new javax.swing.GroupLayout(panelPrincipalInventario);
        panelPrincipalInventario.setLayout(panelPrincipalInventarioLayout);
        panelPrincipalInventarioLayout.setHorizontalGroup(
            panelPrincipalInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPrincipalInventarioLayout.setVerticalGroup(
            panelPrincipalInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(459, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1064, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPrincipalVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPrincipalInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPrincipalVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPrincipalInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/carrito-de-compras.png"))); // NOI18N
        menuVenta.setText("VENTAS");
        menuVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVentaMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuVenta);

        menuInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/edificio.png"))); // NOI18N
        menuInventario.setText("INVENTARIO");
        menuInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuInventarioMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuInventario);

        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/salida.png"))); // NOI18N
        menuSalir.setText("SALIR");
        menuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVentaMouseClicked
        ControllerMenuVistaPrincipal.cambiarVista(panelPrincipalVenta);
    }//GEN-LAST:event_menuVentaMouseClicked

    private void menuInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInventarioMouseClicked
        ControllerMenuVistaPrincipal.cambiarVista(panelPrincipalInventario);
    }//GEN-LAST:event_menuInventarioMouseClicked

    private void menuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_menuSalirMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VistaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonFinalizarVenta;
    private javax.swing.JButton botonIngresarProducto;
    private javax.swing.JTextField campoCodigoProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenu menuInventario;
    private javax.swing.JMenu menuSalir;
    private javax.swing.JMenu menuVenta;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelPrincipalInventario;
    private javax.swing.JPanel panelPrincipalVenta;
    private javax.swing.JTable tablaLineaDeVenta;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables

    //BOTONES DEL MENU BAR
    public javax.swing.JMenu getMenuInventario() { return menuInventario; }
    public void setMenuInventario(javax.swing.JMenu menuInventario) { this.menuInventario = menuInventario; }

    public javax.swing.JMenu getMenuSalir() { return menuSalir; }
    public void setMenuSalir(javax.swing.JMenu menuSalir) { this.menuSalir = menuSalir; }

    public javax.swing.JMenu getMenuVenta() { return menuVenta; }
    public void setMenuVenta(javax.swing.JMenu menuVenta) { this.menuVenta = menuVenta; }
    
    //PANELES

    public javax.swing.JPanel getPanelPrincipal() { return panelPrincipal; }
    public void setPanelPrincipal(javax.swing.JPanel panelPrincipal) { this.panelPrincipal = panelPrincipal; }

    public javax.swing.JPanel getPanelPrincipalInventario() { return panelPrincipalInventario; }
    public void setPanelPrincipalInventario(javax.swing.JPanel panelPrincipalInventario) { this.panelPrincipalInventario = panelPrincipalInventario; }

    public javax.swing.JPanel getPanelPrincipalVenta() { return panelPrincipalVenta; }
    public void setPanelPrincipalVenta(javax.swing.JPanel panelPrincipalVenta) { this.panelPrincipalVenta = panelPrincipalVenta; }
    
    //TABLAS

    public javax.swing.JTable getTablaLineaDeVenta() { return tablaLineaDeVenta; }
    public void setTablaLineaDeVenta(javax.swing.JTable tablaLineaDeVenta) { this.tablaLineaDeVenta = tablaLineaDeVenta; }

    public javax.swing.JTable getTablaProductos() { return tablaProductos; }
    public void setTablaProductos(javax.swing.JTable tablaProductos) { this.tablaProductos = tablaProductos; }
    
    //CAMPOS CONTENEDORES

    public javax.swing.JTextField getCampoCodigoProducto() { return campoCodigoProducto; }
    public void setCampoCodigoProducto(javax.swing.JTextField campoCodigoProducto) { this.campoCodigoProducto = campoCodigoProducto; }
    
    //BOTONES

    public javax.swing.JButton getBotonFinalizarVenta() { return botonFinalizarVenta; }
    public void setBotonFinalizarVenta(javax.swing.JButton botonFinalizarVenta) { this.botonFinalizarVenta = botonFinalizarVenta; }

    public javax.swing.JButton getBotonIngresarProducto() { return botonIngresarProducto; }
    public void setBotonIngresarProducto(javax.swing.JButton botonIngresarProducto) { this.botonIngresarProducto = botonIngresarProducto; }
    
    
}
