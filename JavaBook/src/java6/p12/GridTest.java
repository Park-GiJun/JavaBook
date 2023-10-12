package java6.p12;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;

public class GridTest {

	private Frame frame;
	private Button b1, b2, b3;
	private TextField t1, t2, t3;

	public GridTest() {
		frame = new Frame("Grid Layout");
		b1 = new Button("bt1");
		b2 = new Button("bt2");
		b3 = new Button("bt4");

		t1 = new TextField("Input Text");
		t2 = new TextField("Input Text");
		t3 = new TextField("Input Text");
	}

	public void setFrame() {
		frame.setLayout(new GridLayout(3, 0));
		frame.add(b1);
		frame.add(t1);
		frame.add(b2);
		frame.add(t2);
		frame.add(b3);
		frame.add(t3);

		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		GridTest grid = new GridTest();
		grid.setFrame();
	}

}
