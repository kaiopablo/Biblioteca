package Database;

import java.util.ArrayList;

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
