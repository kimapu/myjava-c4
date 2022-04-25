package apiit.myjava.day3.arrays;

import java.util.Arrays;

public class Sorter {

	public static void main(String[] args) {
		
		int[] arr = {7,4,2,7,5,3,1};
		
		System.out.println( "> before sorting..." );
		Arrays.stream(arr)
			.forEach( System.out :: println );
		
		Arrays.sort(arr);
		System.out.println( "> after sorting..." );
		Arrays.stream(arr)
			.forEach( System.out :: println );
		
	}
	
}
