package Aula3;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduza um numero para iniciar a contagem decrescente:");
        int numero = scan.nextInt();

        while(numero >=0){
            System.out.println(numero);
            numero = numero -1;
        }

       scan.close(); 
    }
}
