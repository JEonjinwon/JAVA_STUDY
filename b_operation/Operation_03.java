package b_operation;

public class Operation_03 {
	public static void main(String[] args) {
		// 1. 산술 연산자
		// - 사칙연산자 (+ - * /), 나머지 연산자( % ), 쉬프트 연산자 ( << >> >>> )
		// 는 두개의 피연산자를 취하는 이항 연산자 이다.
		// - 이항 연산시에는 두개의 피연산자(개산이 되는 숫자)모두 4byte형보다 작은 경우에는 둘다 4byte형인
		// int로 변환하여 연산을 수행한다.
		// 2. 사칙연산자 ( + - * / )
		// - 두 개의 피연산자중 하나 이상이 4byte형보다 큰 경우에는 큰 자료형으로 변환 후 연산한다.
		// : int + float => float + float => float
		// - 두 개의 피연산자 모두 4byte보다 작은 경우에는 둘다 int 형으로 변환후 연산한다.
		// : byte + short => int + int
		// - 정수형 간의 나눗셈에서 0으로 나누는 것은 금지되어 있다.

		// 34p 문제 2-8
		byte b1 = 80;
		byte b2 = 100;
		long lo1 = 642L;
		long result1 = lo1 + b1;
		System.out.println(result1);
		int result2 = b1 + b2;
		System.out.println(result2);
		byte result3 = (byte) (b1 + b2);
		System.out.println(result3);
		long lo2 = 60000L * 80000;
		System.out.println(lo2);

		// 3. 나머지 연산자 (%)
		// - 왼쪽의 피연산자를 오른쪽의 피연산자로 나누고 난 나머지 값을 반환하는 연산다.
		// - boolean을 제외한 모든 기본형 변수에 사용할 수 있다.

		int a1 = 10;
		int b3 = 8;

		int share = a1 / b3; // 1 몫
		int remain = a1 % b3; // 2 나머지

		// xx을 xx로 나눈 몪은 x 이고 나머지는 xx이다
		System.out.println(a1 + "을 " + b3 + "로 나눈 몫은 " + share + "이고 나머지는 "
				+ remain + "이다.");

		// 4. 쉬프트 연산자( <<, >>,>>>)
		// -정수형 변수에만 사용이 가능하다.
		// -피연산자의 각자리(2진수)를 오른쪽 또는 왼쪽으로 이동한다.
		// -곱셈과 나눗셈을 할때 연산속도가 매우 뛰어나다.
		// -<< : x<<n : x*2^n
		// ->> : x>>n : x/2^n

		int shift = 10;
		System.out.println(shift << 32);
		System.out.println(shift >> 3);

		// 5.비교연산자
		// -두개의 변수 또는 리터럴을 배교하는데 사용된다.
		// -주로 조건문과 반복문의 조건식에 사용되며 연산결과는 true또는 false이다.
		// -이항연산자이다.

		// 6.대소비교연산자(<, >, <=, >=)
		// -참조형을 제외한 기본 자료형 중 boolean을 제와한 나머지 자료형에 사용이 가능하다.
		//
		// 7.등가비교연산자(==, !=)
		// -모든 자료형에 사용이 가능한다.

		// 수식 | 연산결과
		// x>y | x가 y보다 클떄만 true, 그외에는 false
		// x<y | x가 y보다 작을때만 true, 그외에는 false
		// x>=y | x가 y보다 크거나 같을때만 true, 그외에는 false
		// x<=y | x가 y보다 작거나 같을때만 true, 그외에는 false
		// x==y | x와 y가 같을때 true, 그외에는 false
		// x!=y | x와 y가 다를때 true, 그외에는 false

		float f01 = 0.1f;
		float f02 = 10.0f;
		double do01 = 0.1;
		double do02 = 10.0;
		String str1 = "화이팅";
		System.out.println(f01 == do01);
		System.out.println(f02 == do02);
		System.out.println(str1.equals("화이팅"));

		// 8.비트 연산자(&, |, ^)
		// -이진비트 연산을 수행한다.
		// -실수형을 제외한 모든곳에서 사용가능하다.
		// |(or연산) : 피연산자 중 한쪽의 값이 1이면 1의 결과를 얻는다.
		// &(and연산) : 피연산자 양쪽 모두의 값이 1이면 1의 결과를 얻는다.
		// ^(xor연산) : 피연산자의 값이 서로 다르면 1의 결과를 얻는다.

		int a = 3;
		int b = 5;
		System.out.println(a | b);
		System.out.println(a & b);
		System.out.println(a ^ b);

		// 9.논리 연산자 (&&, ||)
		// - 피연산자로 boolean형 또는 boolean형 값을 결과로 하는 조건식만 허용한다.
		// - 조건식의 결합에 사용한다.
		// -&&가 ||보다 연산우선순위가 높다.
		// ||(or결합) : 피연산자 중 한쪽의 값이 true이면 true의 결과를 얻는다.
		// &&(and결합) : 피연산자 양쪽 모두의 값이 true이면 true의 결과를 얻는다.

		int a2 = 7;
		// 5이상 15이하 일때 true
		// 5<= a2 <=15
		// 5<=a2 && a2<=15
		System.out.println((5 <= a2 && a2 <= 15) + "\n");

		// [문제 2-11]
		char ch01 = '7';
		System.out.println(ch01 >= 'A' && ch01 <= 'Z');
		System.out.println(ch01 >= 'a' && ch01 <= 'z');
		System.out.println((ch01 >= 'a' && ch01 <= 'z')
				|| (ch01 >= 'A' && ch01 <= 'Z'));
		System.out.println(ch01 >= '0' && ch01 <= '9');
		
		
		//10.삼항연사자
		//	-세 개의 피연산자를 필요로 하기 때문에 삼항연산자로 이름지어 졌다.
		//	-삼항연산자의 조건식에는 연산결과가 true또는 false인 식이 사용되어야 한다.
		//	-기본구조 
		//		(조건식) ? true일때 : false일때
		//	-true결과 타입과 false결과 타입은 같아야한다.
		
		
		int a3 = -10;
		int abs = a3 >= 0 ? a3 : -a3;
		System.out.println(abs);
		
		
		
		
		//11.대입연산자(-, op=)
		//	-변수에 값 또는 수식의 연산결과를 저장하는데 사용한다.
		//	-연산우선순위가 가장 낮다.
	
		int b4 = 10;
		//1. b4의 값에 3을 곲한 결과를 b4에 저장
		b4 = b4*3;
		b4*=3;
		
		char c3 = 'a';
		c3+=5;
		//c3 = (char)(c3 +5);
		
		
		
		//반올림
		double cc =3.43543;
		System.out.println(((int)(cc*100+0.5))/100f);
		
		//랜덤  (0 <= Math.random() < 1)
		System.out.println((int)(Math.random()*6+1));
		
		//[문제 2-13]
		System.out.println((int)(Math.random()*100));

		System.out.println((int)(Math.random()*331+44));
	
		
		
		
		
		
		

	}
}
