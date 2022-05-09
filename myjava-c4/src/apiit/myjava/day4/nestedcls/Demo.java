package apiit.myjava.day4.nestedcls;

public class Demo { 

	public static void main(String[] args) {

		//declare outer
		Outer outer = new Outer();
		outer.show();
		//define inner 
		Outer.Inner inner = outer.new Inner();
		inner.show();
		//While,
		//define staticnested
		Outer.StaticNested nested = new Outer.StaticNested();
		nested.show();
	}
	
}

class Outer
{
	void show()
	{
		System.out.println( "-- Outer ---" );
	}
	
	/**
	 * inner class
	 *  - non-static member
	 */
	class Inner
	{
		void show()
		{
			System.out.println( "-- Inner ---" );
		}
	}
	
	/**
	 * static nested class
	 *  - static member
	 */
	static class StaticNested
	{
		void show()
		{
			System.out.println( "-- Static Nested ---" );
		}
	}
	
}

