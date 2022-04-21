package apiit.myjava.day2.modifier.pk1;

/**
 * 
 * @author kimlee
 *
 *	Access modifiers
 *		1) package-private
 *		2) private
 *		3) public
 *		4) protected
 */
public class Class1 
{
	//instance-variables
	//1) package-private (default)
		//within class; within package
	int i1 = 100;
	
	//2) private
		//within class;
	private String name1 = "Class1";
	
	//3) public
		//ANYWHERE
	public double rate = 9.9;
	
	//4) protected
		//within class; within package; any subclass in any package
	protected int i2 = 200;
	
	void show()
	{
		System.out.println( i1 );
		System.out.println( name1 );
		System.out.println( rate );
		System.out.println( i2 );
	}
	
}
