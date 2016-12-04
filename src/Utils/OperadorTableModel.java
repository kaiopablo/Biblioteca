/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import VO.Associado;
import VO.Operador;
import VO.ValueObject;
import java.util.ArrayList;

/**
 *
 * @author Luan
 */
public class OperadorTableModel extends CTableModel{
    
    /**
     * Retorna quantidade de colunas da tabela.
     * @return int
     */
    @Override
    public int getColumnCount() {
        return 2;
    }
    
    /**
     * Fixa o nome da coluna na tabela.
     * @param col
     * @return String contendo o nome da coluna.
     */
    @Override
    public String getColumnName(int col) {
      switch(col)
      {
          case 0:
              return "Codigo";
          case 1:
              return "Login";
          default:
              return "";
      }
    }

    /**
     * Retorna valor da celula da tabela.
     * @param rowIndex linha
     * @param columnIndex coluna
     * @return Object contendo o dado.
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex >= 2)return null;
        ArrayList<ValueObject> tabela = this.getDados();
        if(rowIndex >= tabela.size())return null;
        Operador ass = (Operador)tabela.get(rowIndex);
        switch(columnIndex)
        {
            case 0:
                return ass.getId();
            case 1:
                return ass.getLogin();
        }
        return null;
    }
}
    