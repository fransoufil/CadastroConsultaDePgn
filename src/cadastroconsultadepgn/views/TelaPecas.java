
package cadastroconsultadepgn.views;

public class TelaPecas extends javax.swing.JFrame {
    
    public TelaPecas() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPretas = new javax.swing.JButton();
        btnBrancas = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        lblSiglaResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PECAS");

        jPanel1.setBackground(new java.awt.Color(102, 255, 51));

        btnPretas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastroconsultadepgn/views/img/pecas/rei-preto.png"))); // NOI18N
        btnPretas.setText("PEÇAS PRETAS");
        btnPretas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPretas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPretas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretasActionPerformed(evt);
            }
        });

        btnBrancas.setBackground(new java.awt.Color(0, 0, 0));
        btnBrancas.setForeground(new java.awt.Color(255, 255, 255));
        btnBrancas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastroconsultadepgn/views/img/pecas/rei-branco.png"))); // NOI18N
        btnBrancas.setText("PEÇAS BRANCAS");
        btnBrancas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBrancas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBrancas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrancasActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(255, 0, 0));
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblResultado.setText("VITÓRIA");

        lblSiglaResultado.setText("v");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblResultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSiglaResultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBrancas, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnPretas, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPretas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrancas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultado)
                    .addComponent(lblSiglaResultado)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
        TelaResultado resultado = new TelaResultado();
        resultado.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnBrancasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrancasActionPerformed
        this.dispose();
//        TelaTipo telatipo = new TelaTipo();
//        telatipo.setVisible(true);
//
//        TelaTipo.lblResulado.setText(lblResultado.getText());
//        TelaTipo.lblPecas.setText("BRANCAS");
//        TelaTipo.lblSiglaResultado.setText(lblSiglaResultado.getText());
//        TelaTipo.lblSiglaPecas.setText("b");
    }//GEN-LAST:event_btnBrancasActionPerformed

    private void btnPretasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretasActionPerformed
        this.dispose();
//        TelaTipo telatipo = new TelaTipo();
//        telatipo.setVisible(true);
//
//        TelaTipo.lblResulado.setText(lblResultado.getText());
//        TelaTipo.lblPecas.setText("PRETAS");
//        TelaTipo.lblSiglaResultado.setText(lblSiglaResultado.getText());
//        TelaTipo.lblSiglaPecas.setText("");
    }//GEN-LAST:event_btnPretasActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrancas;
    private javax.swing.JButton btnPretas;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblResultado;
    public static javax.swing.JLabel lblSiglaResultado;
    // End of variables declaration//GEN-END:variables
}
