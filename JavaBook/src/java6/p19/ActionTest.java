package java6.p19;

import java.awt.Button;
import java.awt.Frame;

import java6.p18.EventTest;

public class ActionTest {

	private Frame f;
	private Button b1, b2, b3, b4, b5;

	public ActionTest() {

		f = new Frame("Event Test");
		b1 = new Button("b1");
		b2 = new Button("b2");
		b3 = new Button("b3");
		b4 = new Button("b4");
		b5 = new Button("b5");
	}

	public void startFrame() {
		b1.addActionListener(new ActionHandler());
		b2.addActionListener(new ActionHandler());
		b3.addActionListener(new ActionHandler());
		b4.addActionListener(new ActionHandler());
		b5.addActionListener(new ActionHandler());

		f.add(b1, "North");
		f.add(b2, "South");
		f.add(b3, "West");
		f.add(b4, "East");
		f.add(b5, "Center");

		f.setSize(300, 300);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		ActionTest g = new ActionTest();
		g.startFrame();
	}
}
