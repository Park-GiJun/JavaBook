package java3.p13;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;

		Cal cal = new Cal();
		System.out.println("원 면적 : " + cal.areaCircle(r));
		System.out.println("");

		Com com = new Com();
		System.out.println("원 면적 : " + com.areaCircle(r));
	}

}
