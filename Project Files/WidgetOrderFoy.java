
import java.util.Scanner;

/**  
* Patrick Foy - pjfoy  
* CIS171 - 20390
* Feb 7, 2025  
*/
public class WidgetOrderFoy {
	private final double PRICE = 8.99;
	private final double SHIPPING = 0.20;
	private final double TAX = 0.065;
	
	public double computeOrder(int widgets) { 
		double widgetTotal;
		double widgetTaxTotal;
		double widgetShippingTotal;
		double orderTotal;
		
		widgetTotal = widgets * PRICE;
		widgetTaxTotal = (widgetTotal * TAX) + widgetTotal;
		widgetShippingTotal = SHIPPING * widgets;
		orderTotal = widgetTaxTotal + widgetShippingTotal;
		return orderTotal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter how many widgets you need");
		Scanner userAns = new Scanner(System.in);
		int orderCount = userAns.nextInt();
		userAns.close();
		WidgetOrderFoy newOrder  = new WidgetOrderFoy();
		System.out.printf("Your total is $%.2f \n", newOrder.computeOrder(orderCount));
		System.out.println("Thank you for you order!"); 
	}
}