package java3.p14;

public class AirpalneExample {

	public static void main(String[] args) {

		SuperAirplane sa = new SuperAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuperAirplane.SUPER;
		sa.fly();
		sa.land();

	}

}
