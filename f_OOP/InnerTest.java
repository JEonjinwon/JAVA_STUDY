package f_OOP2;

public class InnerTest {

	public static void main(String[] args) {
		Outer.Inner oi = new Outer().new Inner();
		oi.method2(50);
		
		
		
	}

}

class Outer {
	int value = 10;

	class Inner {// 인스턴스 클래스
		int value = 20;

		void method2(int value) {
			System.out.println(value); //매개변수 value 값 => 인자값 
			System.out.println(this.value);// 20 출력
			System.out.println(Outer.this.value); // 10 출력

		}

	}

	static class Inner2 {// static 클래스

	}

	void method() {
		class Inner3 { // 지역 클래스

		}
	}

}