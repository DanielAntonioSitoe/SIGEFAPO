/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloClasses;

/**
 *
 * @author danny
 */
public class Clientes {
    int codigo;
    String nome;
    String sexo;
    int nrBi;
    int contacto;
    String bairro;
    int quarteirao;
    int casa;

    public Clientes(int codigo,String nome, String sexo, int nrBi, int contacto, String bairro, int quarteirao, int casa) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.nrBi = nrBi;
        this.contacto = contacto;
        this.bairro = bairro;
        this.quarteirao = quarteirao;
        this.casa = casa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String setSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNrBi() {
        return nrBi;
    }

    public void setNrBi(int nrBi) {
        this.nrBi = nrBi;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getQuarteirao() {
        return quarteirao;
    }

    public void setQuarteirao(int quarteirao) {
        this.quarteirao = quarteirao;
    }

    public int getCasa() {
        return casa;
    }

    public void setCasa(int casa) {
        this.casa = casa;
    }
    
    
    
    
    
}
