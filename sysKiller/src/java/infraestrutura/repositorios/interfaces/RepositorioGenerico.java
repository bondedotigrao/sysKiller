package infraestrutura.repositorios.interfaces;

import java.util.List;

public interface RepositorioGenerico<T> {
    
    public void create(T t);
    public T read(int codigo);
    public List<T> readAll();
    public void update(T t);
    public void delete(T t);
    
}
