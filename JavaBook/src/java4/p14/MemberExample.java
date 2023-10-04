package java4.p14;

public class MemberExample {

	public static void main(String[] args) {
		Member ori = new Member("홍길동", 25, new int[] { 98, 80 }, new Car("소나타"));

		Member cloned = ori.getMember();
		cloned.scores[0] = 101;
		cloned.car.model = "K5";

		System.out.println("[복제 객체의 필드값]");
		System.out.println("name : " + cloned.name);
		System.out.println("age : " + cloned.age);
		System.out.print("scores : {");
		for (int i = 0; i < cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i == (cloned.scores.length - 1)) ? "" : ",");
		};
		System.out.println("}");
		System.out.println("car: " + cloned.car.model);
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("name : " + ori.name);
		System.out.println("age : " + ori.age);
		System.out.print("scores : {");
		for (int i = 0; i < ori.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i == (ori.scores.length - 1)) ? "" : ",");
		}
		System.out.println("}");
		System.out.println("car: " + ori.car.model);
		System.out.println();
	}

}
