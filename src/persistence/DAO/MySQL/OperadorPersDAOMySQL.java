/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.DAO.MySQL;

import VO.Autoria;
import VO.Associado;
import VO.ValueObject;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import persistence.DAO.AssociadoPersDAO;
import persistence.DAO.OperadorPersDAO;

/**
 *
 * @author viniciuscustodio
 */
public class OperadorPersDAOMySQL extends BasePersDAOMySQL implements OperadorPersDAO {
    
    @Override
    public List search(ValueObject vo) {
        Associado professor = (Associado) vo;
        
        String qString = "SELECT p from Operador p WHERE p.login = " + professor.getNome();
        
        return super.search(Associado.class, qString); 
    }

    

}
