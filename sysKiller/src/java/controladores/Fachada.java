
package controladores;

import Entidades.Assassinato;
import Entidades.Mandante;
import Entidades.Matador;
import Entidades.Vitima;
import java.util.List;
import repositorio.RepositorioAssassinato;
import repositorio.RepositorioMandante;
import repositorio.RepositorioMatador;
import repositorio.RepositorioVitima;
import repositorioGenerico.RepositorioGenerico;


public class Fachada {
    private static Fachada myself = null;
    
    RepositorioGenerico <Vitima> repositorioVitima =  null;
    RepositorioGenerico <Matador> repositorioMatador =  null;
    RepositorioGenerico <Mandante> repositorioMandante =  null;
    RepositorioGenerico <Assassinato> repositorioAssassinato =  null;
    
    public static Fachada getInstance(){
        
        if(myself==null)
            myself = new Fachada();
        
        return myself;
    }
    
    private Fachada(){
        this.repositorioVitima = new RepositorioVitima();
        this.repositorioMatador = new RepositorioMatador();
        this.repositorioMandante = new RepositorioMandante();
        this.repositorioAssassinato = new RepositorioAssassinato();
    }
    
    //Vitima
    
    public void inserir(Vitima v){
        this.repositorioVitima.inserir(v);
    }
    public void alterar(Vitima v){
        this.repositorioVitima.alterar(v);
        
    }
    public Vitima recuperarVitima(int codigo){
       return this.repositorioVitima.recuperar(codigo);
    }
    public void deletar(Vitima v){
        this.repositorioVitima.deletar(v);
        
    }
    public List<Vitima> recuperarTodasVitimas(){
        return this.repositorioVitima.recuperarTodos();
        
    }
    
    //Matador
    
     public void inserir(Matador r){
        this.repositorioMatador.inserir(r);
    }
    public void alterar(Matador r){
        this.repositorioMatador.alterar(r);
        
    }
    public Matador recuperarMatador(int codigo){
       return  this.repositorioMatador.recuperar(codigo);
    }
    public void deletar(Matador r){
         this.repositorioMatador.deletar(r);
        
    }
    public List<Matador> recuperarTodasMatador(){
        return  this.repositorioMatador.recuperarTodos();
        
    }
    
    //Mandante
    
     public void inserir(Mandante man){
        this.repositorioMandante.inserir(man);
    }
    public void alterar(Mandante man){
        this.repositorioMandante.alterar(man);
        
    }
    public Mandante recuperarMandante(int codigo){
       return  this.repositorioMandante.recuperar(codigo);
    }
    public void deletar(Mandante man){
         this.repositorioMandante.deletar(man);
        
    }
    public List<Mandante> recuperarTodasMandante(){
        return  this.repositorioMandante.recuperarTodos();
        
    }
     //Assassinato
    
     public void inserir(Assassinato ass){
        this.repositorioAssassinato.inserir(ass);
    }
    public void alterar(Assassinato ass){
        this.repositorioAssassinato.alterar(ass);
        
    }
    public Assassinato recuperarAssassinato(int codigo){
       return  this.repositorioAssassinato.recuperar(codigo);
    }
    public void deletar(Assassinato ass){
         this.repositorioAssassinato.deletar(ass);
        
    }
    public List<Assassinato> recuperarTodasAssassinato(){
        return this.repositorioAssassinato.recuperarTodos();
        
    }
    
    public List<Assassinato> recuperarTodosAssassinatos(Matador matador){
        return ((RepositorioAssassinato)this.repositorioAssassinato).recuperarPorMatador(matador);
    }
}
