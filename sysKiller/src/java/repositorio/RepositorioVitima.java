
package repositorio;

import Entidades.Vitima;
import java.util.ArrayList;
import java.util.List;
import repositorioGenerico.RepositorioGenerico;


public class RepositorioVitima  implements RepositorioGenerico<Vitima>{
    
    private List<Vitima> vitimas = null;
    
    
    public RepositorioVitima(){
        this.vitimas = new ArrayList<>();
    }

   
    public void inserir(Vitima vitima) {
        this.vitimas.add(vitima);
        
    }

  
    public void alterar(Vitima vitima) {
        for(int i = 0;i < vitimas.size();i++){
            if(vitima.getCodigo() == vitimas.get(i).getCodigo()){
                vitimas.set(i, vitima);
            }
        }
    }

   
    public Vitima recuperar(int codigo) {
        for(Vitima v : vitimas){
            if(codigo == v.getCodigo()){
                return v;
            }
        }
        
        return null;
    }

   
    public void deletar(Vitima vitima) {
        vitimas.remove(vitima);
    }

    @Override
    public List<Vitima> recuperarTodos() {
        return this.vitimas;
    }
    
}