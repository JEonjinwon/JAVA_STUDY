package z_exam;

public class exam_02 {

	public static void main(String[] args) {

		// [3-1] 다음중 형변환을 생략할 수 있는것은?
		byte b = 10;
		char ch = 'A';
		int in = 100;
		long lo = 1000L;
		// (1) b = (byte)int; (2) ch =(char)b;
		// (3) short s = (short)ch;
		// (4) float f = (float) lo; (5)in = (int)ch;
		// 정답 : 4,5
		// (1)int를 byte보다 큰 변수라 형변환시 케스트 연산자가 필요하다
		// (2)byte에서 char로 형변환시 케스트 연산자가 필요하다.
		// (3)char에서 short로 형변환시 케스트 연산자가 필요하다.
		// (4)long에서 float보다 작은변수라 형변환시 케스트 연산자가 생략 가능하다.
		// (5)char는 4byte 이하라서 int로 자동형 변환 된다.

		// [3-2]다음 연산의 결과를 적으시오.
		int x = 2;
		int y = 5;
		char c = 'A';// 'A'의 문자코드는 65
		System.out.println(1 + x << 33);
		// 1+2<<33 => 3<<33
		// => int형은 32칸이므로 33은 1칸 쉬프트 해주는것과 같다
		// => 3은 이진수 0011을 한칸 쉬프트 해주면 0110 => 6이 나온다.
		System.out.println(y >= 5 || x < 0 && x > 2);
		// 연산 순서가 등호 && || 순서 이다
		// => true || false && false
		// => true || false
		// => true
		System.out.println(y += 10 - x++);
		// y에 10을 더해주고 값을 대입해준후 x를 빼주면된다
		// =>15 - 2 => 13 ,현재 x=3, 현재 y=13
		System.out.println(x += 2);
		// x에 +2를 해서 대입 해주면된다
		// 3 +2 =>5 , 현재 x=5, 현재 y=13
		System.out.println(!('A' <= c && c <= 'Z'));
		// 부등호 부터 처리하고 &&처리하고 !을 처리한다.
		// => !(true && true) =>!true =>false
		System.out.println('C' - c);
		// 'C'-c => char- char => int -int => int => 67 - 65 =2 /
		System.out.println('5' - '0');
		// char-char => int - int =>int => 5-0 ->5
		System.out.println(c + 1);
		// char + int => int +int => int => 66+1 =>1
		System.out.println(++c);
		// ++가 앞에 있으면 +1 증가해서 출력하라는 뜻
		// => B ,현재 c :B
		System.out.println(c++);
		// ++가 뒤에있으면 출력한뒤 +1 증가
		// => B ,현재 c: C
		System.out.println(c);
		// 현재 C출력 => C

		// [3-3]아래는 변수 num의 값에 따라 "양수", "음수", "0"을
		//출력하는 코드이다 삼항 연산자를 이용해서 (1)에 알맞은 코드를 넣으시오
		int num =10;
		String result =/*(1)*/ (num >=0 ?(num== 0 ? "0":"양수")  : "음수" );
		System.out.println(result);
		//중첩 삼항 연산자로 구조는 A ? (B ? C : D) : E 
		//=> num >=0 이면 num ==0조건을 실행해서 두조건다 참이면 "0", 
		//첫조건만 맞으면 "양수", 두조건 다 틀리면 "음수"를 출력하는데
		//num이 10으로 첫조건만 맞아서 "양수" 출력

		
		//[3-4] 아래의 코드는 사과를 담는데 필요한 바구니의 수를 구하는 코드이다.
		//만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 
		//13개의 바구니가 필요할 것이다. (1)에 알맞은 코드를 넣으시오
		int apples =123; //사과의 개수
		int bucket =10; //바구니의 크기 (바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = (/*(1)*/  (apples%bucket)==0 ?(apples/bucket) :(apples/bucket +1));
		System.out.println("필요한 바구니의 수 :"+numOfBucket);
		//사과가 바구니에 10개씩 들어가니깐 사과를 바구니로 나누고 
		//남는게 있으면 바구니를 하나 추가해서 담아 주어야한다.
		//나머지가 0인 조건을 만들고 true면 몫을, false면 몫 +1을 해준다.
		//123/10 ==0이 false이므로 몫 12에 +1을 해준다 
		//필요한 바구니의 수 : 13
		
		
		//[3-5] 아래의 코드는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 
		//만일 변수 num의 값이 '456'이라면 '400'이되고 '111'이라면 '100'이 된다 
		//(1)에 알맞은 코드를 넣으시오.
		int num5 = 456;
		int result5 = /*(1)*/(num5/100*100);
		System.out.println(result5);
		//num5의 값을 100으로 나누면 몫이 남고 그몫에 100을 곱하면 백의자리 밑의 값은 다 0이된다.
		
		
		//[3-6] 아래 코드의 문제점을 수정해서 실행 결과와 같은 결과를 얻도록 하시오.
		byte b6 = 20;
		byte a6 = 10; //c6의 결과가 30이라 a6를 10으로 준다. 
		byte c6= (byte)(a6 + b6);
		// byte +byte => int +int => int라서 byte로 강제 형변환 한다.
		char ch6 ='A';
		ch6 =(char)(ch6 +2); 
		//char + int => int +int => int라서 char로 강제 형변환 한다.
		float f =3/2f; 
		// float에서 소숫점 아랫 값까지 나올려면 f를 뒤에 붙혀준다.
		long l = 3000L*3000*3000;
		//3000*3000*3000은 int형 인데 범위를 초과하기 때문에 
		//한가지를 long으로 바꿔 long *int *int 
		//=> long*long*long =>long로 처리한다.
		float f2 = 0.1f;
		double d6 = 0.1;
		boolean result6 = (float)d6==f2; //d6을 float로 변환
		System.out.println("c= "+c6);
		System.out.println("ch= "+ch6);
		System.out.println("f= "+f);
		System.out.println("l= "+l);
		System.out.println("result6= "+result6);
		
		
		//[3-7]아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 
		//변수 num의 값을 뺀 나머지를 구하는 코드이다. 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이다. 
		//19의 경우 20이고, 81의 경우 90이된다. 30에서 24를 뺀 나머지는 6이기 때문에 변수 num의 값이 24라면 6을 결과로 얻어야 한다.
		//(1)에 알맞은 코드를 넣으시오.
		int num7 = 24;
		int result7 = /*(1)*/ (10-num7%10);
		//num7에서 가까운 10의 배수에서 num7을 빼는거니깐 10에서 num7의 1의 자리를 뺴주면된다.
		//그래서 num7을 10으로 나눈 나머지를 구하고 그 값을 10에서 빼면 된다
		//(10 - num7%10)
		System.out.println("result : "+result7);
		 
		
		//[3-8] 아래는 화씨를 섭씨로 변환하는 코드이다. 변환공식이 'C = 5/9 X (F -32)'라고 할때
		//(1)과 (2)에 알맞은 코드를 넣으시오.
		//단, 변환 결과값은 소수점 셋째자리에서 반올림 해야 한다.
		int fahremheit =100;//화씨
		float formula= /*(1)*/ 5f/9*(fahremheit -32);
		//변환 공식에 맞게 대입 5/9는 float가 나와야 하므로 f를 붙혀준다.
		float celcius =/*(2)*/ (int)((formula)*100 +0.5)/100f; 
		//formula를 소숫점 셋째 자리로 반올림하기위해 100을 곱해서 소숫점 두번쨰 까지 정수로 올려준다
		//=>0.5를 더해서 반올림을 해준다. => int로 소숫점을 다 지운다.
		//=> 100f로 나누어 int/float => float/float =>float로 만들며 자리수를 2자리 내린다
		//=> 소숫점 3자리에서 반올림한 값이 나온다.
		System.out.println("Fahrenheit: "+fahremheit);
		System.out.println("Celcius: "+celcius);
		

		
	
		
	}

}
