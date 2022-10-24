package Aula4;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma frase/palavra");
        String word = sc.nextLine();
        
        String LOWER = word.toLowerCase();

        char tmp = word.charAt(word.length()-1);
        char c0 = word.charAt(0);
        char c1 = word.charAt(1);
        char c2 = word.charAt(2);
        int point = word.codePointAt(0);
        if (word.contains("sim")){
            System.out.println("Bom dia");


        }

        System.out.println(LOWER);
        System.out.println("ultimo caractere:" +tmp);
        System.out.println(c0+","+c1+","+c2);
        System.out.println(point);

        sc.close();

    }
    
}
