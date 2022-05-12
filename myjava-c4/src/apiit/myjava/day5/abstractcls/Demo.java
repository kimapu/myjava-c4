package apiit.myjava.day5.abstractcls;

public class Demo {

	public static void main(String[] args) {
		
//		Employee emp0 = new Employee(); //cannot be instantiated due to abstract class
//		System.out.println( emp0.calculateSalary() );
//		
		Contractor emp1 = new Contractor();
		System.out.println( emp1.calculateSalary() );
		
		FullTimer emp2 = new FullTimer();
		System.out.println( emp2.calculateSalary() );
		
	}
	
}

abstract class Employee{
	
	abstract double calculateSalary(); //we dont know the actual-implementation of the method...
	
}

class Contractor extends Employee
{
	@Override
	public double calculateSalary() {
		System.out.println( "--- Contractor salary ---" );
		//logic-code
		return 10000;
	}
}

class FullTimer extends Employee
{
	@Override
	public double calculateSalary() {
		System.out.println( "--- FullTimer salary ---" );
		//logic-code
		return 3500;
	}
}