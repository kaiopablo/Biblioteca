package Database;

/**
 *
 * @author luan
 */
public abstract class DBObject {
    private final Object chaveprimaria;
    
    public DBObject(Object chaveprimaria)
    {
        this.chaveprimaria = chaveprimaria;
    }
    
    public Object getChavePrimaria()
    {
        return this.chaveprimaria;
    }
    
    /**
     * Busca o objeto por chave primaria.
     * @param chaveprimaria
     * @return objeto contendo os dados ou null.
     */
    public abstract DBObject Buscar(Object chaveprimaria);
    
    /**
     * Busca o primeiro objeto contendo o nome informado.
     * @param nome
     * @return objeto contendo os dados ou null.
     */
    public abstract DBObject Buscar(String nome);
    
    /**
     * Excluir o objeto do banco de dados.
     * @param vo objeto contendo os dados a serem excluídos.
     */
    public abstract void Excluir();
    
    /**
     * Cadastra o objeto no banco de dados.
     */
    public abstract void Cadastrar();
    
    /**
     * Edita o objeto no banco de dados.
     */
    public abstract void Editar();
}
