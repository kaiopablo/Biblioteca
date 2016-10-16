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
public class Livro extends DBObject{
    private String titulo;
    private String editora;
    private String localEdicao;
    private int numeroExemplares;
    private ArrayList<Integer> autores;
    
    public Livro(int cod, String titulo, String editora, String localEdicao, int numeroExemplares, ArrayList<Integer> codAutores) {
        super(cod);
        this.titulo = titulo;
        this.editora = editora;
        this.localEdicao = localEdicao;
        this.numeroExemplares = numeroExemplares;
        this.autores = codAutores;
    }
    
        public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getLocalEdicao() {
        return localEdicao;
    }

    public void setLocalEdicao(String localEdicao) {
        this.localEdicao = localEdicao;
    }

    public int getNumeroExemplares() {
        return numeroExemplares;
    }

    public void setNumeroExemplares(int numeroExemplares) {
        this.numeroExemplares = numeroExemplares;
    }
    
    /**
     * Busca o objeto por chave primaria.
     * @param chaveprimaria
     * @return objeto contendo os dados ou null.
     */
    public static Livro Buscar(Object chaveprimaria) {
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
    public static ArrayList<Livro> Buscar(String filtro) {
        ArrayList<Livro> lista = new ArrayList<>();
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
