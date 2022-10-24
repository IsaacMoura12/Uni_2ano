package Aula8;

public class Cereal extends Alimento {
    private String nome;

    Cereal(String nome, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.nome = nome;
    }

    public String toString() {
        return String.format("Cereal %s, %s", this.nome, super.toString());
    }
}