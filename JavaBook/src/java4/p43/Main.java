package java4.p43;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		String text = "홍/김/박";

		StringTokenizer st = new StringTokenizer(text, "/");

		int cnt = st.countTokens();

		for (int i = 0; i < cnt; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();

		st = new StringTokenizer(text, "/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
