package java6.p19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("b1")) {
			System.out.println("b1 click");
		} else if(e.getActionCommand().equals("b2")) {
			System.out.println("b2 click");
		} else if(e.getActionCommand().equals("b3")) {
			System.out.println("b3 click");
		} else if(e.getActionCommand().equals("b4")) {
			System.out.println("b4 click");
		} else if(e.getActionCommand().equals("b5")) {
			System.out.println("b5 click");
		} 
	}
	
}
