package e_OOP;

public class CardTest {

	public static void main(String[] args) {
		//클래스변수 사용 이므로 클래스.클래스변수명
		System.out.println(Card.width);
		System.out.println(Card.heigh);
		//객체 생성방식 : 클래스명 변수명 = new 클래스명();
		Card cd1 = new Card();
		//참조변수명.인스턴스변수명 =저장할 값;
		cd1.name="Daniel";
		cd1.number = 19961210;
		Card cd2 = new Card();
		cd2.name = "nayeon";
		cd2.number = 19950922;
		System.out.println("출력1");
		//인스턴스변수는 각각의 저장 공간을 갖기 때문에 독립적인 값을 같는다.
		System.out.println("1번카드의 이름은"+cd1.name+", 직원 번호"+cd1.number+", 폭은"+Card.width+", 높이는"+Card.heigh+"이다.");
		System.out.println("1번카드의 이름은"+cd2.name+", 직원 번호"+cd2.number+", 폭은"+Card.width+", 높이는"+Card.heigh+"이다.");
		Card.width=70;
		Card.heigh=100;
		//클래스 변수는 값을 바꾸면 값이 전체적으로 바뀐다.
		System.out.println("출력2");
		System.out.println("1번카드의 이름은"+cd1.name+", 직원 번호"+cd1.number+", 폭은"+Card.width+", 높이는"+Card.heigh+"이다.");
		System.out.println("2번카드의 이름은"+cd2.name+", 직원 번호"+cd2.number+", 폭은"+Card.width+", 높이는"+Card.heigh+"이다.");
	}
}

class Card {
	String name;
	int number;
	static int width = 100;
	static int heigh = 250;

}
