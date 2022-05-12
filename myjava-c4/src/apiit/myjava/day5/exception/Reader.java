package apiit.myjava.day5.exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Reader {

	public static void main(String[] args) {
		
		final String PATH = "src/apiit/myjava/day5/exception/sample.txt";
		try {
			
			List<String> lst = Files.readAllLines(Paths.get( PATH ));
			for (String line : lst) {
				System.out.println( line );
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("\n> Reading complete!");
		}
		
	}
	
}
