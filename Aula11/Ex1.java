package Aula11;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.File;
import java.io.FileNotFoundException;





public class Ex1 {
    public static void main(String[] args) {
        TreeMap<String, TreeMap<String, Integer>> map = new TreeMap<>();

        try{
            File file = new File("C:/POO/POO/src/Aula11/major.txt");
            Scanner sc = new Scanner(file);
            
            sc.findAll("[A-zÀ-ú0-9]{3,}") 
                .reduce((prevMatch,  match) -> {
                    String prevWord = prevMatch.group(0);
                    String word = match.group(0).toLowerCase();

                    if( !map.containsKey(prevWord) ) {
                        map.put(prevWord, new TreeMap<>());
                    }
                    if( !map.get(prevWord).containsKey(word) ) {
                        map.get(prevWord).put(word, 1);
                    } else {
                        map.get(prevWord).put(word, map.get(prevWord).get(word));
                        
                    }
                    return match;
                });

            
                System.out.println(map.toString());

                sc.close();
    
            } catch (FileNotFoundException e) {
                System.out.println("Error: File not found.");
                e.printStackTrace();
            }
        }
    }  
    
    

