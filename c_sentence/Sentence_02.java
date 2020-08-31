package c_sentence;

public class Sentence_02 {

	public static void main(String[] args) {
		// 1. 반복문 (for while do-while)
		// -어떤 작업이 반복적으로 수행되도록 할때 사용된다.
		// -반복문은 주어진 조건이 만족되는 동안 문장을 반복수행한다
		// -for문의 경우 반복횟수를 알고 있을때 사용된다.
		// -while문과 같은 경우 반복횟수를 모를 때 사용된다

		// 2.for문
		// -기본구조
		// -for(초기화 ; 조건식; 증감연산){
		// true떄 수행문장
		// }

		// 1. 5~16까지의 합을 구하여라.
		int j;
		int result1 = 0;
		for (j = 5; j <= 16; j++) {
			result1 += j;
		}
		System.out.println(result1);

		int n = 3;
		int i = 0;
		String answer = "";
		for (i = 0; i < n; i++) {
			if (i % 2 == 0) {
				answer += "수";
			} else {
				answer = answer + "박";
			}
		}
		System.out.println(answer);

		// [문제 2-19]
		int num = 0;
		int num2 = 1;
		long num3 = 1;
		int num4 = 1;
		int num5 = 1;
		for (num = 0; num <= 5; num++) {
			System.out.print("\t" + num);
		}
		System.out.println();
		for (num = 5; num >= 0; num--) {
			System.out.print("\t" + num);
		}
		System.out.println();
		for (num = 2; num <= 10; num++) {
			num2 = num2 + num;
		}
		System.out.println(num2);
		for (num = 5; num < 15; num++) {
			num3 = (long) (num3 * num);
		}
		System.out.println(num3);
		for (num = 3; num <= 4462; num++) {
			if (num % 2 == 0) {
				num4 = num + num4;
			}
		}
		System.out.println(num4);
		for (num = 8; num < 57; num++) {
			if ((num % 2 == 0) || (num % 3 == 0)) {
				num5 = num + num5;
			}
		}
		System.out.println(num5);

		int gob = 1;
		int gu = 1;

		for (gu = 1; gu <= 9; gu++) {
			for (gob = 1; gob <= 9; gob++) { // 3단출력
				if (gob == 9) {
					System.out.print(gu + "*" + gob + "=" + gu * gob + "  ");
					System.out.println("");
				} else {
					System.out.print(gu + "*" + gob + "=" + gu * gob + "  ");
				}
			}
		}

		//
		// 55p[예제2-13]
		for (int i13 = 0; i13 < 3; i13++) {
			System.out.println("Hello Java");
		}

		// 3. while문
		// -반복횟수를 알수 없을때 많이 사용.
		// -조건식과 수행해야할 블럭{}만으로 구성되어 있다.
		// -기본구조
		// while(조건식){
		// 조건식이 true일때 수행될문장
		// }

		//
		// 1. 1~10까지출력
		int number = 1;
		while (number < 11) {
			System.out.println(number);
			number++;
		}
		// 2. 3~10까지 합계 구하기
		int number2 = 3;
		int sum2 = 0;
		while (number2 <= 15) {
			sum2 += number2;
			number2++;
		}
		System.out.println(sum2);

		// 1~100까지의 정수중 4의 배수의 합계를 구하시오
		int num7 = 1;
		int sum4 = 0;
		while (num7 < 101) {
			if (num7 % 4 == 0) {
				sum4 += num7;
			}
			num7++;
		}
		System.out.println(sum4);

		// 5~? 합계를 구하였을때 합계가 100이상이 되는 ?의 값을 구하여라
		int numb = 5;
		int sumb = 0;
		while (sumb < 100) {
			sumb += numb;
			if (sumb < 100) {
				numb++;
			}
		}
		System.out.println(numb);

		int numb2 = 5;
		int sumb2 = 0;
		while (true) {
			sumb2 += numb2;
			if (sumb2 >= 100) {
				break;
			}
			numb2++;
		}
		System.out.println(numb2);

		// 별찍기

		for (i = 0; i < 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		// 짝수
		int num8 = 0;
		while (num8 < 10) {
			if (num8 % 2 == 0) {
				System.out.println(num8);
			}
			num8++;
		}

		int num9 = 0;
		while (num9 < 10) {
		
			if (num9 % 2 != 0) {
				continue;
			}	num9++;
			System.out.println(num8);

		}

		//
	}
}
