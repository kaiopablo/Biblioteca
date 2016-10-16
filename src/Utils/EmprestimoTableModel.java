/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Database.Emprestimo;
import Database.DBObject;
import java.util.ArrayList;

/**
 *
 * @author Luan
 */
public class EmprestimoTableModel extends CTableModel{

    
        /**
     * Retorna lista de autores filtrada.
     * @return ArrayList<Autor>
     */
    private ArrayList<Emprestimo> getEmprestimosFiltrado()
    {
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();
        int i;
        ArrayList<DBObject> dados = this.getDados();
        for(i=0;i<dados.size(); i++){
            Emprestimo emp = (Emprestimo)dados.get(i);
            if(this.getFiltro().equals("") || emp.getNome().contains(this.getFiltro())){
                emprestimos.add(emp);
            }
        }
        return emprestimos;
    }
    
    /**
     * Retorna quantidade de dados da tabela, com filtro aplicado.
     * @return int quantidade de dados.
     */
    @Override
    public int getRowCount() {
        if(this.getFiltro().equals(""))return this.getDados().size();
        return this.getEmprestimosFiltrado().size();
    }

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
              return "Data do empréstimo";
          case 1:
              return "Previsão de devolução";
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
        if(columnIndex >= 2)return null;
        ArrayList<Emprestimo> emps = this.getEmprestimosFiltrado();
        if(rowIndex >= emps.size())return null;
        Emprestimo emp = emps.get(rowIndex);
        return (columnIndex == 0) ? emp.getChavePrimaria() : emp.getNome();
    }
}
    