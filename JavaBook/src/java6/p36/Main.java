package java6.p36;

import java.awt.Frame;
import java.awt.Label;

public class Main {
	public static void main(String[] args) {
	
		Frame f = new Frame("Label");
		f.setSize(300,200);
		f.setLayout(null);
		
		Label id = new Label( "ID : ");
		id.setBounds(50, 50, 30, 10);
		
		Label pw = new Label("PW : ");
		pw.setBounds(50, 65, 30, 10);
		
		f.add(id);
		f.add(pw);
		f.setVisible(true);
	}

}
