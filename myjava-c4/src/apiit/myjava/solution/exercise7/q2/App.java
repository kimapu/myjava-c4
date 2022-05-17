package apiit.myjava.solution.exercise7.q2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class App {

	public static void main(String[] args) {

		String path2File = "src/apiit/myjava/solution/exercise7/q2/strings.txt";
		
		try {
			
			//get
			List<String> content = Files.readAllLines(Paths.get(path2File));
			
			//loop
			for (String line : content) {
				if( line.length() > 80 )
					throw new ExceptionLineTooLong();
				
				System.out.println( line );
			}
			
		} catch (IOException | ExceptionLineTooLong e) {
			//e.printStackTrace();
			System.err.println( "> "+ e.getMessage() );
		}
	}
	
}
