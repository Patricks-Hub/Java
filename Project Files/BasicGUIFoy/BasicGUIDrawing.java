package BasicGUIFoy;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/**  
* Patrick Foy - pjfoy  
* CIS171 - 20390
* Feb 15, 2025  
*/

public class BasicGUIDrawing extends JComponent {
	
//set global colors default state
	Color bullseye = Color.black;
	Color ring1 = Color.black;
	Color ring2 = Color.black;
	Color ring3 = Color.black;
	
	//string for IF statment changes
	String activeRing = "red";
	
	public void paintComponent(Graphics g) {
		
		//set 2d for stroke /shapes and colors
		Graphics2D graphicsObj = (Graphics2D) g;
		BasicStroke bs = new BasicStroke(20);
		
	//set dart board rings and colors 
		graphicsObj.setColor(Color.lightGray);
		graphicsObj.fillRect(0, 0, 350, 350);
		graphicsObj.setColor(Color.black);
        graphicsObj.setStroke(bs);
        graphicsObj.setColor(ring3);
		graphicsObj.drawOval(37, 37, 275, 275);
		graphicsObj.setColor(ring2);
		graphicsObj.drawOval(75, 75, 200, 200);
		graphicsObj.setColor(ring1);
		graphicsObj.drawOval(113, 113, 125, 125);
		graphicsObj.setColor(bullseye);
		graphicsObj.fillOval(150, 150, 50, 50);
		
	}
	
	public void changeColor() {
		
		bullseye = Color.black;
		ring1 = Color.black;
		ring2 = Color.black;
		ring3 = Color.black;
		
		if (activeRing.equals("red")) {
			activeRing = "green";
			ring1 = Color.green;
		} else if (activeRing.equals("green")) {
			activeRing = "white";
			ring2 = Color.white;
		} else if (activeRing.equals("white")) {
			activeRing = "yellow";
			ring3 = Color.yellow;
		} else {
			activeRing = "red";
			bullseye = Color.red;
		}
			
		
		repaint();
	}
	
	
	

}
