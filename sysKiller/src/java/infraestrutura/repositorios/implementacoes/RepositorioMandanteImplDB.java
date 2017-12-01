/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorios.implementacoes;

import infraestrutura.dao.PersistenceDao;
import infraestrutura.repositorios.interfaces.RepositorioGenerico;
import java.util.List;
import negocio.Mandante;

/**
 *
 * @author sion_
 */
public class RepositorioMandanteImplDB implements RepositorioGenerico<Mandante>{

    @Override
    public void create(Mandante t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public Mandante read(int codigo) {
        return (Mandante)PersistenceDao.getInstance().read("SELECT m FROM Mandante m WHERE m.codigo="+codigo).get(0);
    }

    @Override
    public List<Mandante> readAll() {
        return PersistenceDao.getInstance().read("SELECT m FROM Mandante m");
    }

    @Override
    public void update(Mandante t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public void delete(Mandante t) {
        PersistenceDao.getInstance().delete(t);
    }
    
}
