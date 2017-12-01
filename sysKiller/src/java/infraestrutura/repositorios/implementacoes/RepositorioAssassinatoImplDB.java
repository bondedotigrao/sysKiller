/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorios.implementacoes;

import infraestrutura.dao.PersistenceDao;
import infraestrutura.repositorios.interfaces.RepositorioGenerico;
import java.util.List;
import negocio.Assassinato;

/**
 *
 * @author sion_
 */
public class RepositorioAssassinatoImplDB implements RepositorioGenerico<Assassinato>{

    @Override
    public void create(Assassinato t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public Assassinato read(int codigo) {
        return (Assassinato)PersistenceDao.getInstance().read("SELECT a FROM Assassinato a WHERE a.codigo="+codigo).get(0);
    }

    @Override
    public List<Assassinato> readAll() {
        return PersistenceDao.getInstance().read("SELECT a FROM Assassinato a");
    }

    @Override
    public void update(Assassinato t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public void delete(Assassinato t) {
        PersistenceDao.getInstance().delete(t);
    }
    
    
    
}
