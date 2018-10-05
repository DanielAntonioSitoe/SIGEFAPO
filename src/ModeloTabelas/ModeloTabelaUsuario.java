/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloTabelas;

import ModeloClasses.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author danny
 * Modelo de Tabela de clientes
 */
public class ModeloTabelaUsuario extends AbstractTableModel {
    private List<Usuario> dados = new ArrayList<>();
    private String[]colunas = {"Codigo","NomeCompleto","NomeUsuario","Senha","Tipo","HoraEntrada","Operacao","HoraSaida"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
     @Override
    public int getRowCount() {
       return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
       switch(coluna){
           case 0 : return dados.get(linha).getCodigo();
           case 1 : return dados.get(linha).getNomeCompleto();
           case 2 : return dados.get(linha).getNomeUsuario();
           case 3 : return dados.get(linha).getSenha();
           case 4 : return dados.get(linha).getTipo();
           case 5 : return dados.get(linha).getHoraEntrada();
           case 6 : return dados.get(linha).getOperacao();
           case 7 : return dados.get(linha).getHoraSaida();
       }return null;
    }
    
    public void addrow(Usuario p){
        this.dados.add(p);
        this.fireTableDataChanged();
    }
    
    
}
