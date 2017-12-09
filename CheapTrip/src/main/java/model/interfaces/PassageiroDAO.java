package model.interfaces;

import model.entidades.Passageiro;

/**
 *
 * @author Mark IV
 */
public interface PassageiroDAO extends DAO<Passageiro> {
    boolean login(String login,String senha);
    Passageiro recuperarPorCpf(String cpf);
}
