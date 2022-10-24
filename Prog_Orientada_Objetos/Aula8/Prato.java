package Aula8;

import java.util.ArrayList;
import java.util.List;

public class Prato {
    private String nome;
    private List<Alimento> composicao;

    Prato(String nome) {
        this.nome = nome;
        this.composicao = new ArrayList<>();
    }

    public boolean addIngrediente(Alimento alimento) {
        this.composicao.add(alimento);
        return true;
    }

    public double totalCalorias() {
        double total = 0;
        for(Alimento alimento : composicao) {
            total += alimento.getCalorias();
        }
        return total;
    }

    public String toString() {
        return String.format("Prato \'%s\', composto por %d Ingredientes", this.nome, this.composicao.size());
    }
}
