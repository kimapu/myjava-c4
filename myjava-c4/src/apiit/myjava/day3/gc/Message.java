package apiit.myjava.day3.gc;

public class Message {

	private final String text;

	public Message(String text) {
		super();
		this.text = text;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println( "GC: finalised..." );
	}
	
}

