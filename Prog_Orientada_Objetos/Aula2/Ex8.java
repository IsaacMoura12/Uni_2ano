package Aula2;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o valor do cateto1:");
        double cat1 = scan.nextDouble();

        System.out.print("Insira o valor do cateto2:");
        double cat2 = scan.nextDouble();

        double hip = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
        System.out.printf("O comprimento da hipotenusa é: "+ "%.2f",hip);


        double seno = cat2/hip;
        
        double angulo = Math.asin(seno);
        double graus = (angulo*180)/Math.PI;



        
        System.out.printf(" e o valor do angulo é: " + "%.2f" ,graus);
        scan.close();
        
    }
    
}
