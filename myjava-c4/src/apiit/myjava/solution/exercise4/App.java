package apiit.myjava.solution.exercise4;

import java.util.Arrays;

public class App {


	/**
	 * Find the sum and average of the my_array object. int my_array[] = {1, 2, 3,
	 * 4, 5, 6, 7, 8, 9, 10};
	 */
	void sumArr() {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		float sum = 0.0F;
		float avg = 0.0f;
		for (int i : arr) {
			sum += i;
		}
		avg = sum / arr.length;
		System.out.println(sum);
		System.out.println(avg);
	}

	/**
	 * 
	 * Copy the following array elements to another. "Affogato", "Americano",
	 * "Cappuccino", "Corretto", "Cortado", "Doppio", "Espresso", "Frappucino",
	 * "Freddo", "Lungo", "Macchiato", "Marocchino", "Ristretto”
	 */
	void arrcopy() {
		// initialize array
		String[] c1 = { "Affogato", "Americano", "Cappucino", "Coretto", "Cortado", "Doppio", "Espresso", "Frappucino",
				"Freddo", "Lungo", "Macchiato", "Marrochino", "Ristretto" };
		// Copy array to another
		String[] c2 = Arrays.copyOf(c1, c1.length);
//		alternatively, w/ System.arraycopy()
//		String[] c2 = new String[c1.length];
//		System.arraycopy(c1, 0, c2, 0, c1.length);
		
		System.out.println("Original array: " + Arrays.toString(c1));
		System.out.println("\n");
		System.out.println("Copy array: " + Arrays.toString(c2));
	}

	/**
	 * Sort the following String array using Arrays class. "Java", "Python", "PHP",
	 * "C#", "C Programming", "C++"
	 */
	void mysort() {
		String[] lang = { "Java", "Python", "PHP", "C#", "C Programming", "C++" };

		Arrays.sort(lang);
		for (String language : lang) {
			System.out.print(language + " ");
		}

	}

	/**
	 * Declare on one line a two-dimensional array of int values called intArr. On
	 * the second line, allocate memory for 5 rows. On subsequent lines, allocate
	 * memory for each row to have 8 columns. 
	 * 
	 * Fill in each cell of the intArr array
	 * from the previous question with the result of multiplying that cell's column
	 * index by its row index. Do not hardcode the length of the array in any way.
	 * 
	 * Print each row of the intArr array from the previous question in order on
	 * separate lines. Entries should be separated by a single space. The last entry
	 * in each row should be followed by a colon (:) and then the sum of the entries
	 * in that row. 
	 * Do not hardcode the length of the array in any way.
	 */
	void m1() {
		int[][] intArr; //declaration
		intArr = new int[5][]; //instantiate 2d arr with 5 rows
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = new int[8]; //arr of the row - 8 boxes
		}

		for (int row = 0; row < intArr.length; row++) { //row
			for (int col = 0; col < intArr[row].length; col++) { //col
				intArr[row][col] = row * col;
			}
		}

		for (int row = 0; row < intArr.length; row++) //row
		{
			int rowSum = 0;
			for (int col = 0; col < intArr[row].length; col++) { //col
				System.out.print(intArr[row][col] + " ");
				rowSum += intArr[row][col];
			}
			System.out.println(" : " + rowSum);
		}

	}
	
}
