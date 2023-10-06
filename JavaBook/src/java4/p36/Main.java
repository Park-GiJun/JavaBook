package java4.p36;

public class Main {

	public static void main(String[] args) {
		String ssn = "980320-1234567";
		
		String first = ssn.substring(0,6);
		String second = ssn.substring(7);
		
		System.out.println(first);
		System.out.println(second);

	}

}
