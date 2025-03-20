import java.util.Scanner;

/**  
* Patrick Foy - pjfoy  
* CIS171 - 20390
* Feb 1, 2025  
*/
public class PreDefinedBestPracticesProgramFoy {

	public static void main(String[] args) {
		
		System.out.print("Welcome to my \"Min Max Game\"  \n ");
		
		System.out.print("You will input 2 numbers and the system will create a random number and tell you which is largest. \n \n");
		
		Scanner inputNum1 = new Scanner(System.in);
		
		System.out.print("Please enter a number between 0 and 100 decimals are accepted. \n");
		
		double userNum1 = inputNum1.nextDouble();
		
		Scanner inputNum2 = new Scanner(System.in);
		
		System.out.print("Please enter a second number between 0 and 100 decimals are accepted. \n");
		
		double userNum2 = inputNum2.nextDouble();
		
		inputNum1.close();
		
		inputNum2.close();
		
		double randomNum = Math.random()*101;
		
		System.out.printf("The system number is %.2f%n \n", randomNum);
		
		double userNum1Abs = Math.abs(userNum1); // Fix any Negative Numbers if user entered wrong
		
		double userNum2Abs = Math.abs(userNum2); //Fix any Negative Numbers if user entered wrong
		
		double minValue1 = Math.min(userNum1Abs, userNum2Abs);
		double minValue2 = Math.min(randomNum, minValue1);
		
		System.out.printf("The \"smallest number\" is %.2f%n \n", minValue2);
		
		double maxValue1 = Math.max(userNum1Abs, userNum2Abs);
		double maxValue2 = Math.max(randomNum, maxValue1);
		
		System.out.printf("The \"largest number\" is %.2f%n \n", maxValue2);
		
		System.out.print("Thanks for playing my \"Min Max Game\"! \n \n Hope you had fun! ");
		
		
		
		

	}

}
