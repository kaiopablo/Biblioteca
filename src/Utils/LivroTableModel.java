/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import VO.Emprestimo;
import VO.Livro;
import VO.ValueObject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Luan
 */
public class LivroTableModel extends CTableModel{
    
    /**
     * Retorna quantidade de colunas da tabela.
     * @return int
     */
    @Override
    public int getColumnCount() {
        return 4;
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
              return "Código";
          case 1:
              return "ISBN";
          case 2:
              return "Título";
          case 3:
              return "Editora";
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
        if(columnIndex >= 4)return null;
        ArrayList<ValueObject> tabela = this.getDados();
        if(rowIndex >= tabela.size())return null;
        Livro dado = (Livro)tabela.get(rowIndex);
        switch(columnIndex)
        {
            case 0:
                return dado.getId();
            case 1:
                return dado.getIsbn();
            case 2:
                return dado.getTitulo();
            case 3:
                return dado.getEditora();
        }
        return null;
    }
}
    