package Treino4;
import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira uma frase:");
        String frase = sc.nextLine();

        //System.out.println(countDigits(frase));
        //System.out.println(countSpaces(frase));
        //System.out.println(isLower(frase));
        //System.out.println(Spaces(frase));
        System.out.println(Palindrome(frase));
        

        sc.close();
    }


    public static int countDigits(String frase){

        int count = 0;

        for(int i = 0; i <= frase.length()-1;i++){
           
            if(Character.isDigit(frase.charAt(i))){
                count = count +1;
            } 
            
        }
        return count;
    }


    public static int countSpaces(String frase){
        int count = 0;
        char[] ch = frase.toCharArray();        

        for(int i = 0; i<= ch.length-1;i++){
            if(ch[i]== ' '){
                count = count +1;
            }
        }
        return count;
    }


    public static boolean isLower(String frase){
        String frase2 = frase.toLowerCase();
        boolean val;
        if(frase2.equals(frase)){
            val = true;
            
        }else{val = false;}
        return val;

    }


    public static String Spaces(String frase){
        String s = frase.trim().replaceAll("+ ", " ");
        return s;

        
    }

    public static boolean Palindrome(String frase){
        boolean val;

        String reverse = "";

        for(int i= frase.length()-1;i>=0;i--){
            reverse = reverse + frase.charAt(i);

        }

        if(reverse.equals(frase)){
            val = true;
        } else{ val = false;}
        return val;
    }

    
}
