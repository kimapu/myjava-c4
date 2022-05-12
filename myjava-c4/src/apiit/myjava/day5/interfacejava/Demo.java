package apiit.myjava.day5.interfacejava;

public class Demo {
	
	public static void main(String[] args) {
		
		Professor p1 = new Professor();
		p1.teach();
		p1.learn();
		p1.research();
		
		Lecturer lect1 = new Lecturer();
		lect1.teach();
		lect1.learn();
		
		Student s1 = new Student();
		s1.learn();
		
	}

}

interface Teaching{
	//public abstract void teach(); //implicitly public abstract
	void teach();
}

interface Learning{
	void learn();
}

//Normally, lecturer can teach while student can learn
//Additionally, lecturer can also learn

//Professor can teach, learn, research

//alternatively,
interface Research extends Teaching, Learning
{
	void research();
}

//==============================
class Person{}

class Professor implements Research
{
	@Override
	public void teach() {
		System.out.println( "--- Professor teaching ---" );
	}
	
	@Override
	public void learn() {
		System.out.println( "--- Professor learning ---" );
	}
	
	@Override
	public void research() {
		System.out.println( "--- Professor researching ---" );
	}
}

class Lecturer extends Person implements Teaching, Learning //multi-inheritance
{
	@Override
	public void teach() {
		System.out.println( "--- Lecturer teaching ---" );
	}
	
	@Override
	public void learn() {
		System.out.println( "--- Lecturer learning ---" );
	}
}

class Student extends Person implements Learning
{
	@Override
	public void learn() {
		System.out.println( "--- Student learning ---" );
	}
}

class Adminstrator extends Person
{}


