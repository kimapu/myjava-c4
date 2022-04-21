package apiit.myjava.day1.boxing;

public class Demo {

	/**
	 * auto-boxing feature (builtin)
	 * 	introduced from java5
	 */
	
	void m1()
	{	
		//Integer i1 = new Integer(100); //before java5
		
		Integer i1 = 100; //auto-box featured
		int 	i2 = 100;
		
		//i1 is object type
		//i2 is memory location
		
		boolean eq = i1.equals(100);
		
	}
	
	void m2()
	{
		
		String pwd = "ab1";
		
		boolean isDigit = false;
		//check any digit in this passwd?
		for (int i = 0; i < pwd.length(); i++) {
			isDigit = Character.isDigit( pwd.charAt(i) );
			if(isDigit) break;
		}
		
		System.out.println( (isDigit) ? "found!" : "not found!" );
	}
	
}
