package java4.p29;

import java.lang.reflect.*;
import java.text.DateFormat.Field;

public class Main {

	public static void main(String[] args) {
		
		try {
			Class claz = Class.forName("java4.p29.TClass");
			
			System.out.println("[Class Name]");
			System.out.println(claz.getName());
			System.out.println();
			
			System.out.println("[Constructor Info]");
			Constructor[] cts = claz.getDeclaredConstructors();
			for(Constructor ct : cts) {
				System.out.print(ct.getName() + "(");
				Class[] pms = ct.getParameterTypes();
				printParameters(pms);
				System.out.println(")");
			}
			System.out.println();
			System.out.println("[File Info]");
			java.lang.reflect.Field[] fields = claz.getDeclaredFields();
			for(java.lang.reflect.Field field : fields) {
				System.out.println(field.getType().getSimpleName() + " " + field.getName());
			}
			System.out.println();
			
			System.out.println("[Method Info]");
			Method[] methods = claz.getDeclaredMethods();
			for(Method method : methods) {
				System.out.print(method.getName() + "(");
				Class[] pms = method.getParameterTypes();
				printParameters(pms);
				System.out.println(")");
			}
			System.out.println();
		}catch	(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	
	
			
	}
	private static void printParameters(Class[] pms) {
		for(int i = 0 ; i < pms.length; i++) {
			System.out.print(pms[i].getName());
			if(i<pms.length-1) {
				System.out.print(",");
			}
		}
	}

}
