package Aula3;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean val;

        // nota pratica
        System.out.print("Insira a nota Prática:");
        double pratica = scan.nextDouble();
        if((pratica <=20) && (pratica>= 0))
             val  = true;
            
        else{
        System.out.print("Nota inválida, insira a nota Prática:");
        pratica = scan.nextDouble();

        while(pratica>20 || pratica <0){
            System.out.print("Nota inválida, insira a nota Teórica:");
            pratica = scan.nextDouble();}
                }
    
        
        // nota teorica
        System.out.print("Insira a nota Teórica:");
        double teorica = scan.nextDouble();
        

        if((teorica <=20) && (teorica>= 0))
            val = true;
        else{
            System.out.print("Nota inválida, insira a nota Teórica:");
            teorica = scan.nextDouble();

            while(teorica>20 || teorica <0){
        System.out.print("Nota inválida, insira a nota Teórica:");
        teorica = scan.nextDouble();}
            }
    



        // calculo da nota final
        double nota;
        if (pratica < 7 || teorica <7){
            nota = 66;
            System.out.println("Reprovado por nota mínima");

        }else{
        nota = (0.4*pratica)+(0.6 *teorica);
        System.out.printf("Nota final:" + "%.2f", nota);}

        scan.close();
    
    }
    
}
