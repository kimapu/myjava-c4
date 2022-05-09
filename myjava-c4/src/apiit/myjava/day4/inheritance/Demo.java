package apiit.myjava.day4.inheritance;

public class Demo {

	public static void main(String[] args) {
		
		Consultant emp1 = new Consultant();
		emp1.id = 123456789;
		emp1.name = "Consultant123";
		emp1.show();
		
	}
	
}

/**
 * Super class
 */
 class Employee
 {
	 long id;
	 String name;
	 
	 void show() {
		 System.out.println( "--- EMPLOYEE ---" );
	 }
	 
 }
 
 /**
  * Sub class
  */
 class Consultant extends Employee
 {
	 
 }
