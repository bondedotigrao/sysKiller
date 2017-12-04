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
public class KillerController1 {
    private RepositorioGenerico<Matador> repKiller = null;
    private Matador selectedKiller = null;

    public KillerController1() {
        repKiller = new RepositorioMatadorImplDB();
    }
    
    public String inserir(Matador k){
        this.repKiller.create(k);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O killer " + k.getNome() + " foi adicionado com sucesso!"));
        
        return "apresentaKiller.xhtml";
    }
    
    public String alterar(Matador k){
        
        this.repKiller.update(k);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O killer " + k.getNome() + " foi alterado com sucesso!"));
        
        return "apresentaKiller.xhtml";
    }
    
    public Matador recuperar(int codigo){
        return this.repKiller.read(codigo);
    }
    
    public String deletar(Matador k){
        this.repKiller.delete(k);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O killer " + k.getNome() + " foi deletado com sucesso!"));
        
        return "apresentaKiller.xhtml";
    }
    
    public List<Matador> recuperarTodos(){
        return this.repKiller.readAll();
    }

    public RepositorioGenerico<Matador> getRepKiller() {
        return repKiller;
    }

    public void setRepKiller(RepositorioGenerico<Matador> repKiller) {
        this.repKiller = repKiller;
    }

    public Matador getSelectedKiller() {
        return selectedKiller;
    }

    public void setSelectedKiller(Matador selectedKiller) {
        this.selectedKiller = selectedKiller;
    }
    
    
}
