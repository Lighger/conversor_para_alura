package conversorInterfaz;
// Longitudes

import javax.swing.JOptionPane;

public class Panel3 extends javax.swing.JPanel {

    public Panel3() {
        initComponents();
        campo2.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new javax.swing.JPanel();
        cbxVel = new javax.swing.JComboBox<>();
        campo2 = new javax.swing.JTextField();
        txtIgual = new javax.swing.JLabel();
        campo1 = new javax.swing.JTextField();
        btnVel = new javax.swing.JButton();

        panel2.setBackground(new java.awt.Color(9, 33, 133));
        panel2.setEnabled(false);

        cbxVel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        cbxVel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Convertir (MPH) a (Km/h)", "Convertir (MPH) a (m/s)", "Convertir (Km/h) a (MPH)", "Convertir (Km/h) a (m/s)", "Convertir (m/s) a (Km/h)", "Convertir (m/s) a (MPH)", " " }));
        cbxVel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxVel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxVelActionPerformed(evt);
            }
        });

        campo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtIgual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtIgual.setForeground(new java.awt.Color(255, 255, 255));
        txtIgual.setText("->");

        campo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campo1.setText("1");

        btnVel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnVel.setText("Convertir");
        btnVel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btnVel))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxVel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(campo1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIgual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxVel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnVel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxVelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxVelActionPerformed

    }//GEN-LAST:event_cbxVelActionPerformed

    private void btnVelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVelActionPerformed
        if (!campo1.getText().trim().matches("[0-9]*")) {
            JOptionPane.showMessageDialog(null, "Solo se permiten numeros");
        } else if (campo1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa el valor de velocidad a convertir");
        } else {
            double velocidad = Double.parseDouble(campo1.getText());
            double kmh, ms, mph;

            switch (cbxVel.getSelectedItem().toString()) {
                case "Convertir (MPH) a (Km/h)" -> {
                    kmh = velocidad * 1.609;
                    campo2.setText(String.valueOf(String.format("%.2f", kmh)));
                }
                case "Convertir (MPH) a (m/s)" -> {
                    ms = velocidad / 2.237;
                    campo2.setText(String.valueOf(String.format("%.2f", ms)));
                }
                case "Convertir (Km/h) a (MPH)" -> {
                    mph = velocidad / 1.609;
                    campo2.setText(String.valueOf(String.format("%.2f", mph)));
                }
                case "Convertir (Km/h) a (m/s)" -> {
                    ms = velocidad * 5 / 18;
                    campo2.setText(String.valueOf(String.format("%.2f", ms)));
                }
                case "Convertir (m/s) a (Km/h)" -> {
                    kmh = velocidad * 18 / 5;
                    campo2.setText(String.valueOf(String.format("%.2f", kmh)));
                }
                case "Convertir (m/s) a (MPH)" -> {
                    mph = velocidad * 2.237;
                    campo2.setText(String.valueOf(String.format("%.2f", mph)));
                }
                default ->
                    throw new AssertionError();
            }
        }
    }//GEN-LAST:event_btnVelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVel;
    private javax.swing.JTextField campo1;
    private javax.swing.JTextField campo2;
    private javax.swing.JComboBox<String> cbxVel;
    private javax.swing.JPanel panel2;
    private javax.swing.JLabel txtIgual;
    // End of variables declaration//GEN-END:variables
}
