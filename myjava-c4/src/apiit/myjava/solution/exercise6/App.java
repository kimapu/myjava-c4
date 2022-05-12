package apiit.myjava.solution.exercise6;

import java.util.Scanner;

public class App {

	static Scanner scan = new Scanner(System.in);
	static private Shape shape;
	
	public static void main(String[] args) {
		int option = 0;
		do {
		
			System.out.println("1) Circle");
			System.out.println("2) Rectangle");
			System.out.println("3) Square");
			System.out.println("\n>>> Choose shape: ");
			option = scan.nextInt();
			handlePrompt( option );
			System.out.println();
		} while ( option >=1 && option <= 3 );
		
		System.out.println(">>> Thank you!");
		
	}
	
	static void handlePrompt(int option) {
		switch ( option ) {
		case 1:
			//Cricle object
			System.out.println("Enter radius: ");
			int radius = scan.nextInt();
			shape = new Circle(radius);
			shape.print();
			break;
		case 2:
			//Rectangle object
			System.out.println("Enter width: ");
			int width = scan.nextInt();
			System.out.println("Enter length: ");
			int length = scan.nextInt();
			shape = new Rectangle(width, length);
			shape.print();
			break;
		case 3:
			//Square object
			System.out.println("Enter side: ");
			int side = scan.nextInt();
			shape = new Square(side);
			shape.print();
			break;
		default:
			break;
		}
		System.out.println("=================================");
	}
	
}
