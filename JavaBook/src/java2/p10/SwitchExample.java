package java2.p10;

public class SwitchExample {

	public static void main(String[] args) {
		int time = (int) (Math.random()*4) +8;
		System.out.println("현재 시간 : "+ time);
		
		switch(time) {
		case 8:
			System.out.println("출근");
			break;
			
		case 9:
			System.out.println("회의");
			break;
		case 10:
			System.out.println("업무");
			break;
		default:
			System.out.println("외근");
			break;
		}

	}

}
