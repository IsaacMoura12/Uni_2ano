package Aula12;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;



public class Ex1 {

public static void main(String[] args) {
    int [] results = counter();
    System.out.printf("Número Total de Palavras: %d\nNúmero de Diferentes Palavras: %d", results[0], results[1]);
    
}


public static int[] counter(){
    int totalwords = 0;
    List<String> words = new ArrayList<>();
    try(Scanner sc = new Scanner(new File("src/Aula12/words.txt"))){

        while (sc.hasNextLine()){
            String word = sc.next();
            totalwords++;
            if(!words.contains(word)){
                words.add(word);
            }
        }
    } catch (FileNotFoundException e){
        e.printStackTrace();
    }
    return new int[]{
        totalwords,words.size()};
    }
}

