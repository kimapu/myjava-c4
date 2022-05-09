package apiit.myjava.day4.localcls;

public class Demo {

	public static void main(String[] args) {
		
		new Email().add("asd@asdas");;
		
	}
	
}

class Email
{
	
	/**
	 * addEmail
	 */
	void add(String email)
	{
		/**
		 * local class for validating email format 
		 */
		class EmailValidator
		{
			static boolean check(String addr) {
				return addr.contains("@");
			}
		}
		
		if( EmailValidator.check(email) ) {
			System.out.println( "> Email added!" );
		}else {
			System.err.println( "> Invalid email addr!" );
		}
			
		
	}
	
}
