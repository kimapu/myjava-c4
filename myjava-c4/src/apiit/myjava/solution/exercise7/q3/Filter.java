package apiit.myjava.solution.exercise7.q3;

import java.io.FileReader;
import java.io.IOException;

public class Filter {

	public static void printInteger( String path )
	{
		//FileReader, read char 1-by-1
			//eg., abc123d4ds8a7f0gd
			//eg., a,b,c,1,2,3...
		try {
			
			FileReader r = new FileReader(path);
			int ch = r.read(); //a
			
			while ( ch != -1 ) //check for EOF
			{
				char c = (char)ch;
				
				//check isDigit 
				try {
					
					if ( Character.isDigit(c) ) {
						System.out.print( c );
					} else {
						throw new NumberFormatException("*");
					}
					
				} catch (Exception e) {
					System.out.print( e.getMessage() );
				}
				
				//move next char
				ch = r.read();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
