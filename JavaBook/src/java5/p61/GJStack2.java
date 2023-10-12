package java5.p61;

import java.util.*;

public class GJStack2 {
	private int[] arr;
	private int top;
	
	public GJStack2() {
		arr = new int[10];
		top = -1;
	}

	public Coin pop() {
		Coin coin = new Coin(arr[top--]);
		return coin;

	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public void push(Coin coin) {
		arr[++top] = coin.getCoin();
	}

}
