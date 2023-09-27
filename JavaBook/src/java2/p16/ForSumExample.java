package java2.p16;

import java.util.Scanner;

public class ForSumExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int sum = 0;
		sc.close();
		
		for(int n =1; n <= a; n++ ) {
			sum += n;
		}
		System.out.println("sum = " + sum);
	}

}
