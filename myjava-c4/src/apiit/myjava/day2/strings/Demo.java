package apiit.myjava.day2.strings;

public class Demo {

	
	void m2()
	{
		/**
		 * StringBuilder object - mutable
		 */
		StringBuilder sb1 = new StringBuilder("hello");
		sb1.append(" world");
		
		String final_str = sb1.toString();
	}
	
	void m1()
	{
		/**
		 * String object - immutable
		 */
		String s1 = "hello"; //shorthand
		//equivalent, String s1 = new String("hello");
		s1 = "hello world!";
		String s2 = s1;
		
		//case 2
		String str = "a1";//1
		str = "a2";//2
		str = "a3";//3
		str = "a4";//4
		str = "a5";//5
		str = "a6";//6
		str = "a7";//final referenced
		//frequency is updating the content of string is high!
	}
	
}
