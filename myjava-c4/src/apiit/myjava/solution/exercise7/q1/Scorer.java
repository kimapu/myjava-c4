package apiit.myjava.solution.exercise7.q1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Scorer {


	private int count = 0;
	private final String targetFile;
	
	public Scorer( String file ) {
		this.targetFile = file;
	}
	
	/**
	 * + sum() : double
	 */
	public double sum() throws NumberFormatException{
		double sum = 0;
		List<String> scores = get();
		if( scores != null ) 
		{
			for (String scoreLine : scores) {
				//split, 12 23 34 45 56
				StringTokenizer tokenizer = new StringTokenizer( scoreLine );
				while ( tokenizer.hasMoreTokens() ) {
					sum += Double.parseDouble(tokenizer.nextToken());
					count++; //counting the # of score when iterating...
				}
			}
		}
		return sum;
	}
	
	/**
	 * + avg() : double
	 */
	public double avg() {
		return sum() / count;
	}
	
	/**
	 * - get() : List<String>
	 */
	private List<String> get(){
		List<String> content = null;
		if( new File(targetFile).exists() ) //check the targetFile exist 
		{
			content = new ArrayList<>();
			//BufferedReader to read the content
			try {

				//w/ old-school APIs
//				BufferedReader br = new BufferedReader(new FileReader(targetFile));
//				String line;
//				while ( (line = br.readLine()) != null ) {
//					content.add(line);
//				}
				
				//w/ Files API (java8 or later)
				content = Files.readAllLines( Paths.get(targetFile) );
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				System.out.println( "Done..." );
			}
		}
		return content;
	}
	
}
