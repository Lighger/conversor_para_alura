package conversorInterfaz;
// Masa

import javax.swing.JOptionPane;

public class Panel4 extends javax.swing.JPanel {

    public Panel4() {
        initComponents();
        campo2.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new javax.swing.JPanel();
        cbxMasa = new javax.swing.JComboBox<>();
        campo2 = new javax.swing.JTextField();
        txtIgual = new javax.swing.JLabel();
        campo1 = new javax.swing.JTextField();
        btnMasa = new javax.swing.JButton();

        panel2.setBackground(new java.awt.Color(9, 33, 133));
        panel2.setEnabled(false);

        cbxMasa.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        cbxMasa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Convertir de Toneladas a Kilos", "Convertir de Toneladas a Libras", "Convertir de Toneladas a Gramos", "Convertir de Kilos a Toneladas", "Convertir de Kilos a Libras", "Convertir de Kilos a Gramos", "Convertir de Libras a Toneladas", "Convertir de Libras a Kilos", "Convertir de Libras a Gramos", "Convertir de Gramos a Kilos", "Convertir de Gramos a Libras", "Convertir de Gramos a Toneladas" }));
        cbxMasa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxMasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMasaActionPerformed(evt);
            }
        });

        campo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtIgual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtIgual.setForeground(new java.awt.Color(255, 255, 255));
        txtIgual.setText("->");

        campo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campo1.setText("1");

        btnMasa.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnMasa.setText("Convertir");
        btnMasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasaActionPerformed(evt);
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
                        .addComponent(btnMasa))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxMasa, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(campo1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIgual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxMasa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnMasa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void cbxMasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMasaActionPerformed

    }//GEN-LAST:event_cbxMasaActionPerformed

    private void btnMasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasaActionPerformed
        if (!campo1.getText().trim().matches("[0-9]*")) {
            JOptionPane.showMessageDialog(null, "Solo se permiten numeros");
        } else if (campo1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa una cantidad para convertir");
        } else {
            double cantidad = Double.parseDouble(campo1.getText());
            double ton = 1, kg = 1, lb = 1, gr = 1;

            switch (cbxMasa.getSelectedItem().toString()) {
                case "Convertir de Toneladas a Kilos" -> {
                    kg = cantidad * 1000;
                    campo2.setText(String.valueOf(String.format("%.2f", kg)));
                }
                case "Convertir de Toneladas a Libras" -> {
                    lb = cantidad * 2204.62;
                    campo2.setText(String.valueOf(String.format("%.2f", lb)));
                }
                case "Convertir de Toneladas a Gramos" -> {
                    gr = cantidad * 1000000;
                    campo2.setText(String.valueOf(String.format("%.2f", gr)));
                }
                case "Convertir de Kilos a Toneladas" -> {
                    ton = cantidad / 1000;
                    campo2.setText(String.valueOf(String.format("%.2f", ton)));
                }
                case "Convertir de Kilos a Libras" -> {
                    lb = cantidad * 2.204;
                    campo2.setText(String.valueOf(String.format("%.2f", lb)));
                }
                case "Convertir de Kilos a Gramos" -> {
                    gr = cantidad * 1000;
                    campo2.setText(String.valueOf(String.format("%.2f", gr)));
                }
                case "Convertir de Libras a Toneladas" -> {
                    ton = cantidad / 2205;
                    campo2.setText(String.valueOf(String.format("%.2f", ton)));
                }
                case "Convertir de Libras a Kilos" -> {
                    kg = cantidad / 2.205;
                    campo2.setText(String.valueOf(String.format("%.2f", kg)));
                }
                case "Convertir de Libras a Gramos" -> {
                    gr = cantidad * 453.6;
                    campo2.setText(String.valueOf(String.format("%.2f", gr)));
                }
                case "Convertir de Gramos a Kilos" -> {
                    kg = cantidad / 1000;
                    campo2.setText(String.valueOf(String.format("%.2f", kg)));
                }
                case "Convertir de Gramos a Libras" -> {
                    lb = cantidad / 453.6;
                    campo2.setText(String.valueOf(String.format("%.2f", lb)));
                }
                case "Convertir de Gramos a Toneladas" -> {
                    ton = cantidad / 1000000;
                    campo2.setText(String.valueOf(String.format("%.2f", ton)));
                }
                default ->
                    throw new AssertionError();
            }
        }


    }//GEN-LAST:event_btnMasaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMasa;
    private javax.swing.JTextField campo1;
    private javax.swing.JTextField campo2;
    private javax.swing.JComboBox<String> cbxMasa;
    private javax.swing.JPanel panel2;
    private javax.swing.JLabel txtIgual;
    // End of variables declaration//GEN-END:variables
}
