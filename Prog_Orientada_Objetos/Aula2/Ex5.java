package Aula2;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insere a v1:");
        double v1 = scan.nextDouble();
        System.out.println("Insere a distância 1:");
        double distancia1 = scan.nextDouble();
        
        System.out.println("Insere a v2:");
        double v2 = scan.nextDouble();
        System.out.println("Insere a distância 2:");
        double distancia2 = scan.nextDouble();

        double tempo1 = distancia1/v1;
        double tempo2 = distancia2/v2;
        double tempo = tempo1+ tempo2;
        double distanciatotal = distancia1 + distancia2;
        double vmedia = distanciatotal/tempo;
        System.out.printf("A velocidade média é:"+ "%.2f",vmedia);
        scan.close();


        
    }
}
