package Aula3;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         double turma[][] = new double[17][17];
         double notas[] = new double[16];
         
        int i = 0;

        while(i<16){
        boolean val;

        // nota pratica
        System.out.print("Insira a nota Prática:");
        double pratica = scan.nextDouble();
        if((pratica <=20) && (pratica>= 0))
             val  = true;
            
        else{
        System.out.print("Nota inválida, insira a nota Prática:");
        pratica = scan.nextDouble();

        while(pratica>20 || pratica <0){
            System.out.print("Nota inválida, insira a nota Teórica:");
            pratica = scan.nextDouble();}
                }
    
        
        // nota teorica
        System.out.print("Insira a nota Teórica:");
        double teorica = scan.nextDouble();
        

        if((teorica <=20) && (teorica>= 0))
            val = true;
        else{
            System.out.print("Nota inválida, insira a nota Teórica:");
            teorica = scan.nextDouble();

            while(teorica>20 || teorica <0){
        System.out.print("Nota inválida, insira a nota Teórica:");
        teorica = scan.nextDouble();}
            }
    
            turma[i][i] = teorica;
            turma[i][i+1] = pratica;


        // calculo da nota final
        //double notas[] = new double[16];
        double nota;
        if (pratica < 7 || teorica <7){
            nota = 66;
            notas[i] = nota;
            //System.out.println("Reprovado por nota mínima");

        }else{
        nota = (0.4*pratica)+(0.6 *teorica);
        notas[i] = nota;}
        
        //System.out.printf("Nota final:" + "%.2f", nota);}
        i = i +1;
        
        }

        int a = 0;
        while(a<=16){
        //System.out.printf("%2d%2d%2d",turma[a][0],turma[a][1], notas[a]);
        //System.out.printf("%2d%n", notas[a] );
        System.out.print(notas[a]);
        System.out.print( turma[a][0]);
        System.out.print( turma[a][1]);
        a = a +1;

        }




        scan.close();
    







       
        
    }
    
}
