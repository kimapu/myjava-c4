package apiit.myjava.solution.exercise5;
/**
 * @author kimlee
 *	
 *	Inheritance relationship 
 *		
 *		Current is-a-kind-of Account === Current extends Account
 */
public class Current extends Account{

	/**
	 * special-attr
	 */
	public final int FEE = 1; //RM1 charged per-tranx
	public int freeTranx = 5;
	public int tranxCount = 0;
	
	//constructor
	public Current() {}
	
	/**
	 * - handleTranx() : void
	 */
	private void handleTranx() {
		if ( ++tranxCount > freeTranx ) {
			super.withdraw(FEE);
		}
	}
	
	/**
	 * overriding methods for deposit/withdraw
	 */
	@Override
	public void deposit( double amt ) {
		System.out.println( ">> Current - deposit tranx" );
		handleTranx();
		super.balance += amt;
	}
	
	@Override
	public void withdraw( double amt ) {
		System.out.println( ">> Current - withdraw tranx" );
		handleTranx();
		super.balance -= amt;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder( super.toString() );
		sb.append( "\nTranx Fee: "+ FEE );
		sb.append( "\nFree Transaction: "+ freeTranx );
		sb.append( "\nTransaction performed: "+ tranxCount );
		return sb.toString();
	}
}
