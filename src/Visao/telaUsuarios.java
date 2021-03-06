/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import ModeloPercistencia.PercistenciaUsuario;
import ModeloClasses.Usuario;
import ModeloConexao.conexao;
import ModeloTabelas.ModeloTabelaUsuario;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.util.Calendar;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author danny
 */
public class telaUsuarios extends javax.swing.JFrame {
    java.awt.event.ActionEvent evt;
    
      private static conexao mysql=new conexao();
    private static Connection cn=mysql.conectar();
    private static String sSql="";
    public Integer totalregistros;
    Usuario u;
   

    /**
     * Creates new form telaClientes
     */
    public telaUsuarios() {
        initComponents();
        jBtCancelarActionPerformed(evt);
        atualiza2();
    }
    
     public void atualiza2() {       
         ModeloTabelaUsuario tableModel = new ModeloTabelaUsuario();          
         jTable1.setModel(tableModel);    
         
         sSql="select cod,nomeCompleto,nomeUsuario,senha,tipo,horaEntrada,Operacao,horaSaida from tabelaUsuarios";
        try{ 
         Statement st = cn.createStatement();
         ResultSet rs = st.executeQuery(sSql);
         while(rs.next()){
             u.setCodigo(rs.getInt("cod"));
             u.setNomeCompleto(rs.getString("nomeCompleto"));
             u.setNomeUsuario(rs.getString("nomeUsuario"));
             u.setSenha(rs.getString("senha"));
             u.setTipo(rs.getString("tipo"));
             u.setHoraEntrada(rs.getString("horaEntrada"));
             u.setOperacao(rs.getString("Operacao"));
             u.setHoraSaida(rs.getString("horaSaida"));             
             totalregistros +=1;      
             tableModel.addrow(u);
             
         }        
        }
        catch(Exception erro){           
       JOptionPane.showMessageDialog(null," Erro de Leitura: "+erro/*.getMessage()*/);   
        }
    
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
        jBtInserir = new javax.swing.JButton();
        jBtExcluir = new javax.swing.JButton();
        jBtCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLbSenhaUsuario = new javax.swing.JLabel();
        jLbUserUsuario = new javax.swing.JLabel();
        jLbNomeUsuario = new javax.swing.JLabel();
        jTxtNomeCompleto = new javax.swing.JTextField();
        jTxtNomeUsuario = new javax.swing.JTextField();
        jLbTipoUsuario = new javax.swing.JLabel();
        jTxtSenhaUsuario = new javax.swing.JTextField();
        jComboTipoUsuario = new javax.swing.JComboBox<>();
        jBtSalvaImagem = new javax.swing.JButton();
        jBtUploadImagem = new javax.swing.JButton();
        jTxtImagen = new javax.swing.JTextField();
        jLbReceberaImagem = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadasro de Usuarios");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Cadastro de Usuarios");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 420, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 130, 80));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 820, 100));

        jBtSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente.png"))); // NOI18N
        jBtSalvar.setText("Salvar");
        jBtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 160, 60));

        jBtInserir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/businessapplication_edit_male_user_thepencil_theclient_negocio_2321.png"))); // NOI18N
        jBtInserir.setText("Inserir");
        jBtInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtInserirActionPerformed(evt);
            }
        });
        getContentPane().add(jBtInserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 160, 60));

        jBtExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        jBtExcluir.setText("Excluir");
        jBtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jBtExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 160, 60));

        jBtCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtCancelar.setText("Cancelar");
        jBtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 160, 60));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 590, 160));

        jLbSenhaUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbSenhaUsuario.setText("Senha :");
        getContentPane().add(jLbSenhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 110, 20));

        jLbUserUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbUserUsuario.setText("Usuario :");
        getContentPane().add(jLbUserUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 110, 20));

        jLbNomeUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbNomeUsuario.setText("Nome :");
        getContentPane().add(jLbNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 110, 20));
        getContentPane().add(jTxtNomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 240, 30));
        getContentPane().add(jTxtNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 240, 30));

        jLbTipoUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbTipoUsuario.setText("Tipo:");
        getContentPane().add(jLbTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 110, -1));
        getContentPane().add(jTxtSenhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 240, 30));

        jComboTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Padrao", "Administrador" }));
        getContentPane().add(jComboTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 240, 30));

        jBtSalvaImagem.setText("Salvar");
        getContentPane().add(jBtSalvaImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 160, 20));

        jBtUploadImagem.setText("Upload");
        getContentPane().add(jBtUploadImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 70, -1));

        jTxtImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtImagenActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 120, 20));
        getContentPane().add(jLbReceberaImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 200, 130));

        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Imagem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 250, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSalvarActionPerformed
        // TODO add your handling code here:
      
    PercistenciaUsuario.gravarDadosUsuario(recuperaDados());
//     ModeloTabelaUsuario tableModel = new ModeloTabelaUsuario();          
//         jTable1.setModel(tableModel);    
//         tableModel.addrow(recuperaDados());
    }//GEN-LAST:event_jBtSalvarActionPerformed

    private void jTxtImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtImagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtImagenActionPerformed

    private void jBtInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtInserirActionPerformed
        // TODO add your handling code here:
        PercistenciaUsuario.editarDadosUsuario(recuperaDados());
    }//GEN-LAST:event_jBtInserirActionPerformed

    private void jBtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCancelarActionPerformed
        // TODO add your handling code here:
        jTxtNomeCompleto.setText("");
        jTxtNomeUsuario.setText("");
        jTxtSenhaUsuario.setText("");
        jComboTipoUsuario.setSelectedIndex(0);
        
        jBtInserir.setEnabled(false);
        jBtExcluir.setEnabled(false);
        jBtSalvar.setEnabled(true);
    }//GEN-LAST:event_jBtCancelarActionPerformed

    private void jBtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtExcluirActionPerformed
        // TODO add your handling code here:
        PercistenciaUsuario.apagarDadosUsuario(recuperaDados());
    }//GEN-LAST:event_jBtExcluirActionPerformed

    
    Usuario recuperaDados(){
        try{
          int codigo = 0;
//          if(jBtInserir.isEnabled()){
//         codigo = (int) jTable1.getValueAt(jTable1.getSelectedRow(),0);
//        }
        String nomeCompleto = jTxtNomeCompleto.getText();
    String nomeUsuario = jTxtNomeUsuario.getText();
    String senha = jTxtSenhaUsuario.getText();
    String tipo = (String) jComboTipoUsuario.getSelectedItem();    
   Calendar dat = Calendar.getInstance(); 
    DateFormat f =DateFormat.getDateInstance();
    String horaEntrada = f.format(dat.getTime());
    String Operacao = "sdfs";
    String horaSaida = "32" ;
    
    Usuario u = new Usuario(codigo,nomeCompleto,nomeUsuario,senha,tipo,horaEntrada,Operacao,horaSaida);
            jBtCancelarActionPerformed(evt);
    return u;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Falha verifique os Dados!");
            return null;
        } 
        
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
            java.util.logging.Logger.getLogger(telaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new telaUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtCancelar;
    private javax.swing.JButton jBtExcluir;
    private javax.swing.JButton jBtInserir;
    private javax.swing.JButton jBtSalvaImagem;
    private javax.swing.JButton jBtSalvar;
    private javax.swing.JButton jBtUploadImagem;
    private javax.swing.JComboBox<String> jComboTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLbNomeUsuario;
    private javax.swing.JLabel jLbReceberaImagem;
    private javax.swing.JLabel jLbSenhaUsuario;
    private javax.swing.JLabel jLbTipoUsuario;
    private javax.swing.JLabel jLbUserUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtImagen;
    private javax.swing.JTextField jTxtNomeCompleto;
    private javax.swing.JTextField jTxtNomeUsuario;
    private javax.swing.JTextField jTxtSenhaUsuario;
    // End of variables declaration//GEN-END:variables
}
