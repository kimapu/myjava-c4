package apiit.myjava.day3.arrays;

public class OneDimensional {

	
	static void m1()
	{
		//1-D array
		
		//declaration
		int[] $arr;
		//creation
		$arr = new int[5];
		//initlisation
		$arr[0] = 10;
		$arr[1] = 20;
		$arr[2] = 30;
		$arr[3] = 40;
		$arr[4] = 50;
		show( $arr );
		
		//- the above can be shorthand...
		int[] $arr2 = {10, 20, 30, 40, 50}; //this creates arr object with autocomputed size according to no. of elem initialised
		show( $arr2 );
		
	}
	
	static void show( int[] arr )  
	{
		System.out.println( arr );
		//display arr elem
		//for-each
		for( int elem : arr )
		{
			System.out.print( elem + " " );
		}
		System.out.println();
	}
	
	static void m2()
	{
		/**
		 * Exception: ArrayIndexOutOfBoundsException
		 */
		int[] $arr1 = {10, 20, 30, 40, 50}; //0-4
		
		//for - may attempt to Exception
		for( int i = 0; i < $arr1.length; i++)
		{
			System.out.print( $arr1[i] + " " ); 
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
	
		m2();
		
	}
	
}
