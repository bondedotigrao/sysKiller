package Entidades;

public class Assassinato {
    
    private int codigo;
    private Mandante mandante;
    private Vitima vitima;
    private Matador matador;

    public Assassinato(int codigo,Mandante mandante, Vitima vitima, Matador matador) {
        this.codigo = codigo;
        this.mandante= mandante;
        this.matador=matador;
        this.vitima=vitima;
        

    }

    public Mandante getMandante() {
        return mandante;
    }

    /**
     * @param mandante the mandante to set
     */
    public void setMandante(Mandante mandante) {
        this.mandante = mandante;
    }

    /**
     * @return the vitima
     */
    public Vitima getVitima() {
        return vitima;
    }

    /**
     * @param vitima the vitima to set
     */
    public void setVitima(Vitima vitima) {
        this.vitima = vitima;
    }

    /**
     * @return the matador
     */
    public Matador getMatador() {
        return matador;
    }

    /**
     * @param matador the matador to set
     */
    public void setMatador(Matador matador) {
        this.matador = matador;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
