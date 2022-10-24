package Treino4;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira uma frase:");
        String frase1 = sc.nextLine();
        String tmp = "";

        String frase = frase1.toUpperCase();

        String[] splited = frase.split(" ");
        for(int i = 0; i>= splited.length-1;i++){
            String a = splited[i];
            int b = a.length();

            if(b>=3){
                String inicial = splited[i].substring(0,1);
                tmp = tmp + inicial;}

            

        }
        System.out.println(tmp);
        sc.close();


    }
    
}
