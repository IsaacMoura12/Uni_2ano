package Aula3;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o montante investido:");
        double montante = scan.nextDouble();

        
        while(montante<0){
            System.out.print("Valor invalido, insira montante:");
            montante = scan.nextDouble();}
        
        while  ( montante % 1000 != 0){
            System.out.print("Valor invalido, insira montante:");
            montante = scan.nextDouble();
        }

        System.out.print("Insira a taxa de juros mensal:");
        double taxa = scan.nextDouble();

        while (taxa < 0 || taxa >5){
            System.out.print("Valor invalido, insira a taxa:");
            taxa = scan.nextDouble();

        }

        

        // calculo dos juros:

        int i = 12;
        double juro = taxa/100;
        int tmp = 1;
        
        
        while(i>0){
            double money = montante * juro;
            montante = montante + money;
            i = i -1;
            
            System.out.printf(tmp + " Mes:"  + "%.2f %n", montante );
            tmp = tmp +1;
            
        }
        
        








        scan.close();
    }
    
}
