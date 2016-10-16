package Utils;

import VO.Autor;
import VO.ValueObject;
import java.util.ArrayList;

/**
 *
 * @author luan
 */
public class AutorTableModel extends CTableModel{


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
              return "Nome";
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
        ArrayList<ValueObject> autores = this.getDados();
        if(rowIndex >= autores.size())return null;
        Autor aut = (Autor)autores.get(rowIndex);
        return (columnIndex == 0) ? aut.getId() : aut.getNome();
    }
    
}
