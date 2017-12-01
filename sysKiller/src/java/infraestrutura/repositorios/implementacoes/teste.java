package infraestrutura.repositorios.implementacoes;

import negocio.TipoVitima;

/**
 *
 * @author Mark IV
 */
public class teste {
    public static void main(String args[]){
        TipoVitima tv = new TipoVitima("sdd",2,"ttt");
        
        RepositorioTipoVitimaImplDB rtv = new RepositorioTipoVitimaImplDB();
        
        rtv.create(tv);
    }
}
