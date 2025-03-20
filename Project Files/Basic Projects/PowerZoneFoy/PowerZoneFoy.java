package PowerZoneFoy;

import java.util.Random;
import javax.swing.JOptionPane;

/**  
* Patrick Foy - pjfoy  
* CIS171 - 20390
* Feb 15, 2025  
*/
public class PowerZoneFoy {

	public static void main(String[] args) {

		//ID input and formatting 
    	final int START_POINT1 = 0;
    	final int END_POINT1 = 2;
    	final int START_POINT2 = 2;
    	final int END_POINT2 = 5;
    	final int START_POINT3 = 5;
    	final int END_POINT3 = 6;
		String memberID;
		
		memberID = JOptionPane.showInputDialog(null, "Please enter your member ID. ");
		
		String memberIDUpper = memberID.toUpperCase();
    	String formattedText0 = memberIDUpper.substring(START_POINT1, Math.min(END_POINT1, memberIDUpper.length())); 
    	String formattedText1 = memberIDUpper.substring(START_POINT2, Math.min(END_POINT2, memberIDUpper.length()));
    	String formattedText2 = memberIDUpper.substring(START_POINT3, Math.min(END_POINT3, memberIDUpper.length())); 

		//Time input and formatting
		int inputMinutes;
		int hours;
		int minutes;
		final int MIN_IN_HOUR = 60;
		
		inputMinutes = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of minuntes you worked out. "));
		
		hours = inputMinutes / MIN_IN_HOUR; 
		minutes = inputMinutes % MIN_IN_HOUR;
		
		//Random Authorization Code Generation
		Random random = new Random();
		int entryCode = random.nextInt(1000,10000);
		
		//Output message with variables 
		String gymInfo = "Your Power Zone Gym Information and Authorization Code";
		gymInfo += "\nYou have worked out for: "+ hours + " hours and " + minutes + " minutes.";
		gymInfo += "\nMember ID is: " + formattedText0 + "-" + formattedText1 + "-" + formattedText2;
		gymInfo +="\nYour Entry Code: " + entryCode;
		
		JOptionPane.showMessageDialog(null, gymInfo);
	}
}
