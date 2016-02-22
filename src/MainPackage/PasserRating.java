package MainPackage;
import java.util.Scanner;

public class PasserRating {
	private static Scanner input;

	public static void main(String[] args) {
		
		// Allows for user input
		Scanner input = new Scanner(System.in);
		
		
		// Prompts user for all values needed and assigns them a variable name
		System.out.println("Players amount of touchdowns (TD): ");
		double TD = input.nextDouble();
		System.out.println("Players amount of total yards (Yards): ");
		double Yards = input.nextDouble();
		System.out.println("Players amount of interceptions (INT): ");
		double INT = input.nextDouble();
		System.out.println("Players amount of completions (COMP): ");
		double COMP = input.nextDouble();
		System.out.println("Players amount of passes attempted (ATT): ");
		double ATT = input.nextDouble();
		
		// Calculation 1
		double Calculation1;
		Calculation1 = (((COMP/ATT) - .3)*5);
				
		// Calculation 2
		double Calculation2;	
		Calculation2 =  (((Yards/ATT) -3)*.25);
		
		// Calculation 3
		double Calculation3;
		Calculation3 = ((TD/ATT) * 20);
		
		// Calculation 4
		double Calculation4;
		Calculation4 = (2.375 - ((INT/ATT)*25));
		
		// Passer Rating formula declared as variable name QBRating
		double QBRating;
		QBRating = (((Calculation1 + Calculation2 + Calculation3 + Calculation4)/6)*100);

	    
		// Prints the passers rating
		System.out.printf("The players passer rating is: " + QBRating);

	
	}
}

