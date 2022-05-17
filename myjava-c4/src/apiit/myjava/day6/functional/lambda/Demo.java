package apiit.myjava.day6.functional.lambda;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Demo {

	/**
	 * function package
	 * https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
	 * 
	 */
	
	/**
	 * Normal function using Java method
	 */
	Integer add10( Integer n )
	{
		return n + 10;
	}
	
	//w/ 1 param; 2 param; 1 result; no result (void)
	int m1(int n) {return 1;} //1 param; 1 result -> Function...
	void m2(int n) { return; } //1 param; no result -> explaining Consuming n... ie., its a Consumer
	int m3() { return 2; } //no param; 1 result -> explaining supplying n... ie., its a Supplier
	//etc...
	
	/**
	 * Functional interface...
	 *  //Function
	 *  //express add10 using lambda 
	 */
//	Function<Integer, Integer> add10 = n -> n + 10; //sometimes, it is called as arrow function.
	UnaryOperator<Integer> add10 = n -> n + 10;
	
	public static void main(String[] args) {
		
		int n = 9;
		
		System.out.println( "new Demo().add10("+n+") -> "+ new Demo().add10(n) );
		System.out.println( "new Demo().add10.apply("+n+") -> "+ new Demo().add10.apply(n) );
	}
	
	/**
	 * Predicate functional interface
	 * 	//boolean-based function
	 */
	boolean isNegative(Integer n) {
		return n < 0;
	}
	//while,
	Predicate<Integer> isNegate = n -> n < 0;
	
	
}





