package repositorio;

import Entidades.Assassinato;
import Entidades.Matador;
import java.util.ArrayList;
import java.util.List;
import repositorioGenerico.RepositorioGenerico;


public class RepositorioAssassinato implements RepositorioGenerico<Assassinato> {
    private List<Assassinato> assassinatos = null;
    
    public  RepositorioAssassinato(){
        assassinatos = new ArrayList<>();
    }

    
    public void inserir(Assassinato assassinato) {
        this.assassinatos.add(assassinato);
    }

    
    public void alterar(Assassinato assassinato) {
     for(int i = 0; i < this.assassinatos.size();i++){
         if(this.assassinatos.get(i).getCodigo() == assassinato.getCodigo()){
             this.assassinatos.set(i, assassinato);
         }
     } 
     
    }

    
    public Assassinato recuperar(int codigo) {
      for(Assassinato a : assassinatos){
          if(codigo == a.getCodigo()){
              return a;
          }
      }  
      return null;
    }

   
    public void deletar(Assassinato assassinato) {
       this.assassinatos.remove(assassinato);
    }

    
    public List<Assassinato> recuperarTodos() {
       return this.assassinatos;
    }
    
    public List<Assassinato> recuperarPorMatador(Matador matador){
        
        List<Assassinato> listaPorMatador = new ArrayList<>();
        
        for(Assassinato a:this.assassinatos){
            if(a.getMatador().getCodigo()==matador.getCodigo()){
                listaPorMatador.add(a);
            }
        }
        return listaPorMatador;
    }
    
    
}
