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

/**
 *
 * @author lucasfernandes
 */
@Entity
public class Associado extends ValueObject implements Serializable {

    @OneToMany(mappedBy="associado")
    private List<Emprestimo> emprestimos;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_associado;
    private String nome;
    private String telefone;
    private String email;
    private String endereco;

    public Associado(Long id, String nome, String telefone, String email, String endereco) { 
        this.setId(id); 
        this.nome = nome; 
        this.telefone = telefone; 
        this.email = email; 
        this.endereco = endereco; 
    } 
    
    public Associado(String nome, String telefone, String email, String endereco) { 
        this.nome = nome; 
        this.telefone = telefone; 
        this.email = email; 
        this.endereco = endereco; 
    } 

    @Override
    public long getId() {
        return this.getId_associado();
    }

    @Override
    public void setId(long id) {
        this.setId_associado(id);
    }

    /**
     * @return the id_associado
     */
    public long getId_associado() {
        return id_associado;
    }

    /**
     * @param id_associado the id_associado to set
     */
    public void setId_associado(long id_associado) {
        this.id_associado = id_associado;
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
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    

}
