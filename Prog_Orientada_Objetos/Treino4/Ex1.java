package Treino4;

import java.util.Scanner;


public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira uma frase:");
        String frase = sc.nextLine();


        String frase2 = frase.toLowerCase();
        System.out.println(frase2);
        char frase3 = frase.charAt(frase.length()-1);
        System.out.println(frase3);

        char a1 = frase.charAt(0);
        char a2 = frase.charAt(1);
        char a3 = frase.charAt(2);
        System.out.println(a1+ "," + a2 + "," + a3 );
        int point = frase.codePointAt(0);
        System.out.println(point);
        if(frase.contains("sim")){
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
        


        sc.close();
    }
    
}
