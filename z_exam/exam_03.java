package z_exam;

import java.util.Scanner;

public class exam_03 {

	public static void main(String[] args) {
		// [4-1] 다음의 문장들을 조건식으로 표현하라
		// (1)int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		int x1 = 11;
		if (x1 > 10 && x1 < 20) {
			System.out.println(x1);
		}// x가 10보다 크니깐 x>10 그리고 x가 20보다 작아야 하니깐 x<20을 조건으로 같고 있으니깐 if안에 넣어 주면
			// 된다

		// (2)char형 변수 ch가 공백이고 탭 아닐때 true인 조건식
		char ch = 'x';
		if (ch == ' ' && ch != '\t') {
			System.out.println(ch);
		}// ch가 공백이니까 ch=' '그리고 ch가 탭이 아닐때 ch!='\t'를 조건으로 같고 있으니깐 if안에 넣어 주면 된다
		// (3)char형 변수 ch가 'x'또는'X'일 때 true인 조건식
		if (ch == 'x' || ch == 'X') {
			System.out.println(ch);
		}// ch가 x 또는 X일 떄 true이니깐 or로 결합해준다
		// (4)char형 변수 ch가 숫자('0'~~'9')일 때 true인 조건식
		if (ch >= '0' && ch <= '9') {
			System.out.println(ch);
		}// ch의 범위가 0에서 9이므로 ch>='0' && ch<='9'로 표현해주면된다
		// (5)char형 변수 ch가 영문자 (대문자 또는 소문자 )일때true인 조건식
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println(ch);
		}// 소문자 a부터 z 범위이거나 대문자 A부터Z범위에 있으면 영문자 이기 때문에 둘을 or결합해준다
		// (6)boolean형 변수 powerOn가 false일 때 true인 조건식
		boolean powerOn = false;
		if (powerOn == false) {
			System.out.println(powerOn);
		}// powerOn이 false일때 출력 시켜주면된다
		// (7)문자열 참조변수 str이 "yes"일 떼 true인 조건식
		String str = "yes";
		if (str.equals("yes")) {
			System.out.println(str);
		}// String은 equals로 같다 비교해준다.

		// [4-2]1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오.
		int i, j = 0;
		for (i = 1; i <= 20; i++) {
			if ((i % 2 != 0) && (i % 3 != 0))
				j = j + i;
		}
		System.out.println(j);
		// 2의 배수는 2로 나눈 나머지가 0, 3의배수는 3으로 나눈 나머지가 0 일때 이고 둘다 아닌 수이므로
		// 조건식에 (i % 2 != 0) 와 (i % 3 != 0)를 &&연산자로 묶어준다
		// 그리고 i를 1부터 20까지 1씩 증가해야하므로 반복에 i = 1; i <= 20; i++를 넣어준다.
		// i가 1씩 늘어나고 조건에 맞으면 수를 더해줘야 하기때문에 변수 j를 두고 하나씩 더해가면서 반복

		// [4-3]다음의 for문을 while문으로 변경하시오
		// for (int dan = 2; dan< 10; dan++){
		// for(int gob =1; gob<10; gob++){
		// System.out.println(dan +"*"+gob+"="+dan*gob);
		// }
		// }
		int dan = 2;
		while (dan < 10) {
			int gob = 1;
			while (gob < 10) {
				System.out.print(dan + "*" + gob + "=" + dan * gob + "  ");
				gob++;
			}
			dan++;
		}
		// dan과 gob를 9까지 반복 시키면서 키워야 하니깐 반복문에 dan<10과 gob<10을 사용하고
		// 1씩 증가 하기위해 gob++와 dan++를 사용하고
		// 구구단 특성상 gob가 9까지 증가하고 dan이 +1되게 짜주었다.

		// [4-4]두개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우릐 수를 출력하는 프로그램을 작성하시오
		int j1, j2;
		for (j1 = 1; j1 < 7; j1++) {
			for (j2 = 1; j2 < 7; j2++) {
				if ((j1 + j2) - 6 == 0) {
					System.out.println("첫번째 눈 : " + j1 + "두번쨰 눈 : " + j2);
				}
			}
		}// 주사위의 눈은 1부터 6이므로 범위를 1부터 7보다 작은 정수로 설정
			// 두번째 주사위눈에 +1씩 더해서 6이되면 첫번째 주사위눈에 +1이 되게한다.
			// 두 주사위의 합을 구한다.
			// 그합에서 -6을 해줘 0이나오면 출력이 되게해준다.

		// [4-5]방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는
		// 0<=x<=10, 0<=y<=10

		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if (2 * x + 4 * y == 10) {
					System.out.println("x의 해 :" + x + "  y의 해 :" + y);
					System.out.println();
				}
			}
		}// x의 시작점과 y의 시작점이 0이고 10까지 반복해야 하므로 int x=0;x<=10;x++ 와
			// int y=0;y<=10;y++ 로 조건을 달아주고 y가 10이되면 x의 값이 +1 증가 하게 짜주었다.=
			// 2x+4y=10의 해를 구하라고 했으니 조건이 2*x+4*y==10 인 조건문을 만들어서 x와 y의 값을 구한다.

		// [4-6]사용자로부터 두개의 정수(시작, 끝)를 입력받아 시작(포함)에서 끝(포함)까지의
		// 곱을 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in); // 값을 입력받는 Scanner 생성
		// int num6;// 숫자 1 변수 생성
		// System.out.print("숫자1을 입력하세요  : ");
		// num6 = sc.nextInt(); //숫자1에 값을 입력받는다
		// System.out.println();
		// int num66;//숫자2 변수 생성
		// System.out.print("숫자2을 입력하세요  : ");//숫자2에 값을 입력받는다.
		// num66= sc.nextInt();
		// System.out.println();
		// long result6=1L;//곱해서 값을 저장하는 변수
		// if(num6<=num66){ //뒤에 입력한 숫자가 큰경우
		// for(num6=num6;num6<=num66;num6++){ //첫숫자를 1씩증가하면서곱해서 result6에 값을 저장
		// 두번째 숫자가 될때까지 진행
		// result6*=num6;
		// }
		// }else {
		// for(num66=num66;num66<=num6;num66++){//두번째 숫자를 1씩증가하면서곱해서 result6에 값을
		// 저장 첫숫자가 될때까지 진행
		// result6*=num66;
		// }
		// }
		// System.out.println("곱은 "+result6+" 입니다.\n");

		// [4-7]1+ (1+2)+(1+2+3)+(1+2+3+4)+....+(1+2+3+....+10)의 결과를 계산하시오.
		int sum7 = 0;
		int sum77 = 0;
		int n = 1;
		int x = 1;
		for (n = 1; n <= 10; n++) {
			sum7 += n;
			sum77 += sum7;
			// 문제를 풀어서 보면 (0+1)+(1+2)+(1+2+3)+.........+(1+2+3+....+10)
			// 이므로 sum7이라는 정수형 변수를 0으로 초기화하고 더해주는 값(n)을 +1씩 증가 시켜가면서 앞에 값에 더해준다.
			// => sum7+=n 이값을 정수형 변수 sum77에 더해주면서 n을 증가 시킨다.
			if (sum7 == 1) {
				System.out.print(sum7 + "+"); // 처음 1출력, n이 1일 경우는 괄호를 쓰지 않고 +만
												// 해준다.
			} else {
				System.out.print("("); // 괄호 열어주는 곳 출력
				for (x = 1; x <= n; x++) { // n이 +1씩 되는 값까지 x를 1씩 증가 x가 10까지 커지고
											// n+1
					if (x == n) { // x가 n과 같아지는 값에서 더해주는 값 출력
						if (n == 10) {
							System.out.print(n + ")");// 더해주는 값 출력 마지막이라 괄호닫고
														// +생략
						} else if (n != 10) {
							System.out.print(n + ")+");// 더해주는 값 출력하고 괄호 닫고 +
						}
					} else { // x가 n과 다르면 그 x 값 쓰고 +를 붙혀준다.
						System.out.print(x + "+");// 앞에서 더해줬던 값
					}
				}

			}

		}
		System.out.println();
		System.out.println(sum77);
		System.out.println();

		// [4-8]1+(-2)+3+(-4)+....과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지
		// 구하시오.
		int sum8 = 0;// 1+(2)+3+(-4)+....의 합계 저장 변수 :sum8
		int buho = 1; // 부호를 표현해주는 변수 1또는 -1로 나온다
		int num8 = 0; // i2를 중기하면서 부호 바꿔가면서 더해줄 값
		for (int i2 = 1; sum8 < 100; i2++) { // i2가 1부터 합계가 100까지 1씩증가

			num8 = i2 * buho;// i2를 1씩 증가시키면서 앞에 -1을 곱해 부호를 바꿔준다.
			buho *= -1; // 부호가 1씩 증가 될때마다 -1씩 곱해서 바뀌게 설정
			sum8 += num8;// 부호를 바꿔가면서 구한 num8의 합계를 저장해줄 값

		}
		System.out.println("num8 " + num8);
		System.out.println(sum8);

		// //[4-9]사용자로부터 입력받은 정수의 각 자리의 합을 더한 결과를 출력하는 프로그램을 작성하시오.
		// //예를 들어 사용자가 53263을 입력하였다면 결과는 19가 되어애 한다.
		// int sum9=0;// 값을 더해서 저장할 변수
		// System.out.print("숫자를 입력하세요 : ");
		// int num9 = sc.nextInt(); //값을 입력받을 변수
		// System.out.println();
		// //입력받은 값을 한자리씩 내려가면서 1의자리만 다 더해주는 반복문.
		// while(num9>0){
		// sum9 +=num9%10;//입력 받은 값의1의자리를 더해준다
		// num9/=10; // 입력받은 값을 한자리씩 내려서 자릿수를 옮겨준다.
		// }System.out.println("각자리수의 합 : " + sum9);

		// [4-10]피보나치 수열은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열이다.
		// 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는 1과 2를 더해서 3이 되어서
		// 1,1,2,3,5,8,13,21,....과 같은 식으로 진행된다. 1과 1부터 시작하는
		// 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 작성하시오.
		int num10 = 1;// 첫번째 숫자
		int num10_2 = 1;// 두번째 숫자
		int result10 = 0;// 첫번째와 두번째 숫자를 더해줄 숫자 변수
		System.out.print(num10 + "," + num10_2);// 일단 첫번째 두번째 숫자는 입력
		for (int i10 = 0; i10 < 8; i10++) { // 3번쨰부터 10번째 까지니깐 8번 반복
			result10 = num10 + num10_2;// 앞에 두 숫자를 더해서 뒤에 출력할 변수에 저장
			System.out.print("," + result10);// 더해준 변수값을 출력
			num10 = num10_2;// 한칸씩 밀어가면서 더하기 위해 뒤에 더해준 변수를 앞에 변수에 저장.
			num10_2 = result10;// 앞에 뒤에 변수끼리 더한값을 뒤에 변수에 저장.

		}
		System.out.println();
		System.out.println();

		// [4-11]다음은 주어진 문자열이 숫자인지를 판별하는 프로그램이다 (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오
		String value = "12A24"; // 문자열 저장 하는 변수
		char ch11 = ' '; // 문자형 저장 변수
		int n11 = 0; // 숫자 저장 변수
		boolean isNumber = true; // 숫자인지 판단해서 true면 출력해주는 변수
		for (int i11 = 0; i11 < value.length(); i11++) { // 0부터 문자열의 길이만큼 +1씩 증가
			// (1)
			ch11 = value.charAt(i11); // 문자열 각자리를 char로 변환
			n11 = ch11 - '0'; // char-char => int로 바꿔 n11변수에 저장
			if (!(n11 >= 0 && n11 <= 9)) {// n11이 0~9에 없을시 문자로 판단
				isNumber = false; // 문자면 false
			}
		}
		if (isNumber) {
			System.out.println(value + "는 숫자입니다.");
		} else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}

	}

}
