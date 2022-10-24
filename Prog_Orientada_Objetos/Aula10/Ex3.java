package Aula10;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.HashSet;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
        String string = "Hello World";   // inserir aqui
        Map<Character, ArrayList<Integer>> map = new HashMap<>();

        int i=0;
        for( Character character : string.toCharArray() ){
            if( !map.containsKey(character) ) 
                map.put(character, new ArrayList<>());
            map.get(character).add(i);
            i++;
        }

        System.out.println(map.toString());
    }
}
