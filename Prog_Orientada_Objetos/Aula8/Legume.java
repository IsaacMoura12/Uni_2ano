package Aula8;

public class Legume extends Alimento {
    private String nome;

    Legume(String nome, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.nome = nome;
    }

    public String toString() {
        return String.format("Legume %s, %s", this.nome, super.toString());
    }
}