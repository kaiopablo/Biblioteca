package Utils;

import Database.Autor;
import Database.DBObject;
import java.util.ArrayList;

/**
 *
 * @author luan
 */
public class AutorTableModel extends CTableModel{

    /**
     * Retorna lista de autores filtrada.
     * @param filtro
     * @return ArrayList<Autor>
     */
    private ArrayList<Autor> getAutores(String filtro)
    {
        ArrayList<Autor> autores = new ArrayList<>();
        int i;
        ArrayList<DBObject> dados = this.getDados();
        for(i=0;i<dados.size(); i++){
            Autor aut = (Autor)dados.get(i);
            if(filtro.equals("") || aut.getNome().contains(filtro)){
                autores.add(aut);
            }
        }
        return autores;
    }
    
    /**
     * Retorna quantidade de dados da tabela, com filtro aplicado.
     * @return int quantidade de dados.
     */
    @Override
    public int getRowCount() {
        if(this.getFiltro().equals(""))return this.getDados().size();
        return this.getAutores(this.getFiltro()).size();
    }

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
        ArrayList<Autor> autores = this.getAutores(this.getFiltro());
        if(rowIndex >= autores.size())return null;
        Autor aut = autores.get(rowIndex);
        return (columnIndex == 0) ? aut.getChavePrimaria() : aut.getNome();
    }
    
}
