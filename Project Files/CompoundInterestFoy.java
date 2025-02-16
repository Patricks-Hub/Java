import java.util.Scanner;

/**  
* Patrick Foy - pjfoy  
* CIS171 - 20390
* Feb 7, 2025  
*/
public class CompoundInterestFoy {
	
	public double computeBalance(double principal, double interestRate, int time) { 
		double rateTotal;
		double rateYearsTotal;
		double compoundtotal;
		rateTotal = 1 + interestRate;
		rateYearsTotal = Math.pow(rateTotal, time);
		compoundtotal = principal * rateYearsTotal;
		return compoundtotal;	
	}
	public static void main(String[] args) {
		System.out.println("Please enter your principal amount");
		Scanner userPrincipal = new Scanner(System.in);
		int principal = userPrincipal.nextInt();
		System.out.println("Please enter your interest rate as a decimal ex. 3% is .03");
		Scanner userRate = new Scanner(System.in);
		double rate = userRate.nextDouble();
		System.out.println("Please enter the amount of years you are barrowing for");
		Scanner userYears = new Scanner(System.in);
		int years = userYears.nextInt();
		userPrincipal.close();
		userRate.close();
		userYears.close();
		CompoundInterestFoy newBalance  = new CompoundInterestFoy();
		System.out.printf("Your total is $%.2f \n", newBalance.computeBalance(principal, rate, years));
		//user input output
		System.out.println("Test Cases");
		System.out.printf("Your total is $%.2f", newBalance.computeBalance(10000, .045, 13));
		// should return $17721.96
		System.out.printf("\nYour total is $%.2f", newBalance.computeBalance(20000, .03, 15));
		// should return $31159.35
		System.out.printf("\nYour total is $%.2f", newBalance.computeBalance(30000, .01, 20));
		// should return $36605.70
	}
}