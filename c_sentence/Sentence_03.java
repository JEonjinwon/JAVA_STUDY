package c_sentence;

import java.util.Scanner;

public class Sentence_03 {

	public static void main(String[] args) {
		// 1. 사용자로 값을 입력받기
		// -Scanner
		Scanner sc = new Scanner(System.in);
		// String input = sc.next();
		// System.out.println(input);

		// 1. 사용자로부터 숫자 두개를 받아서 두 숫자 사이의 합을 출력해주세요
	/*	int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = 0;
		if (a1 < a2) {
			for (a1 = a1; a1 <= a2; a1++) {
				a3 += a1;
			}
		} else if (a2 < a1) {
			for (a2 = a2; a2 <= a1; a2++) {
				a3 += a2;
			}
		} else {
			a3 = a1;
		}
		System.out.println(a3);

		*/
		
		
		//2. do-while
		//	-while문의 변형으로 기본구조는 while문과 비슷하다.
		//		하지만 최소 1회는 블럭{}을 수행하게 된다.
		//-기본구조
		//		do{
		//			수행될문장
		//		}while(조건식);
		
		//사용자로부터 입력받은 문자열을 출력하는 프로그램을 만든다.
		//단 사용자가 "exit"라는 단어까지 무한반복하게 해주세요
		String b1 = null;
		do{
		System.out.println("문자열 입력");
		b1=sc.next(); 
		System.out.println(b1);
		}while(!"exit".equals(b1));
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
