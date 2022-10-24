package Aula8;

public abstract class Alimento {
    private double proteinas;
    private double calorias;
    private double peso;


    Alimento(double proteinas, double calorias, double peso){
        this.calorias = calorias;
        this.proteinas = proteinas;
        this.peso = peso;
    }

    public double getCalorias(){
        return this.calorias;
    }

    public double getProteinas(){
        return this.proteinas;

    }

    public double getPeso(){

        return this.peso;
    }


    public String toString(){

        return String.format("Proteinas %.1f, calorias %.1f, Peso %.1f", this.proteinas, this.calorias, this.peso);
    }
}
