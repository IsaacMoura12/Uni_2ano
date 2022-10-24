package Aula2;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insere o tempo em segundos:");
        int segundos = scan.nextInt();

        int horas = segundos/3600;
        int minutos = (segundos/60) % 60;
        int segundos1 = (segundos/60) / 60;
        System.out.print(horas +":"+minutos +":"+segundos1);
        scan.close();

        
    }
    
}
