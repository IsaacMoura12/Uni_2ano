package Aula3;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um numero inteiro postivo:");
        int numero = scan.nextInt();
        while(numero<=0){
            System.out.print("Inválido, insira um numero inteiro postivo:");
            numero = scan.nextInt();  
        }

        int sum = 0;
        int tmp;
        int tmp2 = numero;
        while(tmp2>0){
            tmp = numero % tmp2;
            if(tmp == 0){
                sum = sum +1;
            
            } 
            tmp2 = tmp2 -1;
            
        }
        if(sum ==2){

            System.out.print(numero+ " É primo.");
        }else{
            System.out.print(numero + " Não é primo");}
        //System.out.print(numero);


        scan.close();
    }
    
}
