package apiit.myjava.solution.exercise5;

import java.time.LocalDate;

public class Account extends Object{

	//default-constructor
	public Account() {}
	
	/**
	 * data-member
	 */
	public long number;
	public double balance;
	public LocalDate dateCreated;
	
	/**
	 * + deposit(double) : void
	 */
	public void deposit( double amt ) {
		//logic-code
		balance += amt;
	}
	
	/**
	 * + withdraw(double) : void
	 */
	public void withdraw( double amt ) {
		//logic-code
		balance -= amt;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(">> Account details...");
		sb.append("\nAcc #: "+ number);
		sb.append("\nBalance: "+ balance);
		sb.append("\nDate created: "+ dateCreated);
		return sb.toString(); 
	}

	@Override
	public boolean equals(Object next) {
		//explicit-casting
		Account nextAcc = (Account)next;
		return this.number == nextAcc.number;
	}
	
	
	
}
