package apiit.myjava.day2.statics;

public class Demo {

	/**
	 * static keyword
	 * 	- members belong to the class, instead of object
	 */
	public static void main(String[] args) {
		
		//no object instantiation...
		Vote.count ++;
		Vote.show();
	
		//---
		Poll poll1 = new Poll(); //instantiate object of Poll class...
		poll1.count = 1;
		poll1.show();
		
		Poll poll2 = new Poll(); //instantiate object of Poll class...
		poll2.count = 1000;
		poll2.show();
		
	}
	
}

class Vote
{
	//class-members
	static int count;
	static void show()
	{
		System.out.println( count );
	}
}

//Comparatively,
class Poll
{
	//instance-members or non-static members
	int count;
	void show()
	{
		System.out.println( count );
	}
}
