/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import crud.models.Pedidos;
import crud.models.Usuarios;
import java.util.List;
import javax.swing.JOptionPane;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.hql.internal.ast.util.SessionFactoryHelper;

/**
 *
 * @author Kin
 */
public class CRUD {

    /**
     * @param args the command line arguments
     */
    public static void Cadastrar(Usuarios user) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();

    }

    public static void CadastrarPedido(Pedidos pedido) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(pedido);
        session.getTransaction().commit();
        session.close();

    }

    public static List Listar() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query queryResult = session.createQuery("from Usuarios");
        List todosUsuarios;
        todosUsuarios = queryResult.list();
        for (int i = 0; i < todosUsuarios.size(); i++) {
         Usuarios usuario = (Usuarios) todosUsuarios.get(i);
         System.out.println(usuario.getNome());
        }
        return todosUsuarios;
        

    }

}
