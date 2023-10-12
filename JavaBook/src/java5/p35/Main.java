package java5.p35;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>(0);
		
		set.add("Java");
		set.add("JDBC");
		set.add("servlet/JSP");
		set.add("IBATIS");
		
		
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String element = it.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println("총객체수 : " + set.size());
		
		it = set.iterator();
		
		while(it.hasNext()) {
			String element = it.next();
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
	}

}
