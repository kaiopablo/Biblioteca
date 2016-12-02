/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.DAO.MySQL;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import persistence.DAO.*;

/**
 *
 * @author viniciuscustodio
 */
public class MysqlDAOFactory extends DAOFactory{

    
    private static final EntityManagerFactory EMF
            = Persistence.createEntityManagerFactory("BibliotecaPU");
    
    public MysqlDAOFactory()
    {
        
    }

    public static EntityManagerFactory getMysqlEntityFactory() {
        return EMF;
    }
    
    @Override
    public AssociadoPersDAO getAssociadoPersDAO() {
        return new AssociadoPersDAOMySQL();
    }
    
    public AutorPersDAO getAutorPersDAO(){
        return new AutorPersDAOMySQL();
    }
    
    public AutoriaPersDAO getAutoriaPersDAO(){
        return new AutoriaPersDAOMySQL();
    }
    
    public LivroPersDAO getLivroPersDAO(){
        return new LivroPersDAOMySQL();
    }
    
    public EmprestimoPersDAO getEmprestimoPersDAO(){
        return new EmprestimoPersDAOMySQL();
    }
    
    public OperadorPersDAO getOperadorPersDAO(){
        return new OperadorPersDAOMySQL();
    }
    
    public static void closeStatement(Statement s) {
        try {
            if (s != null) {
                s.close();
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static void closePreparedStatement(Statement ps) {
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static void closeResultSet(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    
}
