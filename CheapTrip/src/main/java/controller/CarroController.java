package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.entidades.Carro;
import model.implementacoes.CarroHibernateDAO;

/**
 *
 * @author Mark IV
 */
@ManagedBean
@SessionScoped
public class CarroController {
    private CarroHibernateDAO carroHDAO = null;
    private Carro cadCarro;
    private Carro selectedCarro;

    public CarroController() {
        this.carroHDAO = new CarroHibernateDAO();
        this.cadCarro = new Carro();
    }

    public CarroHibernateDAO getCarroHDAO() {
        return carroHDAO;
    }

    public void setCarroHDAO(CarroHibernateDAO carroHDAO) {
        this.carroHDAO = carroHDAO;
    }

    public Carro getCadCarro() {
        return cadCarro;
    }

    public void setCadCarro(Carro cadCarro) {
        this.cadCarro = cadCarro;
    }

    public Carro getSelectedCarro() {
        return selectedCarro;
    }

    public void setSelectedCarro(Carro selectedCarro) {
        this.selectedCarro = selectedCarro;
    }
    
}
