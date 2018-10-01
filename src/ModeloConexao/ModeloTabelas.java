/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloConexao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author danny
 * Modelo de Tabela de clientes
 */
public class ModeloTabelas extends AbstractTableModel {
    private List<Object> dados = new ArrayList<>();
    private String[]colunas = {"Numero_Conta","tipo"};

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
//           case 0 : return dados.get(linha).getNumeroConta();
//           case 1 : return dados.get(linha).getCliente();
//           case 2 : return dados.get(linha).getSaldo();
//           case 3 : return dados.get(linha).getTipo();
       }return null;
    }
    
    public void addrow(Object p){
        this.dados.add(p);
        this.fireTableDataChanged();
    }
    
    
}
