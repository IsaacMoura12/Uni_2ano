package Aula2;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a massa de agua a aquecer:");
        double agua = scan.nextDouble();
        System.out.println("Insira a temp inicial:");
        double t1 = scan.nextDouble();
        System.out.println("Insira a temp final:");
        double t2 = scan.nextDouble();

        double temp = t2 - t1;
        double joules = (agua * temp) + 4184;
        System.out.print("A energia necessária é: " + joules + " Joules");
        scan.close();
        

        
    }
    
}
