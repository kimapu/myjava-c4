package apiit.myjava.day3.arrays;

public class TwoDimensional {

	
	static void m1()
	{
		
		/**
		 * 2-D arrays
		 */
		int row = 3;
		int col = 4;
		
		//declaration
		String[][] arr1;
		//creation
		arr1 = new String[row][col];
		//initilisation
		arr1[0][0] = "arr1[0][0]";
		arr1[0][1] = "arr1[0][1]";
		arr1[0][2] = "arr1[0][2]";
		arr1[0][3] = "arr1[0][3]";
		//...
		show( arr1 );
		
		//- the above can be shorthand
		String[][] arr2 = {
				{"arr1[0][0]", "arr1[0][1]", "arr1[0][2]", "arr1[0][3]"},
		};
		
	}
	
	static void show( String[][] arr )
	{
		//row
		for (int i = 0; i < arr.length; i++) {
			//col
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf( "%s\t" , arr[i][j] );
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		m1();
		
	}
	
}






