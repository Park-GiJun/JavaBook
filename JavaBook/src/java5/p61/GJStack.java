package java5.p61;

import java.util.*;

public class GJStack {
	List<Coin> box = new ArrayList<Coin>();

	private int top;

	public GJStack() {

		top = -1;
	}

//	public Coin pop() {
//		Coin coin = new Coin(box.get(top++));
//		return coin;
//
//	}

	public boolean isEmpty() {
		if (!box.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public void push(Coin coin) {
		box.add(coin);
	}

}
