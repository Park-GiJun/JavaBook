package java2.p93;

class Cal {
	static double pi = 3.14159;
	
	static int plus (int x, int y) {
		return x + y;
	}
	
	static int min(int x, int y) {
		return x- y;
	}
}

public class Calculator {

	public static void main(String[] args) {
		double result1 = 10 * 10 * Cal.pi;
		int result2 = Cal.plus(10, 5);
		int result3 = Cal.min(10, 5);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
