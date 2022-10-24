package Aula2;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Insira a distância em km:");
    int km = scan.nextInt();
    double milhas = (km / 1.609);
    System.out.print("A distância em milhas é:" + milhas);
    scan.close();


    }
}
