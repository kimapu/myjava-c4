package apiit.myjava.day4.overloading;

public class Demo {

	public static void main(String[] args) {
		
		new Bob().show();
		
		new Bob().show("arg");
		
		new Bob().show( new String[] {"elem1", "elem2"}  );
		
	}
}

class Person{

	void show(String[] msg)
	{
		System.out.println( "--- Person > show(msg[]) ---" );
	}
	
}

class Bob extends Person{
	
	void show()
	{
		System.out.println( "--- Bob > show() ---" );
	}
	
	//overloading method - show()
	void show( String arg )
	{
		System.out.println( "--- Bob > show(arg) ---" );
	}
}
