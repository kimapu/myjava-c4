package apiit.myjava.day4.overriding;

public class Demo {

	public static void main(String[] args) {
		new Alice().dance();
		new Bob().dance();
	}
	
}

class Person{

	void dance(){
		System.out.println( "--- Person > dance() --- " );
	}
	
}

class Alice extends Person
{
	
	@Override
	public void dance() {
		System.out.println( "--- Alice > dance() ---" );
	}
	
}

class Bob extends Person
{
	
}

