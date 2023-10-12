package java5.p38;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		
		if(ts.add("korea")) {
			System.out.println("첫 번째 korea 추가 성공");
		} else {
			System.out.println("첫 번째 korea 추가 실패");
		}
		
		if(ts.add("China")) {
			System.out.println("첫 번째 china 추가 성공");
		}else {
			System.out.println("첫 번째 china 추가 실패");
		}
		
		if(ts.add("america")) {
			System.out.println("첫 번째 america 추가 성공");
		}else {
			System.out.println("첫 번째 america 추가 실패");
		}
		if(ts.add("China")) {
			System.out.println("두 번째 china 추가 성공");
		}else {
			System.out.println("두 번째 china 추가 실패");
		}
		
		System.out.println("Iterator로 문자 전체 순회---------------------");
		Iterator<String> it = ts.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
				
	}

}
