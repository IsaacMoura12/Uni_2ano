package Aula5;
import java.util.Scanner;
import java.io.IOException;


public class Ex1 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        
        Date date = new Date(1,1,0);

        while(true) {
			System.out.println("\nDate operations:");
			System.out.println("1 - create new date");
			System.out.println("2 - show current date");
			System.out.println("3 - increment date");
			System.out.println("4 - decrement date");
			System.out.println("0 - exit");
			System.out.print("\nOption: ");

			int option = sc.nextInt();

			if(option == 1) { // create new date
				System.out.println("\n(create new date)");
				System.out.print("day: ");
				int day = sc.nextInt();
				System.out.print("month: ");
				int month = sc.nextInt();
				System.out.print("year: ");
				int year = sc.nextInt();
				date = new Date(day, month, year);
			} 
			else if(option == 2) { // show current date
				System.out.println(date);
				System.in.read();
			}
			else if(option == 3) {
				System.out.println("\n(increment date)");
				System.out.print("number of days: ");
				int days = sc.nextInt();
				date.increment(days);
			}
			else if(option == 4) {
				System.out.println("\n(decrement date)");
				System.out.print("number of days: ");
				int days = sc.nextInt();
				date.decrement(days);
			}
			else {
				break;
			}
		}

		sc.close();

        
    }
    
}
