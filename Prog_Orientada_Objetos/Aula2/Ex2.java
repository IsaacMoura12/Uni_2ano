package Aula2;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor da temperatura em Celsius:");
        int graus = scan.nextInt();
        double far = (graus * 1.8) + 32;
        System.out.print("O valor em fahrenheit é: " + far);
        scan.close();

        
    }
}
