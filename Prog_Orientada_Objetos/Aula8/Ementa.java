package Aula8;

import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;

class PratoDiaria {
    private Prato prato;
    private DiaSemana diaSemana;
    PratoDiaria(Prato prato, DiaSemana diaSemana) {
        this.prato = prato;
        this.diaSemana = diaSemana;
    }
    public String toString() {
        return String.format("%s, dia %s", this.prato, this.diaSemana);
    }
}

public class Ementa {
    private String nome;
    private String local;
    private ArrayList<PratoDiaria> pratos;

    Ementa(String nome, String local) {
        this.nome = nome;
        this.local = local;
        this.pratos = new ArrayList<>();
    }

    public void addPrato(Prato prato, DiaSemana diaSemana) {
        this.pratos.add(new PratoDiaria(prato, diaSemana));
    }

    public String toString() {
        String string = "";
        for (PratoDiaria pratoDiaria : pratos) {
            string += pratoDiaria + "\n";
        }
        return string;
    }
}
