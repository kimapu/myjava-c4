package apiit.myjava.solution.exercise5;

import java.time.LocalDate;

public class App {

	/**
	 * Client program
	 */
	public static void main(String[] args) {
		
		//in your spare time, create command-prompt for this exercise...
		
		//@Test3
		Current curr = new Current();
		curr.number = 654321;
		curr.balance = 2000;
		curr.dateCreated = LocalDate.now();
		System.out.println( curr );
		
		System.out.println("\n>> Performing transaction [6 deposit] ");
		curr.deposit(10);
		curr.deposit(10);
		curr.deposit(10);
		curr.deposit(10);
		curr.deposit(10);
		
		curr.deposit(10); //charged rm1
		System.out.println( "\n"+curr );
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		//@Test2
		Savings svg1 = new Savings();
		svg1.number = 123456;
		svg1.balance = 1000;
		svg1.dateCreated = LocalDate.now();
		svg1.interestRate = 0.03;
		//System.out.println( svg1 );
		
		double interest = svg1.calcInterest();
		svg1.addToBalance(interest);
		//System.out.println( svg1 );
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		//@Test1
		Account acc1 = new Account();
		acc1.number = 123;
		//System.out.println( acc1 );
		
		Account acc2 = new Account();
		acc2.number = 123;
		//System.out.println( acc2 );
		
		//System.out.println( acc1.equals(acc2) );
		
	}
	
}
