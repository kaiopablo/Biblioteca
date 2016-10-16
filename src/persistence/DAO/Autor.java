package persistence.DAO;

import java.util.ArrayList;

/**
 *
 * @author luan
 */
public class Autor extends DBObject{
    private String nome;
    
    public Autor(int cod, String nome) {
        super(cod);
        this.nome = nome;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    /**
     * Busca o objeto por chave primaria.
     * @param chaveprimaria
     * @return objeto contendo os dados ou null.
     */
    public static Autor Buscar(Object chaveprimaria) {
        if(chaveprimaria instanceof Integer){
            //Implementar busca em SQL;   
        }
        return null;
    }
       
    /**
     * Retorna lista de objetos que contenham o string filtro
     * @param filtro
     * @return ArrayList de objetos
     */
    public static ArrayList<Autor> Buscar(String filtro) {
        ArrayList<Autor> lista = new ArrayList<>();
        return lista;
    }

    @Override
    public void Excluir() {
        //Implementar exclusão em SQL do objeto atual;
    }

    @Override
    public void Cadastrar() {
        //Implementar salvar o objeto atual em SQL;
    }

    @Override
    public void Editar() {
        //Implementar salvar objecto atual em SQL;
    }
    
}
