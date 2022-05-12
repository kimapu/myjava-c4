package apiit.myjava.solution.exercise6;

public class Circle extends Shape {

	private final int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void print() {
		System.out.println( ">>> Circle shape..." );
		System.out.println( "Radius: "+ radius );
		System.out.println( "Area: "+ ofArea() );
	}

	@Override
	public double ofArea() {
		//A=πr2
		return Math.PI * Math.pow(radius, 2);
	}

}
