package apiit.myjava.day4.block;

public class Demo {


	public static void main(String[] args) {
		new Alice(); //invoke Alice() constructor...
	}
	
}

class Person{
	

	static {
		System.out.println( "--- Person > static initialisation block ---" );
	}
	
	
	{
		System.out.println( "--- Person > initialisation block ---" );
	}
	
}

class Alice extends Person{
	
	/**
	 * instance var
	 */
	public String from;
	{
		from = "MY";
		System.out.println( "--- Alice > initialisation block ---" );
	}
	
	
	/**
	 * static var
	 */
	public static int counter;
	static {
		counter = 0;
		System.out.println( "--- Alice > static initialisation block ---" );
	}
	
	
	/**
	 * constructor
	 * - initialisation while constructing object
	 */
	public Alice()
	{
		System.out.println( "--- Alice > constructor ---" );
	}
	
}
