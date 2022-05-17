package apiit.myjava.day6.functional.reduce;

import java.util.Arrays;

public class Demo {


	/**
	 * reduce() -  reducing elem into a single elem
	 * 
	 */
	
	/**
	 * REQ: Compute the sum of given arr - 1,2,3,4,5,6.
	 */
	int sum( int[] arr )
	{
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		
//		System.out.println( "Sum: "+ new Demo().sum(arr) );
		
		int sum = Arrays.stream(arr).reduce(0, (elem1, elem2) -> elem1 + elem2 );
		System.out.println( "Sum: "+ sum );
	}
	
	
}
