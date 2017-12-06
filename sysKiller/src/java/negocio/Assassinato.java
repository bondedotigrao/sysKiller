package negocio;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@ManagedBean
@RequestScoped
public class Assassinato {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private Mandante mandante;
    private Vitima vitima;
    private Matador matador;
    
    public Assassinato(int codigo, Mandante mandante, Vitima vitima, Matador matador) {
        this.codigo = codigo;
        this.mandante = mandante;
        this.vitima = vitima;
        this.matador = matador;
    }
    
    @Deprecated
    public Assassinato() {
        
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public Mandante getMandante() {
        return this.mandante;
    }
    
    public void setMandante(Mandante mandante) {
        this.mandante = mandante;
    }
    
    public Vitima getVitima() {
        return this.vitima;
    }
    
    public void setVitima(Vitima vitima) {
        this.vitima = vitima;
    }
           
    public Matador getMatador() {
        return this.matador;
    }
    
    public void setMatador(Matador matador) {
        this.matador = matador;
    }
    
}
