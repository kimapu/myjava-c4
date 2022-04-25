package apiit.myjava.day3.equality;

public class Demo {


	/**
	 * == vs equals()
	 */
	
	static void m1()
	{
		//== in primitive
		int i1 = 10;
		int i2 = 20;
		
		System.out.println( i1 == i2 ); //false
		//System.out.println( i1.equals(i2) ); //compilation fail
		
		//== in object
		Integer i3 = new Integer(10);
		Integer i4 = new Integer(10);
		Integer i5 = i4;
		
		System.out.println( i3 == i4 ); //false
		System.out.println( i4 == i5 ); //true
	}
	
	static void m2()
	{	
		//equals() in object only
		Integer i3 = new Integer(10);
		Integer i4 = new Integer(10);
		
		System.out.println( i3.equals(i4) ); //true
	
		Student s1 = new Student(123456);
		Student s2 = new Student(654321);
		
		System.out.println( "Same student: "+ s1.equals(s2) );
		
	}
	
	static void m3()
	{
		//autocasting effect
		//== in object
		Integer i3 = 10; 
 		Integer i4 = 10;
		
 		//implicit casted to the corresponding primitive in action
		System.out.println( i3 == i4 ); //true
		System.out.println( i3.equals(i4) ); //true, so it is recommended when we assess the values
		
	}
	
	public static void main(String[] args) {
		m2();
	}
	
	
}

class Student
{
	long id;

	public Student(long id) {
		super();
		this.id = id;
	}

	@Override
	public boolean equals(Object next) {
		Student nxt = (Student)next;
		/**
		 * provide check criteria for comparing objects
		 */
		return this.id == nxt.id;
	}	
	
}




