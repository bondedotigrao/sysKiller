package repositorio;


import Entidades.Matador;
import java.util.ArrayList;
import java.util.List;
import repositorioGenerico.RepositorioGenerico;

public class RepositorioMatador implements RepositorioGenerico<Matador> {
    private List<Matador> matadores = null;
    
    public RepositorioMatador(){
        matadores = new ArrayList();
    }
    
    public void inserir(Matador matador) {
        this.matadores.add(matador);
    }

 
    public Matador recuperar(int codigo) {
        for(Matador m : matadores){
            if(codigo == m.getCodigo()){
                return m;
            }
        }
        return null;
    }

    
    public void alterar(Matador matador) {
        for(int i = 0; i < matadores.size();i++){
            if(matador.getCodigo() == matadores.get(i).getCodigo()){
                matadores.set(i, matador);
                return;
            }
        }
    }

    
    public void deletar(Matador matador) {
        matadores.remove(matador);
    }

 
    public List recuperarTodos() {
        return this.matadores;
    }
    
    public boolean logar(String login,String senha){
        for(Matador m : matadores){
            if(login.equals(m.getLogin()) && senha.equals(m.getSenha())){
                return true;
            }
        }
        
        return false;
    }

    
}
