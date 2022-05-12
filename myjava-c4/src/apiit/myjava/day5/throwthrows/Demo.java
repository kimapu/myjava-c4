package apiit.myjava.day5.throwthrows;

public class Demo {

	public static void main(String[] args) {

		boolean onThrows = true;
//		boolean onThrows = false;
		
		if (onThrows) {
			//throws demo
			showFirst();		
			try {
				showLast();	
			} 
			catch (ArrayIndexOutOfBoundsException e1) {
				System.err.println("> Out of bound!");
			}
			
		}else {
			//throw demo
			try {
				negative(-1);
			} catch (Exception e) {
				System.err.println( e.getMessage() );
			}
			
		}
		
	}
	
	/**
	 * throws vs. throw
	 */
	
	static void showLast() throws ArrayIndexOutOfBoundsException
	{
		
		int[] n = {1,2,3,4,5};//index-> 0, 1, 2, 3, 4

		System.out.println( "Last element"+ n[5] ); //JVM generates Exception event
		
	}

	static void showFirst() 
	{
		
		int[] n = {1,2,3,4,5};//index-> 0, 1, 2, 3, 4

		try {
			System.out.println( "Last element"+ n[-1] ); //JVM generates Exception event
		} catch (Exception e) {
			System.err.println("> Out of bound!");
		}
		
	}
	
	static boolean negative(int n) throws Exception //1)
	{
		//handling is deferred to calling code
		if( n < 0 )
			throw new Exception("> Negative value!"); //Programmer tries to generate Exception event
		return true;
	}
	
	static boolean positive(int n) //2
	{
		//handling presents
		try {
			if( n > 0 )
				throw new Exception("> Positive value!"); //Programmer tries to generate Exception event
		} catch (Exception e) {
			System.out.println( e.getMessage() );
		}
		
		return true;
	}
	
}
