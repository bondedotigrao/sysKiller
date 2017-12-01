
package Entidades;


public class Mandante {

    private String nome;
    private String telefone;
    private String login;
    private String senha;
    private int codigo;
    
    public Mandante(String nome,String telefone,String login,String senha,int codigo){
        this.nome=nome;
        this.telefone=telefone;
        this.login=login;
        this.senha=senha;
        this.codigo=codigo;
        
    }

   
    public String getNome() {
        return nome;
    }

    
   
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
