/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorios.implementacoes;

import infraestrutura.dao.PersistenceDao;
import infraestrutura.repositorios.interfaces.RepositorioGenerico;
import java.util.List;
import negocio.Vitima;

/**
 *
 * @author sion_
 */
public class RepositorioVitimaImplDB implements RepositorioGenerico<Vitima>{

    @Override
    public void create(Vitima t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public Vitima read(int codigo) {
        return (Vitima)PersistenceDao.getInstance().read("SELECT v FROM Vitima v WHERE v.codigo="+codigo).get(0);
    }

    @Override
    public List<Vitima> readAll() {
        return PersistenceDao.getInstance().read("SELECT v FROM Vitima v");
    }

    @Override
    public void update(Vitima t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public void delete(Vitima t) {
        PersistenceDao.getInstance().delete(t);
    }
    
}
