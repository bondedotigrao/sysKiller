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
public class Matador {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String nome;
    private String telefone;
    private String login;
    private String senha;

    public Matador(String nome, String telefone, String login, String senha) {
        this.nome = nome;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
    }
    
    @Deprecated
    public Matador() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Matador{" + "codigo=" + codigo + ", nome=" + nome + ", telefone=" + telefone + ", login=" + login + ", senha=" + senha + '}';
    }
    
    
    
}
