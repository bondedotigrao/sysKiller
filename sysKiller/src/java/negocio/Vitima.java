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
public class Vitima {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String nome;
    private TipoVitima tipo;
    private String descricaoF; //descrições fisicas
    private String descricaoA; //descrições adicionais 
    
    public Vitima( String nome, TipoVitima tipo, String descricaoF, String descricaoA) {
        this.nome = nome;
        this.tipo = tipo;
        this.descricaoF = descricaoF;
        this.descricaoA = descricaoA;
    }
    @Deprecated
    public Vitima() {
        
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public TipoVitima getTipo() {
        return tipo;
    }

    public void setTipo(TipoVitima tipo) {
        this.tipo = tipo;
    }
    
    public String getDescricaoF() {
        return this.descricaoF;
    }
    
    public void setDescricaoF(String descricaoF) {
        this.descricaoF = descricaoF;
    }
    
    public String getDescricaoA() {
        return descricaoA;
    }
    
    public void setDescricaoA(String descricaoA) {
        this.descricaoA = descricaoA;
    }
    
}
