package repositorio;

import Entidades.Mandante;
import java.util.ArrayList;
import java.util.List;
import repositorioGenerico.RepositorioGenerico;

public class RepositorioMandante implements RepositorioGenerico<Mandante> {
    
    private List<Mandante> mandantes = null;
    
    public RepositorioMandante(){
        this.mandantes = new ArrayList<>();
    }

    
    public void inserir(Mandante mandante) {
        this.mandantes.add(mandante);
    }

   
    public void alterar(Mandante mandante) {
          for(int i = 0; i < mandantes.size();i++){
            if(mandante.getCodigo() == mandantes.get(i).getCodigo()){
                mandantes.set(i, mandante);
                return;
            }
        }
    }

 
    public Mandante recuperar(int codigo) {
        for(Mandante m : mandantes){
            if(codigo == m.getCodigo()){
                return m;
            }
        }
        return null;
    }

   
    public void deletar(Mandante mandante) {
        this.mandantes.remove(mandante);
    }

    @Override
    public List<Mandante> recuperarTodos() {
        return this.mandantes;
    }
    
}
