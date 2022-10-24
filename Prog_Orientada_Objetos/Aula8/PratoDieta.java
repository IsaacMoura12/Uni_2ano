package Aula8;

public class PratoDieta extends Prato {
    private double maxCalorias;

    PratoDieta(String nome, double maxCalorias) {
        super(nome);
        assert maxCalorias>0;
        this.maxCalorias = maxCalorias;
    }

    @Override
    public boolean addIngrediente(Alimento alimento) {
        if( super.totalCalorias()+alimento.getCalorias() < this.maxCalorias ) {
            super.addIngrediente(alimento);
            return true;
        }
        return false;
    }    

    public String toString() {
        return String.format("%s - Prato Dieta(%.1f Calorias)", super.toString(), super.totalCalorias());
    }
}
