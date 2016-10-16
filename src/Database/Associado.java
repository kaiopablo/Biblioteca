/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.util.ArrayList;

/**
 *
 * @author Luan
 */
public class Associado extends DBObject{
    private String nome;
    private String telefone;
    private String email;
    private String endereco;
    
    public Associado(int cod, String nome, String telefone, String email, String endereco) {
        super(cod);
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    /**
     * Busca o objeto por chave primaria.
     * @param chaveprimaria
     * @return objeto contendo os dados ou null.
     */
    public static Associado Buscar(Object chaveprimaria) {
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
    public static ArrayList<Associado> Buscar(String filtro) {
        ArrayList<Associado> lista = new ArrayList<>();
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
