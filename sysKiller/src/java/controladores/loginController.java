/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import negocio.Mandante;

/**
 *
 * @author Mark IV
 */

@ManagedBean
@SessionScoped
public class loginController {
    
    private Mandante mandanteLogado = null;

    public Mandante getMandanteLogado() {
        return mandanteLogado;
    }

    public void setMandanteLogado(Mandante mandanteLogado) {
        this.mandanteLogado = mandanteLogado;
    }
    
    
    public String realizarLoginMandante(String login,String senha){
        
        List<Mandante> mandantes = new MandanteController().recuperarTodos();
        
        for(Mandante m:mandantes){
            if(m.getLogin().equals(login)){
                if(m.getSenha().equals(senha)){
                    this.mandanteLogado = m;
                }
                break;
            }
        }
        
        
        if(mandanteLogado==null){
            ///jogar mensagem de erro!
            
            return null;
        }else{
            return "cadMandante_1.xhtml";
        }
    }
    
    
}
