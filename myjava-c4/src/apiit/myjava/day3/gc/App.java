package apiit.myjava.day3.gc;

import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) throws Exception{
		
		Message msg1 = new Message("hello world!");
		
		TimeUnit.SECONDS.sleep(2);
		
		msg1 = null;
		
		System.out.println( "> GC is being processed..." );
		
	}
	
}
