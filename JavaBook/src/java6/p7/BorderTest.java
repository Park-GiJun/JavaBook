package java6.p7;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class BorderTest {

	private Frame frame;
	private Button center, west, east, south;
	private TextField tfl;

	public BorderTest() {
		frame = new Frame("Border Layout Example");
		south = new Button("bt1");
		west = new Button("bt2");
		east = new Button("bt3");
		center = new Button("bt4");
		tfl = new TextField();
		tfl.setText("입력창 입니다.");
	}

	public void startFrame() {
		frame.add(tfl, "North");
//		frame.add(south, "South");
//		frame.add(east, "East");
		frame.add(west, "West");
		frame.add(center, "Center");

		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {

		BorderTest border = new BorderTest();
		border.startFrame();

	}

}
