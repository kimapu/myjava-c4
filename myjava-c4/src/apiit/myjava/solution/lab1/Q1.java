package apiit.myjava.solution.lab1;

import java.util.Scanner; //or, * implies all classes from the package

public class Q1 {

	/**
	 * Write a program that reads in the radius and length of a cylinder and computes volume using the following formulas: area = radius * radius * PI volume = area * length
	 */
	static Scanner scan = new Scanner(System.in);
	static void show()
	{
		System.out.println( "-- QUESTION 1 ---" );
		
		System.out.println( "Ënter radius: " );
		int radius = scan.nextInt(); //capture-convert input to int

		System.out.println( "Enter length: " );
		String lengthString = scan.next();//capture
		int length = Integer.parseInt(lengthString);//convert 
		
		//area
		double area = Math.PI * Math.pow(radius, 2);
		//volume
		double volume = area * length;
		
		System.out.println( "Area: "+ area );
		System.out.println( "Volume: "+ volume );
		
		System.out.println( ">Done..." );
	}
	
}