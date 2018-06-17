/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import crud.models.Usuarios;
import javax.swing.JOptionPane;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
 *
 * @author Kin
 */
public class CRUD {

    /**
     * @param args the command line arguments
     */
    public static void Cadastrar(String nome, String cidade, String endereco){

            Usuarios user = new Usuarios();
            user.setNome(nome);
            user.setCidade(cidade);
            user.setEndereco(endereco);
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
            session.close();
        
        
    }
    
}
