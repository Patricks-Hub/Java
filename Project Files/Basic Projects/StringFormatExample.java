
/**  
* Patrick Foy - pjfoy  
* CIS171 - 20390
* Feb 15, 2025  
*/
public class StringFormatExample {
    public static void main(String[] args) {
    	String text = "This is a sample string";
    	int n = 10;

    	String formattedText = text.substring(0, Math.min(n, text.length())); // Handle cases where n is larger than the string length
    	System.out.println(formattedText); // Output: This is
    }
}
