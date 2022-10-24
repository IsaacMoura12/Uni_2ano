package Aula2;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Montante Investido:");
        double money = scan.nextDouble();
        System.out.print("Insira a taxa de juros mensal");
        double juro = scan.nextDouble();
        
        double tmp2 = juro * 100;
        for(int i = 1; i<=3;i++){
            double tmp1 = money/tmp2;
            money = money + tmp1;



        }

        System.out.print(money);
        scan.close();


    }
}
