/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import VO.Emprestimo;
import VO.ValueObject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Luan
 */
public class EmprestimoTableModel extends CTableModel{
    
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
              return "Empréstimo";
          case 1:
              return "Previsão";
          case 2:
              return "Associado";
          case 3:
              return "Livro";
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
        ArrayList<ValueObject> emps = this.getDados();
        if(rowIndex >= emps.size())return null;
        Emprestimo emp = (Emprestimo)emps.get(rowIndex);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        switch(columnIndex)
        {
            case 0:
                return dateFormat.format(emp.getData());
            case 1:
                return dateFormat.format(emp.getPrevisao());
            case 2:
                return emp.getAssociado().getNome();
            case 3:
                return emp.getLivro().getTitulo();
        }
        return null;
    }
}
    