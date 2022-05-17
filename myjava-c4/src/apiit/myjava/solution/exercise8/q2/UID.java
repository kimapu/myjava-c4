package apiit.myjava.solution.exercise8.q2;

import java.util.UUID;
import java.util.function.Supplier;

public class UID {

	/**
	 * Generator w/ lambda 
	 */
	
	public static Supplier<UUID> create = () -> UUID.randomUUID();
	
}
