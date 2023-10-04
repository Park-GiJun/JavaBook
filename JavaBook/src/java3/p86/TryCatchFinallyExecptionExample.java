package java3.p86;

public class TryCatchFinallyExecptionExample {

	public static void main(String[] args) {

		String data1 = null;
		String data2 = null;

		try {
			data1 = args[0];
			data2 = args[1];
			String data3 = "100";
			String data4 = "a200";

			int value1 = Integer.parseInt(data3);
			int value2 = Integer.parseInt(data4);
			int result = value1 + value2;

			System.out.println(data3 + " + " + data4 + "=" + result);

			System.out.println(data1);
			System.out.println(data2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return;

		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요");
		}

	}

}
