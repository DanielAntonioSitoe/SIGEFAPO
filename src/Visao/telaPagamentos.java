/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

/**
 *
 * @author danny
 */
public class telaPagamentos extends javax.swing.JFrame {

    /**
     * Creates new form telaClientes
     */
    public telaPagamentos() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBtSalvar = new javax.swing.JButton();
        jBtCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableServicosPagos = new javax.swing.JTable();
        jLblValorServico = new javax.swing.JLabel();
        jLblCodServico = new javax.swing.JLabel();
        jLblCodCliente = new javax.swing.JLabel();
        jTxtCodCliente = new javax.swing.JTextField();
        jTxtCodServico = new javax.swing.JTextField();
        jTxtValorServico = new javax.swing.JTextField();
        jLblconsumoServico = new javax.swing.JLabel();
        jTxtConsumoServico = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pagamentos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(850, 570));
        setPreferredSize(new java.awt.Dimension(850, 570));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Pagamentos de Servicos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 470, 60));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 60, 80));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 820, 110));

        jBtSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/entrar.png"))); // NOI18N
        jBtSalvar.setText("Salvar");
        jBtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 160, 60));

        jBtCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtCancelar.setText("Cancelar");
        getContentPane().add(jBtCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 160, 60));

        jTableServicosPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableServicosPagos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 820, 210));

        jLblValorServico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLblValorServico.setText("Valor:");
        getContentPane().add(jLblValorServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 110, 20));

        jLblCodServico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLblCodServico.setText("Cod Servico :");
        getContentPane().add(jLblCodServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 110, 20));

        jLblCodCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLblCodCliente.setText("Cod Cliente :");
        getContentPane().add(jLblCodCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 110, 20));
        getContentPane().add(jTxtCodCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 330, 30));

        jTxtCodServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodServicoActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtCodServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 330, 30));

        jTxtValorServico.setEditable(false);
        getContentPane().add(jTxtValorServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 330, 30));

        jLblconsumoServico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLblconsumoServico.setText("Consumo:");
        getContentPane().add(jLblconsumoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 110, -1));

        jTxtConsumoServico.setEditable(false);
        jTxtConsumoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtConsumoServicoActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtConsumoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 330, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtSalvarActionPerformed

    private void jTxtConsumoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtConsumoServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtConsumoServicoActionPerformed

    private void jTxtCodServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodServicoActionPerformed

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
            java.util.logging.Logger.getLogger(telaPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new telaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtCancelar;
    private javax.swing.JButton jBtSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLblCodCliente;
    private javax.swing.JLabel jLblCodServico;
    private javax.swing.JLabel jLblValorServico;
    private javax.swing.JLabel jLblconsumoServico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableServicosPagos;
    private javax.swing.JTextField jTxtCodCliente;
    private javax.swing.JTextField jTxtCodServico;
    private javax.swing.JTextField jTxtConsumoServico;
    private javax.swing.JTextField jTxtValorServico;
    // End of variables declaration//GEN-END:variables
}