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
public class Pagamentos {
    int codigoFactura;
    int codigoCliente;
    int codigoServico;
    int consumo;
    double valor;
    Date dataFactura;
    Date dataPagamento;
    boolean pago;

    public Pagamentos(int codigo, int codigoCliente, int codigoServico, int consumo, double valor, Date dataFactura, Date dataPagamento,boolean pago) {
        this.codigoFactura = codigo;
        this.codigoCliente = codigoCliente;
        this.codigoServico = codigoServico;
        this.consumo = consumo;
        this.valor = valor;
        this.dataFactura = dataFactura;
        this.dataPagamento = dataPagamento;
        this.pago = pago;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoServico() {
        return codigoServico;
    }

    public void setCodigoServico(int codigoServico) {
        this.codigoServico = codigoServico;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataFactura() {
        return dataFactura;
    }

    public void setDataFactura(Date dataFactura) {
        this.dataFactura = dataFactura;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
    
    
    
}
