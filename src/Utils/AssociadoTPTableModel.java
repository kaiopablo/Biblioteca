/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author luan
 */
public class AssociadoTPTableModel extends AbstractTableModel{    
    public static class DadosAssociado{
        private long cod;
        private String nome;
        private int qtdEmp;
        
        public DadosAssociado(long cod, String nome, int qtdEmprestimos)
        {
            this.cod = cod;
            this.nome = nome;
            this.qtdEmp = qtdEmprestimos;
        }

        /**
         * @return the cod
         */
        public long getCodigo() {
            return cod;
        }

        /**
         * @param cod the cod to set
         */
        public void setCodigo(long cod) {
            this.cod = cod;
        }

        /**
         * @return the nome
         */
        public String getNome() {
            return nome;
        }

        /**
         * @param nome the nome to set
         */
        public void setNome(String nome) {
            this.nome = nome;
        }

        /**
         * @return the qtdEmp
         */
        public int getQtdEmprestimos() {
            return qtdEmp;
        }

        /**
         * @param qtdEmp the qtdEmp to set
         */
        public void setQtdEmprestimos(int qtdEmp) {
            this.qtdEmp = qtdEmp;
        }
    }
    private ArrayList<DadosAssociado> lista = new ArrayList<>();
    
    /**
     * Retorna quantidade de colunas da tabela.
     * @return int
     */
    @Override
    public int getColumnCount() {
        return 3;
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
              return "Nome";
          case 2:
              return "Empréstimos";
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
        if(columnIndex >= 3)return null;
        if(rowIndex >= lista.size())return null;
        DadosAssociado ass = lista.get(rowIndex);
        switch(columnIndex)
        {
            case 0:
                return ass.getCodigo();
            case 1:
                return ass.getNome();
            case 2:
                return ass.getQtdEmprestimos();
        }
        return null;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }
    
    public ArrayList<DadosAssociado> getLista()
    {
        return this.lista;
    }
    
    public void clear()
    {
        this.lista.clear();
    }
    
    public void addDado(DadosAssociado value)
    {
        this.lista.add(value);
    }
    
    public void remDado(DadosAssociado value)
    {
        this.lista.remove(value);
    }
}
