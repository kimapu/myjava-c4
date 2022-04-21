package apiit.myjava.day2.constructors;

public class Demo {

	public static void main(String[] args) {
		
		//construct Class1 object
		Class1 c1 = new Class1();
		//c1 references to Class1 object

		//Class1 c1 		-> 	declaration
		//new Class1(); 	->	construction
		
		Class1 c2 = new Class1("c2 references Class1");
		
	}
}

class Class1
{
	//by default, Java inserts a default constructor FOC
	//also known as no-arg constructor
	public Class1() {
		System.out.println( "--- Class1 constructor ---" );
	}
	
	/**
	 * overloaded constructor
	 */
	public Class1( String arg ) 
	{
		System.out.println( "--- Class1 constructor with argument---" );
		System.out.println("Argument: "+ arg);
	}
}
