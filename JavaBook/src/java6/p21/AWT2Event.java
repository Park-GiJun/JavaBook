package java6.p21;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWT2Event {

	private Frame f;
	private Button b1, b2, b3, b4, b5;

	public AWT2Event() {
		f = new Frame("AWT@");
		b1 = new Button("b1");
		b2 = new Button("b2");
		b3 = new Button("b3");
		b4 = new Button("b4");
		b5 = new Button("b5");
	}

	public void setFrame() {
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b1 click");
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b2 click");
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b3 click");
			}
		});
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b4 click");
			}
		});
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b5 click");
			}
		});
		f.add(b1, BorderLayout.NORTH);
		f.add(b2, BorderLayout.SOUTH);
		f.add(b3, BorderLayout.WEST);
		f.add(b4, BorderLayout.EAST);
		f.add(b5, BorderLayout.CENTER);
		
		f.setSize(300,300);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		AWT2Event border = new AWT2Event();
		border.setFrame();
	}
}
