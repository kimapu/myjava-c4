package apiit.myjava.day1.hello; 

public class HelloWorld {

	//Java method
	public void main() //function method...
	{
		System.out.println( "> Main function..." );
	}

	/**
	 * Main method
	 *  method signature is registered to JVM
	 */
	public static void main(String[] args)
	{
		System.out.println( "Hello World!" );
		new HelloWorld().main();
	}
	
	
}
