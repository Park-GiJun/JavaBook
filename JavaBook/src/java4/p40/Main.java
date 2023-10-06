package java4.p40;

public class Main {

	public static void main(String[] args) {
		
		String a= "김연수&김자바,김수연-김바자";
		
		String[] names = a.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}
	}

}
