package tfdatabase;

import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Borrar extends javax.swing.JFrame {

    public Borrar() {
        initComponents();
        this.setSize(500,330);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.setIconImage(getIconImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Aplicar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Titulo1 = new javax.swing.JLabel();
        Titulo2 = new javax.swing.JLabel();
        Titulo3 = new javax.swing.JLabel();
        Titulo4 = new javax.swing.JLabel();
        Titulo5 = new javax.swing.JLabel();
        Titulo6 = new javax.swing.JLabel();
        Subtitulo1 = new javax.swing.JLabel();
        Subtitulo2 = new javax.swing.JLabel();
        Subtitulo3 = new javax.swing.JLabel();
        Subtitulo4 = new javax.swing.JLabel();
        Subtitulo5 = new javax.swing.JLabel();
        Subtitulo6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(70, 70, 70));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 300));

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Seleccione Departamento a Editar");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "smartphones", "procesadores" }));

        jTextField1.setEnabled(false);

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Ingrese el Nombre EXACTO del Artículo a Borrar");

        Aplicar.setText("Aplicar");
        Aplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AplicarActionPerformed(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.setEnabled(false);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        Titulo1.setForeground(new java.awt.Color(153, 255, 204));
        Titulo1.setText("------");

        Titulo2.setForeground(new java.awt.Color(153, 255, 204));
        Titulo2.setText("------");

        Titulo3.setForeground(new java.awt.Color(153, 255, 204));
        Titulo3.setText("------");

        Titulo4.setForeground(new java.awt.Color(153, 255, 204));
        Titulo4.setText("------");

        Titulo5.setForeground(new java.awt.Color(153, 255, 204));
        Titulo5.setText("------");

        Titulo6.setForeground(new java.awt.Color(153, 255, 204));
        Titulo6.setText("------");

        Subtitulo1.setForeground(new java.awt.Color(204, 204, 204));
        Subtitulo1.setText("[]");

        Subtitulo2.setForeground(new java.awt.Color(204, 204, 204));
        Subtitulo2.setText("[]");

        Subtitulo3.setForeground(new java.awt.Color(204, 204, 204));
        Subtitulo3.setText("[]");

        Subtitulo4.setForeground(new java.awt.Color(204, 204, 204));
        Subtitulo4.setText("[]");

        Subtitulo5.setForeground(new java.awt.Color(204, 204, 204));
        Subtitulo5.setText("[]");

        Subtitulo6.setForeground(new java.awt.Color(204, 204, 204));
        Subtitulo6.setText("[]");

        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Borrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setLabel("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Titulo4)
                                    .addComponent(Subtitulo1)
                                    .addComponent(Subtitulo4))
                                .addGap(137, 137, 137)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Titulo5)
                                            .addComponent(Subtitulo2)
                                            .addComponent(Subtitulo5))
                                        .addGap(99, 99, 99)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Titulo6)
                                            .addComponent(Subtitulo3)
                                            .addComponent(Subtitulo6)
                                            .addComponent(Titulo3)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2)
                                        .addGap(20, 20, 20))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Titulo1)
                                .addGap(137, 137, 137)
                                .addComponent(Titulo2)
                                .addGap(36, 271, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Aplicar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(Buscar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Aplicar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo1)
                    .addComponent(Titulo2)
                    .addComponent(Titulo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Subtitulo1)
                    .addComponent(Subtitulo2)
                    .addComponent(Subtitulo3))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo4)
                    .addComponent(Titulo5)
                    .addComponent(Titulo6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Subtitulo4)
                    .addComponent(Subtitulo5)
                    .addComponent(Subtitulo6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String Departamento, Articulo;
    
    private void AplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AplicarActionPerformed
        if(this.jComboBox1.getSelectedItem().toString().equals("smartphones")||this.jComboBox1.getSelectedItem().toString().equals("procesadores")){
            this.Buscar.setEnabled(true);
            this.jTextField1.setEnabled(true);
            Departamento=this.jComboBox1.getSelectedItem().toString();
        }else{
            this.Buscar.setEnabled(false);
            this.jTextField1.setEnabled(false);
        }
    }//GEN-LAST:event_AplicarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        Articulo=this.jTextField1.getText();
        if(Departamento.equals("Procesadores")||Departamento.equals("procesadores")){
            this.Titulo1.setText("Marca");
            this.Titulo2.setText("Nombre");
            this.Titulo3.setText("Nucleos");
            this.Titulo4.setText("Frecuencia");
            this.Titulo5.setText("Precio");
            this.Titulo6.setText("Stock");
            Conectar cn = new Conectar();
            Statement st;
            ResultSet rs;
            try {
                st = (Statement) cn.con.createStatement();
                rs = st.executeQuery("SELECT * FROM `" + Departamento + "` WHERE `Nombre` LIKE '" + Articulo + "'");
                while (rs.next()) {
                    this.Subtitulo1.setText(rs.getString(this.Titulo1.getText()));
                    this.Subtitulo2.setText(rs.getString(this.Titulo2.getText()));
                    this.Subtitulo3.setText(rs.getString(this.Titulo3.getText()));
                    this.Subtitulo4.setText(rs.getString(this.Titulo4.getText()));
                    this.Subtitulo5.setText(rs.getString(this.Titulo5.getText()));
                    this.Subtitulo6.setText(rs.getString(this.Titulo6.getText()));
                }
                cn.con.close();
            } catch (Exception e) {
            }
        }
        if(Departamento.equals("Smartphones")||Departamento.equals("smartphones")){
            this.Titulo1.setText("Marca");
            this.Titulo2.setText("Nombre");
            this.Titulo3.setText("RAM");
            this.Titulo4.setText("ROM");
            this.Titulo5.setText("Precio");
            this.Titulo6.setText("Stock");
            Conectar cn = new Conectar();
            Statement st;
            ResultSet rs;
            try {
                st = (Statement) cn.con.createStatement();
                rs = st.executeQuery("SELECT * FROM `" + Departamento + "` WHERE `Nombre` LIKE '" + Articulo + "'");
                while (rs.next()) {
                    this.Subtitulo1.setText(rs.getString(this.Titulo1.getText()));
                    this.Subtitulo2.setText(rs.getString(this.Titulo2.getText()));
                    this.Subtitulo3.setText(rs.getString(this.Titulo3.getText()));
                    this.Subtitulo4.setText(rs.getString(this.Titulo4.getText()));
                    this.Subtitulo5.setText(rs.getString(this.Titulo5.getText()));
                    this.Subtitulo6.setText(rs.getString(this.Titulo6.getText()));
                }
                cn.con.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Articulo=this.jTextField1.getText();    
        Conectar cn = new Conectar();
            Statement st;
            ResultSet rs;
            try {
                st = (Statement) cn.con.createStatement();
                st.executeUpdate("DELETE FROM "+Departamento+" WHERE Nombre = '"+Articulo+"'");
                JOptionPane.showMessageDialog(null, Articulo+" ha sido borrado");
                cn.con.close();
            } catch (Exception e) {
            }
            this.jTextField1.setText("");
        this.Subtitulo1.setText("******");
        this.Subtitulo2.setText("******");
        this.Subtitulo3.setText("******");
        this.Subtitulo4.setText("******");
        this.Subtitulo5.setText("******");
        this.Subtitulo6.setText("******");
        this.Titulo1.setText("------");
        this.Titulo2.setText("------");
        this.Titulo3.setText("------");
        this.Titulo4.setText("------");
        this.Titulo5.setText("------");
        this.Titulo6.setText("------");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Menu menu=new Menu();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Borrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Borrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Borrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Borrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Borrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aplicar;
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel Subtitulo1;
    private javax.swing.JLabel Subtitulo2;
    private javax.swing.JLabel Subtitulo3;
    private javax.swing.JLabel Subtitulo4;
    private javax.swing.JLabel Subtitulo5;
    private javax.swing.JLabel Subtitulo6;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel Titulo3;
    private javax.swing.JLabel Titulo4;
    private javax.swing.JLabel Titulo5;
    private javax.swing.JLabel Titulo6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
