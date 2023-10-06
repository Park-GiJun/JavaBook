package java4.p34;

public class Main {

	public static void main(String[] args) {

		String ssn = "123456-1234567";

		int length = ssn.length();
		System.out.println(length);

		if (length == 14) {
			System.out.print("주민등록번호가 맞습니다.\n");
		} else {
			System.out.print("주민등록번호가 아닙니다.\n");
		}

	}

}
