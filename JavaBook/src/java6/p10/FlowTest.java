package java6.p10;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowTest {

	private Frame frame;
	private Button bt1, bt2, bt3;

	public FlowTest() {
		frame = new Frame("Flow Layout");
		bt1 = new Button("확인");
		bt2 = new Button("열기");
		bt3 = new Button("닫기");
	}

	public void startFrame() {
		frame.setLayout(new FlowLayout());
		frame.add(bt2);
		frame.add(bt1);
		frame.add(bt3);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		FlowTest flow = new FlowTest();
		flow.startFrame();
	}
}
