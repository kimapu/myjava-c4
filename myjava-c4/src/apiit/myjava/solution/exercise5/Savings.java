package apiit.myjava.solution.exercise5;
/**
 * @author kimlee
 *	
 *	Inheritance relationship 
 *		
 *		Savings is-a-kind-of Account === Savings extends Account
 */
public class Savings extends Account{

	/**
	 * special-attr
	 */
	public double interestRate;
	
	//constructor
	public Savings() {}
	
	/**
	 * + calcInterest() : double
	 */
	public double calcInterest() {
		return super.balance * interestRate;
	}
	
	/**
	 * + addToBalance(double) : void
	 */
	public void addToBalance( double interest ) {
		super.deposit(interest);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder( super.toString() );
		sb.append( "\nRate: "+ interestRate );
		return sb.toString();
	}
	
}
