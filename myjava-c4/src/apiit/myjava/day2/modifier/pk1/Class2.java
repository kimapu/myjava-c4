package apiit.myjava.day2.modifier.pk1;

public class Class2 {

	void show()
	{
		//accessing the i1 from Class1
		int result = new Class1().i1 * 2;
		//String name1 = new Class1().name1; //ERROR becos, private
		double rate1 = new Class1().rate;
		int i2 = new Class1().i2;
	}
	
}
