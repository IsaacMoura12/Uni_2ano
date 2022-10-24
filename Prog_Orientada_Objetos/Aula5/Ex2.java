package Aula5;
import java.util.Scanner;
import java.io.IOException;
public class Ex2 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
         Calendar calendar = new Calendar(0,1);



        while(true) {
			System.out.println("\nDate operations:");
			System.out.println("1 - create new calendar");
			System.out.println("2 - print calendar month");
			System.out.println("3 - print calendar");
			System.out.println("0 - exit");
			System.out.print("\nOption: ");

			int option = sc.nextInt();

			if(option == 1) { // create new calendar
				System.out.println("\n(create new calendar)");
				System.out.print("year: ");
				int year = sc.nextInt();
				System.out.print("weak day: ");
				int weakDay = sc.nextInt();
				calendar = new Calendar(year, weakDay);
			} 
			else if(option == 2) { // print calendar month
				System.out.println("\n(print calendar month)");
				System.out.print("month: ");
				int month = sc.nextInt();
				System.out.print(calendar.printMonth(month));
				System.in.read();
			}
			else if(option == 3) {
				System.out.println(calendar);
				System.in.read();
			}
			else {
				break;
			}
		}

		sc.close();
	}
        




        
    
    
}
