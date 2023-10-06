package java4.p54;

public class Main {

	public static void main(String[] args) {
		
		Integer a = new Integer(100);
		Integer b = new Integer("100");
		Integer c = Integer.valueOf(300);
		Integer d = 400;
		
		int va = a.intValue();
		int vb = b.intValue();
		int vc = c.intValue();
		int vd = d.intValue();
		
		System.out.println(va);
		System.out.println(vb);
		System.out.println(vc);
		System.out.println(vd);

	}

}
