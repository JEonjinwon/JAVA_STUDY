package e_OOP;

public class InitTest {

	public static void main(String[] args) {
		Init i = new Init(6);
		System.out.println(i.action2); //명 -> 블럭 -> 생성자
	}
}
class Init{
	// 초기화 순서 : 명시적 -> 초기화 블럭 -> 생성자 초기화
	static int action=100; //명시적 초기화
	int action2;
	 Init(int action2) { //생성자를 이용하여 초기화
		 this.action2 =action2;
	 }
	 static{ //클래스 초기화 블럭 
		 action = 10;
	 }
	 { //인스턴스 초기화 블럭 
		 action = 10;
	 }
	 
	 
	 
	 
	 
	 
}