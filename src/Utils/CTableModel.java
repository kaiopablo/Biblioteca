package Utils;

import Database.DBObject;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author luan
 */
public abstract class CTableModel extends AbstractTableModel{
    private ArrayList<DBObject> dados;
    private String filtro;    
    
    public CTableModel()
    {
        dados = new ArrayList<>();
        filtro = "";
    }
    
    /**
     * Substitui a lista de dados da tabela.
     * @param dados 
     */
    public void setDados(ArrayList<DBObject> dados)
    {
        this.dados = dados;
        this.fireTableDataChanged();
    }
    
    /**
     * Adiciona um novo dado à tabela.
     * @param dado 
     */
    public void addDado(DBObject dado)
    {
        this.dados.add(dado);
        this.fireTableDataChanged();
    }
    
    /**
     * Filtra os dados a serem exibidos na tabela.
     * @param filtro 
     */
    public void filtrarDados(String filtro)
    {
        this.filtro = filtro;
        this.fireTableDataChanged();
    }
    
    /**
     * Retorna o filtro utilizado.
     * @return 
     */
    public String getFiltro()
    {
        return filtro;
    }
    
    /**
     * Retorna todos os dados da tabela.
     * @return 
     */
    public ArrayList<DBObject> getDados()
    {
        return dados;
    }
}
