package apiit.myjava.day4.nestedcls;

public class Demo { 

	public static void main(String[] args) {

		//declare outer
		Outer outer = new Outer();
		outer.show();
		//define inner 
		Outer.Inner inner = outer.new Inner();
		inner.show(99);
		//While,
		//define staticnested
		Outer.StaticNested nested = new Outer.StaticNested();
		nested.show();
	}
	
}

class Outer
{
	int i = 1;
	
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
		int i = 2;
		void show()
		{
			//Outer.this.show();
			System.out.println( "-- Inner ---" );
		}
		
		void show(int i)
		{
			System.out.println( "-- Inner ---" );
			System.out.println( i + this.i + Outer.this.i); //shadowing 99+2+1
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

