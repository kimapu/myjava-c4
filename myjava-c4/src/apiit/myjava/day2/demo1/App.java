package apiit.myjava.day2.demo1;

public class App {

	public static void main(String[] args) {
	
		Calculator calc = new Calculator();
		calc.i1 = 10;
		calc.i2 = 5;
		System.out.println( calc.add() );
		System.out.println( calc.minus() );
		System.out.println( calc.mul() );
		System.out.println( calc.div() );
		System.out.println( calc.mod() );
		
	}
	
}
