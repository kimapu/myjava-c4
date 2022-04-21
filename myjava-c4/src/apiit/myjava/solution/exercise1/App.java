package apiit.myjava.solution.exercise1;

import java.util.Scanner;

public class App {


	public static void main(String[] args) {
		
		console();
		
	}
	
	static void console() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter account number: ");
		int accNo = scan.nextInt();
		System.out.println("\nEnter account initial balance: ");
		double balance = scan.nextDouble();
		
		Account acc1 = new Account();
		acc1.number = accNo;
		acc1.balance = balance;
		
		String again = "";
		do {
			//perform-transaction
			System.out.println( ">>>Transaction..." );
			//performTransaction();
			System.out.println( "1) Deposit ");
			System.out.println( "2) Withdraw ");
			
			System.out.println("Select option [1/2]: ");
			int option = scan.nextInt();
			System.out.println("Amount? ");
			double amt = scan.nextDouble();
			switch(option) {
				case 1:
					acc1.deposit( amt );
					System.out.println( "\n>>> Current balance: "+acc1.balance );
					break;
				case 2:
					acc1.withdraw( amt );
					System.out.println( "\n>>> Current balance: "+acc1.balance );
					break;
				default:
					System.out.println( "Invaid option!" );
					break;
			}
			
			System.out.println( "\nContinued? [yes/no]" );
			again = scan.next();
		}while( again.equalsIgnoreCase( "yes" ) );
		System.out.println("\n>>>Thank you...");
		System.exit(0);
	}

	static void test() {
		//input-value
		int accNo = 1112233333;
		double balance = 20000;
		
		//make Account object with data-values
		Account acc1 = new Account();
		acc1.number = accNo;
		acc1.balance = balance;
		System.out.println( ">>>Initial Balance-"+acc1.balance );
		
		
		//perform tranx
		double amt = 1000;
		System.out.println( ">>>WITHDRAW- "+amt );
		acc1.withdraw(amt);
		System.out.println( "\n>>>Balance-"+acc1.balance );
		

		amt = 2000;
		System.out.println( "\n>>>DEPOSIT- "+amt );
		acc1.deposit(amt);
		System.out.println( "\n>>>Balance-"+acc1.balance );
	}
	
}
