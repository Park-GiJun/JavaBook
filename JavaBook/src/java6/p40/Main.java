package java6.p40;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
	static TextField id;
	static TextField pw;
	static TextField result;

	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(400, 100);
		f.setLayout(new FlowLayout());

		Label lId = new Label("ID : ");
		id = new TextField(10);

		Label lPw = new Label("PW : ");
		pw = new TextField(10);
		pw.setEchoChar('*');

		Button login = new Button("Login");
		login.setSize(30, 30);
		login.addActionListener(new Main());

		result = new TextField("ID와 PW를 입력해주세요");
		result.setEnabled(false);
		result.setColumns(32);

		f.add(lId);
		f.add(id);
		f.add(lPw);
		f.add(pw);
		f.add(login);
		f.add(result);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Login")) {
			if (id.getText().equals("aaa") && pw.getText().equals("bbb")) {
				result.setText("로그인에 성공하셨습니다.");
			} else {
				result.setText("아이디와 비밀번호를 확인해주세요");
			}
		}
	}

}
