package Aula4;
import java.util.Scanner;


public class Ex4 {


        public final static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            String[] mesesNomes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    
            int mes = readInRange("Mes: ", 1, 12);
            int ano = readInteger("Ano: ");
            int diaDaSemana = readInRange("Dia da semana: ", 1, 7);
    
            int diasDoMes = diasNoMes(mes, ano);
    
            System.out.println("\n");
    
            // print mes e ano centrados
            String header = mesesNomes[mes-1] + " " + ano;
            for(int i = 0; i < (20-header.length())/2 ; i++) {
                System.out.print(" ");
            }
            System.out.println(header);
    
            System.out.println("Su Mo Tu We Th Fr Sa");
    
            // preenche os dias em branco
            for(int i = 0; i < (diaDaSemana-1); i++)
            System.out.print("   ");
            
            int x = diaDaSemana-1;
            for(int i = 1; i <= diasDoMes; i++) {
                System.out.printf("%2d ", i);
                x += 1;
                if( x>=7 ) {
                    x = 0;
                    System.out.println();
                }
            }
            System.out.println("\n");
        }
    
        public static int diasNoMes(int mes, int ano) {
            int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};
    
            int bissexto = 0;
            if( mes==2 && ((ano % 400 == 0) || ( (ano % 4 == 0) && (ano % 100 != 0) )) )
                bissexto = 1;
            
            return dias[mes-1]+bissexto;
        }
    
        public static int readInteger(String text) {
            return readInRange(text, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
    
        public static int readInRange(String text, int min, int max) {
            int n;
            while( true ) {
                System.out.print(text);
                if(!sc.hasNextInt()) {
                    sc.next();
                    continue;
                }
                n = sc.nextInt();
                if( n>=min && n<=max ) // if number in range
                    break;
                else
                    System.out.println("Number not in range!");
            }
            return n;
        }
    }

