package java6.p30;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main implements WindowListener {

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	public static void main(String[] args) {

		Frame f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null);
		Button b = new Button("Check");
		b.setSize(100, 50);
		b.setLocation(100, 75);

		f.add(b);
		f.addWindowListener(new Main());
		f.setVisible(true);

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("b click");
				b.setLabel("Cancel");
			}
		});
	}

}
