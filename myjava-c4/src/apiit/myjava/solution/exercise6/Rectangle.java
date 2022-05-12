package apiit.myjava.solution.exercise6;

public class Rectangle extends Shape {

	private final int width, length;
	
	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}
	
	@Override
	public void print() {
		System.out.println( ">>> Rectangle shape..." );
		System.out.println( "Width: "+ width );
		System.out.println( "Length: "+ length );
		System.out.println( "Area: "+ ofArea() );
	}

	@Override
	public double ofArea() {
		//A=wl
		return width * length;
	}

}
