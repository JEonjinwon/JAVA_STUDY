package z_exam;

public class exam_01 {
	public static void main(String[] args) {
		// [2-1] 다음 표의 빈 칸에 8개의 기본형을 알맞은 자리에 넣으세요.
		// 종류/크기 1byte 2byte 4byte 8byte
		// 논리형 boolean
		// 문자형 char
		// 정수형 byte short int long
		// 실수형 float double

		// [2-2]다음의 문장에서 리터럴 변수 상수 키워드를 적으시오
		int i = 10;
		long l = 100L;
		final float PI = 3.14f;
		// -리터럴 : 100, 100L, 3.14f
		// -변수 : i l
		// -키워드 : final, int , long ,float
		// -상수 : PI

		
		// [2-3]다음중 기본형이 아닌것은?
		// 1.int
		// 2.Byte
		// 3.double
		// 4.boolean
		// 정답 : 3 byte가 기본형이다.

		// [2-4] 다음 문장들의 출력 결과를 적으세요.
		System.out.println("1" + "2");
		// String + String => String
		// "1"+"2" =>"12"
		System.out.println(true + "");
		// boolean + String => String +String =>String
		// "true" +"" => "true"
		System.out.println('A' + 'B');
		// char + char => int + int =>int
		// 65 + 66 => 131
		System.out.println('1' + 2);
		// char + int => int _int => int
		// 49 + 2 => 51
		System.out.println('1' + '2');
		// char + char => int + int =>int
		// 49 +50 => 99
		System.out.println(4 + 24.1715F);
		// int + float => float +float => float
		// 4 + 24.1715 => 28.1715
		System.out.println('A' + 3.14);
		// char + double => double +double => double
		// 65 + 3.14 => 68.14
		System.out.println('j' + "ava");
		// char + String => char + String => String
		// 'j' + "ava" => java
		// System.out.println(true + null);
		// +연산자에 관에 인수가 정의되지 않고 null을 사용해서 오류 이다.
		// 참조형의 기본형 null이라 주소를 모른다.
		
		// [2-5]다음 중 키워드가 아닌것은?
		// 1.if 2.True 3.NULL 4.Class 5.System
		// 정답 : 2 3 4 5 키워드는 예약어이기떄문에 자주색으로 바뀌는 if만 키워드이다

		// [2-6]다음 중 변수의 이름으로 사용할 수 있는 것은?
		// 1.$ystem 2.channel#5 3.7eleven 4.If 5.자바 6.new 7.$MAX_NUM 8.hello@com
		// 정답 : 1457 2는 #을 사용, 3은 숫자가 첫글자 , 6은 예약어, 8은 @ 사용

		// [2-7]참조형 변수와 같은 크기의 기본형은 ? 참조형은 변수의 크기는 4byte이다.
		// 1.int 2.long 3.short 4.float 5.double
		// 정답 : 14 long과 double는 8byte, short는 2byte

		// [2-8]다음 중 형변환을 생략할 수 있는 것은?
		byte b = 10;
		char ch = 'A';
		int i2 = 100;
		long l2 = 1000L;

		// 1.b = (byte)i2;
		// 2.ch =(char)b;
		// 3.short s = (short)ch;
		// 4.float f = (float)l2;
		// 5.i2 = (int)ch;
		// 정답 : 45
		// byte ->short(char)->int ->long->float ->double 순으로 크기가 커져 반대는 형변환 생략
		// 불가

		// [2-9]char 타입의 변수에 저장될 수 있는 정수 값의 범위는 ?
		// char타입 2byte ->16bit ->16칸 -> 0 ~ (2^16)-1 -> 0~65535

		// [2-10]다음 중 변수를 잘못 초기화 한 것은? 정답 : 1234
		// 1.byte b = 256;
		// byte는 -128~127 .
		// 2.char c ='';
		// char은 빈칸으로 둘수 없다
		// 3.char answer = 'no';
		// char는 2글자가 올수 없다.
		// 4.float f =3.14;
		// float는 숫자 뒤에 f 추가
		// 5.double d = 1.4e3f; //1.4e3f앞에 (double) 생략

	}
}
