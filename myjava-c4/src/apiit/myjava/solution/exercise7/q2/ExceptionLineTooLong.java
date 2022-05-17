package apiit.myjava.solution.exercise7.q2;

public class ExceptionLineTooLong extends java.lang.Exception {

	final static private String DEFAULT_MSG = "The strings is too long!";
	
	//contructor
	public ExceptionLineTooLong()
	{
		super(DEFAULT_MSG);
	}
	
}
