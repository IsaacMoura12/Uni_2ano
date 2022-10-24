package Aula10;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        
        double start = System.nanoTime();

        Map<String, String> map = new HashMap<>();
        
        map.put("branco", "Que tem a cor de neve");
        map.put("azul", "cor de oceano");
        map.put("verde", "cor de relva");
        map.put("castanho", "cor de  m");
        map.put("joao", "cor de telhado");

        map.put("azul", map.get("azul").replaceAll("oceano", "lagoa"));
        map.remove("joao");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue() + " :)");
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " :)");
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getValue() + " :)");
        }
        double stop = System.nanoTime();
        stop -= start;
        stop /= 1e6;

        System.out.println(stop);
    }
}
