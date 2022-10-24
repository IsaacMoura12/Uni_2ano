package Aula4;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira uma string:");
        String s = sc.nextLine();
        System.out.println(countDigits(s));
        System.out.println(countSpaces(s));
        System.out.println(countLower(s));
        System.out.println(Spaces(s));
        System.out.println(isPalindrome(s));






        sc.close();
    }
    

    public static int countDigits(String s){
        int count = 0;
        for(int i = 0; i <= s.length()-1;i++){
           //char tmp = s.charAt(i);
           if( Character.isDigit(s.charAt(i))){
               count = count +1;
           }

        }
        return count;
        
    }

    public static int countSpaces(String s){
        int spaces = 0;
        String tmp = s;
        char ch[] = tmp.toCharArray();
        for(int i = 0; i<= ch.length-1;i++){
            if(ch[i] ==' '){
                spaces = spaces +1;

            }

        }
        return spaces;
    }

    public static boolean countLower(String s){
        boolean tmp;
        int count = 0;

        String ss = s;
        char ch[] = ss.toCharArray();
        for(int i = 0; i<= ch.length-1;i++){
            if(Character.isUpperCase(ch[i])){
                count = count +1;
            }
        }
        if(count>0){
            tmp = false;
        } else{
            tmp = true;
        }
        return tmp;
    }


    public static String Spaces(String s){
        String nova = s.trim().replaceAll(" +", " ");
        return nova;
    }


    public static Boolean isPalindrome(String s){
        //boolean tmp;
        //String nova = s.toLowerCase();
        String reverse = "";
        for( int i = (s.length())-1; i>= 0;i-- ){
            reverse = reverse + s.charAt(i);
        }

        if(s.toLowerCase().equals(reverse.toLowerCase())){

            return true;
        }else{
            
            return false;
           
        }
        
        
    }



}
