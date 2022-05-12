package apiit.myjava.day5.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

	static Scanner scan0 = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String cont = "yes";
		do {
			//exception handling...
			try {
				
				Scanner scan = new Scanner(System.in);
				//prompt the user for number
				System.out.println( "Enter number: " );
				int n = scan.nextInt();	
				System.out.println( "> You entered: "+ n );
				
			}
			//catch( InputMismatchException ex ) {
			catch( Exception ex ) //polymorphic reference -Exception 
			{
					System.err.println("> Incorrect input type!");
			}
			finally { //ALWAYS executed despite exception thrown
				System.out.println( "\n>Again[yes/no]? " );
				cont = scan0.next();
			}
			
			System.out.println();
		} while (cont.equalsIgnoreCase("yes"));
		
		System.out.println( "\n\n> Done..." );
		
	}
	
}
