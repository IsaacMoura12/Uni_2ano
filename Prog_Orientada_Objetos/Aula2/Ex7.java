package Aula2;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira a abcissa do ponto1:");
        double x1 = scan.nextDouble();
        System.out.println("Insira a ordenada do ponto1:");
        double y1 = scan.nextDouble();
        System.out.println("Insira a abcissa do ponto2:");
        double x2 = scan.nextDouble();
        System.out.println("Insira a ordenada do ponto2:");
        double y2 = scan.nextDouble();

        double temp1 = Math.pow(x2 - x1,2);
        double temp2 = Math.pow(y2 - y1,2);
        double distancia = Math.sqrt((temp1+temp2));
        System.out.printf("A distancia entre os pontos é:" +"%.2f", distancia);
        scan.close();


    }
}
