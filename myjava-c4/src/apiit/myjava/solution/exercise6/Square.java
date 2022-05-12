package apiit.myjava.solution.exercise6;

public class Square extends Shape {

	private final int side;
	
	public Square( int side ) {
		this.side = side;
	}
	
	@Override
	public void print() {
		System.out.println( ">>> Square shape..." );
		System.out.println( "Side: "+ side );
		System.out.println( "Area: "+ ofArea() );
	}

	@Override
	public double ofArea() {
		//A=a2
		return Math.pow(side, 2);
	}

}
