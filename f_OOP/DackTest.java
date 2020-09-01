package f_OOP2;

import java.util.Arrays;
import java.util.Scanner;

public class DackTest {
	public static void main(String[] args) {
		Card c1 = new Card();//1,1
		System.out.println(c1);//SPADE, A 
		Card c2 = new Card(2,5);//1,1
		System.out.println(c2);//DIAMOND,5
		//9. 카드 한 벌의 객체를 생성
		Deck d = new Deck();
		System.out.println(Arrays.toString(d.c));//모든 카드가 다 출력되면됨 3번문제 확인법
		//10. 0번 index의 카드 한 장을 뽑기
		System.out.println("10번 정답"+d.pick(0));
		//11. 임의의 index번째 카드 한 장을 뽑기 
		Card pick2 = d.pick();
		System.out.println("11번 정답"+pick2);
		//12. 카드 자동 섞기
		d.shuffle();
		//13. 0번 index의 카드 한 장을 뽑기 
		System.out.println("13번 정답"+d.pick(0));
		//14. 카드 1000번 섞기 
		Scanner sc = new Scanner(System.in);
		System.out.println("셔플 횟수를 입력 하세요");
		int sc_num=sc.nextInt();
		d.shuffle(sc_num);
		System.out.println(sc_num+"번 셔플");
		//d.shuffle(1000);
		//15. 0번 index의 카드 한 장을 뽑기 
		System.out.println("15번 정답  " + d.pick(0));
	}
}

class Deck {
	//1. 카드의 수량을 저장할수 있는 변수 CARD_NUM을 선언하고 Card 클래스의 상수를이용하여 초기화.
	static final int CARD_NUM = Card.KIND_MAX * Card.NUM_MAX;
	//2. 카드 52장을 저장할 수 있는 변수 c를 선언 및 생성하여라 
	Card[] c = new Card[CARD_NUM];
	//3. 기본 생성자를 작성하여라. 단 변수 c의 모등방에 카드 1,1 ~4,13까지 생성하여 저장하여라
	Deck() {
		for (int i = 0; i < Card.KIND_MAX; i++) {
			for (int j = 0; j < Card.NUM_MAX; j++) {
				c[(i * 13) + j] = new Card(i + 1, j + 1);
			}
		}
	}
	//4. 사용자로 부터 입력 받은 index번째 카드 한장을 반환하는 메서드(pick)를 작성하여라
	Card pick() {
		Card pick = c[(int) (Math.random() * c.length)];
		return pick;
	}
	//5. 사용자로부터 입력받은 index번째 카드 한 장을 반환하는 메서드(pick)를 작성하여라.
	//	단, 입력받은 값이 0~51사이의 정수라면 입력받은 index번째 카드 한장을 반환하고
	//	그렇지 않은 경우에는 "랜덤번호"를 출력하고 임의의 한 장을 반환하도록 하여라.
	//	단, 4번에서 만든 pick을 활용하세요.
	Card pick(int a) {
		Card result;
		if (a >= 0 && a <= 51) {
			result = c[a];
		} else {
			System.out.println("랜덤번호");
			result = c[(int) (Math.random() * c.length)];
		}
		return result;
	}
	//7. c의 카드를 섞는 메서드(shuffle)을 작성하여라. -자동섞기
	//단, 카드 섞는법 연습문제 5-6의 방법을 활용
	void shuffle() {
		for (int i = 0; i < c.length; i++) {
			int x = (int) (Math.random() * c.length);
			Card shuffle = c[i];
			c[i] = c[x];
			c[x] = shuffle;
		}
	}
	//8. 사용자로부터 입력받은 횟수만큼 c의 카드를 섞는 메서드(shuffle)을 작성하여라
	//	단, 임의의 방 2개를 뽑아 2개의 index번째 요소와 위치를 바꾼다. 
	//	이를 사용자로 부터 입력받은 횟수만큼 반복한다.
	void shuffle(int a) {
		while (a > 0) {
			for (int i = 0; i < c.length; i++) {
				i = (int) (Math.random() * c.length);
				int x = (int) (Math.random() * c.length);
				Card shuffle = c[i];
				c[i] = c[x];
				c[x] = shuffle;
			}
			a--;
		}
	}

}

class Card /*extends Object*/ {

	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	static final int SPADE = 1;
	static final int DIAMOND = 2;
	static final int HEART = 3;
	static final int CLOVER = 4;

	static int width = 100;
	static int heigh = 250;

	int kind;
	int num;

	Card(int kind, int num) {
		this.kind = kind;
		this.num = num;
	}

	Card() {
		this(SPADE, 1);
	}

	@Override
	public String toString() {
		String kind = "";
		String num = "";
		switch (this.kind) {
		case 1:
			kind = "♠";
			break;
		case 2:
			kind = "♦";
			break;
		case 3:
			kind = "♥";
			break;
		default:
			kind = "♣";
			break;
		}

		switch (this.num) {
		case 1:
			num = "A";
			break;
		case 11:
			num = "J";
			break;
		case 12:
			num = "Q";
			break;
		case 13:
			num = "K";
			break;
		default:
			num += this.num;
			break;
		}
		return kind + "," + num;
	}
}
