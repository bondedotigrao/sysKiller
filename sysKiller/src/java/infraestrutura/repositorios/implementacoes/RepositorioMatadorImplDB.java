/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorios.implementacoes;

import infraestrutura.dao.PersistenceDao;
import infraestrutura.repositorios.interfaces.RepositorioGenerico;
import java.util.List;
import negocio.Matador;

/**
 *
 * @author sion_
 */
public class RepositorioMatadorImplDB implements RepositorioGenerico<Matador>{

    @Override
    public void create(Matador t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public Matador read(int codigo) {
        return (Matador)PersistenceDao.getInstance().read("SELECT m FROM Matador m WHERE m.codigo="+codigo).get(0);
    }

    @Override
    public List<Matador> readAll() {
        return PersistenceDao.getInstance().read("SELECT m FROM Matador m");
    }

    @Override
    public void update(Matador t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public void delete(Matador t) {
        PersistenceDao.getInstance().delete(t);
    }
    
}
