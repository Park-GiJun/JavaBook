package java1.p77;

public class OperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1000000000;
		int b = 1000000000;

		int axb = a * b;
		long axb2 = (long) a * (long) b;
		long axb3 = (long) (a * b);

		System.out.println(axb);
		System.out.println(axb2);
		System.out.println(axb3);

	}

}
