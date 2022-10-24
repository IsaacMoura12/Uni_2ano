package Aula8;

import java.util.ArrayList;
import java.util.List;


public class Empresa {
    private String nome;
    private String codigoPostal;
    private String email;
    private List<Viatura> viaturas;

    public Empresa(String nome, String codigoPostal, String email) {
        
            this.nome = nome;
            this.codigoPostal = codigoPostal;
            this.email = email;
            viaturas = new ArrayList<Viatura>();
        

    }

    public Empresa(String nome, String codigoPostal, String email, List<Viatura> viaturas) {
        this(nome, codigoPostal, email);
        this.viaturas = viaturas;
    }

    

    @Override
    public String toString() {
        return "Empresa [codigoPostal=" + codigoPostal + ", email=" + email + ", nome=" + nome + ", viaturas="
                + viaturas + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Viatura> getViaturas() {
        return viaturas;
    }

    public void setViaturas(List<Viatura> viaturas) {
        this.viaturas = viaturas;
    }

}