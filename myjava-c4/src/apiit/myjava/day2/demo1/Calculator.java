package apiit.myjava.day2.demo1;

public class Calculator {

	public final int i1, i2;
	
	public Calculator(int value1, int value2)
	{
		i1 = value1;
		i2 = value2;
	}
	
	public int add() {
		return i1 + i2;
	}
	
	public int minus() {
		return i1 - i2;
	}
	
	public int mul() {
		return i1 * i2;
	}
	
	public int div() {
		return i1 / i2;
	}
	
	public int mod() {
		return i1 % i2;
	}
	
}
