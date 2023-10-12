package java5.p47;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		
		NavigableSet<Integer> decendingSet = scores.descendingSet();
		for (Integer score : decendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		NavigableSet<Integer> ascendingSet = decendingSet.descendingSet();
		for(Integer score : ascendingSet) {
			System.out.print(score + " ");
		}
	}

}
