package apiit.myjava.solution.exercise2;


/**
 * 
 * @author kimlee
 *
 *	To improve the initial find function in object oriented way
 *
 */

public class Name {

	private final String firstName;
	private final String lastName;
	private final String familyName;
	
	private final String fullName;
	
	public Name(String firstName, String lastName, String familyName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.familyName = familyName;
		this.fullName = String.join(" ", familyName.toUpperCase(), firstName, lastName);
	}
	
	public String getFullName() {
		return fullName;
	}

	public String initial()
	{
		String initial = "";
		//StringBuilder class
		//String.split()
		String[] token = fullName.split("\\s"); // [ali, baba, china]
		StringBuilder sb = new StringBuilder();
		
		//for(;;)
		//enhanced-for // for-each
		for (String elem : token) { //ali; baba; china
			sb.append( elem.charAt(0) ); 
		}
		
		initial = sb.toString().toUpperCase();
		return initial;
	}
	
}
