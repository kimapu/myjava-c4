package apiit.myjava.solution.exercise7.q1;

public class App {

	public static void main(String[] args) {

		String path = "src/apiit/myjava/solution/exercise7/q1/score.txt";

		Scorer score = new Scorer(path);
		double total = score.sum();
		double average = score.avg();

		// show
		System.out.println("Total: " + total);
		System.out.println("Average: " + average);
	}

}
