package apiit.myjava.day2.finals;

public class Demo {

	/**
	 * final keyword can be used in 3 contexts
	 * 
	 * 	1) final variable (constant variable)
	 *  2) final method (cannot be overridden)
	 *  3) final class (cannot be subclass)
	 *  
	 */
	
	public static void main(String[] args) {
		
		new Class2().m1();
		
		String s1 = new String("abc");
		
	}
}
//
//class SubString1 extends String
//{
//	
//}

class Class1
{
	//constant variable
	final double GST = 0.06;
	
	//final method
	final void m1()
	{
		System.out.println( "printout > Class1" );
	}
}

final class Class2 extends Class1
{
	
}
//
//class Class3 extends Class2
//{
//	
//}





