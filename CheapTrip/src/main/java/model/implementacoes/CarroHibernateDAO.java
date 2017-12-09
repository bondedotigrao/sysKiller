package model.implementacoes;

import java.util.List;
import model.entidades.Carro;
import model.interfaces.CarroDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Mark IV
 */
public class CarroHibernateDAO implements CarroDAO {

    private SessionFactory sessions;
    private static CarroHibernateDAO instance;

    public CarroHibernateDAO getInstance() {
        if (instance == null) {
            instance = new CarroHibernateDAO();
        }
        return instance;
    }

    public CarroHibernateDAO() {
        Configuration cfg = new Configuration().configure();
        this.sessions = cfg.buildSessionFactory();
    }

    @Override
    public void cadastrar(Carro carro) {
        Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();
        try {
            session.persist(carro);
            t.commit();
        } catch (Exception cadCarroError) {
            System.out.println(cadCarroError.getCause()
                    + "\nOcorreu um erro ao cadastrar um carro");
        } finally {
            session.close();
        }
    }

    @Override
    public Carro recuperar(int codigo) {
        Session session = this.sessions.openSession();

        try {
            return (Carro) session.createQuery("From carro Where id_carro=" + codigo).getResultList().get(0);
        } catch (Exception recCarroError) {
            System.out.println(recCarroError.getCause()
                    + "\nOcorreu um erro ao recuperar um carro");
        } finally {
            session.close();
        }
        return null;

    }

    @Override
    public void alterar(Carro carro) {
        Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();
        try {
            session.update(carro);
            t.commit();
        } catch (Exception alteraCarrroError) {
            System.out.println(alteraCarrroError.getCause()
                    + "\nOcorreu um erro ao aterar um carrro");
        } finally {
            session.close();
        }
    }

    @Override
    public void deletar(Carro carro) {
        Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();
        try {
            session.delete(carro);
            t.commit();
        } catch (Exception delCarrroError) {
            System.out.println(delCarrroError.getCause()
                    + "\nOcorreu um erro ao deletar um carrro");
        } finally {
            session.close();
        }
    }

    @Override
    public List<Carro> recuperarTodos() {
        Session session = this.sessions.openSession();
        List<Carro> carros = null;

        try {
            carros = (List) session.createQuery("From carro").getResultList();
        } catch (Exception recTodosCarrosError) {
            System.out.println(recTodosCarrosError.getCause()
                    + "\nOcorreu um erro ao recuperar todos os carrros.");
        } finally {
            session.close();
            return carros;
        }
    }

}
