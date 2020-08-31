package e_OOP;

public class TvTest {

	public static void main(String[] args) {
		System.out.println(Tv.color);//전역변수는 선언 하지 않아도 기본값을 넣어준다.
		Tv.color = "black";
		System.out.println(Tv.color);
		Tv.changeColor();
		System.out.println(Tv.color);
		//인스턴스 화
		Tv t = new Tv(); //변수의 타입은 인스턴스 타입과 일치 해야한다.
		System.out.println(t.channel);
		t.channel=10;
		System.out.println(t.channel);
		t.channelUp();
		System.out.println(t.channel);
		t.volum=15;
		System.out.println(t.volum);
		t.voluemUp();
		System.out.println(t.volum);
		
	}

}

class Tv{
	// 클래스 바로 아래 선언 "전역변수(멤버변수)"
	static String color;	//static 붙어서 "클래스변수"
	int channel;			//static 않 붙어서 "인스턴스 변수"
	int volum;				//static 않 붙어서 "인스턴스 변수"
	
	//클래스 메서드
	static void changeColor(){  
		color = "yellow";
	}
	//인스턴스 메서드 
	void channelUp(){
		channel++;
	}
	//인스턴스 메서드 
	void voluemUp(){
		volum++;
	}
	
	
	
}













