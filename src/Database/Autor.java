package Database;

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
    
    @Override
    public DBObject Buscar(Object chaveprimaria) {
        if(chaveprimaria instanceof Integer){
            //Implementar busca em SQL;   
        }
        return null;
    }

    @Override
    public DBObject Buscar(String nome) {
        //Implementar busca em SQL;   
        return null;
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
