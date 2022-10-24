package Aula11;
import java.util.Scanner;
import java.util.HashMap;
import java.io.File;
import java.util.TreeMap;

public class Ex2 {
    public static void main(String[] args) {

        HashMap<String, Companhia> companhias = new HashMap<>();
        TreeMap<String, Voo> voos = new TreeMap<>();



        


/* HashSet para Companhias */
try {
    File companhiasFile = new File("./src/Aula11/companhias.txt");
    Scanner companhiasScanner = new Scanner(companhiasFile);

    companhiasScanner.nextLine(); // avança cabeçalho

    companhiasScanner.findAll(".*\n")
        .forEach(companhia -> {
            String[] row = companhia.group(0).trim().split("\t");
            companhias.put(row[0], new Companhia(row[0], row[1]));
        });

    companhiasScanner.close();

} catch (Exception e) {
    System.out.println(e);
    return;
}

/*  HashSet para  Voos */
try {
    File voosFile = new File("./src/Aula11/voos.txt");
    Scanner voosScanner = new Scanner(voosFile);

    voosScanner.nextLine(); // avança cabeçalho

    voosScanner.findAll(".*\n")
        .forEach(voo -> {
            String[] row = voo.group(0).trim().split("\t");
            voos.put(row[0]+row[1], new Voo(row[0], row[1], row[2], row.length==4 ? row[3] : null));
        });
    
    voosScanner.close();

} catch (Exception e) {
    System.out.println(e);
    return;
}



System.out.printf("\n%-7s%-10s%-25s%-25s%-10s%s\n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");
voos.forEach((code, voo) -> {
    Companhia companhia = companhias.get(voo.code.substring(0, 2));
    if( companhia==null ) {
        companhia = new Companhia(code, voo.code.substring(0, 2));
        companhias.put(companhia.code, companhia);
    }
    System.out.printf("%-7s%-10s%-25s%-25s%-10s%s\n", voo.time, voo.code, companhia.name, voo.city, voo.delay!=null ? voo.delay : "", voo.delay!=null ? voo.atraso() : "");
});
}
}


// classes

class Voo {
protected String time;
protected String code;
protected String city;
protected String delay;
Voo(String time, String code, String city, String delay) {
this.time = time;
this.code = code;
this.city = city;
this.delay = delay;
}

public String toString() {
return String.format("%s\t%s\t%s\t%s", this.time, this.code, this.city, this.delay);
}

public String atraso() {
int totalMinutesCurrent = Integer.parseInt(this.time.substring(0, 2)) * 60 + Integer.parseInt( this.time.substring(3) );
int totalMinutesDelay = Integer.parseInt(this.delay.substring(0, 2)) * 60 + Integer.parseInt( this.delay.substring(3) );
int finalMinutes = totalMinutesCurrent + totalMinutesDelay;
return String.format("Previsto: %02d:%02d", finalMinutes/60, finalMinutes%60);
}
}

class Companhia {
protected String code;
protected String name;
Companhia(String code, String name) {
this.code = code;
this.name = name;
}

public int hashCode() {
return this.code.charAt(0) + this.code.charAt(1)*100;
}

public String toString() {
return String.format("%s\t%s", this.code, this.name);
}
}