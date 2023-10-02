package java3.p74;

public class Main {

	public static void main(String[] args) {
		Anonymous anoy = new Anonymous();
		
		anoy.field.wake();
		anoy.method1();
		anoy.method2(new Person() {
			void study() {
				System.out.println("공부합니다.");
			}
			
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});

	}

}
