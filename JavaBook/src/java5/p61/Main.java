package java5.p61;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {

//		Stack<Coin> coinbox = new Stack<Coin>();
		GJStack2 coinbox = new GJStack2();

		coinbox.push(new Coin(20));
		coinbox.push(new Coin(70));
		coinbox.push(new Coin(100));
		coinbox.push(new Coin(130));

		while (!coinbox.isEmpty()) {
			Coin coin = coinbox.pop();
			System.out.println("꺼내온 동전 : " + coin.getCoin() + " 원");
		}
	}

}
