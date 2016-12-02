/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author viniciuscustodio
 */
@Entity
public class Operador extends ValueObject implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_operador;
    private String login;
    private String senha;
            
            
    public Operador(){}
    
    @Override
    public long getId() {
        return this.getId_operador();
    }

    @Override
    public void setId(long id) {
        this.setId_operador(id);
    }

    /**
     * @return the id_operador
     */
    public long getId_operador() {
        return id_operador;
    }

    /**
     * @param id_operador the id_operador to set
     */
    public void setId_operador(long id_operador) {
        this.id_operador = id_operador;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}
