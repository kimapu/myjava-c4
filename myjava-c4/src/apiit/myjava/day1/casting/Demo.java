package apiit.myjava.day1.casting;

public class Demo {

	void m1()
	{	
		/**
		 * implicit casting
		 */
		short s1 = 101;
		int i1 = s1; //implicit-casted short primitive -> int primitive
		
		/**
		 * explicit casting
		 */
		int i2 = 101;
		short s2 = (short)i2; //explicit-casted to short <- int
	}
	
	void m2()
	{
		Vehicle v1;
		v1 = new Car(); //upcasting
		v1 = new Bike();
		v1 = new Truck();
		
		if( v1 instanceof Car ) {
			Car car = (Car)v1; //downcasting
		}else if( v1 instanceof Bike ) {
			Bike bike = (Bike)v1;
		}else if( Truck.class.isInstance(v1) ) {
			Truck truck = (Truck)v1;
		}else {
			System.out.println( "> unknown object!" );
		}
		
	}
	
}

class Vehicle{}
class Car extends Vehicle {}
class Bike extends Vehicle {}
class Truck extends Vehicle {}
