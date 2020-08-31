package z_2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("문자 또는 숫자 입력 :");
		Scanner sc = new Scanner(System.in);
		String a;
		a=sc.nextLine();
		boolean b=true;
		//true면 true 출력  팰린드롬이 아니면 아래 for문을 돌려 if문에 해당해서 false가 출력
		int length = a.length();
		for(int i = 0; i<length/2;i++){
			if(a.charAt(i)!=(a.charAt(length-i-1))){
				//a.charAt(i)는 인덱스가 0부터 1칸씩 증가, (a.charAt(length-i-1))는 뒤에서부터 인덱스가 1칸씩 감소
				b=false;
			}
		}
		System.out.println(b);
	}

}
