package java6.p34;

import java.awt.Frame;
import java.awt.List;

public class Main {

	public static void main(String[] args) {
		
		Frame f = new Frame("list- secelect");
		f.setSize(300,200);
		f.setLayout(null);
		
		List selectOne = new List(5);
		selectOne.setLocation(20, 40);
		selectOne.setSize(100,120);
		selectOne.add("Student");
		selectOne.add("Teacher");
		selectOne.add("Driver");
		selectOne.add("Computer Programmer");
		selectOne.add("etc");
		
		List selectMany = new List(5, true);
		selectMany.setLocation(150,40);
		selectMany.setSize(100,120);
		selectMany.add("Studnet");
		selectMany.add("Teacher");
		selectMany.add("driver");
		selectMany.add("Computer Promgrammer");
		selectMany.add("etc");
		
		f.add(selectMany);
		f.add(selectOne);
		f.setVisible(true);
	}

}
