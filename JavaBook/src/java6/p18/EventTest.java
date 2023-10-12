package java6.p18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest implements ActionListener {

	private Frame f;
	private Button b1, b2, b3, b4, b5;

	public EventTest() {
		f =new Frame("Event Test");
		b1 = new Button("b1");
		b2 = new Button("b2");
		b3 = new Button("b3");
		b4 = new Button("b4");
		b5 = new Button("b5");
		
	}
	
	public void startFrame() {
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		f.add(b1, "North");
		f.add(b2, "South");
		f.add(b3, "West");
		f.add(b4, "East");
		f.add(b5, "Center");
		
		f.setSize(300, 300);
		f.setVisible(true);
		
	}
	
	@Override
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
	
	public static void main(String[] args) {
		EventTest g = new EventTest();
		g.startFrame();
	}

}
