package Aula8;

public class PratoVegetariano extends Prato {
    PratoVegetariano(String nome) {
        super(nome);
    }

    @Override
    public boolean addIngrediente(Alimento alimento) {
        if( !alimento.getClass().equals(Carne.class) ) {
            super.addIngrediente(alimento);
            return true;
        }
        return false;
    } 

    public String toString() {
        return String.format("%s - Prato Vegetariano", super.toString());
    }
}