package controladores;

import infraestrutura.repositorios.implementacoes.RepositorioVitimaImplDB;
import infraestrutura.repositorios.interfaces.RepositorioGenerico;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import negocio.Vitima;


/**
 *
 * @author Mark IV
 */
@ManagedBean
@SessionScoped
public class VitimaController {
    private RepositorioGenerico<Vitima> repVitima = null;
    private Vitima selectedVitima;
    private Vitima cadVitima;
    
    public VitimaController(){
        this.repVitima = new RepositorioVitimaImplDB();
        this.cadVitima = new Vitima();
    }
    
    public String inserir(){
        this.repVitima.create(this.cadVitima);
        
        this.cadVitima = new Vitima();
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Vitima cadastrada com sucesso!"));
        
        return "crudVitima.xhtml";
        
    }
    
    public String alterar(){
        this.repVitima.update(this.selectedVitima);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Vitima alterada com sucesso!"));
        
         return "crudVitima.xhtml";
    }
    
    public Vitima recuperar(int codigo){
        return this.repVitima.read(codigo);
    }
    
    public String deletar(){
        this.repVitima.delete(this.selectedVitima);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Vitima " + this.selectedVitima.getNome() + " deletada com sucesso!"));
        
         return "crudVitima.xhtml";
    }
    
    public List<Vitima> recuperarTodasVitimas(){
        return this.repVitima.readAll();
    }

    public RepositorioGenerico<Vitima> getRepVitima() {
        return repVitima;
    }

    public void setRepVitima(RepositorioGenerico<Vitima> repVitima) {
        this.repVitima = repVitima;
    }

    public Vitima getSelectedVitima() {
        return selectedVitima;
    }

    public void setSelectedVitima(Vitima selectedVitima) {
        this.selectedVitima = selectedVitima;
    }

    public Vitima getCadVitima() {
        return cadVitima;
    }

    public void setCadVitima(Vitima cadVitima) {
        this.cadVitima = cadVitima;
    }
    
}
