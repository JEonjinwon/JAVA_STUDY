package e_OOP;

public class OOPBasic {
	public static void main(String[] args) {
		// 1. OOP: Object Oriented Programming => 객체지향 프로그래밍
		// - 기존의 프로그래밍 언언에 몇가지 규칙을 추가한 보다 발전된 언어이다.
		// 2. 객체지향 프로그래밍의 장점
		// - 코드의 재사용성이 높다.
		// - 코드의 관리가 용이하다.
		// - 신뢰성이 높은 프로그래밍이 가능하다.
		// 3.클래스
		// - 객체를 정의해 놓은 것
		// - 설계도
		// 	클래스 		객체
		// 	Tv설계도 		Tv
		// 	붕어빵틀 		붕어빵		
		// 4. 객체의 구성요소
		// - 속성 
		//		: 멤버 변수,
		//		: 전원, 볼륨, 색상, 채널....
		// - 기능 
		// 		: 메서드, 행위, function..
		//		: 켜기, 끄기, 볼륨올리기, 채널올리기 .......
		// 5. 인스턴스
		// - 클래스로부터 객체를 만드는 과정을 인스턴스화라고 한다.
		// - Tv클래스로부터 만들어진 객체를 Tv클래스의 인스턴스라고 한다.
		// - 인스턴스 생성방법
		// 		: 클래스명 변수명; -> 참조변수 선언 
		//		: 변수명 = new 클래스명(); -> 해당 클래스의 인스턴스 생성후 인스턴스의 주소를 변수에 저장 
		//			Tv t = new Tv();
		// 6. 선언 위치에 따른 변수(저장)의 종류 
		// - 지역변수
		//		: 메서드 내에 선언된다.
		//		: 메서드가 종료시 같이 소멸된다.
		// - 클래스변수
		//		: 클래스의 영역에 선언된다.
		//		: 클래스가 Method Area에 로드 될때 같이 로드된다.
		//		: 한 클래스의 모든 인스턴스들이 동일한 값을 가져야 할때 사용한다.
		//		: 인스턴스변수 앞에 static만 붙이면 된다.
		// - 인스턴스변수		
		//		: 클래스의 영역에 선언된다.
		//		: 클래스의 인스턴스가 생성 될때 heep영역에 생성된다.
		//		: 인스턴스마다 독립적인 저장공간을 가진다. (각각 다른 값을 가진다.)
		//		: 인스턴스마다 고유한 값을 가저야 하는 경우 해당 변수는 인스턴스 변수로 선언해야 한다.
		// 7. 메서드 (행위)
		//	- 어떠한 작업을 수행하기 위한 명령문의 집합
		//	- 주로 어떤 값을 입력받아서 수행후 그 결과를 돌려준다.
		//	- 입력받는 값이 없을수도 결과를 반환하지 않을수도 있다.
		//	1)	입력O,반환O (기본 모양)
		//	2)	입력O,반환X
		//	3)	입력X,반환O
		//	4)	입력X,반환X
		// 	- 반복적으로 수행되는 코드를 줄이기 위해서 사용된다.
		//	- 작성방법
		//		반환타입 메서드명(변수타입 변수,..........){
		//			수행할 문장
		//			return 반환값;
		//			}
		//
		// 		int add(int a, int b){
		//			int result = a + b;
		//			return result;
		// 		 }
		// 8. return문 
		//	- 메서드가 정상적으로 종료되는 경우
		//		: 메서드의 마지막 문장까지 실행된 경우
		//		: return문을 만났을 때
		//	- 반환값이 있는 경우
		//		: return 반환값;   => 반환값과 반화타입의 타입은 일치해야 한다.
		//	- 반환값이 없는 경우
		//		: return; 		 => 반환 타입이 void되어야 한다.
		//						 => 마지막에 나갈 경우에만 return 생략 가능 
		// 9. 메서드 호출 
		//	- 클래스 메서드 
		//		- 클래스명.메서드명();
		//			int 변수명 = 클래스명.add(3,5);
		//		- 변수의 타입은 반환 타입과 일치해야한다
		// 10. JVM메모리 구조 
		//	- Method Area
		//		: 클래스가 로드되며 클래스변수, 클래스메서드가 같이 생성된다.
		// 	- Call Stack
		//		: 메서드가 호출되었을때 실행되는 영역
		// 	- Heap Area
		//		: 인스턴스가 생성되며 인스턴스변수, 인스턴스메서드가 같이 생성된다.
		//		
		// 11. 기본형 메게변수와 참조형 매개변숭
		//	- 메서드가 호출 되었을 때 매게 변수로 지정한 값(인자값)을 메서드의 메개변수에 복사하여 넘겨준다.
		//	- 기본형 매개변수 
		//		: 단순히 값만을 복사해준다.
		//		: 변수의 값을 읽기만 할 수 있다.
		//	- 참조형 매개변수 
		//		: 주소를 복사해준다.
		//		: 변수의 값을 읽기 또는 변경이 가능하다. 
		//
		// 12. 재귀호출(Recursive call)
		//	- 메서드 내에서 자기자신 메서드를 다시 호출하는  것 
		//
		// 13. 메서드 종류
		//	- 클래스 메서드 
		//		: 객체 생성없이 '클래스명.메서드명()'으로 호출한다.
		//		: 인스턴스 멤버와 관련없는 작업을 수행한다.
		//		: 클래스메서드 내에서 인스턴스 멤버를 사용할수 없다.
		//		: 클래스메서드 내에서 인스턴스멤버를 사용하지 않고 있다면 클래스 메서드로 만드는 것을 고려해야한다.
		//	- 인스턴스메서드 
		//		: 인스턴스를 생성 후 '참조변수명.메서드명()'으로 호출한다.
		//		: 인스턴스멤버와 관련된 작업을 수행한다.
		//		: 클래스멤버와 관련된 작업을 수행할수도 있다.
		//		: 인스턴스메서드 내에서는 모든 멤버를 호출할수 있다.
		//
		// 14. 메서드 오버로딩 
		//	- 클래스 내에서 이름이 같은 이름의 메서드를 여러개 정의할 수 있는 것 .
		//	- println()이 가장 대표적인 예이다.
		//	- 조건 
		//		: 메서드의 명이 같아야한다.
		//		: 메개변수의 갯수 또는 타입이 달라야 한다.
		//			- a(), a(int), a(long) 
		//		: 반환 타입은 상관이 없다.
		//	- 장점
		//		: 메서드의 이름으로만 구분이 된다면 메서드명이 다 달라야 한다.
		//		: 같은 역할을 하는 것인데 메서드 명이 다르면 기억하기가 어렵다.
		//		: 메서드의 이름을 짓는데 고민을 덜 수 있다.
		// 15. 생성자
		//	- 인스턴스가 생성될때 호출되는 인스턴스 초기화 메서드 이다.
		//	- 인스턴스변수를 초기화할 목적을 사용
		//	- 특징
		//		: 메서드처럼 클래스 내에 선언된다.
		//		: 리턴값이 없다.
		//		: 반환타입이 void이어야 하지만 생략한다.
		//		: 생성자의 이름은 클래스 명과 동일 해야 한다.
		//	- 정의방법
		//		: 기본 생성자 
		//			클래스명 (){
		//				
		//			}
		//		: 매개변수가 있는 생성자
		//			클래스명(변수타입 변수명,......){
		//
		//			}
		//
		// 16. 변수의 초기화
		//	- 변수를 선언하고 처음으로 값을 저장하는 것 
		//	- 명시적 초기화 
		//		: int a =10;
		//	- 생성자를 이용하여 초기화
		//	- 초기화 블럭을 이용한 초기화
		//		: 변수의 복잡한 초기화인 경우 사용 
		//		: 클래스초기화블럭, 인스턴스초기화블럭
		//	-  초기화 순서 : 명시적 -> 초기화 블럭 -> 생성자 초기화
		
		
		
	}
}
