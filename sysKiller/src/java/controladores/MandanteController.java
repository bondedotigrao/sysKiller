package controladores;

import infraestrutura.repositorios.implementacoes.RepositorioMandanteImplDB;
import infraestrutura.repositorios.interfaces.RepositorioGenerico;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import negocio.Mandante;


/**
 *
 * @author Mark IV
 */
@ManagedBean
@SessionScoped
public class MandanteController {
    private RepositorioGenerico<Mandante> repMandante = null;
    private Mandante selectedMandante;
    private Mandante cadMandante;
    
    public MandanteController(){
        this.repMandante = new RepositorioMandanteImplDB();
        this.cadMandante = new Mandante();
    }
    
    public void inserir(){
        this.repMandante.create(this.selectedMandante);
        
        this.cadMandante = new Mandante();
        
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Mandante inserido com sucesso!"));
    }
    
    public void deletar(){
        this.repMandante.delete(this.selectedMandante);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Mandante " + this.selectedMandante.getNome() + " deletado com sucesso!"));
    }
    
    public Mandante recuperar(int codigo){
        return this.repMandante.read(codigo);
    }
    
    public void alterar(){
        this.repMandante.update(this.selectedMandante);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Mandante alterado com sucesso!"));
    }
    
    public List<Mandante> recuperarTodos(){
        return this.repMandante.readAll();
    }

    public RepositorioGenerico<Mandante> getRepMandante() {
        return repMandante;
    }

    public void setRepMandante(RepositorioGenerico<Mandante> repMandante) {
        this.repMandante = repMandante;
    }

    public Mandante getSelectedMandante() {
        return selectedMandante;
    }

    public void setSelectedMandante(Mandante selectedMandante) {
        this.selectedMandante = selectedMandante;
    }

    public Mandante getCadMandante() {
        return cadMandante;
    }

    public void setCadMandante(Mandante cadMandante) {
        this.cadMandante = cadMandante;
    }
    
    
}
