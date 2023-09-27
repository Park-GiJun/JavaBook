package java2.p72.component;

public class Tire {
	private int size;
	
	
	public Tire() {
		System.out.println("Trie Constructor");
		size = 0;
	}
	public int getSize() {
		return size;
	}

	public void setSize(int ssize) {
		size = ssize;
	}
	
	public void bigTire(int bsize) {
		size = bsize*2;
	}
	
	
	
	

}
