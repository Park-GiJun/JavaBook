package java4.p28;

public class ClassInfoExample {

	public static void main(String[] args) {
		
		Car car = new Car(100);
		Class claz = car.getClass();
		System.out.println(claz.getName());
		System.out.println(claz.getSimpleName());
		System.out.println(claz.getPackage().getName());

	}

}
