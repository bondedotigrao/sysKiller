
package controladores;

import infraestrutura.repositorios.implementacoes.RepositorioMatadorImplDB;
import infraestrutura.repositorios.interfaces.RepositorioGenerico;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import negocio.Matador;


/**
 *
 * @author Mark IV
 */
@ManagedBean
@SessionScoped
public class KillerController {
    private RepositorioGenerico<Matador> repKiller = null;
    private Matador selectedKiller;
    private Matador cadKiller;
    
    public KillerController(){
    this.repKiller = new RepositorioMatadorImplDB();
    this.cadKiller = new Matador();
}
    public void inserir(){
        this.repKiller.create(this.cadKiller);
        
        this.cadKiller = new Matador();
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Matador inserido com sucesso!"));
    }
    
    public void alterar(){
        
        this.repKiller.update(this.selectedKiller);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Matador alterado com sucesso!"));
    }
    
    public Matador recupera(int codigo){
        return this.repKiller.read(codigo);
    }
    
    public void deletar(){
        this.repKiller.delete(this.selectedKiller);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Matador " + this.selectedKiller.getNome() + " deletado com sucesso!"));
    }
    
    public List<Matador> recuperarTodosMatadores(){
        return this.repKiller.readAll();
    }

    public Matador getSelectedKiller() {
        return selectedKiller;
    }

    public void setSelectedKiller(Matador selectedKiller) {
        this.selectedKiller = selectedKiller;
    }

    public RepositorioGenerico<Matador> getRepKiller() {
        return repKiller;
    }

    public void setRepKiller(RepositorioGenerico<Matador> repKiller) {
        this.repKiller = repKiller;
    }

    public Matador getCadKiller() {
        return cadKiller;
    }

    public void setCadKiller(Matador cadKiller) {
        this.cadKiller = cadKiller;
    }
    
    
}
