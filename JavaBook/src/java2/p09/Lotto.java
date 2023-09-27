package java2.p09;

public class Lotto {

	public static void main(String[] args) {

		int[] num = new int[6];
		boolean b = false;
		
			for (int i = 0; i < 6; i++) {
				num[i] = (int) (Math.random() * 45) + 1;
				System.out.println(num[i]);
			}
	}
}
