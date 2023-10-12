package java4.p67;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH)+1;
		int d = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("년" + y);
		System.out.println("월" + m);
		System.out.println("일" + d);
		
		int ampm = now.get(Calendar.AM_PM);
		String strAmpm = null;
		if(ampm==Calendar.AM) {
			strAmpm = "오전";
			
		}else {
			strAmpm = "오후";
		}
		System.out.println(strAmpm);
		
		int hour = now.get(Calendar.HOUR);
		int min = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);
		
		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);
		

	}

}
