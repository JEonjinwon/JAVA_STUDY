package e_OOP;

public class Qu3_8 {

	public static void main(String[] args) {
		//7. 3번의 add메서드를 호출하여라
		int result3 = MyAdd.add(3);
		System.out.println(result3);
		//8. 4번의 add메서드를 호출하여라
		MyAdd ma = new MyAdd();
		int result4 = ma.add(3, 4);
		System.out.println(result4);
		//9. 5번의 add메서드를 호출하여라
		long result5 = ma.add(3, 4L);
		System.out.println(result5);
		//10. 6번의 add메서드를 호출하여라
		float result6 = ma.add('A', 0.3f);
		System.out.println(result6);

		
		
			
	}
}

class MyAdd {
	
	
	// 1. 클래스변수 a를 선언하고 20의 값으로 초기화하여라.
	static int a = 20;
	// 2. 인스턴스변수 b를 선언하고 15의 값으로 초기화 하여라.
	int b = 15;

	// 3. int타입의 매개변수가 하나이며 변수 a의 합을 반환하는 클래스 메서드를 add를 작성하여라.
	static int add(int x) {
		return x + x;
	}

	// 4. int타입의 매개변수가 2개이며 매개변 합을 반환하는 인스턴스 메서드를 add를 작성하여라.
	int add(int x, int y) {
		return x + y;
	}

	// 5. int타입, long타입 각 한개의 매개변수,매개변수의 합을 반환하는 인스턴스 메서드를 add를 작성하여라.
	long add(int x, long y) {
		return x + y;
	}

	// 6. char타입, float타한개의 매개변수,매개변수의 합을 반환하는 인스턴스 메서드를 add를 작성하여라.
	float add(char x, float y) {
		return x + y;
	}
	//추가1. 인스턴스메서드 add  매개변수 long타입 int타입 => 매개변수 합을 반환하는 메서드
	long add(long a, int b) {
		return a + b;
	}
	//추가2. 인스턴스메서드 add  매개변수 int타입 2개  => 매개변수 합을 반환하는 long 타입 메서드
	//	long add(int a, int b) {
	//		return (long)(a + b);
	//	}
}

	
		