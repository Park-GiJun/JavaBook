package javaExample.BaseballGame;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean clear = true;

		Random rd = new Random();
		int[] answer = new int[3];

		for (int i = 0; i < 3; i++) {
			int randomNum;
			boolean dup;

			do {
				dup = false;
				randomNum = rd.nextInt(8) + 1;
				for (int j = 0; j < i; j++) {
					if (answer[j] == randomNum) {
						dup = true;
						break;
					}
				}
			} while (dup);

			answer[i] = randomNum;
		}
		while (clear) {
			System.out.println("숫자를 입력하세요.");
			int strike = 0;
			int ball = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] inps = new int[3];

			if (st.hasMoreTokens()) {
				for (int i = 0; i < 3; i++) {
					inps[i] = Integer.parseInt(st.nextToken());
				}
			}

			for (int i = 0; i < 3; i++) {
				if (answer[i] == inps[i]) {
					strike++;
				}
			}
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (answer[i] == inps[j]) {
						ball++;
					}
				}
			}
			System.out.println("스트라이크 : " + strike);
			System.out.println("볼 : " + (ball - strike));
			System.out.println();
			if (strike == 3) {
				System.out.println("Clear");
				clear = false;
			}
		}
	}

}
