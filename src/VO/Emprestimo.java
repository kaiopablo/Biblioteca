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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;


@Entity
public class Emprestimo extends ValueObject implements Serializable {
    
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_emprestimo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date previsao;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date devolucao;
    
    @ManyToOne
    private Associado associado;
    
    @ManyToOne
    private Livro livro;
    
    

    @Override
    public long getId() {
        return this.getId_emprestimo();
    }

    @Override
    public void setId(long id) {
        this.setId_emprestimo(id);
    }

    /**
     * @return the id_emprestimo
     */
    public long getId_emprestimo() {
        return id_emprestimo;
    }

    /**
     * @param id_emprestimo the id_emprestimo to set
     */
    public void setId_emprestimo(long id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the previsao
     */
    public Date getPrevisao() {
        return previsao;
    }

    /**
     * @param previsao the previsao to set
     */
    public void setPrevisao(Date previsao) {
        this.previsao = previsao;
    }

    /**
     * @return the devolucao
     */
    public Date getDevolucao() {
        return devolucao;
    }

    /**
     * @param devolucao the devolucao to set
     */
    public void setDevolucao(Date devolucao) {
        this.devolucao = devolucao;
    }

    /**
     * @return the associado
     */
    public Associado getAssociado() {
        return associado;
    }

    /**
     * @param associado the associado to set
     */
    public void setAssociado(Associado associado) {
        this.associado = associado;
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
     * @return the id_autor
     */

    /**
     * @return the id_associado
     */
 
    

}
