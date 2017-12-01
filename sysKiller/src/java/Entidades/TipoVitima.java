
package Entidades;


public class TipoVitima {
    
    private String descricao;
    private double valor;
    private String tipoExecucao;
    

   public TipoVitima(String descricao,double valor,String tipoExecucao){
       this.descricao = descricao;
       this.valor=valor;
       this.tipoExecucao=tipoExecucao;
      
       
   }
    
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the tipoExecucao
     */
    public String getTipoExecucao() {
        return tipoExecucao;
    }

    /**
     * @param tipoExecucao the tipoExecucao to set
     */
    public void setTipoExecucao(String tipoExecucao) {
        this.tipoExecucao = tipoExecucao;
    }

   
    
    
}
