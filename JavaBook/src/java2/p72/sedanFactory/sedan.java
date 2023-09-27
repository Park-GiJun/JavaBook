package java2.p72.sedanFactory;

import java2.p72.component.Tire;

public class sedan {

	public static void main(String[] args) {
//		java2.p72.component.Tire compoTire = new java2.p72.component.Tire();
		Tire compoTire = new Tire();
//		compoTire.size = 20;
		compoTire.setSize(20);
//		compoTire.bigTire(60);

//		System.out.println(compoTire.size);
//		System.out.println(compoTire.getSize());
		System.out.println(compoTire.getSize());

	}
}
