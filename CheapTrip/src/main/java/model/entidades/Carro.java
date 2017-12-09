package model.entidades;

import java.util.Objects;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Mark IV
 */
@Entity
@ManagedBean
@RequestScoped
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_carro;
    @Column(length = 15)
    private String nome;
    @Column(length = 3,nullable = false,updatable = true)
    private int vagas;
    @Column(length = 7,nullable = false)
    private String placa;
    @Column
    private String chassi;
    
    @Deprecated
    public Carro() {
    }

    public Carro(String nome, int vagas, String placa, String chassi) {
        this.nome = nome;
        this.vagas = vagas;
        this.placa = placa;
        this.chassi = chassi;
    }

    public int getId_carro() {
        return id_carro;
    }

    public void setId_carro(int id_carro) {
        this.id_carro = id_carro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carro other = (Carro) obj;
        if (this.id_carro != other.id_carro) {
            return false;
        }
        if (this.vagas != other.vagas) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        if (!Objects.equals(this.chassi, other.chassi)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Carro{" + "id_carro=" + id_carro + ", nome=" + nome + ", vagas=" + vagas + ", placa=" + placa + ", chassi=" + chassi + '}';
    }
    
    
}
