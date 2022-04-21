package apiit.myjava.solution.exercise1;

public class Account {

	public int number;
	public double balance;
	
	public void deposit( double amount ) {
//		System.out.println( "deposit method called..." ); //for debugging purpose
		balance = balance + amount;
	}

	public void withdraw( double amount ) {
//		System.out.println( "withdraw method called..." ); //for debugging purpose
		balance = balance - amount;
	}
	
	
}
