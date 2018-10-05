/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloPercistencia;

import ModeloClasses.Usuario;
import ModeloConexao.conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;



/**
 *
 * @author danny
 */
public class PercistenciaUsuario {
      private static conexao mysql=new conexao();
    private static Connection cn=mysql.conectar();
    private static String sSql="";
    public Integer totalregistros;
    
    
   public static void gravarDadosUsuario(Usuario u){
         sSql = "insert into tabelaUsuarios(nomeCompleto,nomeUsuario,senha,tipo,horaEntrada,operacao,horaSaida)"+"values(?,?,?,?,?,?,?)";
    try{
       PreparedStatement pst=cn.prepareStatement(sSql);
       pst.setString(1, u.getNomeCompleto());
       pst.setString(2, u.getNomeUsuario());
       pst.setString(3, u.getSenha());
       pst.setString(4, u.getTipo());
       pst.setString(5, u.getHoraEntrada());
       pst.setString(6, u.getOperacao());
       pst.setString(7, u.getHoraSaida());
       int n= pst.executeUpdate();
       
       JOptionPane.showMessageDialog(null,"Gravado com Sucesso!");
       
     } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"Falha na Gravacao\n"+ e);
    
        }   

    }
   public static void editarDadosUsuario(Usuario u){
       sSql = "update tabelaUsuarios set nomeCompleto=?,nomeUsuario=?,senha=?,tipo=?,horaEntrada=?,operacao=?,horaSaida=?"+"where cod=?";
    try{
       PreparedStatement pst=cn.prepareStatement(sSql);
       pst.setString(1, u.getNomeCompleto());
       pst.setString(2, u.getNomeUsuario());
       pst.setString(3, u.getSenha());
       pst.setString(4, u.getTipo());
       pst.setString(5, u.getHoraEntrada());
       pst.setString(6, u.getOperacao());
       pst.setString(7, u.getHoraSaida());
       int n= pst.executeUpdate();
       
       JOptionPane.showMessageDialog(null,"Editado com Sucesso!");
       
     } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"Falha na Edicao\n"+ e);
    
        }   

    }
   public static void apagarDadosUsuario(Usuario u){

    }
    
   public static void tabelaUsuario(){

    }
    
}
