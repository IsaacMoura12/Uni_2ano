package Aula8;

public class Carne extends Alimento{
    private VariedadeCarne variedadeCarne;



    Carne(VariedadeCarne variedadeCarne, double calorias, double proteinas, double peso){
        super(proteinas, calorias, peso);
        this.variedadeCarne = variedadeCarne;
    }


    public String toString(){

        return String.format("Carne %s, %s", variedadeCarne, super.toString());
    }
    
}
