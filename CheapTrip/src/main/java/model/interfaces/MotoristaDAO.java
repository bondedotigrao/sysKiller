package model.interfaces;

import model.entidades.Motorista;

/**
 *
 * @author Mark IV
 */
public interface MotoristaDAO extends DAO<Motorista> {
    boolean login(String login,String senha);
    Motorista recuperarPorCpf(String cpf);
}
