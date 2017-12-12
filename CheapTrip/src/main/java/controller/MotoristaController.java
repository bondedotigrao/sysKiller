package controller;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import model.entidades.Motorista;
import model.implementacoes.MotoristaHibernateDAO;

/**
 *
 * @author Mark IV
 */
@ManagedBean
@SessionScoped
public class MotoristaController {
    private MotoristaHibernateDAO motoristaHibernate = null;
    private Motorista cadMotorista;
    private Motorista selectedMotorista;

    public MotoristaController() {
        this.motoristaHibernate = new MotoristaHibernateDAO();
        this.cadMotorista = new Motorista();
    }
    
    public String cadastrar(){
        this.motoristaHibernate.cadastrar(this.cadMotorista);
        this.cadMotorista = new Motorista();
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Motorista cadastrado com sucesso!"));
        
        return "index.xhtml";
    }
    
    public String alterar(){
        this.motoristaHibernate.alterar(this.selectedMotorista);
   
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Motorista alterado com sucesso!"));
        
        return "index.xhtml";
    }
    
    public String deletar(){
        this.motoristaHibernate.deletar(this.selectedMotorista);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Motorista deletado com sucesso!"));
        
        return "index.xhtml";
    }
    
    public Motorista recuperar(){
        return this.motoristaHibernate.recuperar(this.selectedMotorista.getId_motorista());
    }
    
    public List<Motorista> recuperarTodos(){
        return this.motoristaHibernate.recuperarTodos();
    }
    
    public Motorista recuperarPorCpf(){
        return this.motoristaHibernate.recuperarPorCpf(this.selectedMotorista.getCpf());
    }
    
    public boolean login(){
        return false;
    }
}
