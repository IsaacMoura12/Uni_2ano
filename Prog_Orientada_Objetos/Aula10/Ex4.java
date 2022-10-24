package Aula10;


import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new FileReader("teste.txt"));

        HashSet<String> hs = new HashSet<>();
        HashSet<String> h1 = new HashSet<>();
        HashSet<String> full = new HashSet<>();

        while(input.hasNext()){
            String word = input.next();
            
            full.add(word);

            if(word.length() > 2)
                hs.add(word);
                
            int a = word.length();
            if(word.lastIndexOf('s') == --a){
                h1.add(word);
            }
            if(!word.matches("\\D+"))
                full.remove(word);

            System.out.println(word);
        }
        System.out.println();

        System.out.println(full);

        System.out.println();

        System.out.println(h1);

        System.out.println();


        for (String a : hs) {
            System.out.println(a);
        }
    }    
}


