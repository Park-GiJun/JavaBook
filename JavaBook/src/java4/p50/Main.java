package java4.p50;

import java.util.*;

import java4.p26.SYstemEnvExample;

public class Main {

	public static void main(String[] args) {

		int[] scores = { 99, 68, 36, 29, 88 };

		Arrays.sort(scores);

		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores [" + i + "] = " + scores[i]);
		}

		String[] names = { "홍", "김", "박" };
		Arrays.sort(names);
		for (int i = 0; i < names.length; i++) {
			System.out.println("names [" + i + "] = " + names[i]);
		}

		int index = Arrays.binarySearch(scores, 99);
		System.out.println(index);
	}

}
