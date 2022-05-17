package apiit.myjava.day6.functional.map;

import java.util.Arrays;
import java.util.function.BiFunction;

public class Demo {

	/**
	 * map() -  transform elem to another elem
	 * 
	 */
	
	/**
	 * REQ: Top up 10 to each element in the array
	 * 		//2,4,6,8,10
	 */
	
	//1) Java method
	void topUp( int[] arr, int n)
	{
		for (int i : arr) {
			System.out.println( i + n );
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10};
		int n = 10;
		
		//1) new Demo().topUp( arr, n );
		
		//2) w/ map()
		Arrays.stream(arr) //populate all arr lem to stream of elem
			.map( elem -> elem + n ) //w/ lambda ie., 2+10; 4+10; 6+10; 8+10; 10+10
			.forEach( System.out :: println );

//		Arrays.stream(arr).map( elem -> new Demo.Arithmetic().add.apply(elem, n) )			
//			.forEach( System.out :: println );

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
