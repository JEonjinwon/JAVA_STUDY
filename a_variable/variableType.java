package a_variable;

public class variableType {

	public static void main(String[] args) {

		//
		//
		// 변수의 타입
		// 1. 기본형타입(primitive type)
		// - boolean, char, byte, short, int, long, float, double
		// 2. 참조형 타입(reference type)
		// - 8가지 기본형을 제외한 나머지 타입, 객체의 주소를 저장한다.
		// 3. 기본형 타입의 크기(1byte = 8bit)
		// - 1byte : boolean, byte
		// - 2byte : char, short
		// - 4byte : int, float
		// - 8byte : long, double
		// 4. 종류
		// - 논리형 : boolean (true, false 중 하나를 값을 가진다.)
		// - 문자형 : char (문자를 하나 저장하는데 사용된다.)
		// - 정수형 : byte, short, int, long (정수값을 저장하는데 사용된다.)
		// - 실수형 : float, double (실수값을 저장하는데 사용된다.)
		// 5. 논리형 - boolean (기본값 : false)
		// - boolean 형 번수에는 true또는 false의 값 하나만 저장할 수 있다.
		// - boolean 변수는 대답(yes, no), 스위치(on, off)등의 논리구조에 사용된다.
		// - 데이터를 다루는 가장작은 단위가 byte이기 떄문에 1byte의 크기를 가진다. 실제는 1bit만 필요
		// 1byte=8bit
		//
		//
		// 1. 변수 power를 선언하고 true의 값으로 초기화 하여라.
		boolean power = true;
		//
		// 6. 문자형 -char - java는 unicode 문자체계를 이용한다. 2byte의 크기를 가진다.
		// - 문자 하나를 저장하기 위해서 사용한다. 'A'
		//
		// 2.변수 ch를 선언하고 'A'의 값으로 초기화 하여라.
		char ch = 'A';
		char ch2 = '\u0041';
		char ch3 = 65;
		System.out.println(ch);
		System.out.println(ch2);
		System.out.println(ch3);
		// 7. 정수형 - byte, short, int, long
		// - 기본 자료형은 int이다.
		// - 변수에 저장하려는 정수값의 범위에 따라 4개의 정수형중에 하나를 선택한다.
		// - byte,short의 경우 크기가 작아서 범위를 넘어서는경우가 많다. 그래서 int형을 사용하는것이 좋다.
		// 1. 변수 b1에 50의 값을 저장하여라
		byte b1 = 50;
		// 2. 변수 s1에 25000의 값을 저장하여라
		short s1 = 25000;
		// 3. 변수 i1에 15억의 값을 저장하여라
		int i1 = 1500000000;
		// 4. 변수 l1에 53억의 값을 저장하여라
		long l1 = 5300000000L;

		// 8. 실수형 -float, double
		// - 실수형 값을 저장하는데 사용된다.
		// - float : 1+8+23
		// - double : 1+11+52
		// - 실수형중 자료형을 선택할때는 값의 범위안이 아니라 정밀도도 중요하다.

		// 1. 변수 f1에 3.141592를 저장해주세요.
		float f1 = 3.141592f;
		// 1. 변수 d1에 3.14159253548를 저장해주세요.
		double d1 = 3.14159253548;

		// 9. String
		// -문자열을 다루는 클래스
		// -기본값이 null이다. null만 주소가 없다. ""도 빈 주소가 있다.
		// -\말고는 아무거나 가능
		String name = "JeonJinWon";
		String gibon = null;
		String r1 = "++++++++-\n------";

		System.out.println(r1);

		// 1. 변수 a1에 7의 값을 저장해주세요.
		int a1 = 7;
		// 2. 변수 S1에 "이름"의 값을 저장해주세요
		String s2 = "이름";
		// 3. a1과 S1의 합을 변수 result1에 저장해주세요.
		String result1 = a1 + s2;
		System.out.println(result1);
		System.out.println("" + true);
		System.out.println("" + null);

		// 10. overflow
		// -변수 자신이 저장할 수 있는 범위를 넘어섰을때 최솟값으로 돌아가는 현상 정수형에서만 가능
		byte b2 = 126;
		b2++;
		System.out.println(b2);
		b2++;
		System.out.println(b2);

		// 11.형변환 (casting)
		// -'케스트 연산자'를 이용하여 형변환을 할 수 있다.
		// -'A' => 10진수일때 어떤 값인지 ??
		// - 10 => '?'

		// 1. byte형 변수 b3에 100의 값을 저장 해주세요.
		byte b3 = 100;
		// 2. char형 변수 c3에 'K'의 값을 저장해주세요.
		char c3 = 'K';
		// 3. int형 변수 i3에 400000의 값을 저장해주세요.
		int i3 = 400000;
		// 4. float형 변수 f3에 3.14를 저장해 주세요.
		float f3 = 3.14f;

		// 5. c3에 저장된 값인 10진수값을 변서 result2에 저장해주세요.
		int result2 = (int) c3;
		// 6. result2의 값을 출력해주세요.
		System.out.println(result2);

		// 7. f3에 저장된 값중 정수값만 취득하여 result3에 저장해주세요.
		int result3 = (int) f3;
		// 8. result3를 출력해주세요.
		System.out.println(result3);

		// 9. 22p 문제 2-4
		int aa = 8;
		int bb = 3;
		int result4 = (aa / bb);
		float result5 = (float) aa / bb;
		System.out.println(result4);
		System.out.println(result5);

		// byte 타입의 변수 b6를 선언하고 15의 값으로 초기화 하여라.
		byte b6 = 15;
		// char 타입의 변수 c6를 선언하고 'A'의 값으로 초기화 하여라.
		char c6 = 'A';
		// b6와 c6의 합을 변수 byte result6에 저장하여라.
		byte result6 = (byte) (b6 + c6);
		System.out.println(result6);

		// 23p 문제 2-5
		byte byte01 = 33;
		long long01 = 888;
		char char01 = 'A';
		float float01 = 3.141592f;
		int intger01 = (int) long01;
		short short01 = (short) char01;
		int integer01 = (int) float01;
		int integer02 = byte01;
		int integer03 = char01;

		System.out.println(byte01);
		System.out.println(long01);
		System.out.println(char01);
		System.out.println(float01);
		System.out.println(intger01);
		System.out.println(short01);
		System.out.println(integer01);
		System.out.println(integer02);
		System.out.println(integer03);

	}
}
