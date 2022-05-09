package apiit.myjava.day4.anonymouscls;

public class Demo {

	public static void main(String[] args) {
		
		//1)
		Top top = new Top() //new object of anonymous class
		{ //anonymous class
			public void show() {
				System.out.println( "--- Top Class---" );
			}
		};
		top.show();
		
		//2)
		AppInterface service = new AppInterface() //new object of anonymous class
		{ //anonymous class
			public void connect() {
				System.out.println( "--- conencted ---" );
			}

		};
		service.connect();
	}
	
}

/**
 * Abstract class
 */
abstract class Top
{
	public abstract void show();
}

/**
 * Interface
 */
interface AppInterface
{
	void connect();
}