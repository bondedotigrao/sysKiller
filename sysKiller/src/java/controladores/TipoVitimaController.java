package controladores;

import infraestrutura.repositorios.implementacoes.RepositorioTipoVitimaImplDB;
import infraestrutura.repositorios.interfaces.RepositorioGenerico;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import negocio.TipoVitima;

/**
 *
 * @author Mark IV
 */
@ManagedBean
@SessionScoped
public class TipoVitimaController {
    private RepositorioGenerico<TipoVitima> repTipoVitima = null;
    private TipoVitima selectedTipoVitima;
    private TipoVitima cadTipoVitima;

    public TipoVitimaController() {
        this.repTipoVitima = new RepositorioTipoVitimaImplDB();
        this.cadTipoVitima = new TipoVitima();
    }
    
    public String inserir(){
        this.repTipoVitima.create(this.cadTipoVitima);
        
        this.cadTipoVitima = new TipoVitima();
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Tipo de vitima cadastrado com sucesso"));
        
        return "apresentaTipoVitima.xhtml";
    }
    
    public String alterar(){
        this.repTipoVitima.update(this.selectedTipoVitima);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O tipo de vitima foi alterado."));
        
        return "apresentaTipoVitima.xhtml";
    }
    
    public TipoVitima recupera(int codigo){
        return this.repTipoVitima.read(codigo);
    }
    
    public String deletar(){
        this.repTipoVitima.delete(this.selectedTipoVitima);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Tipo de vítima deletado"));
        
        return "apresentaTipoVitima.xhtml";
    }
    
    public List<TipoVitima> recuperarTodosTipoVitima(){
        return this.repTipoVitima.readAll();
    }

    public RepositorioGenerico<TipoVitima> getRepTipoVitima() {
        return repTipoVitima;
    }

    public void setRepTipoVitima(RepositorioGenerico<TipoVitima> repTipoVitima) {
        this.repTipoVitima = repTipoVitima;
    }

    public TipoVitima getSelectedTipoVitima() {
        return selectedTipoVitima;
    }

    public void setSelectedTipoVitima(TipoVitima selectedTipoVitima) {
        this.selectedTipoVitima = selectedTipoVitima;
    }

    public TipoVitima getCadTipoVitima() {
        return cadTipoVitima;
    }

    public void setCadTipoVitima(TipoVitima cadTipoVitima) {
        this.cadTipoVitima = cadTipoVitima;
    }
    
    
}
