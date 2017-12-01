
package repositorioGenerico;

import java.util.List;


public interface  RepositorioGenerico <T>{
    
    public void inserir(T t);
    public void alterar(T t);
    public T recuperar(int codigo);
    public void deletar(T t);
    public List<T> recuperarTodos();
  
}
    

