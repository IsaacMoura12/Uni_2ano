package Aula3;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o mês:");
        int mes = scan.nextInt();
        System.out.print("Insira o ano:");
        double ano = scan.nextDouble();
        int dias;

        // ver se é ano bissexto:
        boolean val;
        if(ano % 100 == 0){
            if(ano % 400 == 0){
                val = true;
            }else{
                val = false;
            }
        }else if((ano % 4 == 0 ) && (ano % 100 !=0)) {
                val = true;
        } else{
            val = false;
        }
        
        
        int tmp1[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        

        if(val == true){
            if(mes == 2){
                dias = 29;
                System.out.print(dias + " dias.");
            }else{dias = tmp1[mes];
                System.out.print(dias + " dias.");
            }
        }else{
            if(mes==2){
                dias = 28;
                System.out.print(dias + " dias.");

            }else{dias = tmp1[mes];
            System.out.print(dias + " dias.");}
        }
         
         
            
            


    

        scan.close();
    }
    
}

