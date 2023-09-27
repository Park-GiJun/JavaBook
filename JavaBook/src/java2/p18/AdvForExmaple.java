package java2.p18;

public class AdvForExmaple {

	public static void main(String[] args) {
		int[] scores = {9, 8, 7, 6, 5};
		
		int sum = 0;
		for (int s : scores) {
			sum += s;
		}
		System.out.println("sum = " + sum);
	}

}
