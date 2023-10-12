package java6.p24;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

public class AdapterTest implements WindowListener {

	private Frame f;
	private Button b1, b2, b3;

	public AdapterTest() {
		f = new Frame("adapter");
		b1 = new Button("Ok");
		b2 = new Button("Open");
		b3 = new Button("Close");
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	public void windowClosed(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
	
	public void startFrame() {
		f.addWindowListener(this);
		f.setLayout(new FlowLayout());
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setSize(300, 300);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		AdapterTest a = new AdapterTest();
		a.startFrame();
	}

}
