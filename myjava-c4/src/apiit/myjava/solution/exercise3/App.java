package apiit.myjava.solution.exercise3;

import java.util.Scanner;

public class App {


	/**
	 * Use do-while construct, write a program that prompts the users to continue the program execution. 
	 * 	“Yes” to continue the program and “No” to terminate the program.
	 */

	public static void main(String[] args) {
		
		InvestmentComputer app = new InvestmentComputer();
		Scanner scan = new Scanner( System.in );
		String cont;
		do {
			
			//prompt the user for future investment details
			System.out.println("Enter investment amount: ");
			double amount = scan.nextDouble();
			System.out.println("Enter annual interest rate: ");
			double annualRate = scan.nextDouble();
			System.out.println("Enter number of year: ");
			int yr = scan.nextInt();
			
			double futureInvestmentValue = app.compute(amount, annualRate, yr);
			System.out.printf("\n>>> Your future investment value: %.2f\n", futureInvestmentValue);
			
			System.out.println("\n>>> Do you wanna continue [yes/no]? ");
			cont = scan.next();
			System.out.println();
			
		}while( cont.equalsIgnoreCase("yes") );
		System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println( ">>> Thankyou!" );
		
	}
	
}
