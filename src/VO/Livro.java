/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;


@Entity
public class Livro extends ValueObject implements Serializable {
    
    @OneToMany(mappedBy = "livro")
    private List<Autoria> autorias;
    
    @OneToMany(mappedBy = "livro")
    private List<Emprestimo> emprestimos;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_livro;
    private String isbn;
    private String editora;
    private String localEdicao;
    private String numeroExemplares;
    private String titulo;
    
    public Livro(){}
    
    public Livro(Long id, String isbn, String editora, String localEdicao, String numeroExemplares, String titulo) { 
        this.setId(id); 
        this.isbn = isbn;
        this.editora = editora; 
        this.localEdicao = localEdicao; 
        this.numeroExemplares = numeroExemplares; 
        this.titulo = titulo; 
    } 
    
    public Livro(String isbn, String editora, String localEdicao, String numeroExemplares, String titulo) { 
        this.isbn = isbn;
        this.editora = editora; 
        this.localEdicao = localEdicao; 
        this.numeroExemplares = numeroExemplares; 
        this.titulo = titulo; 
    } 

    @Override
    public long getId() {
        return this.getId_livro();
    }

    @Override
    public void setId(long id) {
        this.setId_livro(id);
    }

    /**
     * @return the autorias
     */
    public List<Autoria> getAutorias() {
        return autorias;
    }

    /**
     * @param autorias the autorias to set
     */
    public void setAutorias(List<Autoria> autorias) {
        this.autorias = autorias;
    }

    /**
     * @return the emprestimos
     */
    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    /**
     * @param emprestimos the emprestimos to set
     */
    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    /**
     * @return the id_livro
     */
    public long getId_livro() {
        return id_livro;
    }

    /**
     * @param id_livro the id_livro to set
     */
    public void setId_livro(long id_livro) {
        this.id_livro = id_livro;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the editora
     */
    public String getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }

    /**
     * @return the localEdicao
     */
    public String getLocalEdicao() {
        return localEdicao;
    }

    /**
     * @param localEdicao the localEdicao to set
     */
    public void setLocalEdicao(String localEdicao) {
        this.localEdicao = localEdicao;
    }

    /**
     * @return the numeroExemplares
     */
    public String getNumeroExemplares() {
        return numeroExemplares;
    }

    /**
     * @param numeroExemplares the numeroExemplares to set
     */
    public void setNumeroExemplares(String numeroExemplares) {
        this.numeroExemplares = numeroExemplares;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

   
 
    

}
