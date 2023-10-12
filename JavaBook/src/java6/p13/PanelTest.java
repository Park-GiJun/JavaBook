package java6.p13;

import java.awt.*;

public class PanelTest {

	private Frame f;
	private Panel p;
	private Button ok, cancel;
	private TextField tf;

	public PanelTest() {
		f = new Frame("Panel Test");
		ok = new Button("전송");
		cancel = new Button("취소");
		tf = new TextField("Input...");
		p = new Panel();
	}

	public void startFrame() {
		f.add(tf, BorderLayout.NORTH);
		p.setBackground(Color.green);
		p.add(ok);
		p.add(cancel);
		f.add(p, BorderLayout.CENTER);

		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String[] main) {
		PanelTest g = new PanelTest();
		g.startFrame();
	}
}
