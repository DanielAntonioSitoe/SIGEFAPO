/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloClasses;

import java.util.Date;

/**
 *
 * @author danny
 */
public class Usuario {
    int codigo;
    String nomeCompleto;
    String nomeUsuario;
    String senha;
    String tipo;
    String horaEntrada;
    String Operacao;
    String horaSaida;

    public Usuario(int codigo,String nomeCompleto, String nomeUsuario, String senha, String tipo, String horaEntrada, String Operacao, String horaSaida) {
        this.codigo = codigo;
        this.nomeCompleto = nomeCompleto;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.tipo = tipo;
        this.horaEntrada = horaEntrada;
        this.Operacao = Operacao;
        this.horaSaida = horaSaida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;       
    }

    public String getOperacao() {
        return Operacao;
    }

    public void setOperacao(String Operacao) {
        this.Operacao = Operacao;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }
    
    
    
}
