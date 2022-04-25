package apiit.myjava.day3.arrays;

public class Varargs {

	/**
	 * add() - compute the sum
	 */
	static long add( int i1, int ...arg )
	{
		long sum = i1;
		for (int i : arg) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String... args) {

		System.out.println( add(10) );
		System.out.println( add(10, 20) );
		System.out.println( add(10, 20, 30) );
		System.out.println( add(10, 20, 30, 40) );
		System.out.println( add(10, 20, 30, 40, 50) );
		System.out.println( add(10, 20, 30, 40, 50, 60) );
		
	}
	
}
