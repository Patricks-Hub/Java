package BasicGUIFoy;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
/**  
* Patrick Foy - pjfoy  
* CIS171 - 20390
* Feb 15, 2025  
*/
public class BasicGUIPanel extends JPanel{
	
	BasicGUIDrawing dartboard = new BasicGUIDrawing();
		
		public BasicGUIPanel() {
			
			JButton changeButton = new JButton("Change");
			
			dartboard.setPreferredSize(new Dimension(400,400));
			
			buttonListemer l = new buttonListemer();
			changeButton.addActionListener(l);
			
			
			add(dartboard);
			add(changeButton);
			
		
		}
		
		class buttonListemer implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				dartboard.changeColor();
				
			}
			
		}

}