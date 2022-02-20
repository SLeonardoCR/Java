package Package;

import java.awt.Image;
import java.awt.Toolkit;

public class Interfaz extends javax.swing.JFrame {
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public float num1=0, num2=0;
    public String op; 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Potencia = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Factorial = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        TAN = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        Dividir = new javax.swing.JButton();
        Sumar = new javax.swing.JButton();
        Restar = new javax.swing.JButton();
        AC = new javax.swing.JButton();
        Multiplicar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Screen = new javax.swing.JLabel();
        SIN = new javax.swing.JButton();
        COS = new javax.swing.JButton();
        Raiz = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel2.setBackground(new java.awt.Color(128, 27, 151));

        jButton1.setBackground(new java.awt.Color(128, 27, 151));
        jButton1.setForeground(new java.awt.Color(232, 232, 232));
        jButton1.setText("4");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Potencia.setBackground(new java.awt.Color(128, 27, 151));
        Potencia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Potencia.setForeground(new java.awt.Color(232, 232, 232));
        Potencia.setText("^");
        Potencia.setBorder(null);
        Potencia.setContentAreaFilled(false);
        Potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotenciaActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(128, 27, 151));
        jButton3.setForeground(new java.awt.Color(232, 232, 232));
        jButton3.setText("7");
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(128, 27, 151));
        jButton4.setForeground(new java.awt.Color(232, 232, 232));
        jButton4.setText("0");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(128, 27, 151));
        jButton5.setForeground(new java.awt.Color(232, 232, 232));
        jButton5.setText("1");
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        Factorial.setBackground(new java.awt.Color(128, 27, 151));
        Factorial.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Factorial.setForeground(new java.awt.Color(232, 232, 232));
        Factorial.setText("!");
        Factorial.setBorder(null);
        Factorial.setContentAreaFilled(false);
        Factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FactorialActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(128, 27, 151));
        jButton7.setForeground(new java.awt.Color(232, 232, 232));
        jButton7.setText("8");
        jButton7.setBorder(null);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(128, 27, 151));
        jButton8.setForeground(new java.awt.Color(232, 232, 232));
        jButton8.setText("5");
        jButton8.setBorder(null);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(128, 27, 151));
        jButton9.setForeground(new java.awt.Color(232, 232, 232));
        jButton9.setText("2");
        jButton9.setBorder(null);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(128, 27, 151));
        jButton10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(232, 232, 232));
        jButton10.setText(".");
        jButton10.setBorder(null);
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        TAN.setBackground(new java.awt.Color(128, 27, 151));
        TAN.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TAN.setForeground(new java.awt.Color(232, 232, 232));
        TAN.setText("COS");
        TAN.setBorder(null);
        TAN.setContentAreaFilled(false);
        TAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TANActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(128, 27, 151));
        jButton12.setForeground(new java.awt.Color(232, 232, 232));
        jButton12.setText("9");
        jButton12.setBorder(null);
        jButton12.setContentAreaFilled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(128, 27, 151));
        jButton13.setForeground(new java.awt.Color(232, 232, 232));
        jButton13.setText("3");
        jButton13.setBorder(null);
        jButton13.setContentAreaFilled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(128, 27, 151));
        jButton14.setForeground(new java.awt.Color(232, 232, 232));
        jButton14.setText("6");
        jButton14.setBorder(null);
        jButton14.setContentAreaFilled(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        Igual.setBackground(new java.awt.Color(128, 27, 151));
        Igual.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Igual.setForeground(new java.awt.Color(232, 232, 232));
        Igual.setText("=");
        Igual.setBorder(null);
        Igual.setContentAreaFilled(false);
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });

        Dividir.setBackground(new java.awt.Color(128, 27, 151));
        Dividir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Dividir.setForeground(new java.awt.Color(232, 232, 232));
        Dividir.setText("÷");
        Dividir.setBorder(null);
        Dividir.setContentAreaFilled(false);
        Dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DividirActionPerformed(evt);
            }
        });

        Sumar.setBackground(new java.awt.Color(128, 27, 151));
        Sumar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Sumar.setForeground(new java.awt.Color(232, 232, 232));
        Sumar.setText("+");
        Sumar.setBorder(null);
        Sumar.setContentAreaFilled(false);
        Sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumarActionPerformed(evt);
            }
        });

        Restar.setBackground(new java.awt.Color(128, 27, 151));
        Restar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Restar.setForeground(new java.awt.Color(232, 232, 232));
        Restar.setText("-");
        Restar.setBorder(null);
        Restar.setContentAreaFilled(false);
        Restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarActionPerformed(evt);
            }
        });

        AC.setBackground(new java.awt.Color(128, 27, 151));
        AC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        AC.setForeground(new java.awt.Color(232, 232, 232));
        AC.setText("AC");
        AC.setBorder(null);
        AC.setContentAreaFilled(false);
        AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACActionPerformed(evt);
            }
        });

        Multiplicar.setBackground(new java.awt.Color(128, 27, 151));
        Multiplicar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Multiplicar.setForeground(new java.awt.Color(232, 232, 232));
        Multiplicar.setText("x");
        Multiplicar.setBorder(null);
        Multiplicar.setContentAreaFilled(false);
        Multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(167, 22, 230));

        Screen.setBackground(new java.awt.Color(167, 22, 230));
        Screen.setFont(new java.awt.Font("Franklin Gothic Book", 0, 24)); // NOI18N
        Screen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Screen.setAlignmentX(1.0F);
        Screen.setAlignmentY(1.0F);
        Screen.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Screen, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Screen, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        SIN.setBackground(new java.awt.Color(128, 27, 151));
        SIN.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SIN.setForeground(new java.awt.Color(232, 232, 232));
        SIN.setText("SIN");
        SIN.setBorder(null);
        SIN.setContentAreaFilled(false);
        SIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SINActionPerformed(evt);
            }
        });

        COS.setBackground(new java.awt.Color(128, 27, 151));
        COS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        COS.setForeground(new java.awt.Color(232, 232, 232));
        COS.setText("COS");
        COS.setBorder(null);
        COS.setContentAreaFilled(false);
        COS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COSActionPerformed(evt);
            }
        });

        Raiz.setBackground(new java.awt.Color(128, 27, 151));
        Raiz.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Raiz.setForeground(new java.awt.Color(232, 232, 232));
        Raiz.setText("√");
        Raiz.setToolTipText("");
        Raiz.setBorder(null);
        Raiz.setContentAreaFilled(false);
        Raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Sumar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Restar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(Raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SIN, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(COS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(Potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TAN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16))))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TAN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SIN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(COS, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Restar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sumar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        this.Screen.setText(this.Screen.getText()+"6");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        this.Screen.setText(this.Screen.getText()+"3");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        this.Screen.setText(this.Screen.getText()+"9");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(!(this.Screen.getText().contains("."))){
            this.Screen.setText(this.Screen.getText()+".");
    }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.Screen.setText(this.Screen.getText()+"2");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.Screen.setText(this.Screen.getText()+"5");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.Screen.setText(this.Screen.getText()+"8");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.Screen.setText(this.Screen.getText()+"1");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.Screen.setText(this.Screen.getText()+"0");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.Screen.setText(this.Screen.getText()+"7");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void PotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotenciaActionPerformed
        this.num1=Float.parseFloat(this.Screen.getText());
        this.op="^";
        this.Screen.setText("");
    }//GEN-LAST:event_PotenciaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.Screen.setText(this.Screen.getText()+"4");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACActionPerformed
        this.Screen.setText("");
    }//GEN-LAST:event_ACActionPerformed

    private void SumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumarActionPerformed
        this.num1=Float.parseFloat(this.Screen.getText());
        this.op="+";
        this.Screen.setText("");
    }//GEN-LAST:event_SumarActionPerformed

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
        this.num2=Float.parseFloat(this.Screen.getText());
        switch(this.op){
            case "+":
                this.Screen.setText(nocero(num1+num2));
                break;
            case "-":
                this.Screen.setText(nocero(num1-num2));
                break;
            case "/":
                if(num2==0){
                    this.Screen.setText("Indefinido");
                }else{
                this.Screen.setText(nocero(num1/num2));}
                break;
            case "X":
                this.Screen.setText(nocero(num1*num2));
                break;
            case "^":
                this.Screen.setText(nocero((float) Math.pow(num1, num2)));               
                break;
            case "sin":
                this.num1=Float.parseFloat(this.Screen.getText());
                num1=(float) Math.sin(num1);
                this.Screen.setText(nocero(num1));
                break;
            case "cos":
                this.num1=Float.parseFloat(this.Screen.getText());
                num1=(float) Math.cos(num1);
                this.Screen.setText(nocero(num1));
                break;
            case "tan":
                this.num1=Float.parseFloat(this.Screen.getText());
                num1=(float) Math.tan(num1);
                this.Screen.setText(nocero(num1));
                break;
            case "√":
                this.num1=Float.parseFloat(this.Screen.getText());
                num1=(float) Math.sqrt(num1);
                this.Screen.setText(nocero(num1));
                break;
            default:
                this.Screen.setText("No esta funcionando");
                break;
        }
    }//GEN-LAST:event_IgualActionPerformed

    private void RestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarActionPerformed
        this.num1=Float.parseFloat(this.Screen.getText());
        this.op="-";
        this.Screen.setText("");
    }//GEN-LAST:event_RestarActionPerformed

    private void MultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicarActionPerformed
        this.num1=Float.parseFloat(this.Screen.getText());
        this.op="X";
        this.Screen.setText("");
    }//GEN-LAST:event_MultiplicarActionPerformed

    private void DividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DividirActionPerformed
        this.num1=Float.parseFloat(this.Screen.getText());
        this.op="/";
        this.Screen.setText("");
    }//GEN-LAST:event_DividirActionPerformed

    private void FactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FactorialActionPerformed
        this.num1=Float.parseFloat(this.Screen.getText());
        int i=(int) num1;
        i=i-1;
        do{
            num1=num1*i;
            i--;
        }while(i>1);
        this.Screen.setText(nocero(num1));
    }//GEN-LAST:event_FactorialActionPerformed

    private void SINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SINActionPerformed
        if(this.Screen.getText().contains("")){
            op="sin";
        }else{
            this.num1=Float.parseFloat(this.Screen.getText());
            num1=(float) Math.sin(num1);
            this.Screen.setText(nocero(num1));
        }
    }//GEN-LAST:event_SINActionPerformed

    private void COSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COSActionPerformed
        if(this.Screen.getText().contains("")){
            op="cos";
        }else{
            this.num1=Float.parseFloat(this.Screen.getText());
            num1=(float) Math.cos(num1);
            this.Screen.setText(nocero(num1));
        }
    }//GEN-LAST:event_COSActionPerformed

    private void TANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TANActionPerformed
        if(this.Screen.getText().contains("")){
            op="tan";
        }else{
            this.num1=Float.parseFloat(this.Screen.getText());
            num1=(float) Math.tan(num1);
            this.Screen.setText(nocero(num1));
        }
    }//GEN-LAST:event_TANActionPerformed

    private void RaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaizActionPerformed
        if(this.Screen.getText().contains("")){
            op="√";
        }else{
            this.num1=Float.parseFloat(this.Screen.getText());
            num1=(float) Math.sqrt(num1);
            this.Screen.setText(nocero(num1));
        }
    }//GEN-LAST:event_RaizActionPerformed

    public String nocero(float resultado){
        String result;
        result=Float.toString(resultado);
        if(resultado%1==0){
            result=result.substring(0, result.length()-2);
        }
        return result;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Interfaz().setVisible(true);
        });
    }
    @Override
public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
        getImage(ClassLoader.getSystemResource("Resources/TF.png"));


   return retValue;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AC;
    private javax.swing.JButton COS;
    private javax.swing.JButton Dividir;
    private javax.swing.JButton Factorial;
    private javax.swing.JButton Igual;
    private javax.swing.JButton Multiplicar;
    private javax.swing.JButton Potencia;
    private javax.swing.JButton Raiz;
    private javax.swing.JButton Restar;
    private javax.swing.JButton SIN;
    private javax.swing.JLabel Screen;
    private javax.swing.JButton Sumar;
    private javax.swing.JButton TAN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
