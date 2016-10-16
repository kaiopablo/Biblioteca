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
public class Emprestimo extends DBObject{
    private String nome;
    
    public Emprestimo(int cod, String nome) {
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
    public static Emprestimo Buscar(Object chaveprimaria) {
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
    public static ArrayList<Emprestimo> Buscar(String filtro) {
        ArrayList<Emprestimo> lista = new ArrayList<>();
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