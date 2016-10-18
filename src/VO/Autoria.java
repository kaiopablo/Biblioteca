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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author lucasfernandes
 */
@Entity
public class Autoria extends ValueObject implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_autoria;
//    private long id_livro;
//    private long id_autor;
    
    @ManyToOne
    private Autor autor;
    
    @ManyToOne
    private Livro livro;

    public Autoria(){}
    @Override
    public long getId() {
        return this.getId_autoria();
    }

    @Override
    public void setId(long id) {
        this.setId_autoria(id);
    }

    /**
     * @return the id_autoria
     */
    public long getId_autoria() {
        return id_autoria;
    }

    /**
     * @param id_autoria the id_autoria to set
     */
    public void setId_autoria(long id_autoria) {
        this.id_autoria = id_autoria;
    }

    /**
     * @return the id_livro
     */
//    public long getId_livro() {
//        return id_livro;
//    }

    /**
     * @param id_livro the id_livro to set
     */
//    public void setId_livro(long id_livro) {
//        this.id_livro = id_livro;
//    }

    /**
     * @return the id_autor
     */
//    public long getId_autor() {
//        return id_autor;
//    }
//
//    /**
//     * @param id_autor the id_autor to set
//     */
//    public void setId_autor(long id_autor) {
//        this.id_autor = id_autor;
//    }

    /**
     * @return the autor
     */
    public Autor getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    /**
     * @return the livro
     */
    public Livro getLivro() {
        return livro;
    }

    /**
     * @param livro the livro to set
     */
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    /**
     * @return the id_associado
     */

    

}
