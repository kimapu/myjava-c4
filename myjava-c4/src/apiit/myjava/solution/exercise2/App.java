package apiit.myjava.solution.exercise2;

public class App {

	
	public static void main(String[] args) {
	
		Name username = new Name("ali", "baba", "china");
		String initial = username.initial();
		
		System.out.println( "Initial: "+ initial );
		System.out.println( "Fullname: "+ username.getFullName() );
		
	}
	
	
}
