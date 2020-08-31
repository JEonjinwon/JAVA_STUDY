package e_OOP;

import java.util.Scanner;

public class Calculator_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int result1 = 0;
		float result2=0.0f;
		do {
			int num1 = 0;
			if (i == 0) {
				System.out.print("첫 번쨰 숫자 : ");
				num1 = sc.nextInt();
			} else {
				if(result2==0.0f){
				num1 = result1;
				}else{
					num1 = (int)result2;
				}
			}
			System.out.print("부호 입력 : ");
			String ch = sc.next();
			System.out.print("두 번쨰 숫자 : ");
			int num2 = sc.nextInt();
			Calculator2 c = new Calculator2(num1, ch, num2);

			switch (ch) {
			case "+":
				result1 = c.add();
				System.out.println("연산결과 : " + c.add());
				System.out.println();
				i++;
				break;
			case "-":
				result1 = c.sub();
				System.out.println("연산결과 : " + c.sub());
				System.out.println();
				i++;
				break;
			case "/":
				result2 = c.div();
				System.out.println("연산결과 : " + c.div());
				System.out.println();
				i++;
				break;
			case "*":
				result1 = c.mul();
				System.out.print("연산결과 : " + c.mul());
				System.out.println();
				i++;
				break;
			case "c":
				i = 0;
				System.out.println();
				break;
			case "C":
				i = 0;
				System.out.println();
				break;
			default:
				System.out.println("연산자 잘못입력 프로그램 종료");
				System.exit(0);
				break;
			}
		} while (true);

	}
}

class Calculator2 {
	int num1;
	String ch;
	int num2;

	Calculator2(int n1, String c, int n2) {
		num1 = n1;
		ch = c;
		num2 = n2;
	}

	void setNum1(int num) {
		num1 = num;
	}

	void setNum2(int num) {
		num2 = num;
	}

	void setChar(String c) {
		ch = c;
	}

	int getNum1() {
		return num1;
	}

	int getNum2() {
		return num2;
	}

	String getChar() {
		return ch;
	}

	int add() {
		return num1 + num2;
	}

	int sub() {
		return num1 - num2;
	}

	float div() {
		return (int)((float)num1 / num2*100+0.5)/100f;
	}

	int mul() {
		return num1 * num2;
	}

}