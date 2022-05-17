package apiit.myjava.solution.exercise8.q1;

public class App {

	public static void main(String[] args) {
	
		int n1 = 10;
		int n2 = 5;
	
		//demo2
		Calculator.Arithmetic math = new Calculator.Arithmetic();
		
		Calculator calc = new Calculator(n1, n2);

		System.out.println( "Add: "+ calc.perform( math.add ) );
		System.out.println( "Subtract: "+ calc.perform( math.minus) );
		System.out.println( "Multiply: "+ calc.perform( math.mul ) );
		System.out.println( "Division: "+ calc.perform( math.div ) );
		
	}
	
	static void demo1(int n1, int n2)
	{
		Calculator.Arithmetic calc = new Calculator.Arithmetic();
		
		System.out.println( "add.apply("+n1+", "+n2+") : "+ calc.add.apply(n1, n2)  );
		System.out.println( "minus.apply("+n1+", "+n2+") : "+ calc.minus.apply(n1, n2)  );
		System.out.println( "mul.apply("+n1+", "+n2+") : "+ calc.mul.apply(n1, n2)  );
		System.out.println( "div.apply("+n1+", "+n2+") : "+ calc.div.apply(n1, n2)  );
		
	}
	
}
