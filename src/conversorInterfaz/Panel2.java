package conversorInterfaz;
// Temperatura

import javax.swing.JOptionPane;

public class Panel2 extends javax.swing.JPanel {

    public Panel2() {
        initComponents();
        campo2.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new javax.swing.JPanel();
        cbxTemp = new javax.swing.JComboBox<>();
        campo2 = new javax.swing.JTextField();
        txtIgual = new javax.swing.JLabel();
        campo1 = new javax.swing.JTextField();
        btnTemp = new javax.swing.JButton();

        panel2.setBackground(new java.awt.Color(9, 33, 133));
        panel2.setEnabled(false);

        cbxTemp.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        cbxTemp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Convertir de Celsius (°C) a Fahrenheith (°F)", "Convertir de Celsius (°C) a Kelvin (K)", "Convertir de Fahrenheith (°F) a Celsius (°C)", "Convertir de Fahrenheith (°C) a Kelvin (K)", "Kelvin (K) a Celsius (°C)", "Kelvin (K) a Fahrenheith (°F)" }));
        cbxTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTempActionPerformed(evt);
            }
        });

        campo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtIgual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtIgual.setForeground(new java.awt.Color(255, 255, 255));
        txtIgual.setText("->");

        campo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campo1.setText("1");

        btnTemp.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnTemp.setText("Convertir");
        btnTemp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTempActionPerformed(evt);
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
                        .addComponent(btnTemp))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(campo1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIgual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo2)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void cbxTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTempActionPerformed

    }//GEN-LAST:event_cbxTempActionPerformed

    private void btnTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTempActionPerformed
        if (!campo1.getText().trim().matches("[0-9]*")) {
            JOptionPane.showMessageDialog(null, "Solo se permiten numeros");
        } else if (campo1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un valor");
        } else {
            double temp = Double.parseDouble(campo1.getText());
            double fahr, kelvin, celsius;

            switch (cbxTemp.getSelectedItem().toString()) {
                case "Convertir de Celsius (°C) a Fahrenheith (°F)":
                    fahr = (temp * 1.8) + 32;
                    campo2.setText(String.valueOf(String.format("%.2f", fahr)));
                    break;
                case "Convertir de Celsius (°C) a Kelvin (K)":
                    kelvin = temp + 273.15;
                    campo2.setText(String.valueOf(String.format("%.2f", kelvin)));
                    break;
                case "Convertir de Fahrenheith (°F) a Celsius (°C)":
                    celsius = (temp - 32) / 1.8;
                    campo2.setText(String.valueOf(String.format("%.2f", celsius)));
                    break;
                case "Convertir de Fahrenheith (°C) a Kelvin (K)":
                    kelvin = 273.15 + ((temp - 32) * 5 / 9);
                    campo2.setText(String.valueOf(String.format("%.2f", kelvin)));
                    break;
                case "Kelvin (K) a Celsius (°C)":
                    celsius = temp - 273.15;
                    campo2.setText(String.valueOf(String.format("%.2f", celsius)));
                    break;
                case "Kelvin (K) a Fahrenheith (°F)":
                    fahr = (temp - 273.15) * 9 / 5 + 32;
                    campo2.setText(String.valueOf(String.format("%.2f", fahr)));
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }//GEN-LAST:event_btnTempActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTemp;
    private javax.swing.JTextField campo1;
    private javax.swing.JTextField campo2;
    private javax.swing.JComboBox<String> cbxTemp;
    private javax.swing.JPanel panel2;
    private javax.swing.JLabel txtIgual;
    // End of variables declaration//GEN-END:variables
}
