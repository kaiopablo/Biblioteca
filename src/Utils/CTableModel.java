package Utils;

import VO.ValueObject;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author luan
 */
public abstract class CTableModel extends AbstractTableModel{
    private ArrayList<ValueObject> dados;
    
    public CTableModel()
    {
        dados = new ArrayList<>();
    }
    
    /**
     * Substitui a lista de dados da tabela.
     * @param dados 
     */
    public void setDados(ArrayList<ValueObject> dados)
    {
        this.dados = dados;
        this.fireTableDataChanged();
    }
    
    /**
     * Adiciona um novo dado à tabela.
     * @param dado 
     */
    public void addDado(ValueObject dado)
    {
        this.dados.add(dado);
    }
    
    public void remDado(ValueObject dado)
    {
        this.dados.remove(dado);
    }
    
    public void clearDados()
    {
        this.dados.clear();
    }
    
    /**
     * Retorna quantidade de dados da tabela, com filtro aplicado.
     * @return int quantidade de dados.
     */
    @Override
    public int getRowCount() {
        return this.getDados().size();
    }
        
    /**
     * Retorna todos os dados da tabela.
     * @return 
     */
    public ArrayList<ValueObject> getDados()
    {
        return dados;
    }
}
