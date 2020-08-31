package z_2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// 1. 사용자로부터 숫자입력
		// 2. 사용자로부터 부로호 입렵
		// 3. 사용자로부터 숫자입력
		// 4. 연산을 수행하여 결과를 출력
		// 5. 1~4를 무한반복해준다
		// 단, 사용자가 입력한부호가 사칙연산자가 아니면 종료하여라.
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;

		String buho = null;
		int result = 0;
		do {
			System.out.print("숫자1를 입력하세요 : ");
			num1 = sc.nextInt();

			System.out.print("\n부호를 입력하세요 : ");
			buho = sc.next();

			System.out.print("\n숫자2를 입력하세요 : ");
			num2 = sc.nextInt();
			if ("+".equals(buho)) {
				result = num1 + num2;
			} else if ("-".equals(buho)) {
				result = num1 - num2;
			} else if ("*".equals(buho)) {
				result = num1 * num2;
			} else if ("/".equals(buho)) {
				result = num1 / num2;
			} else {
				buho = "exit";
				result = 0;
			}
			System.out.println("    " + num1 + buho + num2 + "\n연산 결과 : "
					+ result + "\n\n");
		} while (!"exit".equals(buho));

	}
}
