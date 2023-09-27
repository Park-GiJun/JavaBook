package java2.p95;


class Person{
	final String nation = "Korea";
	final String ssn;
	String name;
	
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
		
	}
}
public class PersonExample {

	public static void main(String[] args) {
		
		Person p1 = new Person("123456-123567", "KyeBaek");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "USA";
//		The Fianl field cannot be asigned.
//		p1.ssn = "654321-7654321";
//		p1.name = "LeeSoonSHin";
	}

}
