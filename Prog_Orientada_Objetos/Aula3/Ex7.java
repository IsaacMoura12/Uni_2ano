package Aula3;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String resposta = "Sim";

        while(resposta.equals("Sim")|| resposta.equals("S")){


        int valor = 1 + (int)(Math.random() * ((100 - 1) + 1));
        

        System.out.println("Adivinha o numero!");
        System.out.print("Tentativa:");
        int tentativa = scan.nextInt();
        int count = 1;
        if(tentativa > valor){
            System.out.println("Demasiado alta!");
        }else{
            System.out.println("Demasiado baixa!");
        }

        while(tentativa != valor){
            System.out.print("Tentativa:");
            tentativa = scan.nextInt();
            if(tentativa > valor){
                System.out.println("Demasiado alta!");
            }else{
                System.out.println("Demasiado baixa!");
            }
            count = count +1;

        }
        if(tentativa == valor){

            System.out.println("Correto!  " + count + " tentativas.");
            System.out.print("Pretende continuar? Prima (S)im");
            resposta = scan.next();}

        
    }
    scan.close();
    }
    
}
