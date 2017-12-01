/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorios.implementacoes;

import infraestrutura.dao.PersistenceDao;
import infraestrutura.repositorios.interfaces.RepositorioGenerico;
import java.util.List;
import negocio.TipoVitima;

/**
 *
 * @author sion_
 */
public class RepositorioTipoVitimaImplDB implements RepositorioGenerico<TipoVitima>{

    @Override
    public void create(TipoVitima t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public TipoVitima read(int codigo) {
        return (TipoVitima)PersistenceDao.getInstance().read("SELECT tv FROM TipoVitima tv WHERE tv.codigo="+ codigo).get(0);
    }

    @Override
    public List<TipoVitima> readAll() {
        return PersistenceDao.getInstance().read("SELECT tv FROM TipoVitima tv");
    }

    @Override
    public void update(TipoVitima t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public void delete(TipoVitima t) {
        PersistenceDao.getInstance().delete(t);
    }
    
}
