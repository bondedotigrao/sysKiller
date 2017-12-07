package controladores;

import infraestrutura.repositorios.implementacoes.RepositorioAssassinatoImplDB;
import infraestrutura.repositorios.interfaces.RepositorioGenerico;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import negocio.Assassinato;
import org.primefaces.event.FlowEvent;

/**
 *
 * @author Mark IV
 */
@ManagedBean
@SessionScoped
public class AssassinatoController {
    private RepositorioGenerico<Assassinato> repAssassinato = null;
    private Assassinato selectedAssassinato;
    private Assassinato cadAssassinato;
    
    private boolean skip;
    
    public AssassinatoController(){
        this.repAssassinato = new RepositorioAssassinatoImplDB();
        this.cadAssassinato = new Assassinato();
    }
    
    public String inserir(){
        this.repAssassinato.create(cadAssassinato);
        
        this.cadAssassinato = new Assassinato();
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Assassinato inserido com sucesso"));
        
        return "cadAssassinato.xhtml";
    }
    
    public String alterar(){
        this.repAssassinato.update(this.selectedAssassinato);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Assassinato alterado com sucesso"));
        
         return "cadAssassinato.xhtml";
    }
    
    public Assassinato recuperar(int codigo){
        return this.repAssassinato.read(codigo);
    }
    
    public void deletar(){
        this.repAssassinato.delete(this.selectedAssassinato);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Assassinato deletado com sucesso!"));
    }
    
    public List<Assassinato> recuperarTodos(){
        return this.repAssassinato.readAll();
    }

    public RepositorioGenerico<Assassinato> getRepAssassinato() {
        return repAssassinato;
    }

    public void setRepAssassinato(RepositorioGenerico<Assassinato> repAssassinato) {
        this.repAssassinato = repAssassinato;
    }

    public Assassinato getSelectedAssassinato() {
        return selectedAssassinato;
    }

    public void setSelectedAssassinato(Assassinato selectedAssassinato) {
        this.selectedAssassinato = selectedAssassinato;
    }

    public Assassinato getCadAssassinato() {
        return cadAssassinato;
    }

    public void setCadAssassinato(Assassinato cadAssassinato) {
        this.cadAssassinato = cadAssassinato;
    }
     
    public boolean isSkip() {
        return skip;
    }
 
    public void setSkip(boolean skip) {
        this.skip = skip;
    }
     
    public String onFlowProcess(FlowEvent event) {
        if(skip) {
            skip = false;   //reset in case user goes back
            return "confirm";
        }
        else {
            return event.getNewStep();
        }
    }

}
