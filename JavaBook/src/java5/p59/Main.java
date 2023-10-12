package java5.p59;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 24));
		treeSet.add(new Person("박지원", 31));

		Iterator<Person> it = treeSet.iterator();
		while(it.hasNext()) {
			Person person = it.next();
			System.out.println(person.name + " : " + person.age);
		}
		System.out.println();
		
		NavigableSet<Person> ns = treeSet.descendingSet();
		for(Person person : ns) {
			System.out.println(person.name + " : " +person.age);
		}
		
	}

}
