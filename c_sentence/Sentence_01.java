package c_sentence;

public class Sentence_01 {

	public static void main(String[] args) {
		// 1. 조건문 (if문, switch문)
		// - 조건식과 문장을 포함하는 불럭{}으로 구성되어 있다.
		// - 조건식의 연산 결과에 따라 프로그램의 실행흐름을 변경할 수 있다.

		// 2. if문
		// -구조
		// if(조건식){
		// 조건식이 true일때 수행할 문장
		// }

		// - 변형
		// if(조건식){
		// 조건식이 true일때 수행할 문장
		// }else{
		// 조건식이 false일때 수행할 문장
		// }

		// - 2단 변형
		// if(조건식1){
		// 조건식이 true일때 수행할 문장
		// }else if(조건식2) {
		// 조건식1이 false고, 조건식2이 true일때 수행할 문장
		// }else{
		// 조건식1,2가 false일때 수행할 문장
		// }

		// power가 true이면 "켜져있습니다" 출력
		// power가 false이면 "꺼져있습니다" 출력
		boolean power = true;
		if (power == true) {
			System.out.println("켜져있습니다.");
		} else {
			System.out.println("꺼져있습니다.");
		}

		int a1 = 1;
		// a1의 값이 양수 음수 0 출력
		if (a1 > 0) {
			System.out.println("양수");
		} else if (a1 == 0) {
			System.out.println("0");
		} else {
			System.out.println("음수");
		}

		// 50p[문제 2-16], 51p[예제2-11]
		// 95이상이면 "+" 95미만이면 "-"
		int score = (int) (Math.random() * 101);
		if (score >= 90) {
			System.out.print('A');
			if (score >= 95) {
				System.out.println("+");
			} else {
				System.out.println("-");
			}

		} else if (score >= 80) {
			System.out.print('B');
			if (score >= 85) {
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		} else if (score >= 70) {
			System.out.print('C');
			if (score >= 75) {
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		} else if (score >= 60) {
			System.out.print('D');
			if (score >= 65) {
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		} else {
			System.out.println('F');
		}
		System.out.println(score);

		// 3. switch-case문
		// -조건의 경우의 수가 많을때는 if문보다는 switch문을 사용하는 것이 좋다.
		// -조건의 결과값으로 int형 범위의 정수값을 허용한다.
		// -구조
		// switch(조건식){
		// case 값1 : //조건식읠 값 ==값1
		// 조건식 == 값1이 true일때 수행되는 문장.
		// break;
		// case 값2 : //조건식읠 값 ==값1
		// 조건식 == 값2이 true일때 수행되는 문장.
		// break;
		// default :
		// 조건식과 만족하는 값이 없을때 수행되는 문장.
		// break;//생략가능
		// }

		// 51p[문제 2-17]
		int random = (int) (Math.random() * 5 + 1);
		switch (random) {
		case 1:
			System.out.println("32평 아파트 당첨");
			break;
		case 2:
			System.out.println("자동차 당첨");
			break;
		case 3:
			System.out.println("노트북 당첨");
			break;
		case 4:
			System.out.println("자전거 당첨");
			break;
		default:
			System.out.println("다음기회에");
		}
		System.out.println(random);

		//
		//
		//
		//

		int score2 = 85;//(int) (Math.random() * 101);
		switch (score2 / 10) {
		case 10:
		case 9:
			System.out.print('A');
			switch ((score2 + 5) / 10) {
			case 10:
				System.out.println("+");
				break;
			default:
				System.out.println("-");
			}
			break;
		case 8:
			System.out.print('B');
			switch ((score2 + 5) / 10) {
			case 9:
				System.out.println("+");
				break;
			default:
				System.out.println("-");
			}
			break;
		case 7:
			System.out.print('C');
			switch ((score2 + 5) / 10) {
			case 8:
				System.out.println("+");
				break;
			default:
				System.out.println("-");
			}
			break;
		case 6:
			System.out.print('D');
			switch ((score2 + 5) / 10) {
			case 7:
				System.out.println("+");
				break;
			default:
				System.out.println("-");
			}
			break;
		default:
			System.out.println('F');
		}
		System.out.println(score2);
	}

}
