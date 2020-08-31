package e_OOP;

public class MyMath {

	public static void main(String[] args) {
		//12. add1메서드 호출
		MathTest.add1();
		//13. add2메서드 호출
		MathTest mt = new MathTest();
		int add2 = mt.add2();
		System.out.println(add2);
		//14. add3메서드 호출
		MathTest.add3(3, 5);
		
		//15. add4메서드 호출
		int add4 = mt.add4(3, 5);
		System.out.println(add4);
		//16. add5메서드 호출
		long add5 = mt.add5(3, 4L);
		System.out.println(add5);
		//17. add6메서드 호출
		long add6 = mt.add6(3, 4, 5L);
		System.out.println(add6);
		//18. add7메서드 호출
		String add7 = mt.add7("ASD");
		System.out.println(add7);
	}
}
class MathTest{
	//1. 클래스변수 a를 선언하고 10의 값으로 초기화하여라
	static int a = 10;
	//2. 클래스변수 b를 선언하고 20의 값으로 초기화하여라
	static int b = 20;
	//3. 인스턴스변수 c를 선언하고 30의 값으로 초기화하여라
	int c =30;
	//4. 인스턴스변수 d를 선언하고 40의 값으로 초기화하여라
	int d = 40;
	//5. 클래스메서드 add1, 클래스 변수 a,b의 합을 출력하는 메서드
	static void add1(){
		System.out.println(a+b);
	}
	//6. 인스턴스메서드 add2, 인스턴스변수 c,d의 합을 반환하는 메서드
	int add2(){
		return c+d;
	}
	//7. 클래스메서드 add3, 매개변수 : int타입 2개, 매개변수의 합을 출력하는 메서드
	static void add3(int a, int b){
		System.out.println(a+b);
	}
	//8. 인스턴스 메서드add4, 매개변수 : int타입 2개, 매개변수의 합을 반환하는 메서드
	int add4(int a, int b){
		return a+b;
	}
	//9. 인스턴스 메서드add5, 매개변수 : int타입 1개 long타입 1개, 매개변수의 합을 반환하는 메서드
	long add5(int a, long b){ 
		return a+b;
	}
	//10. 인스턴스 메서드add6, 매개변수 : int타입 2개 long타입 1개, 매개변수의 합을 반환하는 메서드
	long add6(int a, int b, long c){
		return a+b+c;
	}
	//11. 인스턴스 메서드add7, 매개변수 :문자열 1개, 매개변수 48~94중 임의의 값과 문자열의 합을 반환하는 메서드
	String add7(String a){
		int random = ((int)(Math.random()*47+48));
		return  a + random;
	}
	







}
