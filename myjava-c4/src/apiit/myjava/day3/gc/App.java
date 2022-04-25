package apiit.myjava.day3.gc;

public class App {

	public static void main(String[] args) throws Throwable{
		
		Message msg1 = new Message("hello world!");
		
		msg1 = new Message("hows there?");
		
		System.out.println( "> GC is being processed..." );
		
	}
	
}
