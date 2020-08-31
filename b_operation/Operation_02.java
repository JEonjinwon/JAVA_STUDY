package b_operation;

public class Operation_02 {
	public static void main(String[] args) {
		// 1. 증감연산자 (++, --)
		// - 증가연산자 (++) : 피연산자의 값을 1증가시킨다.
		// - 감소연산자 (--) : 피연산자의 값을 1감소시킨다.

		byte b1 = 50;
		b1++;
		// b1 = (byte)(b1 +1);
		char c1 = 'A';
		// c1 = (char)(c1+1);
		c1++;// 'B'
		System.out.println(c1);
		++c1;// 'C'
		int i1 = 40;
		int i2 = 50;

		int i3 = i1 + ++i2; // 40 +51
		System.out.println(i3);// 91

		int i33 = i1 + i2++; // 40 +51
		System.out.println(i33);// 91

		// 30p 문제 2-6
		int number = 30;
		char ch = 'C';
		int result = number++ + 3 + ++ch + ++number;
		// 30(number :31) + 3+ 'D' + 32
		System.out.println("number:" + number);
		System.out.println("ch :" + ch);
		System.out.println("result" + result);

		// 2. 부호연산자 (+,-)
		// -기본 자료형에 boolean, char를 제외한 나머지 자료형에 사용가능

		// 3. 비트전환 연산자 (~)
		// -정수형과 char형에만 사용이 가능하다.
		// -피연산자를 2진수로 표현하였을 때 0은 1로 1은 0으로 바꾼다.
		// 10 00001010
		// ~10 11110101 => 1의 보수 -11
		// ~10+1 11110110 => 2의 보수 -10

		byte b2 = 10;
		byte b3 = (byte) ~b2;
		System.out.println(b3);

		// 4. 논리부정 연산자( ! )
		// - boolean형에만 사용이 가능하다.
		// - true -> false , false -> true
		boolean power = false;
		System.out.println(power);
		
		//power의 값을 부정하여 다시 power에 저장해주세요
		power = !power;
		System.out.println(power);
		

	}
}
