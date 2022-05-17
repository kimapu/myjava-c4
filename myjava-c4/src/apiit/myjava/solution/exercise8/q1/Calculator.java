package apiit.myjava.solution.exercise8.q1;

import java.util.function.BiFunction;

public class Calculator {

	private final int n1, n2;
	
	public Calculator(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}

	/**
	 * Lambda expression for 
	 * 	//Arithmathic operation - 
	 * 	// + - / *
	 */

	//in this way, we can design source code more functional!
	public int perform( BiFunction<Integer, Integer, Integer> func ) //the mth accepts lambda function Object...
	{
		return func.apply(n1,  n2);
	}
	
	static class Arithmetic
	{
		//find appropriate builtin functional interface to use
		BiFunction<Integer, Integer, Integer> add = (n1, n2) -> n1 + n2;
		BiFunction<Integer, Integer, Integer> minus = (n1, n2) -> n1 - n2;
		BiFunction<Integer, Integer, Integer> mul = (n1, n2) -> n1 * n2;
		BiFunction<Integer, Integer, Integer> div = (n1, n2) -> n1 / n2;

	}
	
}
