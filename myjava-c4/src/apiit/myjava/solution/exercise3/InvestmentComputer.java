package apiit.myjava.solution.exercise3;

public class InvestmentComputer {

	/**
	* Write a program that reads in investment amount, annual interest rate, and number of years, and 
	* displays the future investment value using the following formula.
		futureInvestmentVal = investmentAmount x (1 + monthlyInterestRate) numberOfYears*12
	 */
	
	/**
	 * + compute(double, double, int) : double
	 */
	public double compute( double amt, double annualRate, int yr ) {
		double monthlyInterestRate = annualRate / 12;
		double futureInvestmentValue = amt * Math.pow( (1+monthlyInterestRate) , (yr*12) );
		return futureInvestmentValue;
	}
	
}
