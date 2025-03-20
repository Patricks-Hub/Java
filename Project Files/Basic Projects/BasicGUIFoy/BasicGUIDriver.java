package BasicGUIFoy;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**  
* Patrick Foy - pjfoy  
* CIS171 - 20390
* Feb 15, 2025  
*/
public class BasicGUIDriver {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new BasicGUIPanel();
		
		frame.add(panel);
		frame.setSize(450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
	}

}
