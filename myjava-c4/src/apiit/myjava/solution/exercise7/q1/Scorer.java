package apiit.myjava.solution.exercise7.q1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Scorer {


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
				}
			}
		}
		return sum;
	}
	
	/**
	 * + avg() : double
	 */
	public double avg() {
		double avg = 0;
		/**
		 * TO BE prepared by students... :)
		 */
		return avg;
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
				BufferedReader br = new BufferedReader(new FileReader(targetFile));
				String line;
				while ( (line = br.readLine()) != null ) {
					content.add(line);
				}
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
