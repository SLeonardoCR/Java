package tfdatabase;

import com.mysql.jdbc.Statement;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;

public class Menu extends javax.swing.JFrame {

    String Departamento, Marca, Articulo, Presio;
    Float Precio;
    
    public Menu() {
        initComponents();
        this.setSize(700,500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.setIconImage(getIconImage());
    }

    @Override
public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
        getImage(ClassLoader.getSystemResource("Images/Icon.png"));
   return retValue;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PrecioArticulo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TOTAL = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SeleccArticulo = new javax.swing.JComboBox<>();
        SeleccDepartamento = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        SeleccMarca = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Titulo1 = new javax.swing.JLabel();
        Titulo2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Subtitulo1 = new javax.swing.JLabel();
        Subtitulo2 = new javax.swing.JLabel();
        Titulo3 = new javax.swing.JLabel();
        Subtitulo3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(70, 70, 70));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        jPanel2.setBackground(new java.awt.Color(60, 60, 60));

        jLabel4.setText("--------------------------------------------------------");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 255, 204));
        jLabel5.setText("Total");

        jLabel6.setForeground(new java.awt.Color(153, 255, 204));
        jLabel6.setText("Artículo");

        jLabel7.setForeground(new java.awt.Color(153, 255, 204));
        jLabel7.setText("Envío");

        PrecioArticulo.setForeground(new java.awt.Color(204, 204, 204));
        PrecioArticulo.setText("$$$");

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("$99.0");

        TOTAL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TOTAL.setForeground(new java.awt.Color(204, 204, 204));
        TOTAL.setText("$$$");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/4_1.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TOTAL)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(PrecioArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PrecioArticulo))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TOTAL)
                .addGap(55, 55, 55))
        );

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Departamento");

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Artículo");

        SeleccArticulo.setForeground(new java.awt.Color(204, 204, 204));
        SeleccArticulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Artículo" }));
        SeleccArticulo.setEnabled(false);
        SeleccArticulo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SeleccArticuloItemStateChanged(evt);
            }
        });

        SeleccDepartamento.setForeground(new java.awt.Color(204, 204, 204));
        SeleccDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Departamento", "Smartphones", "Procesadores" }));
        SeleccDepartamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SeleccDepartamentoItemStateChanged(evt);
            }
        });
        SeleccDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccDepartamentoActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Marca");

        SeleccMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Marca" }));
        SeleccMarca.setEnabled(false);
        SeleccMarca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SeleccMarcaItemStateChanged(evt);
            }
        });

        jButton1.setText("Aplicar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Aplicar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Titulo1.setForeground(new java.awt.Color(153, 255, 204));
        Titulo1.setText("------");

        Titulo2.setForeground(new java.awt.Color(153, 255, 204));
        Titulo2.setText("------");

        jButton3.setText("Aplicar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Subtitulo1.setForeground(new java.awt.Color(204, 204, 204));
        Subtitulo1.setText("******");

        Subtitulo2.setForeground(new java.awt.Color(204, 204, 204));
        Subtitulo2.setText("******");

        Titulo3.setForeground(new java.awt.Color(153, 255, 204));
        Titulo3.setText("------");

        Subtitulo3.setForeground(new java.awt.Color(204, 204, 204));
        Subtitulo3.setText("******");

        jButton4.setText("Agregar Nuevo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Borrar Artículo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Actualizar Artículo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 51, 255));
        jLabel8.setText("ACCIONES");

        jButton7.setForeground(new java.awt.Color(255, 0, 0));
        jButton7.setText("Salir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(SeleccDepartamento, 0, 242, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(SeleccMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(SeleccArticulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)))
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Titulo1)
                            .addComponent(Subtitulo1))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Titulo2)
                            .addComponent(Subtitulo2))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Subtitulo3)
                            .addComponent(Titulo3)))
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                        .addComponent(jButton7)))
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeleccDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeleccMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeleccArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo1)
                    .addComponent(Titulo2)
                    .addComponent(Titulo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Subtitulo1)
                    .addComponent(Subtitulo2)
                    .addComponent(Subtitulo3))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SeleccDepartamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SeleccDepartamentoItemStateChanged
        
    }//GEN-LAST:event_SeleccDepartamentoItemStateChanged

    private void SeleccMarcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SeleccMarcaItemStateChanged
        
    }//GEN-LAST:event_SeleccMarcaItemStateChanged

    private void SeleccDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeleccDepartamentoActionPerformed

    private void SeleccArticuloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SeleccArticuloItemStateChanged
        
        
    }//GEN-LAST:event_SeleccArticuloItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.SeleccArticulo.setEnabled(true);
        Conectar cn = new Conectar();
        Statement st;
        ResultSet rs;
        Marca=this.SeleccMarca.getSelectedItem().toString();
        try {
            this.SeleccArticulo.removeAllItems();
            st = (Statement) cn.con.createStatement();
            rs = st.executeQuery("SELECT * FROM `"+Departamento+"` WHERE `Marca` LIKE '"+Marca+"'");
            this.SeleccArticulo.addItem("Seleccione "+Departamento);
            while (rs.next()) {
                this.SeleccArticulo.addItem(rs.getString("Nombre"));
            }
            cn.con.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.SeleccArticulo.setEnabled(false);
        this.SeleccMarca.setEnabled(true);
        this.SeleccMarca.removeAllItems();
        Departamento=this.SeleccDepartamento.getSelectedItem().toString();
        Departamento=Departamento.toLowerCase();
        Conectar cn=new Conectar();
        Statement st;
        ResultSet rs;
        try {
            st=(Statement) cn.con.createStatement();
            rs=st.executeQuery("SELECT * FROM `"+Departamento+"`");
            while (rs.next()) {                
                this.SeleccMarca.addItem(rs.getString("Marca"));
            }
            cn.con.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(Departamento.equals("Procesadores")||Departamento.equals("procesadores")){
            this.Titulo1.setText("Nucleos");
            this.Titulo2.setText("Frecuencia");
            this.Titulo3.setText("Stock");
            Articulo = this.SeleccArticulo.getSelectedItem().toString();
            Conectar cn = new Conectar();
            Statement st;
            ResultSet rs;
            try {
                st = (Statement) cn.con.createStatement();
                rs = st.executeQuery("SELECT * FROM `" + Departamento + "` WHERE `Nombre` LIKE '" + Articulo + "'");
                while (rs.next()) {
                    Precio=(rs.getFloat("Precio"));
                    Presio=Precio.toString();
                    this.Subtitulo1.setText(rs.getString(this.Titulo1.getText()));
                    this.PrecioArticulo.setText("$"+Presio);
                    Precio=Precio+99;
                    Presio=Precio.toString();
                    this.TOTAL.setText("$"+Presio);
                    this.Subtitulo2.setText(rs.getString(this.Titulo2.getText()));
                    this.Subtitulo3.setText(rs.getString(this.Titulo3.getText()));
                }
                cn.con.close();
            } catch (Exception e) {
            }
        }
        if(Departamento.equals("Smartphones")||Departamento.equals("smartphones")){
            this.Titulo1.setText("RAM");
            this.Titulo2.setText("ROM");
            this.Titulo3.setText("Stock");
            Articulo = this.SeleccArticulo.getSelectedItem().toString();
            Conectar cn = new Conectar();
            Statement st;
            ResultSet rs;
            try {
                st = (Statement) cn.con.createStatement();
                rs = st.executeQuery("SELECT * FROM `" + Departamento + "` WHERE `Nombre` LIKE '" + Articulo + "'");
                while (rs.next()) {
                    Precio=(rs.getFloat("Precio"));
                    Presio=Precio.toString();
                    this.Subtitulo1.setText(rs.getString(this.Titulo1.getText()));
                    this.PrecioArticulo.setText("$"+Presio);
                    Precio=Precio+99;
                    Presio=Precio.toString();
                    this.TOTAL.setText("$"+Presio);
                    this.Subtitulo2.setText(rs.getString(this.Titulo2.getText()));
                    this.Subtitulo3.setText(rs.getString(this.Titulo3.getText()));
                }
                cn.con.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Borrar borrar=new Borrar();
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Actualizar actualizar=new Actualizar();
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        AreYouSure areyousure=new AreYouSure();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AgregarNuevo agregarnuevo=new AgregarNuevo();
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PrecioArticulo;
    private javax.swing.JComboBox<String> SeleccArticulo;
    private javax.swing.JComboBox<String> SeleccDepartamento;
    private javax.swing.JComboBox<String> SeleccMarca;
    private javax.swing.JLabel Subtitulo1;
    private javax.swing.JLabel Subtitulo2;
    private javax.swing.JLabel Subtitulo3;
    private javax.swing.JLabel TOTAL;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel Titulo3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
