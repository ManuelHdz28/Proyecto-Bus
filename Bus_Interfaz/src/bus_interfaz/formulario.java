/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bus_interfaz;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author pc
 */
public class formulario extends javax.swing.JFrame {

    boolean color1 = true, color2 = true, color3 = true, color4 = true, color5 = true, color6 = true, color7 = true, color8 = true, color9 = true, color10 = true, color11 = true, color12 = true, color13 = true, color14 = true, color15 = true, color16 = true;
    
    double pago = 0, caja = 0;
    String asiento;
    
    /**
     * Creates new form formulario
     */
    public formulario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton9 = new javax.swing.JButton();
        agrupacion = new javax.swing.ButtonGroup();
        asiento2 = new javax.swing.JButton();
        asiento5 = new javax.swing.JButton();
        asiento1 = new javax.swing.JButton();
        asiento6 = new javax.swing.JButton();
        asiento4 = new javax.swing.JButton();
        asiento3 = new javax.swing.JButton();
        asiento7 = new javax.swing.JButton();
        asiento8 = new javax.swing.JButton();
        asiento9 = new javax.swing.JButton();
        asiento10 = new javax.swing.JButton();
        asiento12 = new javax.swing.JButton();
        asiento11 = new javax.swing.JButton();
        asiento13 = new javax.swing.JButton();
        asiento14 = new javax.swing.JButton();
        asiento15 = new javax.swing.JButton();
        asiento16 = new javax.swing.JButton();
        reservar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblMensajeTotalaPagar = new javax.swing.JLabel();
        tema = new javax.swing.JLabel();
        lblTotalPagar = new javax.swing.JLabel();
        lblCostoAsiento = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCaja = new javax.swing.JLabel();

        jButton9.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        asiento2.setBackground(new java.awt.Color(0, 102, 0));
        asiento2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        asiento2.setForeground(new java.awt.Color(255, 255, 255));
        asiento2.setText("02");
        agrupacion.add(asiento2);
        asiento2.setPreferredSize(new java.awt.Dimension(34, 10));
        asiento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento2ActionPerformed(evt);
            }
        });

        asiento5.setBackground(new java.awt.Color(0, 102, 0));
        asiento5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        asiento5.setForeground(new java.awt.Color(255, 255, 255));
        asiento5.setText("05");
        agrupacion.add(asiento5);
        asiento5.setPreferredSize(new java.awt.Dimension(34, 10));
        asiento5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento5ActionPerformed(evt);
            }
        });

        asiento1.setBackground(new java.awt.Color(0, 102, 0));
        asiento1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        asiento1.setForeground(new java.awt.Color(255, 255, 255));
        asiento1.setText("01");
        agrupacion.add(asiento1);
        asiento1.setPreferredSize(new java.awt.Dimension(34, 10));
        asiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento1ActionPerformed(evt);
            }
        });

        asiento6.setBackground(new java.awt.Color(0, 102, 0));
        asiento6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        asiento6.setForeground(new java.awt.Color(255, 255, 255));
        asiento6.setText("06");
        agrupacion.add(asiento6);
        asiento6.setPreferredSize(new java.awt.Dimension(34, 10));
        asiento6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento6ActionPerformed(evt);
            }
        });

        asiento4.setBackground(new java.awt.Color(0, 102, 0));
        asiento4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        asiento4.setForeground(new java.awt.Color(255, 255, 255));
        asiento4.setText("04");
        agrupacion.add(asiento4);
        asiento4.setPreferredSize(new java.awt.Dimension(34, 10));
        asiento4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento4ActionPerformed(evt);
            }
        });

        asiento3.setBackground(new java.awt.Color(0, 102, 0));
        asiento3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        asiento3.setForeground(new java.awt.Color(255, 255, 255));
        asiento3.setText("03");
        agrupacion.add(asiento3);
        asiento3.setPreferredSize(new java.awt.Dimension(34, 10));
        asiento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento3ActionPerformed(evt);
            }
        });

        asiento7.setBackground(new java.awt.Color(0, 102, 0));
        asiento7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        asiento7.setForeground(new java.awt.Color(255, 255, 255));
        asiento7.setText("07");
        agrupacion.add(asiento7);
        asiento7.setPreferredSize(new java.awt.Dimension(34, 10));
        asiento7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento7ActionPerformed(evt);
            }
        });

        asiento8.setBackground(new java.awt.Color(0, 102, 0));
        asiento8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        asiento8.setForeground(new java.awt.Color(255, 255, 255));
        asiento8.setText("08");
        agrupacion.add(asiento8);
        asiento8.setPreferredSize(new java.awt.Dimension(34, 10));
        asiento8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento8ActionPerformed(evt);
            }
        });

        asiento9.setBackground(new java.awt.Color(0, 102, 0));
        asiento9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        asiento9.setForeground(new java.awt.Color(255, 255, 255));
        asiento9.setText("09");
        agrupacion.add(asiento9);
        asiento9.setPreferredSize(new java.awt.Dimension(34, 10));
        asiento9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento9ActionPerformed(evt);
            }
        });

        asiento10.setBackground(new java.awt.Color(0, 102, 0));
        asiento10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        asiento10.setForeground(new java.awt.Color(255, 255, 255));
        asiento10.setText("10");
        agrupacion.add(asiento10);
        asiento10.setPreferredSize(new java.awt.Dimension(34, 10));
        asiento10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento10ActionPerformed(evt);
            }
        });

        asiento12.setBackground(new java.awt.Color(0, 102, 0));
        asiento12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        asiento12.setForeground(new java.awt.Color(255, 255, 255));
        asiento12.setText("12");
        agrupacion.add(asiento12);
        asiento12.setPreferredSize(new java.awt.Dimension(34, 10));
        asiento12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento12ActionPerformed(evt);
            }
        });

        asiento11.setBackground(new java.awt.Color(0, 102, 0));
        asiento11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        asiento11.setForeground(new java.awt.Color(255, 255, 255));
        asiento11.setText("11");
        agrupacion.add(asiento11);
        asiento11.setPreferredSize(new java.awt.Dimension(34, 10));
        asiento11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento11ActionPerformed(evt);
            }
        });

        asiento13.setBackground(new java.awt.Color(0, 102, 0));
        asiento13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        asiento13.setForeground(new java.awt.Color(255, 255, 255));
        asiento13.setText("13");
        agrupacion.add(asiento13);
        asiento13.setPreferredSize(new java.awt.Dimension(34, 10));
        asiento13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento13ActionPerformed(evt);
            }
        });

        asiento14.setBackground(new java.awt.Color(0, 102, 0));
        asiento14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        asiento14.setForeground(new java.awt.Color(255, 255, 255));
        asiento14.setText("14");
        agrupacion.add(asiento14);
        asiento14.setPreferredSize(new java.awt.Dimension(34, 10));
        asiento14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento14ActionPerformed(evt);
            }
        });

        asiento15.setBackground(new java.awt.Color(0, 102, 0));
        asiento15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        asiento15.setForeground(new java.awt.Color(255, 255, 255));
        asiento15.setText("15");
        agrupacion.add(asiento15);
        asiento15.setPreferredSize(new java.awt.Dimension(34, 10));
        asiento15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento15ActionPerformed(evt);
            }
        });

        asiento16.setBackground(new java.awt.Color(0, 102, 0));
        asiento16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        asiento16.setForeground(new java.awt.Color(255, 255, 255));
        asiento16.setText("16");
        agrupacion.add(asiento16);
        asiento16.setPreferredSize(new java.awt.Dimension(34, 10));
        asiento16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento16ActionPerformed(evt);
            }
        });

        reservar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        reservar.setText("RESERVAR");
        reservar.setMaximumSize(new java.awt.Dimension(80, 25));
        reservar.setMinimumSize(new java.awt.Dimension(80, 25));
        reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("HISTORIAL DE RESERVACIONES:");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        lblMensajeTotalaPagar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMensajeTotalaPagar.setText("TOTAL A PAGAR:");

        tema.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tema.setText("RESERVACIONES DE BUS");

        lblTotalPagar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTotalPagar.setText("$0.0");

        lblCostoAsiento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCostoAsiento.setText("COSTO DE ASIENTO: $1.0");

        jLabel2.setText("Total de Caja:");

        lblCaja.setText("$0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(asiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(asiento5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(asiento9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(asiento13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(asiento6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(asiento10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(asiento2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(asiento14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(asiento7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(asiento11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(asiento15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(asiento8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(asiento16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(asiento12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(asiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(asiento4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(reservar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMensajeTotalaPagar)
                                .addGap(26, 26, 26)
                                .addComponent(lblTotalPagar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(lblCostoAsiento)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCaja)
                                .addGap(8, 8, 8)))
                        .addGap(31, 31, 31))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tema)
                .addGap(241, 241, 241))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tema)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(asiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(asiento5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(asiento9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(asiento13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(asiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(asiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(asiento4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(asiento6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(asiento7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(asiento8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(asiento10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(asiento11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(asiento12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(asiento14, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(asiento15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(asiento16, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblCostoAsiento)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMensajeTotalaPagar)
                            .addComponent(lblTotalPagar))
                        .addGap(26, 26, 26)
                        .addComponent(reservar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblCaja))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void asiento7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento7ActionPerformed
       asiento = asiento + asiento1.getText() + " ";
        if(color7 == true){
           pago = pago + 1;
            asiento7.setBackground(Color.red);
            asiento7.setForeground(Color.white);
            color7 = false;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }else{
            pago = pago - 1;
            asiento7.setBackground(new java.awt.Color(0,102,0));
            asiento7.setForeground(Color.white);
            color7 = true;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }
    }//GEN-LAST:event_asiento7ActionPerformed

    private void asiento11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento11ActionPerformed
        asiento = asiento + asiento1.getText() + " ";
        
       if(color11 == true){
           pago = pago + 1;
            asiento11.setBackground(Color.red);
            asiento11.setForeground(Color.white);
            color11 = false;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }else{
            pago = pago - 1;
            asiento11.setBackground(new java.awt.Color(0,102,0));
            asiento11.setForeground(Color.white);
            color11 = true;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }

    }//GEN-LAST:event_asiento11ActionPerformed

    private void asiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento1ActionPerformed
      
        asiento = asiento + asiento1.getText() + " ";
        
       if(color1 == true){
           pago = pago + 1;
            asiento1.setBackground(Color.red);
            asiento1.setForeground(Color.white);
            color1 = false;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }else{
            pago = pago - 1;
            asiento1.setBackground(new java.awt.Color(0,102,0));
            asiento1.setForeground(Color.white);
            color1 = true;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }

    }//GEN-LAST:event_asiento1ActionPerformed

    private void reservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservarActionPerformed
        caja = caja + pago;
        lblCaja.setText(String.valueOf("$" + caja));
        
        if(color1 == false){
            asiento1.setEnabled(false);
        }
        
        if(color2 == false){
            asiento2.setEnabled(false);
        }
        
        if(color3 == false){
            asiento3.setEnabled(false);
        }
        
        if(color4 == false){
            asiento4.setEnabled(false);
        }
        if(color5 == false){
            asiento5.setEnabled(false);
        }
        
        if(color6 == false){
            asiento6.setEnabled(false);
        }
        
        if(color7 == false){
            asiento7.setEnabled(false);
        }
        pago = 0;
        lblTotalPagar.setText("$0.0");
    }//GEN-LAST:event_reservarActionPerformed

    private void asiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento2ActionPerformed
       
        asiento = asiento + asiento1.getText() + " ";
        
       if(color2 == true){
           pago = pago + 1;
            asiento2.setBackground(Color.red);
            asiento2.setForeground(Color.white);
            color2 = false;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }else{
            pago = pago - 1;
            asiento2.setBackground(new java.awt.Color(0,102,0));
            asiento2.setForeground(Color.white);
            color2 = true;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }
    }//GEN-LAST:event_asiento2ActionPerformed

    private void asiento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento3ActionPerformed
         asiento = asiento + asiento1.getText() + " ";
        
       if(color3 == true){
           pago = pago + 1;
            asiento3.setBackground(Color.red);
            asiento3.setForeground(Color.white);
            color3 = false;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }else{
            pago = pago - 1;
            asiento3.setBackground(new java.awt.Color(0,102,0));
            asiento3.setForeground(Color.white);
            color3 = true;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }
    }//GEN-LAST:event_asiento3ActionPerformed

    private void asiento4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento4ActionPerformed
         asiento = asiento + asiento1.getText() + " ";
        
       if(color4 == true){
           pago = pago + 1;
            asiento4.setBackground(Color.red);
            asiento4.setForeground(Color.white);
            color4 = false;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }else{
            pago = pago - 1;
            asiento4.setBackground(new java.awt.Color(0,102,0));
            asiento4.setForeground(Color.white);
            color4 = true;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }
    }//GEN-LAST:event_asiento4ActionPerformed

    private void asiento5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento5ActionPerformed
         asiento = asiento + asiento1.getText() + " ";
        
       if(color5 == true){
           pago = pago + 1;
            asiento5.setBackground(Color.red);
            asiento5.setForeground(Color.white);
            color5 = false;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }else{
            pago = pago - 1;
            asiento5.setBackground(new java.awt.Color(0,102,0));
            asiento5.setForeground(Color.white);
            color5 = true;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }
    }//GEN-LAST:event_asiento5ActionPerformed

    private void asiento6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento6ActionPerformed
         asiento = asiento + asiento1.getText() + " ";
        
       if(color6 == true){
           pago = pago + 1;
            asiento6.setBackground(Color.red);
            asiento6.setForeground(Color.white);
            color6 = false;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }else{
            pago = pago - 1;
            asiento6.setBackground(new java.awt.Color(0,102,0));
            asiento6.setForeground(Color.white);
            color6 = true;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }
    }//GEN-LAST:event_asiento6ActionPerformed

    private void asiento8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento8ActionPerformed
        asiento = asiento + asiento1.getText() + " ";
        
        if(color8 == true){
           pago = pago + 1;
            asiento8.setBackground(Color.red);
            asiento8.setForeground(Color.white);
            color8 = false;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }else{
            pago = pago - 1;
            asiento8.setBackground(new java.awt.Color(0,102,0));
            asiento8.setForeground(Color.white);
            color8 = true;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }
    }//GEN-LAST:event_asiento8ActionPerformed

    private void asiento9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento9ActionPerformed
        
        asiento = asiento + asiento1.getText() + " ";
        if(color9 == true){
           pago = pago + 1;
            asiento9.setBackground(Color.red);
            asiento9.setForeground(Color.white);
            color9 = false;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }else{
            pago = pago - 1;
            asiento9.setBackground(new java.awt.Color(0,102,0));
            asiento9.setForeground(Color.white);
            color9 = true;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }
    }//GEN-LAST:event_asiento9ActionPerformed

    private void asiento10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento10ActionPerformed
        asiento = asiento + asiento1.getText() + " ";
        
        if(color10 == true){
           pago = pago + 1;
            asiento10.setBackground(Color.red);
            asiento10.setForeground(Color.white);
            color10 = false;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }else{
            pago = pago - 1;
            asiento10.setBackground(new java.awt.Color(0,102,0));
            asiento10.setForeground(Color.white);
            color10 = true;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }
    }//GEN-LAST:event_asiento10ActionPerformed

    private void asiento12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento12ActionPerformed
         asiento = asiento + asiento1.getText() + " ";
        
       if(color12 == true){
           pago = pago + 1;
            asiento12.setBackground(Color.red);
            asiento12.setForeground(Color.white);
            color12 = false;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }else{
            pago = pago - 1;
            asiento12.setBackground(new java.awt.Color(0,102,0));
            asiento12.setForeground(Color.white);
            color12 = true;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }
    }//GEN-LAST:event_asiento12ActionPerformed

    private void asiento13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento13ActionPerformed
        asiento = asiento + asiento1.getText() + " ";
        
       if(color13 == true){
           pago = pago + 1;
            asiento13.setBackground(Color.red);
            asiento13.setForeground(Color.white);
            color13 = false;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }else{
            pago = pago - 1;
            asiento13.setBackground(new java.awt.Color(0,102,0));
            asiento13.setForeground(Color.white);
            color13 = true;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }
    }//GEN-LAST:event_asiento13ActionPerformed

    private void asiento14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento14ActionPerformed
         asiento = asiento + asiento1.getText() + " ";
        
       if(color14 == true){
           pago = pago + 1;
            asiento14.setBackground(Color.red);
            asiento14.setForeground(Color.white);
            color14 = false;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }else{
            pago = pago - 1;
            asiento14.setBackground(new java.awt.Color(0,102,0));
            asiento14.setForeground(Color.white);
            color14 = true;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }
    }//GEN-LAST:event_asiento14ActionPerformed

    private void asiento15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento15ActionPerformed
         asiento = asiento + asiento1.getText() + " ";
        
       if(color15 == true){
           pago = pago + 1;
            asiento15.setBackground(Color.red);
            asiento15.setForeground(Color.white);
            color15 = false;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }else{
            pago = pago - 1;
            asiento15.setBackground(new java.awt.Color(0,102,0));
            asiento15.setForeground(Color.white);
            color15 = true;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }
    }//GEN-LAST:event_asiento15ActionPerformed

    private void asiento16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento16ActionPerformed
        asiento = asiento + asiento1.getText() + " ";
        
       if(color16 == true){
           pago = pago + 1;
            asiento16.setBackground(Color.red);
            asiento16.setForeground(Color.white);
            color16 = false;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }else{
            pago = pago - 1;
            asiento16.setBackground(new java.awt.Color(0,102,0));
            asiento16.setForeground(Color.white);
            color16 = true;
            lblTotalPagar.setText(String.valueOf("$"+pago));
       }
    }//GEN-LAST:event_asiento16ActionPerformed
    private void CambiarColor (){
         
    }
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
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup agrupacion;
    private javax.swing.JButton asiento1;
    private javax.swing.JButton asiento10;
    private javax.swing.JButton asiento11;
    private javax.swing.JButton asiento12;
    private javax.swing.JButton asiento13;
    private javax.swing.JButton asiento14;
    private javax.swing.JButton asiento15;
    private javax.swing.JButton asiento16;
    private javax.swing.JButton asiento2;
    private javax.swing.JButton asiento3;
    private javax.swing.JButton asiento4;
    private javax.swing.JButton asiento5;
    private javax.swing.JButton asiento6;
    private javax.swing.JButton asiento7;
    private javax.swing.JButton asiento8;
    private javax.swing.JButton asiento9;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCaja;
    private javax.swing.JLabel lblCostoAsiento;
    private javax.swing.JLabel lblMensajeTotalaPagar;
    private javax.swing.JLabel lblTotalPagar;
    private javax.swing.JButton reservar;
    private javax.swing.JLabel tema;
    // End of variables declaration//GEN-END:variables
}
