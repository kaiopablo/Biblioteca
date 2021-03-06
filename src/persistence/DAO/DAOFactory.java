/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistence.DAO;

import persistence.DAO.MySQL.MysqlDAOFactory;

/**
 *
 * @author Vinicius
 */
public abstract class DAOFactory {
    
    public static final int MYSQL = 1;
    
    public abstract AssociadoPersDAO getAssociadoPersDAO();
    public abstract LivroPersDAO getLivroPersDAO();
    public abstract AutorPersDAO getAutorPersDAO();
    public abstract AutoriaPersDAO getAutoriaPersDAO();
    public abstract EmprestimoPersDAO getEmprestimoPersDAO();
    public abstract OperadorPersDAO getOperadorPersDAO();

    public static DAOFactory getInstance(int factory) {
        
        switch(factory) {
            
            case MYSQL:
                return new MysqlDAOFactory();
            
            default:
                return null;
        }
    }
    
    
    
    public static DAOFactory buscarInstancia() {
        
        return getInstance(1);
    }    

}
