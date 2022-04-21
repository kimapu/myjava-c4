package apiit.myjava.day2.modifier.pk2;

import apiit.myjava.day2.modifier.pk1.Class1;

public class Class3 {

	
	void show()
	{
		//ERROR becos, i1 is package-private member
		//int result = new Class1().i1 * 2;
		//String name1 = new Class1().name1; //ERROR becos, private member
		
		double rate = new Class1().rate;
		
		//int i2 = new Class1().i2; //ERROR becos, i2 is protected field
	}
	
}
