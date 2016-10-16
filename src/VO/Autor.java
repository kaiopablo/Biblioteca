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
public class Autor extends ValueObject implements Serializable {
    
    @OneToMany(mappedBy = "autor")
    private List<Autoria> autorias;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_autor;
    private String nome;
    
    public Autor(String nome)
    {
        this.nome = nome;
    }
    
    public Autor(long ID, String nome)
    {
        this.setId(ID);
        this.nome = nome;
    }

    @Override
    public long getId() {
        return this.getId_autor();
    }

    @Override
    public void setId(long id) {
        this.setId_autor(id);
    }

    /**
     * @return the id_autor
     */
    public long getId_autor() {
        return id_autor;
    }

    /**
     * @param id_autor the id_autor to set
     */
    public void setId_autor(long id_autor) {
        this.id_autor = id_autor;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the id_associado
     */
 
    

}
