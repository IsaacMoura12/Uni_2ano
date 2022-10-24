package Aula8;

public class Peixe extends Alimento {
    private TipoPeixe tipoPeixe;

    Peixe(TipoPeixe tipoPeixe, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.tipoPeixe = tipoPeixe;
    }

    public String toString() {
        return String.format("Peixe %s, %s", tipoPeixe, super.toString());
    }
}
