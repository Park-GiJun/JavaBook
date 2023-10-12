package java4.p71;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		System.out.print(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 mm월 dd일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy.mm.dd a HH:mm:ss");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("올해의 D번째 날");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("이달의 d번쨰 날");
		System.out.println(sdf.format(now));
	
		

	}

}
