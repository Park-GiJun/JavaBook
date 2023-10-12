package java6.p20;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java6.p19.ActionHandler;
import java6.p19.ActionTest;

public class BorderTest {

	private Frame f;
	private Button b1, b2, b3, b4, b5;

	public BorderTest() {
		f = new Frame("BorderTest");
		b1 = new Button("b1");
		b2 = new Button("b2");
		b3 = new Button("b3");
		b4 = new Button("b4");
		b5 = new Button("b5");
	}

	public class InnerHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("b1")) {
				System.out.println("b1 click");
			} else if (e.getActionCommand().equals("b2")) {
				System.out.println("b2 click");
			} else if (e.getActionCommand().equals("b3")) {
				System.out.println("b3 click");
			} else if (e.getActionCommand().equals("b4")) {
				System.out.println("b4 click");
			} else if (e.getActionCommand().equals("b5")) {
				System.out.println("b5 click");
			}
		}

	}

	public void startFrame() {
		b1.addActionListener(new InnerHandler());
		b2.addActionListener(new InnerHandler());
		b3.addActionListener(new InnerHandler());
		b4.addActionListener(new InnerHandler());
		b5.addActionListener(new InnerHandler());

		f.add(b1, "North");
		f.add(b2, "South");
		f.add(b3, "West");
		f.add(b4, "East");
		f.add(b5, "Center");

		f.setSize(300, 300);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		BorderTest g = new BorderTest();
		g.startFrame();
	}

}
